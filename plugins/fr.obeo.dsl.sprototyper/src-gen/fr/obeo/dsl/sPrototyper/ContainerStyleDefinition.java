/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Style Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainerStyleDefinition()
 * @model
 * @generated
 */
public interface ContainerStyleDefinition extends EObject
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
   * @see #setColor(ContainerColorDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainerStyleDefinition_Color()
   * @model containment="true"
   * @generated
   */
  ContainerColorDefinition getColor();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(ContainerColorDefinition value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(LabelStyleDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainerStyleDefinition_Label()
   * @model containment="true"
   * @generated
   */
  LabelStyleDefinition getLabel();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(LabelStyleDefinition value);

  /**
   * Returns the value of the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border</em>' containment reference.
   * @see #setBorder(BorderStyleDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainerStyleDefinition_Border()
   * @model containment="true"
   * @generated
   */
  BorderStyleDefinition getBorder();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getBorder <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border</em>' containment reference.
   * @see #getBorder()
   * @generated
   */
  void setBorder(BorderStyleDefinition value);

} // ContainerStyleDefinition
