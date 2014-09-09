/**
 * 
 */
package fr.obeo.dsl.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Strings;

/**
 * @author glefur
 *
 */
public class SPrototyperQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		QualifiedName fullyQualifiedName = super.getFullyQualifiedName(obj);
		return fullyQualifiedName;
	}

	/**
	 * @param ePackage
	 * @return
	 */
	public QualifiedName qualifiedName(EPackage ePackage) {
		if (ePackage != null && !Strings.isNullOrEmpty(ePackage.getNsURI())) {
			String[] split = ePackage.getNsURI().split("\\.");
			return QualifiedName.create(split);
		}
		return QualifiedName.EMPTY;
	}
	
}
