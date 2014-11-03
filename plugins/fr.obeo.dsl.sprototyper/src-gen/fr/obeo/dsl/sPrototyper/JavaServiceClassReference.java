/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Service Class Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.JavaServiceClassReference#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getJavaServiceClassReference()
 * @model
 * @generated
 */
public interface JavaServiceClassReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Java Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Class</em>' containment reference.
   * @see #setJavaClass(JvmTypeReference)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getJavaServiceClassReference_JavaClass()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJavaClass();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.JavaServiceClassReference#getJavaClass <em>Java Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Class</em>' containment reference.
   * @see #getJavaClass()
   * @generated
   */
  void setJavaClass(JvmTypeReference value);

} // JavaServiceClassReference
