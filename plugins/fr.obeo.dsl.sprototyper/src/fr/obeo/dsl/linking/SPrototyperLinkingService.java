package fr.obeo.dsl.linking;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import fr.obeo.dsl.sPrototyper.MetamodelUsage;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

public class SPrototyperLinkingService extends DefaultLinkingService {

	private static final Logger log = Logger.getLogger(SPrototyperLinkingService.class);
	
	@Inject
	private IValueConverterService valueConverterService;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			INode node) throws IllegalNodeException {
		if (ref == SPrototyperPackage.eINSTANCE.getMetamodelUsage_Usage() && context instanceof MetamodelUsage)
			return getPackage((MetamodelUsage)context, (ILeafNode) node);
		return super.getLinkedObjects(context, ref, node);
	}

	private List<EObject> getPackage(MetamodelUsage context, ILeafNode text) {
		String nsUri = getMetamodelNsURI(text);
		if (nsUri == null)
			return Collections.emptyList();
		if (EPackage.Registry.INSTANCE.getEPackage(nsUri) != null) {
			return Lists.newArrayList((EObject)EPackage.Registry.INSTANCE.getEPackage(nsUri));
		}
		return Collections.emptyList();
	}
	
	private String getMetamodelNsURI(ILeafNode text) {
		try {
			return (String) valueConverterService.toValue(text.getText(), getLinkingHelper().getRuleNameFrom(text
					.getGrammarElement()), text);
		} catch (ValueConverterException e) {
			log.debug("Exception on leaf '" + text.getText() + "'", e);
			return null;
		}
	}
}
