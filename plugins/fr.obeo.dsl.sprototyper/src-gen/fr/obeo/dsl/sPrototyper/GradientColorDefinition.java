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
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getGradientColorDefinition_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getGradientColorDefinition_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

} // GradientColorDefinition
