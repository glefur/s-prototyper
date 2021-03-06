/*
 * generated by Xtext
 */
package fr.obeo.dsl.scoping;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.scoping.XImportSectionNamespaceScopeProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import fr.obeo.dsl.sPrototyper.MetamodelUsage;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.TableElement;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class SPrototyperScopeProvider extends XImportSectionNamespaceScopeProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context.eClass() == SPrototyperPackage.Literals.METAMODEL_USAGE && reference == SPrototyperPackage.Literals.METAMODEL_USAGE__USAGE) {
			return scope_MetamodelUsage_usage((MetamodelUsage) context, reference);
		} else if (context.eClass() == SPrototyperPackage.Literals.SP_TABLE && reference == SPrototyperPackage.Literals.SP_TABLE__ROOT) {
			return scope_SPTable_root((SPTable) context, reference);
		} else if (context.eClass() == SPrototyperPackage.Literals.TABLE_ELEMENT && reference == SPrototyperPackage.Literals.TABLE_ELEMENT__ECLASS) {
			return scope_TableElement_eClass((TableElement) context, reference);
		}
		return super.getScope(context, reference);
	}
	
	public IScope scope_MetamodelUsage_usage(MetamodelUsage context, EReference ref) {
		List<EPackage> allEPackages = Lists.newArrayList();
		Collection<Object> values = EPackage.Registry.INSTANCE.values();
		for (Object object : values) {
			if (object instanceof EPackage.Descriptor) {
				EPackage ePackage = ((EPackage.Descriptor)object).getEPackage();
				if (ePackage != null) 
					allEPackages.add(ePackage);
			} else if (object instanceof EPackage){
				allEPackages.add((EPackage) object);
			}
		}
		return Scopes.scopeFor(allEPackages, qualifiedNameProvider, IScope.NULLSCOPE);
	}
	
	public IScope scope_SPTable_root(SPTable context, EReference ref) {
		EList<MetamodelUsage> usages = context.getUsages();
		List<EClass> accessibleClasses = Lists.newArrayList();
		for (MetamodelUsage metamodelUsage : usages) {
			EPackage usage = metamodelUsage.getUsage();
				if (usage != null) {
				for (EClassifier eClassifier : usage.getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						accessibleClasses.add((EClass) eClassifier);
					}
				}
			}
		}
		return Scopes.scopeFor(accessibleClasses);
	}
	
	public IScope scope_TableElement_eClass(TableElement context, EReference ref) {
		SPTable table = null;
		EObject container = context.eContainer();
		while (table == null && container != null) {
			if (container instanceof SPTable) {
				table = (SPTable) container;
			} else {
				container = container.eContainer();
			}
		}
		if (table != null){
			EList<MetamodelUsage> usages = table.getUsages();
			List<EClass> accessibleClasses = Lists.newArrayList();
			for (MetamodelUsage metamodelUsage : usages) {
				EPackage usage = metamodelUsage.getUsage();
				if (usage != null) {
					for (EClassifier eClassifier : usage.getEClassifiers()) {
						if (eClassifier instanceof EClass) {
							accessibleClasses.add((EClass) eClassifier);
						}
					}
				}
			}
			return Scopes.scopeFor(accessibleClasses);
		} else {
			return IScope.NULLSCOPE;
		}
	}
		
}
