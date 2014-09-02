/**
 */
package fr.obeo.dsl.sPrototyper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Defined Color Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getPreDefinedColorDefinition()
 * @model
 * @generated
 */
public interface PreDefinedColorDefinition extends Color
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.dsl.sPrototyper.PreDefinedColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColor
   * @see #setColor(PreDefinedColor)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getPreDefinedColorDefinition_Color()
   * @model
   * @generated
   */
  PreDefinedColor getColor();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColor
   * @see #getColor()
   * @generated
   */
  void setColor(PreDefinedColor value);

} // PreDefinedColorDefinition
