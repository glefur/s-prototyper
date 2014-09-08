/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.MetamodelUsage#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getMetamodelUsage()
 * @model
 * @generated
 */
public interface MetamodelUsage extends EObject
{
  /**
   * Returns the value of the '<em><b>Usage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usage</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' reference.
   * @see #setUsage(EPackage)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getMetamodelUsage_Usage()
   * @model
   * @generated
   */
  EPackage getUsage();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.MetamodelUsage#getUsage <em>Usage</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usage</em>' reference.
   * @see #getUsage()
   * @generated
   */
  void setUsage(EPackage value);

} // MetamodelUsage
