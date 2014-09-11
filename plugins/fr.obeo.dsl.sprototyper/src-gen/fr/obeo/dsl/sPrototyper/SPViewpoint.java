/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SP Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getRepresentations <em>Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint()
 * @model
 * @generated
 */
public interface SPViewpoint extends EObject
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Shortcut</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shortcut</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shortcut</em>' attribute.
   * @see #setShortcut(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint_Shortcut()
   * @model
   * @generated
   */
  String getShortcut();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getShortcut <em>Shortcut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shortcut</em>' attribute.
   * @see #getShortcut()
   * @generated
   */
  void setShortcut(String value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint_Extension()
   * @model
   * @generated
   */
  String getExtension();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #getExtension()
   * @generated
   */
  void setExtension(String value);

  /**
   * Returns the value of the '<em><b>Service Class</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.JavaServiceClassReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Class</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint_ServiceClass()
   * @model containment="true"
   * @generated
   */
  EList<JavaServiceClassReference> getServiceClass();

  /**
   * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.SPRepresentation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Representations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Representations</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPViewpoint_Representations()
   * @model containment="true"
   * @generated
   */
  EList<SPRepresentation> getRepresentations();

} // SPViewpoint
