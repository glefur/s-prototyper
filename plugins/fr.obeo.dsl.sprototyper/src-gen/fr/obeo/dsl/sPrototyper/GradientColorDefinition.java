/**
 */
package fr.obeo.dsl.sPrototyper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Color Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getFrom <em>From</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getGradientColorDefinition()
 * @model
 * @generated
 */
public interface GradientColorDefinition extends ContainerColorDefinition
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Color)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getGradientColorDefinition_From()
   * @model containment="true"
   * @generated
   */
  Color getFrom();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Color value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Color)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getGradientColorDefinition_To()
   * @model containment="true"
   * @generated
   */
  Color getTo();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Color value);

} // GradientColorDefinition
