/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

import fr.obeo.dsl.sPrototyper.AcceleoExpression;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPRepresentation;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;
import fr.obeo.dsl.sPrototyper.VarRef;
import fr.obeo.dsl.viewpoint.description.DescriptionFactory;
import fr.obeo.dsl.viewpoint.description.Group;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.description.tool.ChangeContext;
import fr.obeo.dsl.viewpoint.description.tool.CreateInstance;
import fr.obeo.dsl.viewpoint.description.tool.ToolFactory;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.CreateLineTool;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.EditionTableDescription;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.FeatureColumnMapping;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.LineMapping;

/**
 * @author glefur
 *
 */
public class Initializer {

	private EditingDomain editingDomain;
	private SPrototyper sPrototyper;

	public Initializer(EditingDomain editingDomain, SPrototyper sPrototyper) {
		this.editingDomain = editingDomain;
		this.sPrototyper = sPrototyper;
	}


	public void run() throws IOException {
		Resource resource = getResource();
		Group group = DescriptionFactory.eINSTANCE.createGroup();
		group.setName(sPrototyper.getName());
		resource.getContents().add(group);
		for (SPViewpoint spViewpoint : sPrototyper.getViewpoints()) {
			Viewpoint viewpoint = createViewpoint(spViewpoint);
			group.getOwnedViewpoints().add(viewpoint);
		}
		Map<Object, Object> options = Maps.newHashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		resource.save(options);

	}


	private Viewpoint createViewpoint(SPViewpoint spViewpoint) {
		Viewpoint viewpoint = DescriptionFactory.eINSTANCE.createViewpoint();
		viewpoint.setName(sPrototyper.getQualifier() + ".vp." + spViewpoint.getName());
		viewpoint.setLabel(spViewpoint.getName());
		for (SPRepresentation spRepresentation : spViewpoint.getRepresentations()) {
			if (spRepresentation instanceof SPTable) {
				SPTable spTable = (SPTable) spRepresentation;
				EditionTableDescription editionTableDescription = createEditionTable(
						spViewpoint, spTable);

				viewpoint.getOwnedRepresentations().add(editionTableDescription);

			}
		}
		return viewpoint;
	}

	private EditionTableDescription createEditionTable(SPViewpoint spViewpoint, SPTable spTable) {
		EditionTableDescription editionTableDescription = fr.obeo.dsl.viewpoint.table.metamodel.table.description.DescriptionFactory.eINSTANCE.createEditionTableDescription();
		editionTableDescription.setDomainClass(spTable.getRoot());
		editionTableDescription.setName(sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + ".rep." + spTable.getName());
		if (!Strings.isNullOrEmpty(spTable.getLabel())) {
			editionTableDescription.setLabel(spTable.getLabel());
		} else {
			editionTableDescription.setLabel(spTable.getName());			
		}
		if (!Strings.isNullOrEmpty(spTable.getTitle())) {
			editionTableDescription.setTitleExpression(spTable.getTitle());
		}
		for (MetamodelRef mmRef : spTable.getMetamodels()) {
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(mmRef.getMetamodel());
			if (ePackage != null) {
				editionTableDescription.getMetamodel().add(ePackage);
			} else {
				//TODO log
			}
		}
		for (TableElement element : spTable.getElements()) {
			LineMapping lm = createLineMapping(spViewpoint, spTable, element, editionTableDescription);
			editionTableDescription.getOwnedLineMappings().add(lm);
		}
		for (TableProperty property : spTable.getProperties()) {
			FeatureColumnMapping cm = createPropertyMapping(spViewpoint, spTable, property);
			editionTableDescription.getOwnedColumnMappings().add(cm);
		}
		return editionTableDescription;
	}



	private LineMapping createLineMapping(SPViewpoint spViewpoint, SPTable spTable, TableElement element, EObject parent) {
		LineMapping lm = fr.obeo.dsl.viewpoint.table.metamodel.table.description.DescriptionFactory.eINSTANCE.createLineMapping();
		lm.setDomainClass(element.getEClass());
		String elementName = Iterables.getLast(Splitter.on('.').split(element.getEClass()));
		String representationQualifier = computeRepresentationQualifier(spViewpoint, spTable);
		String mappingName = representationQualifier  + ".line." + elementName;
		lm.setName(mappingName);
		lm.setSemanticCandidatesExpression(generateVPExpression(element.getExpression()));
		if (element.isRecursive()) {
			lm.getReusedSubLines().add(lm);
		}

		if (element.isCreatable()) {
			if (element.getExpression() instanceof FeatureRef) {
				CommandParameter creationParameter = getCreateLineToolCreationParameter(parent);
				if (creationParameter != null) {
					CreateLineTool tool = (CreateLineTool) creationParameter.getValue();
					tool.setForceRefresh(true);
					tool.setMapping(lm);
					tool.setName(representationQualifier + ".tool." + elementName);
					tool.setLabel("new " + elementName);

					ChangeContext changeContext = createToolModelOperation(element);
					tool.setFirstModelOperation(changeContext);
					Command cmd = CreateChildCommand.create(editingDomain, parent, creationParameter, Collections.emptyList());
					editingDomain.getCommandStack().execute(cmd);
				}
				if (element.isRecursive()) {
					CommandParameter subToolCreationParameter = getCreateLineToolCreationParameter(lm);
					if (subToolCreationParameter != null) {
						CreateLineTool subtool = (CreateLineTool) subToolCreationParameter.getValue();
						subtool.setForceRefresh(true);
						subtool.setMapping(lm);
						subtool.setName(representationQualifier + ".subtool." + elementName);
						subtool.setLabel("new " + elementName);
						ChangeContext changeContext = createToolModelOperation(element);
						subtool.setFirstModelOperation(changeContext);
						Command cmd = CreateChildCommand.create(editingDomain, lm, subToolCreationParameter, Collections.emptyList());
						editingDomain.getCommandStack().execute(cmd);
					}
				}
			} else {
				//Not enough information to automatically create a tool.
			}
		}
		if (!element.getSubElements().isEmpty()) {
			for (TableElement subElement : element.getSubElements()) {
				LineMapping subLM = createLineMapping(spViewpoint, spTable, subElement, lm);
				lm.getOwnedSubLines().add(subLM);
			}
		}
		return lm;
	}

	private CommandParameter getCreateLineToolCreationParameter(EObject parent) {
		CommandParameter creationParameter = null;
		IEditingDomainItemProvider provider = (IEditingDomainItemProvider)((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory().adapt(parent, IEditingDomainItemProvider.class);
		Collection<?> descriptors = provider.getNewChildDescriptors(parent, editingDomain, Collections.EMPTY_LIST);
		for (Object object : descriptors) {
			if (object instanceof CommandParameter) {
				CommandParameter param = (CommandParameter) object;
				if (param.getValue() instanceof CreateLineTool) {
					creationParameter = param;
				}
			}
		}
		return creationParameter;
	}

	private ChangeContext createToolModelOperation(TableElement element) {
		ChangeContext changeContext = ToolFactory.eINSTANCE.createChangeContext();
		changeContext.setBrowseExpression("var:element");
		CreateInstance createInstance = ToolFactory.eINSTANCE.createCreateInstance();
		createInstance.setReferenceName(element.getExpression().getValue());
		createInstance.setTypeName(element.getEClass());
		changeContext.getSubModelOperations().add(createInstance);
		return changeContext;
	}

	private FeatureColumnMapping createPropertyMapping(SPViewpoint spViewpoint, SPTable spTable, TableProperty property) {
		FeatureColumnMapping cm = fr.obeo.dsl.viewpoint.table.metamodel.table.description.DescriptionFactory.eINSTANCE.createFeatureColumnMapping();
 		cm.setName(computeRepresentationQualifier(spViewpoint, spTable) + ".column." + property.getFeature().toLowerCase());
		cm.setFeatureName(property.getFeature());
		if (!Strings.isNullOrEmpty(property.getLabel())) {
			cm.setHeaderLabelExpression(property.getLabel());
		}
		if (property.getExpression() != null) {
			cm.setLabelExpression(generateVPExpression(property.getExpression()));
		}
		return cm;
	}


	private String generateVPExpression(SPExpression expression) {
		if (expression instanceof AcceleoExpression) {
			return '[' + expression.getValue() + "/]";
		} else if (expression instanceof FeatureRef) {
			return "feature:" + expression.getValue();
		} else if (expression instanceof VarRef) {
			return "var:" + expression.getValue();
		}
		return expression.toString();
	}


	private String computeViewpointShortcut(SPViewpoint spViewpoint) {
		String shortcut = spViewpoint.getShortcut();
		if (Strings.isNullOrEmpty(shortcut)) {
			shortcut = spViewpoint.getName().substring(0, 3).toLowerCase();
		}
		return shortcut;
	}

	private String computeRepresentationQualifier(SPViewpoint spViewpoint, SPTable spTable) {
		return sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + "." + spTable.getName().toLowerCase();
	}

	private Resource getResource() {
		Resource prototyperResource = sPrototyper.eResource();
		URI rootURI = prototyperResource.getURI().trimSegments(1);
		URI resourceURI = rootURI.appendSegment(sPrototyper.getName()).appendFileExtension("odesign");
		return prototyperResource.getResourceSet().createResource(resourceURI);

	}

}
