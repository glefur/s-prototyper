/**
 */
package fr.obeo.dsl.sPrototyper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends DiagramElement
{
  /**
   * Returns the value of the '<em><b>Container Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Type</em>' attribute.
   * @see #setContainerType(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_ContainerType()
   * @model
   * @generated
   */
  String getContainerType();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getContainerType <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Type</em>' attribute.
   * @see #getContainerType()
   * @generated
   */
  void setContainerType(String value);

  /**
   * Returns the value of the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EClass</em>' attribute.
   * @see #setEClass(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_EClass()
   * @model
   * @generated
   */
  String getEClass();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getEClass <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EClass</em>' attribute.
   * @see #getEClass()
   * @generated
   */
  void setEClass(String value);

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Expression()
   * @model containment="true"
   * @generated
   */
  SPExpression getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getExpression <em>Expression</em>}' containment reference.
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
   * @see #setColor(ContainerColorDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Color()
   * @model containment="true"
   * @generated
   */
  ContainerColorDefinition getColor();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getColor <em>Color</em>}' containment reference.
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Label()
   * @model containment="true"
   * @generated
   */
  LabelStyleDefinition getLabel();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getLabel <em>Label</em>}' containment reference.
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Border()
   * @model containment="true"
   * @generated
   */
  BorderStyleDefinition getBorder();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getBorder <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border</em>' containment reference.
   * @see #getBorder()
   * @generated
   */
  void setBorder(BorderStyleDefinition value);

} // Container
