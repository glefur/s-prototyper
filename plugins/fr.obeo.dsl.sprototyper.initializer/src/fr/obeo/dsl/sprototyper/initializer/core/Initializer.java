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
import fr.obeo.dsl.sPrototyper.BorderStyleDefinition;
import fr.obeo.dsl.sPrototyper.Color;
import fr.obeo.dsl.sPrototyper.Container;
import fr.obeo.dsl.sPrototyper.ContainerColorDefinition;
import fr.obeo.dsl.sPrototyper.ContainerStyleDefinition;
import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.GradientColorDefinition;
import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition;
import fr.obeo.dsl.sPrototyper.SPDiagram;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPRepresentation;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.SolidColorDefinition;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;
import fr.obeo.dsl.sPrototyper.VarRef;
import fr.obeo.dsl.viewpoint.ContainerLayout;
import fr.obeo.dsl.viewpoint.FontFormat;
import fr.obeo.dsl.viewpoint.description.ColorDescription;
import fr.obeo.dsl.viewpoint.description.ContainerMapping;
import fr.obeo.dsl.viewpoint.description.DescriptionFactory;
import fr.obeo.dsl.viewpoint.description.DiagramDescription;
import fr.obeo.dsl.viewpoint.description.Environment;
import fr.obeo.dsl.viewpoint.description.Group;
import fr.obeo.dsl.viewpoint.description.Layer;
import fr.obeo.dsl.viewpoint.description.SystemColor;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.description.style.FlatContainerStyleDescription;
import fr.obeo.dsl.viewpoint.description.style.StyleFactory;
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

	private static final String DEFAULT_LABEL_EXPRESSION = "feature:name";
	private EditingDomain editingDomain;
	private SPrototyper sPrototyper;
	private Environment environment;

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
				EditionTableDescription editionTableDescription = createEditionTable(spViewpoint, spTable);
				viewpoint.getOwnedRepresentations().add(editionTableDescription);
			} else if (spRepresentation instanceof SPDiagram) {
				SPDiagram spDiagram = (SPDiagram)spRepresentation;
				DiagramDescription diagramDescription = createDiagram(spViewpoint, spDiagram);
				viewpoint.getOwnedRepresentations().add(diagramDescription);
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
		String representationQualifier = computeTableQualifier(spViewpoint, spTable);
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
		cm.setName(computeTableQualifier(spViewpoint, spTable) + ".column." + property.getFeature().toLowerCase());
		cm.setFeatureName(property.getFeature());
		if (!Strings.isNullOrEmpty(property.getLabel())) {
			cm.setHeaderLabelExpression(property.getLabel());
		}
		if (property.getExpression() != null) {
			cm.setLabelExpression(generateVPExpression(property.getExpression()));
		}
		return cm;
	}


	private DiagramDescription createDiagram(SPViewpoint spViewpoint, SPDiagram spDiagram) {
		DiagramDescription diagramDescription = DescriptionFactory.eINSTANCE.createDiagramDescription();
		diagramDescription.setDomainClass(spDiagram.getRoot());
		diagramDescription.setName(sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + ".rep." + spDiagram.getName());
		if (!Strings.isNullOrEmpty(spDiagram.getLabel())) {
			diagramDescription.setLabel(spDiagram.getLabel());
		} else {
			diagramDescription.setLabel(spDiagram.getName());
		}
		if (!Strings.isNullOrEmpty(spDiagram.getTitle())) {
			diagramDescription.setTitleExpression(spDiagram.getTitle());
		}
		for (MetamodelRef mmRef : spDiagram.getMetamodels()) {
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(mmRef.getMetamodel());
			if (ePackage != null) {
				diagramDescription.getMetamodel().add(ePackage);
			} else {
				//TODO log
			}
		}
		Layer defaultLayer = DescriptionFactory.eINSTANCE.createLayer();
		defaultLayer.setName("default");
		diagramDescription.setDefaultLayer(defaultLayer);
		for (DiagramElement element : spDiagram.getElements()) {
			if (element instanceof Container) {
				ContainerMapping mapping = createContainerMapping(spViewpoint, spDiagram, (Container)element, defaultLayer);
				defaultLayer.getContainerMappings().add(mapping);
			}
		}
		return diagramDescription;
	}


	private ContainerMapping createContainerMapping(SPViewpoint spViewpoint, SPDiagram spDiagram, Container containerDefinition, EObject parent) {
		ContainerMapping containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping();
		containerMapping.setDomainClass(containerDefinition.getEClass());
		String elementName = Iterables.getLast(Splitter.on('.').split(containerDefinition.getEClass()));
		String representationQualifier = computeDiagramQualifier(spViewpoint, spDiagram);
		String mappingName = representationQualifier  + ".container." + elementName;
		containerMapping.setName(mappingName);
		containerMapping.setSemanticCandidatesExpression(generateVPExpression(containerDefinition.getExpression()));
		if (!Strings.isNullOrEmpty(containerDefinition.getContainerType()) && "list".equals(containerDefinition.getContainerType())) {
			containerMapping.setChildrenPresentation(ContainerLayout.LIST);
		}
		if (containerDefinition.isRecursive()) {
			containerMapping.getReusedContainerMappings().add(containerMapping);
		}
		
		FlatContainerStyleDescription containerStyle = generateContainerStyle(containerDefinition);
		containerMapping.setStyle(containerStyle);
		
		for (DiagramElement subElement : containerDefinition.getElements()) {
			if (subElement instanceof Container) {
				ContainerMapping subMapping = createContainerMapping(spViewpoint, spDiagram, (Container) subElement, containerMapping);
				containerMapping.getSubContainerMappings().add(subMapping);
			}
		}
		return containerMapping;
	}


	private FlatContainerStyleDescription generateContainerStyle(
			Container containerDefinition) {
		FlatContainerStyleDescription containerStyle = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		containerStyle.setLabelFormat(FontFormat.BOLD_LITERAL);

		ContainerStyleDefinition style = containerDefinition.getStyle();

		ContainerColorDefinition colorDefinition = style.getColor();
		if (colorDefinition instanceof GradientColorDefinition) {
			GradientColorDefinition gcd = (GradientColorDefinition) colorDefinition;
			containerStyle.setBackgroundColor(getColor(gcd.getTo()));
			containerStyle.setForegroundColor(getColor(gcd.getFrom()));			
		} else if (colorDefinition instanceof SolidColorDefinition) {
			SolidColorDefinition scd = (SolidColorDefinition) colorDefinition;
			containerStyle.setBackgroundColor(getColor(scd.getColor()));
			containerStyle.setForegroundColor(getColor(scd.getColor()));			
		}
		if (style.getLabel() != null) {
			LabelStyleDefinition labelDefinition = style.getLabel(); 
			if (labelDefinition.getExpression() != null) {
				containerStyle.setLabelExpression(generateVPExpression(labelDefinition.getExpression()));
			} else {
				containerStyle.setLabelExpression(DEFAULT_LABEL_EXPRESSION);
			}
			if (labelDefinition.getColor() != null) {
				containerStyle.setLabelColor(getColor(labelDefinition.getColor().getColor()));
				if (labelDefinition.eIsSet(SPrototyperPackage.Literals.LABEL_STYLE_DEFINITION__SIZE)) {
					containerStyle.setLabelSize(labelDefinition.getSize());
				}
				boolean bold = true; boolean italic = false;
				if (labelDefinition.eIsSet(SPrototyperPackage.Literals.LABEL_STYLE_DEFINITION__BOLD)) {
					bold = labelDefinition.isBold();
				}
				if (labelDefinition.eIsSet(SPrototyperPackage.Literals.LABEL_STYLE_DEFINITION__ITALIC)) {
					italic = labelDefinition.isItalic();						
				}
				FontFormat fontFormat;
				if (bold) {
					if (italic) {
						fontFormat = FontFormat.BOLD_ITALIC_LITERAL;
					} else {
						fontFormat = FontFormat.BOLD_LITERAL;
					}
				} else {
					if (italic) {
						fontFormat = FontFormat.ITALIC_LITERAL;
					} else {
						fontFormat = FontFormat.NORMAL_LITERAL;
					}
				}
				containerStyle.setLabelFormat(fontFormat);
			}
		} else {
			containerStyle.setLabelExpression(DEFAULT_LABEL_EXPRESSION);
		}
		if (style.getBorder() != null) {
			BorderStyleDefinition borderDefinition = style.getBorder();
			containerStyle.setBorderColor(getColor(borderDefinition.getColor().getColor()));			
			if (borderDefinition.eIsSet(SPrototyperPackage.Literals.BORDER_STYLE_DEFINITION__SIZE)) {
				containerStyle.setBorderSizeComputationExpression(String.valueOf(borderDefinition.getSize()));
			}
		}
		return containerStyle;
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

	private String computeDiagramQualifier(SPViewpoint spViewpoint, SPDiagram spDiagram) {
		return sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + "." + spDiagram.getName().toLowerCase();
	}

	private String computeTableQualifier(SPViewpoint spViewpoint, SPTable spTable) {
		return sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + "." + spTable.getName().toLowerCase();
	}

	private Resource getResource() {
		Resource prototyperResource = sPrototyper.eResource();
		URI rootURI = prototyperResource.getURI().trimSegments(1);
		URI resourceURI = rootURI.appendSegment(sPrototyper.getName()).appendFileExtension("odesign");
		return prototyperResource.getResourceSet().createResource(resourceURI);
	}

	private ColorDescription getColor(Color colorDef) {
		if (colorDef instanceof PreDefinedColorDefinition) {
			Environment env = getEnvironment();
			String zeColor = ((PreDefinedColorDefinition)colorDef).getColor().getLiteral().replaceAll(" ", "_");
			for (SystemColor sysColor : env.getSystemColors().getEntries()) {
				if (zeColor.equals(sysColor.getName())) {
					return sysColor;
				}
			}
		}
		return null;
	}


	private Environment getEnvironment() {
		if (environment == null) {
			Resource viewpointEnvironmentResource = editingDomain.getResourceSet().getResource(URI.createURI("environment:/viewpoint"), true);
			if (viewpointEnvironmentResource != null 
					&& viewpointEnvironmentResource.getContents() != null 
					&& !viewpointEnvironmentResource.getContents().isEmpty() 
					&& viewpointEnvironmentResource.getContents().get(0) instanceof Environment) {
				environment = (Environment) viewpointEnvironmentResource.getContents().get(0);
			} else {
				//TODO log
			}
		}
		return environment;
	}

}
