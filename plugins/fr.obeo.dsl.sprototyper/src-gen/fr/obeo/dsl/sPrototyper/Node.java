/**
 */
package fr.obeo.dsl.sPrototyper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.Node#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(NodeStyleDefinition)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getNode_Style()
   * @model containment="true"
   * @generated
   */
  NodeStyleDefinition getStyle();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.Node#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(NodeStyleDefinition value);

} // Node
