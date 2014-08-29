/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SP Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getElements <em>Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPTable#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable()
 * @model
 * @generated
 */
public interface SPTable extends SPRepresentation
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPTable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPTable#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPTable#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.MetamodelRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodels</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Metamodels()
   * @model containment="true"
   * @generated
   */
  EList<MetamodelRef> getMetamodels();

  /**
   * Returns the value of the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' attribute.
   * @see #setRoot(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Root()
   * @model
   * @generated
   */
  String getRoot();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.SPTable#getRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #getRoot()
   * @generated
   */
  void setRoot(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.TableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Elements()
   * @model containment="true"
   * @generated
   */
  EList<TableElement> getElements();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.TableProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPTable_Properties()
   * @model containment="true"
   * @generated
   */
  EList<TableProperty> getProperties();

} // SPTable
