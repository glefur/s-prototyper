/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.common.collect.Maps;

import fr.obeo.dsl.viewpoint.description.DescriptionPackage;
import fr.obeo.dsl.viewpoint.description.Group;

/**
 * @author glefur
 *
 */
public class Merger {
	
	private EditingDomain editingDomain;
	
	public Merger(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public void serialize(String path, EObject model) throws IOException {
		IPath iPath = new Path(path);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(iPath);
		Resource resource;
		if (file.exists() && file.isAccessible()) {
			resource = editingDomain.getResourceSet().getResource(URI.createPlatformResourceURI(path, true), true);
			if (resource.getContents() == null || resource.getContents().isEmpty()) {
				resource.getContents().add(model);
			} else {
				EList<EObject> elements = resource.getContents();
				EObject equivalent = searchElement(elements, model);
				if (equivalent != null) {
					merge(model, equivalent);
				} else {
					resource.getContents().add(model);
				}
			}
			
		} else {
			resource = editingDomain.getResourceSet().createResource(URI.createPlatformResourceURI(path, true));
			resource.getContents().add(model);
		}
		Map<Object, Object> options = Maps.newHashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);
	}

	private void merge(EObject model, EObject equivalent) {
		for (EObject element : model.eContents()) {
			EStructuralFeature eContainingFeature = element.eContainingFeature();
			if (eContainingFeature.isMany()) {
				
			} else {
				
			}
			equivalent.eGet(eContainingFeature);
			
		}
	}

	private EObject searchElement(EList<EObject> elements, EObject model) {
		EObject equivalent = null;
		for (EObject element : elements) {
			if (element.eClass() == model.eClass()) {
				EAttribute idAttribute = getIdAttribute(model);
				Object value = model.eGet(idAttribute);
				if (value != null) {
					if (value.equals(element.eGet(idAttribute))) {
						equivalent = element;
					}
				} else {
					//I'm screwed!
				}
			}
		}
		return equivalent;
	}

	private EAttribute getIdAttribute(EObject model) {
		if (model instanceof Group) {
			return DescriptionPackage.Literals.GROUP__NAME;
		}
		return null;
	}

}
