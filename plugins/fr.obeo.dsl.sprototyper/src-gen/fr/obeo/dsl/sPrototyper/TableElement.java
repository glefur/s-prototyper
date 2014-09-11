/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#isCreatable <em>Creatable</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement()
 * @model
 * @generated
 */
public interface TableElement extends EObject
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_Recursive()
   * @model
   * @generated
   */
  boolean isRecursive();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#isRecursive <em>Recursive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursive</em>' attribute.
   * @see #isRecursive()
   * @generated
   */
  void setRecursive(boolean value);

  /**
   * Returns the value of the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EClass</em>' reference.
   * @see #setEClass(EClass)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_EClass()
   * @model
   * @generated
   */
  EClass getEClass();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#getEClass <em>EClass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EClass</em>' reference.
   * @see #getEClass()
   * @generated
   */
  void setEClass(EClass value);

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_Expression()
   * @model containment="true"
   * @generated
   */
  SPExpression getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SPExpression value);

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_Creatable()
   * @model
   * @generated
   */
  boolean isCreatable();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#isCreatable <em>Creatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creatable</em>' attribute.
   * @see #isCreatable()
   * @generated
   */
  void setCreatable(boolean value);

  /**
   * Returns the value of the '<em><b>Create Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Expression</em>' containment reference.
   * @see #setCreateExpression(SPExpression)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_CreateExpression()
   * @model containment="true"
   * @generated
   */
  SPExpression getCreateExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#getCreateExpression <em>Create Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Expression</em>' containment reference.
   * @see #getCreateExpression()
   * @generated
   */
  void setCreateExpression(SPExpression value);

  /**
   * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.TableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Elements</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_SubElements()
   * @model containment="true"
   * @generated
   */
  EList<TableElement> getSubElements();

} // TableElement
