/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPrototyper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPrototyper#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPrototyper#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPrototyper#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPrototyper#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPrototyper()
 * @model
 * @generated
 */
public interface SPrototyper extends EObject
{
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPrototyper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see #setQualifier(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPrototyper_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

  /**
   * Returns the value of the '<em><b>Target URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target URI</em>' attribute.
   * @see #setTargetURI(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPrototyper_TargetURI()
   * @model
   * @generated
   */
  String getTargetURI();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getTargetURI <em>Target URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target URI</em>' attribute.
   * @see #getTargetURI()
   * @generated
   */
  void setTargetURI(String value);

  /**
   * Returns the value of the '<em><b>Viewpoints</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.SPViewpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewpoints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewpoints</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPrototyper_Viewpoints()
   * @model containment="true"
   * @generated
   */
  EList<SPViewpoint> getViewpoints();

} // SPrototyper
