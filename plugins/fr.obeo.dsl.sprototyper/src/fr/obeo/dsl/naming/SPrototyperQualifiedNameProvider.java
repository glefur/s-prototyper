/**
 * 
 */
package fr.obeo.dsl.naming;

import java.util.Collections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author glefur
 *
 */
public class SPrototyperQualifiedNameProvider extends XbaseQualifiedNameProvider {

	private PolymorphicDispatcher<String> nameDispatcher = new PolymorphicDispatcher<String>("name", 1, 1,
			Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<String> get()) {
		@Override
		protected String handleNoSuchMethod(Object... params) {
			return null;
		}
	};

	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;

	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return cache.get(Tuples.pair(obj, getCacheKey()), obj.eResource(), new Provider<QualifiedName>() {

			public QualifiedName get() {
				EObject temp = obj;
				String name = nameDispatcher.invoke(temp);
				if (org.eclipse.xtext.util.Strings.isEmpty(name))
					return null;
				QualifiedName qualifiedName = QualifiedName.create(name);
				if(!isRecurseParent(obj))
					return qualifiedName;
				QualifiedName parentsQualifiedName = getFullyQualifiedName(obj.eContainer());
				if (parentsQualifiedName == null)
					return null;
				else 
					return parentsQualifiedName.append(qualifiedName);
			}

		});
	}

	protected String name(EPackage ePackage) {
		return ePackage.getNsURI();
	}

	protected String getCacheKey() {
		return "nsURIfqn";
	}
	
	protected boolean isRecurseParent(EObject obj) {
		return !(obj instanceof EPackage) && obj.eContainer() != null;
	}

	protected String name(EClassifier eClassifier) {
		return eClassifier.getName();
	}

	protected String name(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName();
	}

	protected String name(EOperation eOperation) {
		return eOperation.getName();
	}
	
}
