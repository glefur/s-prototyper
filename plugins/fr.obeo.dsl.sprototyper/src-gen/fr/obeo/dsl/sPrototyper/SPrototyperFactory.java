/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage
 * @generated
 */
public interface SPrototyperFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SPrototyperFactory eINSTANCE = fr.obeo.dsl.sPrototyper.impl.SPrototyperFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SPrototyper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SPrototyper</em>'.
   * @generated
   */
  SPrototyper createSPrototyper();

  /**
   * Returns a new object of class '<em>SP Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Viewpoint</em>'.
   * @generated
   */
  SPViewpoint createSPViewpoint();

  /**
   * Returns a new object of class '<em>SP Representation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Representation</em>'.
   * @generated
   */
  SPRepresentation createSPRepresentation();

  /**
   * Returns a new object of class '<em>SP Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Table</em>'.
   * @generated
   */
  SPTable createSPTable();

  /**
   * Returns a new object of class '<em>Table Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Element</em>'.
   * @generated
   */
  TableElement createTableElement();

  /**
   * Returns a new object of class '<em>Table Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Property</em>'.
   * @generated
   */
  TableProperty createTableProperty();

  /**
   * Returns a new object of class '<em>SP Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Diagram</em>'.
   * @generated
   */
  SPDiagram createSPDiagram();

  /**
   * Returns a new object of class '<em>Diagram Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram Element</em>'.
   * @generated
   */
  DiagramElement createDiagramElement();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Solid Color Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Solid Color Definition</em>'.
   * @generated
   */
  SolidColorDefinition createSolidColorDefinition();

  /**
   * Returns a new object of class '<em>Container Color Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Color Definition</em>'.
   * @generated
   */
  ContainerColorDefinition createContainerColorDefinition();

  /**
   * Returns a new object of class '<em>Gradient Color Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gradient Color Definition</em>'.
   * @generated
   */
  GradientColorDefinition createGradientColorDefinition();

  /**
   * Returns a new object of class '<em>Label Style Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Style Definition</em>'.
   * @generated
   */
  LabelStyleDefinition createLabelStyleDefinition();

  /**
   * Returns a new object of class '<em>Border Style Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border Style Definition</em>'.
   * @generated
   */
  BorderStyleDefinition createBorderStyleDefinition();

  /**
   * Returns a new object of class '<em>SP Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Expression</em>'.
   * @generated
   */
  SPExpression createSPExpression();

  /**
   * Returns a new object of class '<em>Acceleo Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acceleo Expression</em>'.
   * @generated
   */
  AcceleoExpression createAcceleoExpression();

  /**
   * Returns a new object of class '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Ref</em>'.
   * @generated
   */
  VarRef createVarRef();

  /**
   * Returns a new object of class '<em>Feature Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Ref</em>'.
   * @generated
   */
  FeatureRef createFeatureRef();

  /**
   * Returns a new object of class '<em>Metamodel Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel Ref</em>'.
   * @generated
   */
  MetamodelRef createMetamodelRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SPrototyperPackage getSPrototyperPackage();

} //SPrototyperFactory
