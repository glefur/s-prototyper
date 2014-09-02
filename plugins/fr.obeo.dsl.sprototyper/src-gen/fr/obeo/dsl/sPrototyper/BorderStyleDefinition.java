/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Style Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getBorderStyleDefinition()
 * @model
 * @generated
 */
public interface BorderStyleDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(SolidColorDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getBorderStyleDefinition_Color()
   * @model containment="true"
   * @generated
   */
  SolidColorDefinition getColor();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(SolidColorDefinition value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getBorderStyleDefinition_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // BorderStyleDefinition
