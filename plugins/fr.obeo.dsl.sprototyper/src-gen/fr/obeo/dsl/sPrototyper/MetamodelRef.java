/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.MetamodelRef#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getMetamodelRef()
 * @model
 * @generated
 */
public interface MetamodelRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' attribute.
   * @see #setMetamodel(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getMetamodelRef_Metamodel()
   * @model
   * @generated
   */
  String getMetamodel();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.MetamodelRef#getMetamodel <em>Metamodel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' attribute.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(String value);

} // MetamodelRef
