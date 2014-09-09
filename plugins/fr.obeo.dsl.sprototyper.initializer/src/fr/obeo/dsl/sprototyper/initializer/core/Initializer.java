/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

import fr.obeo.dsl.sPrototyper.AcceleoExpression;
import fr.obeo.dsl.sPrototyper.BorderStyleDefinition;
import fr.obeo.dsl.sPrototyper.Container;
import fr.obeo.dsl.sPrototyper.ContainerColorDefinition;
import fr.obeo.dsl.sPrototyper.ContainerStyleDefinition;
import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.GradientColorDefinition;
import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.MetamodelUsage;
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
import fr.obeo.dsl.sprototyper.initializer.core.services.NamingService;
import fr.obeo.dsl.sprototyper.initializer.core.services.ToolsService;
import fr.obeo.dsl.sprototyper.initializer.core.services.VSMService;
import fr.obeo.dsl.viewpoint.ContainerLayout;
import fr.obeo.dsl.viewpoint.FontFormat;
import fr.obeo.dsl.viewpoint.description.ContainerMapping;
import fr.obeo.dsl.viewpoint.description.DescriptionFactory;
import fr.obeo.dsl.viewpoint.description.DiagramDescription;
import fr.obeo.dsl.viewpoint.description.Group;
import fr.obeo.dsl.viewpoint.description.Layer;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.description.style.FlatContainerStyleDescription;
import fr.obeo.dsl.viewpoint.description.style.StyleFactory;
import fr.obeo.dsl.viewpoint.description.tool.ChangeContext;
import fr.obeo.dsl.viewpoint.description.tool.ContainerCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.InitialNodeCreationOperation;
import fr.obeo.dsl.viewpoint.description.tool.ToolFactory;
import fr.obeo.dsl.viewpoint.description.tool.ToolPackage;
import fr.obeo.dsl.viewpoint.description.tool.ToolSection;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.CreateLineTool;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.DescriptionPackage;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.EditionTableDescription;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.FeatureColumnMapping;
import fr.obeo.dsl.viewpoint.table.metamodel.table.description.LineMapping;

/**
 * @author glefur
 *
 */
public class Initializer {

	private static final String DEFAULT_LABEL_EXPRESSION = "feature:name";
	
	private NamingService namingService;
	private ToolsService toolsService;
	private VSMService vsmService;
	
	private EditingDomain editingDomain;
	private SPrototyper sPrototyper;


	public Initializer(NamingService namingService, ToolsService toolsService, VSMService vsmService, EditingDomain editingDomain, SPrototyper sPrototyper) {
		this.namingService = namingService;
		this.toolsService = toolsService;
		this.vsmService = vsmService;
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
		EClass root = spTable.getRoot();
		editionTableDescription.setDomainClass(root.getEPackage().getName() + "." + root.getName());
		editionTableDescription.setName(sPrototyper.getQualifier() + "." + namingService.computeViewpointShortcut(spViewpoint) + ".rep." + spTable.getName());
		if (!Strings.isNullOrEmpty(spTable.getLabel())) {
			editionTableDescription.setLabel(spTable.getLabel());
		} else {
			editionTableDescription.setLabel(spTable.getName());			
		}
		if (!Strings.isNullOrEmpty(spTable.getTitle())) {
			editionTableDescription.setTitleExpression(spTable.getTitle());
		}
		for (MetamodelUsage usage : spTable.getUsages()) {
			editionTableDescription.getMetamodel().add(usage.getUsage());
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
		EClass eClass = element.getEClass();
		String elementName = eClass.getName();
		String domainClass = eClass.getEPackage().getName() + "." + eClass.getName();
		lm.setDomainClass(domainClass);
		String representationQualifier = namingService.computeTableQualifier(spViewpoint, spTable);
		String mappingName = representationQualifier  + ".line." + elementName;
		lm.setName(mappingName);
		lm.setSemanticCandidatesExpression(generateVPExpression(element.getExpression()));
		if (element.isRecursive()) {
			lm.getReusedSubLines().add(lm);
		}

		if (element.isCreatable()) {
			if (element.getExpression() instanceof FeatureRef) {
				CommandParameter creationParameter = toolsService.getToolCreationParameter(DescriptionPackage.Literals.CREATE_LINE_TOOL, parent);
				if (creationParameter != null) {
					CreateLineTool tool = (CreateLineTool) creationParameter.getValue();
					tool.setForceRefresh(true);
					tool.setMapping(lm);
					tool.setName(representationQualifier + ".tool." + elementName);
					tool.setLabel("new " + elementName);

					ChangeContext changeContext = toolsService.createToolModelOperation(element);
					tool.setFirstModelOperation(changeContext);
					Command cmd = CreateChildCommand.create(editingDomain, parent, creationParameter, Collections.emptyList());
					editingDomain.getCommandStack().execute(cmd);
				}
				if (element.isRecursive()) {
					CommandParameter subToolCreationParameter = toolsService.getToolCreationParameter(DescriptionPackage.Literals.CREATE_LINE_TOOL, lm);
					if (subToolCreationParameter != null) {
						CreateLineTool subtool = (CreateLineTool) subToolCreationParameter.getValue();
						subtool.setForceRefresh(true);
						subtool.setMapping(lm);
						subtool.setName(representationQualifier + ".subtool." + elementName);
						subtool.setLabel("new " + elementName);
						ChangeContext changeContext = toolsService.createToolModelOperation(element);
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

	private FeatureColumnMapping createPropertyMapping(SPViewpoint spViewpoint, SPTable spTable, TableProperty property) {
		FeatureColumnMapping cm = fr.obeo.dsl.viewpoint.table.metamodel.table.description.DescriptionFactory.eINSTANCE.createFeatureColumnMapping();
		cm.setName(namingService.computeTableQualifier(spViewpoint, spTable) + ".column." + property.getFeature().toLowerCase());
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
		diagramDescription.setName(sPrototyper.getQualifier() + "." + namingService.computeViewpointShortcut(spViewpoint) + ".rep." + spDiagram.getName());
		if (!Strings.isNullOrEmpty(spDiagram.getLabel())) {
			diagramDescription.setLabel(spDiagram.getLabel());
		} else {
			diagramDescription.setLabel(spDiagram.getName());
		}
		if (!Strings.isNullOrEmpty(spDiagram.getTitle())) {
			diagramDescription.setTitleExpression(spDiagram.getTitle());
		}
		for (MetamodelUsage usage : spDiagram.getMetamodels()) {
			diagramDescription.getMetamodel().add(usage.getUsage());
		}
		Layer defaultLayer = DescriptionFactory.eINSTANCE.createLayer();
		defaultLayer.setName("default");
		diagramDescription.setDefaultLayer(defaultLayer);
		for (DiagramElement element : spDiagram.getElements()) {
			if (element instanceof Container) {
				ContainerMapping mapping = createContainerMapping(spViewpoint, spDiagram, defaultLayer, (Container)element, defaultLayer);
				defaultLayer.getContainerMappings().add(mapping);
			}
		}
		return diagramDescription;
	}


	private ContainerMapping createContainerMapping(SPViewpoint spViewpoint, SPDiagram spDiagram, Layer workingLayer, Container containerDefinition, EObject parent) {
		ContainerMapping containerMapping = DescriptionFactory.eINSTANCE.createContainerMapping();
		containerMapping.setDomainClass(containerDefinition.getEClass());
		String elementName = Iterables.getLast(Splitter.on('.').split(containerDefinition.getEClass()));
		String representationQualifier = namingService.computeDiagramQualifier(spViewpoint, spDiagram);
		String mappingName = representationQualifier  + ".container." + containerDefinition.getName();
		containerMapping.setName(mappingName);
		containerMapping.setSemanticCandidatesExpression(generateVPExpression(containerDefinition.getExpression()));
		if (!Strings.isNullOrEmpty(containerDefinition.getContainerType()) && "list".equals(containerDefinition.getContainerType())) {
			containerMapping.setChildrenPresentation(ContainerLayout.LIST);
		}
		if (containerDefinition.isRecursive()) {
			containerMapping.getReusedContainerMappings().add(containerMapping);
		}
		if (containerDefinition.isCreatable()) {
			ToolSection section = toolsService.getElementsSection(spViewpoint, spDiagram, workingLayer);
			CommandParameter creationParameter = toolsService.getToolCreationParameter(ToolPackage.Literals.CONTAINER_CREATION_DESCRIPTION, section);
			ContainerCreationDescription tool = (ContainerCreationDescription) creationParameter.getValue();
			tool.setForceRefresh(true);
			tool.getContainerMappings().add(containerMapping);
			tool.setName(representationQualifier + ".tool.create." + elementName);
			tool.setLabel("new " + elementName);

			ChangeContext changeContext = toolsService.createToolModelOperation(containerDefinition);
			InitialNodeCreationOperation operation = ToolFactory.eINSTANCE.createInitialNodeCreationOperation();
			operation.setFirstModelOperations(changeContext);
			tool.setInitialOperation(operation);
			Command cmd = CreateChildCommand.create(editingDomain, section, creationParameter, Collections.emptyList());
			editingDomain.getCommandStack().execute(cmd);
		}
		
		FlatContainerStyleDescription containerStyle = generateContainerStyle(containerDefinition);
		containerMapping.setStyle(containerStyle);
		
		for (DiagramElement subElement : containerDefinition.getElements()) {
			if (subElement instanceof Container) {
				ContainerMapping subMapping = createContainerMapping(spViewpoint, spDiagram, workingLayer,(Container) subElement, containerMapping);
				containerMapping.getSubContainerMappings().add(subMapping);
			}
		}
		return containerMapping;
	}

	private FlatContainerStyleDescription generateContainerStyle(Container containerDefinition) {
		FlatContainerStyleDescription containerStyle = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		containerStyle.setLabelFormat(FontFormat.BOLD_LITERAL);

		ContainerStyleDefinition style = containerDefinition.getStyle();

		ContainerColorDefinition colorDefinition = style.getColor();
		if (colorDefinition instanceof GradientColorDefinition) {
			GradientColorDefinition gcd = (GradientColorDefinition) colorDefinition;
			containerStyle.setBackgroundColor(vsmService.getColor(gcd.getTo()));
			containerStyle.setForegroundColor(vsmService.getColor(gcd.getFrom()));			
		} else if (colorDefinition instanceof SolidColorDefinition) {
			SolidColorDefinition scd = (SolidColorDefinition) colorDefinition;
			containerStyle.setBackgroundColor(vsmService.getColor(scd.getColor()));
			containerStyle.setForegroundColor(vsmService.getColor(scd.getColor()));			
		}
		if (style.getLabel() != null) {
			LabelStyleDefinition labelDefinition = style.getLabel(); 
			if (labelDefinition.getExpression() != null) {
				containerStyle.setLabelExpression(generateVPExpression(labelDefinition.getExpression()));
			} else {
				containerStyle.setLabelExpression(DEFAULT_LABEL_EXPRESSION);
			}
			containerStyle.setShowIcon(false);
			if (labelDefinition.getColor() != null) {
				containerStyle.setLabelColor(vsmService.getColor(labelDefinition.getColor().getColor()));
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
			containerStyle.setBorderColor(vsmService.getColor(borderDefinition.getColor().getColor()));			
			if (borderDefinition.eIsSet(SPrototyperPackage.Literals.BORDER_STYLE_DEFINITION__SIZE)) {
				containerStyle.setBorderSizeComputationExpression(String.valueOf(borderDefinition.getSize()));
			}
		}
		return containerStyle;
	}
	
//	private NodeMapping createNodeMapping(SPViewpoint spViewpoint, SPDiagram spDiagram, Layer workingLayer, Node nodeDefinition, EObject parent) {
//		NodeMapping nodeMapping = DescriptionFactory.eINSTANCE.createNodeMapping();
//		nodeMapping.setDomainClass(nodeDefinition.getEClass());
//		String elementName = Iterables.getLast(Splitter.on('.').split(nodeDefinition.getEClass()));
//		String representationQualifier = namingService.computeDiagramQualifier(spViewpoint, spDiagram);
//		String mappingName = representationQualifier  + ".container." + nodeDefinition.getName();
//		nodeMapping.setName(mappingName);
//		nodeMapping.setSemanticCandidatesExpression(generateVPExpression(nodeDefinition.getExpression()));
//
//		if (nodeDefinition.isCreatable()) {
//			ToolSection section = toolsService.getElementsSection(spViewpoint, spDiagram, workingLayer);
//			CommandParameter creationParameter = toolsService.getToolCreationParameter(ToolPackage.Literals.NODE_CREATION_DESCRIPTION, section);
//			NodeCreationDescription tool = (NodeCreationDescription) creationParameter.getValue();
//			tool.setForceRefresh(true);
//			tool.getNodeMappings().add(nodeMapping);
//			tool.setName(representationQualifier + ".tool.create." + elementName);
//			tool.setLabel("new " + elementName);
//
//			ChangeContext changeContext = toolsService.createToolModelOperation(nodeDefinition);
//			InitialNodeCreationOperation operation = ToolFactory.eINSTANCE.createInitialNodeCreationOperation();
//			operation.setFirstModelOperations(changeContext);
//			tool.setInitialOperation(operation);
//			Command cmd = CreateChildCommand.create(editingDomain, section, creationParameter, Collections.emptyList());
//			editingDomain.getCommandStack().execute(cmd);
//		}
//		
//		FlatContainerStyleDescription containerStyle = generateContainerStyle(nodeDefinition);
//		nodeMapping.setStyle(containerStyle);
//		
//		for (DiagramElement subElement : nodeDefinition.getElements()) {
//			if (subElement instanceof Container) {
//				ContainerMapping subMapping = createContainerMapping(spViewpoint, spDiagram, workingLayer,(Container) subElement, nodeMapping);
//				nodeMapping.getSubContainerMappings().add(subMapping);
//			}
//		}
//		return nodeMapping;
//	}

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



	private Resource getResource() {
		Resource prototyperResource = sPrototyper.eResource();
		URI rootURI = prototyperResource.getURI().trimSegments(1);
		URI resourceURI = rootURI.appendSegment(sPrototyper.getName()).appendFileExtension("odesign");
		return prototyperResource.getResourceSet().createResource(resourceURI);
	}


}
