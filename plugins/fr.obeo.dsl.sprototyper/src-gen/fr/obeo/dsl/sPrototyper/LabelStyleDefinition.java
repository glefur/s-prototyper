/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Style Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getSize <em>Size</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isBold <em>Bold</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isItalic <em>Italic</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition()
 * @model
 * @generated
 */
public interface LabelStyleDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(SPExpression)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  SPExpression getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SPExpression value);

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition_Color()
   * @model containment="true"
   * @generated
   */
  SolidColorDefinition getColor();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getColor <em>Color</em>}' containment reference.
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Bold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bold</em>' attribute.
   * @see #setBold(boolean)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition_Bold()
   * @model
   * @generated
   */
  boolean isBold();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isBold <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bold</em>' attribute.
   * @see #isBold()
   * @generated
   */
  void setBold(boolean value);

  /**
   * Returns the value of the '<em><b>Italic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Italic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Italic</em>' attribute.
   * @see #setItalic(boolean)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getLabelStyleDefinition_Italic()
   * @model
   * @generated
   */
  boolean isItalic();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isItalic <em>Italic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Italic</em>' attribute.
   * @see #isItalic()
   * @generated
   */
  void setItalic(boolean value);

} // LabelStyleDefinition
