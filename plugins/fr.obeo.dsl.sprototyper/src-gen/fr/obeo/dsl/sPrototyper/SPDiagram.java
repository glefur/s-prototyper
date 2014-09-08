/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SP Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPDiagram#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.SPDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPDiagram()
 * @model
 * @generated
 */
public interface SPDiagram extends SPRepresentation
{
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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPDiagram_Metamodels()
   * @model containment="true"
   * @generated
   */
  EList<MetamodelRef> getMetamodels();

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
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getSPDiagram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DiagramElement> getElements();

} // SPDiagram
