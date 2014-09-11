/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core.services;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;

import fr.obeo.dsl.sPrototyper.Container;
import fr.obeo.dsl.sPrototyper.SPDiagram;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.viewpoint.description.Layer;
import fr.obeo.dsl.viewpoint.description.tool.ChangeContext;
import fr.obeo.dsl.viewpoint.description.tool.CreateInstance;
import fr.obeo.dsl.viewpoint.description.tool.ModelOperation;
import fr.obeo.dsl.viewpoint.description.tool.ToolFactory;
import fr.obeo.dsl.viewpoint.description.tool.ToolSection;

/**
 * @author glefur
 *
 */
public class ToolsService {
	
	private EditingDomain editingDomain;
	private NamingService namingService;
	private VSMService vsmService;
	
	public ToolsService(NamingService namingService, VSMService vsmService, EditingDomain editingDomain) {
		this.namingService = namingService;
		this.vsmService = vsmService;
		this.editingDomain = editingDomain;
	}

	public ToolSection getElementsSection(SPViewpoint spViewpoint, SPDiagram spDiagram, Layer layer) {
		for (ToolSection section : layer.getToolSections()) {
			if ("Elements".equals(section.getLabel())) {
				return section;
			}
		}
		ToolSection toolSection = ToolFactory.eINSTANCE.createToolSection();
		String representationQualifier = namingService.computeDiagramQualifier(spViewpoint, spDiagram);
		toolSection.setName(representationQualifier + ".tool.section.elements");
		toolSection.setLabel("Elements");
		layer.getToolSections().add(toolSection);
		return toolSection;
	}

	
	public ChangeContext createToolModelOperation(EObject element) {
		ChangeContext changeContext = ToolFactory.eINSTANCE.createChangeContext();
		String browseExpression = "var:element";
		if (element instanceof Container) {
			browseExpression = "var:container";
		}
		changeContext.setBrowseExpression(browseExpression);
		ModelOperation subOperation;
		if (element instanceof TableElement && ((TableElement) element).getCreateExpression() != null) {
			subOperation = ToolFactory.eINSTANCE.createChangeContext();
			((ChangeContext)subOperation).setBrowseExpression(vsmService.generateVPExpression(((TableElement) element).getCreateExpression()));
		} else {
			subOperation = ToolFactory.eINSTANCE.createCreateInstance();
			((CreateInstance)subOperation).setReferenceName(extractExpression(element).getValue());
			((CreateInstance)subOperation).setTypeName(extractEClass(element));
		}
		changeContext.getSubModelOperations().add(subOperation);
		return changeContext;
	}
	
	private SPExpression extractExpression(EObject element) {
		if (element instanceof TableElement) {
			return ((TableElement) element).getExpression();
		} else if (element instanceof Container) {
			return ((Container) element).getExpression();
		}
		return null;
	}
	
	private String extractEClass(EObject element) {
		EClass eClass = null;
		if (element instanceof TableElement) {
			eClass = ((TableElement) element).getEClass();
		} else if (element instanceof Container) {
//			eClass = ((Container) element).getEClass();
			//TODO
		}
		return eClass != null ? (eClass.getEPackage().getName() + "." + eClass.getName()):"";
	}
	
	public CommandParameter getToolCreationParameter(EClass toolKind, EObject parent) {
		CommandParameter creationParameter = null;
		IEditingDomainItemProvider provider = (IEditingDomainItemProvider)((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory().adapt(parent, IEditingDomainItemProvider.class);
		Collection<?> descriptors = provider.getNewChildDescriptors(parent, editingDomain, Collections.EMPTY_LIST);
		for (Object object : descriptors) {
			if (object instanceof CommandParameter) {
				CommandParameter param = (CommandParameter) object;
				if (toolKind.isInstance(param.getValue())) {
					creationParameter = param;
				}
			}
		}
		return creationParameter;
	}


}
