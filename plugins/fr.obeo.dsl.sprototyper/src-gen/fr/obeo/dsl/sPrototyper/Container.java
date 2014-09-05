/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Container#getElements <em>Elements</em>}</li>
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
   * Returns the value of the '<em><b>Recursive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recursive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursive</em>' attribute.
   * @see #setRecursive(boolean)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Recursive()
   * @model
   * @generated
   */
  boolean isRecursive();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#isRecursive <em>Recursive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursive</em>' attribute.
   * @see #isRecursive()
   * @generated
   */
  void setRecursive(boolean value);

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
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(ContainerStyleDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Style()
   * @model containment="true"
   * @generated
   */
  ContainerStyleDefinition getStyle();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Container#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(ContainerStyleDefinition value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.DiagramElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getContainer_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DiagramElement> getElements();

} // Container
