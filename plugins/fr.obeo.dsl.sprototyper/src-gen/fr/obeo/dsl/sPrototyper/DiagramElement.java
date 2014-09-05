/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.DiagramElement#isCreatable <em>Creatable</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.DiagramElement#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.DiagramElement#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.DiagramElement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getDiagramElement()
 * @model
 * @generated
 */
public interface DiagramElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Creatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creatable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creatable</em>' attribute.
   * @see #setCreatable(boolean)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getDiagramElement_Creatable()
   * @model
   * @generated
   */
  boolean isCreatable();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.DiagramElement#isCreatable <em>Creatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creatable</em>' attribute.
   * @see #isCreatable()
   * @generated
   */
  void setCreatable(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getDiagramElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getDiagramElement_EClass()
   * @model
   * @generated
   */
  String getEClass();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getEClass <em>EClass</em>}' attribute.
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getDiagramElement_Expression()
   * @model containment="true"
   * @generated
   */
  SPExpression getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SPExpression value);

} // DiagramElement
