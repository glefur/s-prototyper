/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

import fr.obeo.dsl.sPrototyper.Color;
import fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition;
import fr.obeo.dsl.viewpoint.description.ColorDescription;
import fr.obeo.dsl.viewpoint.description.Environment;
import fr.obeo.dsl.viewpoint.description.Layer;
import fr.obeo.dsl.viewpoint.description.SystemColor;

/**
 * @author glefur
 *
 */
public class VSMService {
	
	private Environment environment;
	private EditingDomain editingDomain;
	
	
	public VSMService(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public Layer getLayer(EObject parent) {
		if (parent instanceof Layer) {
			return (Layer) parent;
		}
		if (parent.eContainer() != null) {
			return getLayer(parent.eContainer());
		}
		return null;
	}

	public ColorDescription getColor(Color colorDef) {
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


	public Environment getEnvironment() {
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
