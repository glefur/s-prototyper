/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.sPrototyper.SPrototyperFactory
 * @model kind="package"
 * @generated
 */
public interface SPrototyperPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sPrototyper";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/SPrototyper";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sPrototyper";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SPrototyperPackage eINSTANCE = fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl <em>SPrototyper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPrototyper()
   * @generated
   */
  int SPROTOTYPER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPROTOTYPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPROTOTYPER__QUALIFIER = 1;

  /**
   * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPROTOTYPER__VIEWPOINTS = 2;

  /**
   * The number of structural features of the '<em>SPrototyper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPROTOTYPER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl <em>SP Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPViewpoint()
   * @generated
   */
  int SP_VIEWPOINT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIEWPOINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Shortcut</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIEWPOINT__SHORTCUT = 1;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIEWPOINT__EXTENSION = 2;

  /**
   * The feature id for the '<em><b>Representations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIEWPOINT__REPRESENTATIONS = 3;

  /**
   * The number of structural features of the '<em>SP Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIEWPOINT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPRepresentationImpl <em>SP Representation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPRepresentationImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPRepresentation()
   * @generated
   */
  int SP_REPRESENTATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION__LABEL = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION__TITLE = 2;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION__METAMODELS = 3;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION__ROOT = 4;

  /**
   * The number of structural features of the '<em>SP Representation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl <em>SP Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPTableImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPTable()
   * @generated
   */
  int SP_TABLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__NAME = SP_REPRESENTATION__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__LABEL = SP_REPRESENTATION__LABEL;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__TITLE = SP_REPRESENTATION__TITLE;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__METAMODELS = SP_REPRESENTATION__METAMODELS;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__ROOT = SP_REPRESENTATION__ROOT;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__ELEMENTS = SP_REPRESENTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__PROPERTIES = SP_REPRESENTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SP Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE_FEATURE_COUNT = SP_REPRESENTATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl <em>Table Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.TableElementImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getTableElement()
   * @generated
   */
  int TABLE_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Creatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__CREATABLE = 0;

  /**
   * The feature id for the '<em><b>Recursive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__RECURSIVE = 1;

  /**
   * The feature id for the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__ECLASS = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__SUB_ELEMENTS = 4;

  /**
   * The number of structural features of the '<em>Table Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.TablePropertyImpl <em>Table Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.TablePropertyImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getTableProperty()
   * @generated
   */
  int TABLE_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_PROPERTY__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_PROPERTY__LABEL = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_PROPERTY__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Table Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl <em>SP Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPDiagram()
   * @generated
   */
  int SP_DIAGRAM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__NAME = SP_REPRESENTATION__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__LABEL = SP_REPRESENTATION__LABEL;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__TITLE = SP_REPRESENTATION__TITLE;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__METAMODELS = SP_REPRESENTATION__METAMODELS;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__ROOT = SP_REPRESENTATION__ROOT;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM__ELEMENTS = SP_REPRESENTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SP Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_DIAGRAM_FEATURE_COUNT = SP_REPRESENTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getDiagramElement()
   * @generated
   */
  int DIAGRAM_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Creatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__CREATABLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__ECLASS = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Diagram Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.ContainerImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 8;

  /**
   * The feature id for the '<em><b>Creatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CREATABLE = DIAGRAM_ELEMENT__CREATABLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = DIAGRAM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ECLASS = DIAGRAM_ELEMENT__ECLASS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__EXPRESSION = DIAGRAM_ELEMENT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Recursive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__RECURSIVE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Container Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONTAINER_TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ELEMENTS = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl <em>Container Style Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainerStyleDefinition()
   * @generated
   */
  int CONTAINER_STYLE_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STYLE_DEFINITION__COLOR = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STYLE_DEFINITION__LABEL = 1;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STYLE_DEFINITION__BORDER = 2;

  /**
   * The number of structural features of the '<em>Container Style Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STYLE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerColorDefinitionImpl <em>Container Color Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.ContainerColorDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainerColorDefinition()
   * @generated
   */
  int CONTAINER_COLOR_DEFINITION = 10;

  /**
   * The number of structural features of the '<em>Container Color Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_COLOR_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.NodeImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getNode()
   * @generated
   */
  int NODE = 11;

  /**
   * The feature id for the '<em><b>Creatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CREATABLE = DIAGRAM_ELEMENT__CREATABLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = DIAGRAM_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ECLASS = DIAGRAM_ELEMENT__ECLASS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__EXPRESSION = DIAGRAM_ELEMENT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.NodeStyleDefinitionImpl <em>Node Style Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.NodeStyleDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getNodeStyleDefinition()
   * @generated
   */
  int NODE_STYLE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STYLE_DEFINITION__COLOR = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STYLE_DEFINITION__LABEL = 1;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STYLE_DEFINITION__BORDER = 2;

  /**
   * The number of structural features of the '<em>Node Style Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STYLE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SolidColorDefinitionImpl <em>Solid Color Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SolidColorDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSolidColorDefinition()
   * @generated
   */
  int SOLID_COLOR_DEFINITION = 13;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLID_COLOR_DEFINITION__COLOR = CONTAINER_COLOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Solid Color Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLID_COLOR_DEFINITION_FEATURE_COUNT = CONTAINER_COLOR_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.GradientColorDefinitionImpl <em>Gradient Color Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.GradientColorDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getGradientColorDefinition()
   * @generated
   */
  int GRADIENT_COLOR_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_COLOR_DEFINITION__FROM = CONTAINER_COLOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_COLOR_DEFINITION__TO = CONTAINER_COLOR_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gradient Color Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRADIENT_COLOR_DEFINITION_FEATURE_COUNT = CONTAINER_COLOR_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl <em>Label Style Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getLabelStyleDefinition()
   * @generated
   */
  int LABEL_STYLE_DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION__COLOR = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION__SIZE = 2;

  /**
   * The feature id for the '<em><b>Bold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION__BOLD = 3;

  /**
   * The feature id for the '<em><b>Italic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION__ITALIC = 4;

  /**
   * The number of structural features of the '<em>Label Style Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STYLE_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.BorderStyleDefinitionImpl <em>Border Style Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.BorderStyleDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getBorderStyleDefinition()
   * @generated
   */
  int BORDER_STYLE_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_DEFINITION__COLOR = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_DEFINITION__SIZE = 1;

  /**
   * The number of structural features of the '<em>Border Style Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl <em>SP Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPExpression()
   * @generated
   */
  int SP_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>SP Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.AcceleoExpressionImpl <em>Acceleo Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.AcceleoExpressionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getAcceleoExpression()
   * @generated
   */
  int ACCELEO_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCELEO_EXPRESSION__VALUE = SP_EXPRESSION__VALUE;

  /**
   * The number of structural features of the '<em>Acceleo Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCELEO_EXPRESSION_FEATURE_COUNT = SP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.VarRefImpl <em>Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.VarRefImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getVarRef()
   * @generated
   */
  int VAR_REF = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__VALUE = SP_EXPRESSION__VALUE;

  /**
   * The number of structural features of the '<em>Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_FEATURE_COUNT = SP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.FeatureRefImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getFeatureRef()
   * @generated
   */
  int FEATURE_REF = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF__VALUE = SP_EXPRESSION__VALUE;

  /**
   * The number of structural features of the '<em>Feature Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF_FEATURE_COUNT = SP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.MetamodelRefImpl <em>Metamodel Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.MetamodelRefImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getMetamodelRef()
   * @generated
   */
  int METAMODEL_REF = 21;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_REF__METAMODEL = 0;

  /**
   * The number of structural features of the '<em>Metamodel Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.ColorImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getColor()
   * @generated
   */
  int COLOR = 22;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.PreDefinedColorDefinitionImpl <em>Pre Defined Color Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.PreDefinedColorDefinitionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getPreDefinedColorDefinition()
   * @generated
   */
  int PRE_DEFINED_COLOR_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DEFINED_COLOR_DEFINITION__COLOR = COLOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pre Defined Color Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DEFINED_COLOR_DEFINITION_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.PreDefinedColor <em>Pre Defined Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColor
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getPreDefinedColor()
   * @generated
   */
  int PRE_DEFINED_COLOR = 24;


  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPrototyper <em>SPrototyper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SPrototyper</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPrototyper
   * @generated
   */
  EClass getSPrototyper();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPrototyper#getName()
   * @see #getSPrototyper()
   * @generated
   */
  EAttribute getSPrototyper_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPrototyper#getQualifier()
   * @see #getSPrototyper()
   * @generated
   */
  EAttribute getSPrototyper_Qualifier();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPrototyper#getViewpoints <em>Viewpoints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPrototyper#getViewpoints()
   * @see #getSPrototyper()
   * @generated
   */
  EReference getSPrototyper_Viewpoints();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPViewpoint <em>SP Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Viewpoint</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint
   * @generated
   */
  EClass getSPViewpoint();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint#getName()
   * @see #getSPViewpoint()
   * @generated
   */
  EAttribute getSPViewpoint_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getShortcut <em>Shortcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shortcut</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint#getShortcut()
   * @see #getSPViewpoint()
   * @generated
   */
  EAttribute getSPViewpoint_Shortcut();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint#getExtension()
   * @see #getSPViewpoint()
   * @generated
   */
  EAttribute getSPViewpoint_Extension();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPViewpoint#getRepresentations <em>Representations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Representations</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint#getRepresentations()
   * @see #getSPViewpoint()
   * @generated
   */
  EReference getSPViewpoint_Representations();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPRepresentation <em>SP Representation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Representation</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation
   * @generated
   */
  EClass getSPRepresentation();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPRepresentation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation#getName()
   * @see #getSPRepresentation()
   * @generated
   */
  EAttribute getSPRepresentation_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPRepresentation#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation#getLabel()
   * @see #getSPRepresentation()
   * @generated
   */
  EAttribute getSPRepresentation_Label();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPRepresentation#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation#getTitle()
   * @see #getSPRepresentation()
   * @generated
   */
  EAttribute getSPRepresentation_Title();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPRepresentation#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation#getMetamodels()
   * @see #getSPRepresentation()
   * @generated
   */
  EReference getSPRepresentation_Metamodels();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPRepresentation#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation#getRoot()
   * @see #getSPRepresentation()
   * @generated
   */
  EAttribute getSPRepresentation_Root();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPTable <em>SP Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Table</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable
   * @generated
   */
  EClass getSPTable();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPTable#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getElements()
   * @see #getSPTable()
   * @generated
   */
  EReference getSPTable_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPTable#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getProperties()
   * @see #getSPTable()
   * @generated
   */
  EReference getSPTable_Properties();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.TableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Element</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement
   * @generated
   */
  EClass getTableElement();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.TableElement#isCreatable <em>Creatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creatable</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement#isCreatable()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_Creatable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.TableElement#isRecursive <em>Recursive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recursive</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement#isRecursive()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_Recursive();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.TableElement#getEClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EClass</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement#getEClass()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_EClass();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.TableElement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement#getExpression()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.TableElement#getSubElements <em>Sub Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableElement#getSubElements()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_SubElements();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.TableProperty <em>Table Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Property</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableProperty
   * @generated
   */
  EClass getTableProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.TableProperty#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableProperty#getFeature()
   * @see #getTableProperty()
   * @generated
   */
  EAttribute getTableProperty_Feature();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.TableProperty#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableProperty#getLabel()
   * @see #getTableProperty()
   * @generated
   */
  EAttribute getTableProperty_Label();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.TableProperty#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.TableProperty#getExpression()
   * @see #getTableProperty()
   * @generated
   */
  EReference getTableProperty_Expression();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPDiagram <em>SP Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Diagram</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPDiagram
   * @generated
   */
  EClass getSPDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPDiagram#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPDiagram#getElements()
   * @see #getSPDiagram()
   * @generated
   */
  EReference getSPDiagram_Elements();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.DiagramElement <em>Diagram Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram Element</em>'.
   * @see fr.obeo.dsl.sPrototyper.DiagramElement
   * @generated
   */
  EClass getDiagramElement();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.DiagramElement#isCreatable <em>Creatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creatable</em>'.
   * @see fr.obeo.dsl.sPrototyper.DiagramElement#isCreatable()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_Creatable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.dsl.sPrototyper.DiagramElement#getName()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getEClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EClass</em>'.
   * @see fr.obeo.dsl.sPrototyper.DiagramElement#getEClass()
   * @see #getDiagramElement()
   * @generated
   */
  EAttribute getDiagramElement_EClass();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.DiagramElement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.DiagramElement#getExpression()
   * @see #getDiagramElement()
   * @generated
   */
  EReference getDiagramElement_Expression();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see fr.obeo.dsl.sPrototyper.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.Container#isRecursive <em>Recursive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recursive</em>'.
   * @see fr.obeo.dsl.sPrototyper.Container#isRecursive()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Recursive();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.Container#getContainerType <em>Container Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container Type</em>'.
   * @see fr.obeo.dsl.sPrototyper.Container#getContainerType()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_ContainerType();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.Container#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see fr.obeo.dsl.sPrototyper.Container#getStyle()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Style();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.Container#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.obeo.dsl.sPrototyper.Container#getElements()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Elements();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition <em>Container Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Style Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.ContainerStyleDefinition
   * @generated
   */
  EClass getContainerStyleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getColor()
   * @see #getContainerStyleDefinition()
   * @generated
   */
  EReference getContainerStyleDefinition_Color();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getLabel()
   * @see #getContainerStyleDefinition()
   * @generated
   */
  EReference getContainerStyleDefinition_Label();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see fr.obeo.dsl.sPrototyper.ContainerStyleDefinition#getBorder()
   * @see #getContainerStyleDefinition()
   * @generated
   */
  EReference getContainerStyleDefinition_Border();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.ContainerColorDefinition <em>Container Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Color Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.ContainerColorDefinition
   * @generated
   */
  EClass getContainerColorDefinition();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see fr.obeo.dsl.sPrototyper.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.Node#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see fr.obeo.dsl.sPrototyper.Node#getStyle()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Style();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.NodeStyleDefinition <em>Node Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Style Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.NodeStyleDefinition
   * @generated
   */
  EClass getNodeStyleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getColor()
   * @see #getNodeStyleDefinition()
   * @generated
   */
  EReference getNodeStyleDefinition_Color();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getLabel()
   * @see #getNodeStyleDefinition()
   * @generated
   */
  EReference getNodeStyleDefinition_Label();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see fr.obeo.dsl.sPrototyper.NodeStyleDefinition#getBorder()
   * @see #getNodeStyleDefinition()
   * @generated
   */
  EReference getNodeStyleDefinition_Border();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SolidColorDefinition <em>Solid Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solid Color Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.SolidColorDefinition
   * @generated
   */
  EClass getSolidColorDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.SolidColorDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.SolidColorDefinition#getColor()
   * @see #getSolidColorDefinition()
   * @generated
   */
  EReference getSolidColorDefinition_Color();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition <em>Gradient Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gradient Color Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.GradientColorDefinition
   * @generated
   */
  EClass getGradientColorDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see fr.obeo.dsl.sPrototyper.GradientColorDefinition#getFrom()
   * @see #getGradientColorDefinition()
   * @generated
   */
  EReference getGradientColorDefinition_From();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.GradientColorDefinition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see fr.obeo.dsl.sPrototyper.GradientColorDefinition#getTo()
   * @see #getGradientColorDefinition()
   * @generated
   */
  EReference getGradientColorDefinition_To();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition <em>Label Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Style Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition
   * @generated
   */
  EClass getLabelStyleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getExpression()
   * @see #getLabelStyleDefinition()
   * @generated
   */
  EReference getLabelStyleDefinition_Expression();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getColor()
   * @see #getLabelStyleDefinition()
   * @generated
   */
  EReference getLabelStyleDefinition_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition#getSize()
   * @see #getLabelStyleDefinition()
   * @generated
   */
  EAttribute getLabelStyleDefinition_Size();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isBold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bold</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isBold()
   * @see #getLabelStyleDefinition()
   * @generated
   */
  EAttribute getLabelStyleDefinition_Bold();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isItalic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Italic</em>'.
   * @see fr.obeo.dsl.sPrototyper.LabelStyleDefinition#isItalic()
   * @see #getLabelStyleDefinition()
   * @generated
   */
  EAttribute getLabelStyleDefinition_Italic();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition <em>Border Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Style Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.BorderStyleDefinition
   * @generated
   */
  EClass getBorderStyleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getColor()
   * @see #getBorderStyleDefinition()
   * @generated
   */
  EReference getBorderStyleDefinition_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see fr.obeo.dsl.sPrototyper.BorderStyleDefinition#getSize()
   * @see #getBorderStyleDefinition()
   * @generated
   */
  EAttribute getBorderStyleDefinition_Size();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPExpression <em>SP Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPExpression
   * @generated
   */
  EClass getSPExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPExpression#getValue()
   * @see #getSPExpression()
   * @generated
   */
  EAttribute getSPExpression_Value();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.AcceleoExpression <em>Acceleo Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acceleo Expression</em>'.
   * @see fr.obeo.dsl.sPrototyper.AcceleoExpression
   * @generated
   */
  EClass getAcceleoExpression();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref</em>'.
   * @see fr.obeo.dsl.sPrototyper.VarRef
   * @generated
   */
  EClass getVarRef();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.FeatureRef <em>Feature Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Ref</em>'.
   * @see fr.obeo.dsl.sPrototyper.FeatureRef
   * @generated
   */
  EClass getFeatureRef();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.MetamodelRef <em>Metamodel Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel Ref</em>'.
   * @see fr.obeo.dsl.sPrototyper.MetamodelRef
   * @generated
   */
  EClass getMetamodelRef();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.MetamodelRef#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metamodel</em>'.
   * @see fr.obeo.dsl.sPrototyper.MetamodelRef#getMetamodel()
   * @see #getMetamodelRef()
   * @generated
   */
  EAttribute getMetamodelRef_Metamodel();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition <em>Pre Defined Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Defined Color Definition</em>'.
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition
   * @generated
   */
  EClass getPreDefinedColorDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition#getColor()
   * @see #getPreDefinedColorDefinition()
   * @generated
   */
  EAttribute getPreDefinedColorDefinition_Color();

  /**
   * Returns the meta object for enum '{@link fr.obeo.dsl.sPrototyper.PreDefinedColor <em>Pre Defined Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Pre Defined Color</em>'.
   * @see fr.obeo.dsl.sPrototyper.PreDefinedColor
   * @generated
   */
  EEnum getPreDefinedColor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SPrototyperFactory getSPrototyperFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl <em>SPrototyper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPrototyper()
     * @generated
     */
    EClass SPROTOTYPER = eINSTANCE.getSPrototyper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPROTOTYPER__NAME = eINSTANCE.getSPrototyper_Name();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPROTOTYPER__QUALIFIER = eINSTANCE.getSPrototyper_Qualifier();

    /**
     * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPROTOTYPER__VIEWPOINTS = eINSTANCE.getSPrototyper_Viewpoints();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl <em>SP Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPViewpoint()
     * @generated
     */
    EClass SP_VIEWPOINT = eINSTANCE.getSPViewpoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIEWPOINT__NAME = eINSTANCE.getSPViewpoint_Name();

    /**
     * The meta object literal for the '<em><b>Shortcut</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIEWPOINT__SHORTCUT = eINSTANCE.getSPViewpoint_Shortcut();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIEWPOINT__EXTENSION = eINSTANCE.getSPViewpoint_Extension();

    /**
     * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_VIEWPOINT__REPRESENTATIONS = eINSTANCE.getSPViewpoint_Representations();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPRepresentationImpl <em>SP Representation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPRepresentationImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPRepresentation()
     * @generated
     */
    EClass SP_REPRESENTATION = eINSTANCE.getSPRepresentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_REPRESENTATION__NAME = eINSTANCE.getSPRepresentation_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_REPRESENTATION__LABEL = eINSTANCE.getSPRepresentation_Label();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_REPRESENTATION__TITLE = eINSTANCE.getSPRepresentation_Title();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_REPRESENTATION__METAMODELS = eINSTANCE.getSPRepresentation_Metamodels();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_REPRESENTATION__ROOT = eINSTANCE.getSPRepresentation_Root();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl <em>SP Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPTableImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPTable()
     * @generated
     */
    EClass SP_TABLE = eINSTANCE.getSPTable();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_TABLE__ELEMENTS = eINSTANCE.getSPTable_Elements();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_TABLE__PROPERTIES = eINSTANCE.getSPTable_Properties();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl <em>Table Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.TableElementImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getTableElement()
     * @generated
     */
    EClass TABLE_ELEMENT = eINSTANCE.getTableElement();

    /**
     * The meta object literal for the '<em><b>Creatable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__CREATABLE = eINSTANCE.getTableElement_Creatable();

    /**
     * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__RECURSIVE = eINSTANCE.getTableElement_Recursive();

    /**
     * The meta object literal for the '<em><b>EClass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__ECLASS = eINSTANCE.getTableElement_EClass();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__EXPRESSION = eINSTANCE.getTableElement_Expression();

    /**
     * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__SUB_ELEMENTS = eINSTANCE.getTableElement_SubElements();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.TablePropertyImpl <em>Table Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.TablePropertyImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getTableProperty()
     * @generated
     */
    EClass TABLE_PROPERTY = eINSTANCE.getTableProperty();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_PROPERTY__FEATURE = eINSTANCE.getTableProperty_Feature();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_PROPERTY__LABEL = eINSTANCE.getTableProperty_Label();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_PROPERTY__EXPRESSION = eINSTANCE.getTableProperty_Expression();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl <em>SP Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPDiagram()
     * @generated
     */
    EClass SP_DIAGRAM = eINSTANCE.getSPDiagram();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_DIAGRAM__ELEMENTS = eINSTANCE.getSPDiagram_Elements();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getDiagramElement()
     * @generated
     */
    EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

    /**
     * The meta object literal for the '<em><b>Creatable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__CREATABLE = eINSTANCE.getDiagramElement_Creatable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__NAME = eINSTANCE.getDiagramElement_Name();

    /**
     * The meta object literal for the '<em><b>EClass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAGRAM_ELEMENT__ECLASS = eINSTANCE.getDiagramElement_EClass();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM_ELEMENT__EXPRESSION = eINSTANCE.getDiagramElement_Expression();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.ContainerImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__RECURSIVE = eINSTANCE.getContainer_Recursive();

    /**
     * The meta object literal for the '<em><b>Container Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CONTAINER_TYPE = eINSTANCE.getContainer_ContainerType();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__STYLE = eINSTANCE.getContainer_Style();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl <em>Container Style Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainerStyleDefinition()
     * @generated
     */
    EClass CONTAINER_STYLE_DEFINITION = eINSTANCE.getContainerStyleDefinition();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_STYLE_DEFINITION__COLOR = eINSTANCE.getContainerStyleDefinition_Color();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_STYLE_DEFINITION__LABEL = eINSTANCE.getContainerStyleDefinition_Label();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_STYLE_DEFINITION__BORDER = eINSTANCE.getContainerStyleDefinition_Border();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.ContainerColorDefinitionImpl <em>Container Color Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.ContainerColorDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getContainerColorDefinition()
     * @generated
     */
    EClass CONTAINER_COLOR_DEFINITION = eINSTANCE.getContainerColorDefinition();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.NodeImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__STYLE = eINSTANCE.getNode_Style();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.NodeStyleDefinitionImpl <em>Node Style Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.NodeStyleDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getNodeStyleDefinition()
     * @generated
     */
    EClass NODE_STYLE_DEFINITION = eINSTANCE.getNodeStyleDefinition();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STYLE_DEFINITION__COLOR = eINSTANCE.getNodeStyleDefinition_Color();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STYLE_DEFINITION__LABEL = eINSTANCE.getNodeStyleDefinition_Label();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STYLE_DEFINITION__BORDER = eINSTANCE.getNodeStyleDefinition_Border();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SolidColorDefinitionImpl <em>Solid Color Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SolidColorDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSolidColorDefinition()
     * @generated
     */
    EClass SOLID_COLOR_DEFINITION = eINSTANCE.getSolidColorDefinition();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLID_COLOR_DEFINITION__COLOR = eINSTANCE.getSolidColorDefinition_Color();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.GradientColorDefinitionImpl <em>Gradient Color Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.GradientColorDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getGradientColorDefinition()
     * @generated
     */
    EClass GRADIENT_COLOR_DEFINITION = eINSTANCE.getGradientColorDefinition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT_COLOR_DEFINITION__FROM = eINSTANCE.getGradientColorDefinition_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRADIENT_COLOR_DEFINITION__TO = eINSTANCE.getGradientColorDefinition_To();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl <em>Label Style Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getLabelStyleDefinition()
     * @generated
     */
    EClass LABEL_STYLE_DEFINITION = eINSTANCE.getLabelStyleDefinition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_STYLE_DEFINITION__EXPRESSION = eINSTANCE.getLabelStyleDefinition_Expression();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_STYLE_DEFINITION__COLOR = eINSTANCE.getLabelStyleDefinition_Color();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_STYLE_DEFINITION__SIZE = eINSTANCE.getLabelStyleDefinition_Size();

    /**
     * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_STYLE_DEFINITION__BOLD = eINSTANCE.getLabelStyleDefinition_Bold();

    /**
     * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_STYLE_DEFINITION__ITALIC = eINSTANCE.getLabelStyleDefinition_Italic();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.BorderStyleDefinitionImpl <em>Border Style Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.BorderStyleDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getBorderStyleDefinition()
     * @generated
     */
    EClass BORDER_STYLE_DEFINITION = eINSTANCE.getBorderStyleDefinition();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORDER_STYLE_DEFINITION__COLOR = eINSTANCE.getBorderStyleDefinition_Color();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE_DEFINITION__SIZE = eINSTANCE.getBorderStyleDefinition_Size();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl <em>SP Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPExpression()
     * @generated
     */
    EClass SP_EXPRESSION = eINSTANCE.getSPExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_EXPRESSION__VALUE = eINSTANCE.getSPExpression_Value();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.AcceleoExpressionImpl <em>Acceleo Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.AcceleoExpressionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getAcceleoExpression()
     * @generated
     */
    EClass ACCELEO_EXPRESSION = eINSTANCE.getAcceleoExpression();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.VarRefImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getVarRef()
     * @generated
     */
    EClass VAR_REF = eINSTANCE.getVarRef();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.FeatureRefImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getFeatureRef()
     * @generated
     */
    EClass FEATURE_REF = eINSTANCE.getFeatureRef();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.MetamodelRefImpl <em>Metamodel Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.MetamodelRefImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getMetamodelRef()
     * @generated
     */
    EClass METAMODEL_REF = eINSTANCE.getMetamodelRef();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL_REF__METAMODEL = eINSTANCE.getMetamodelRef_Metamodel();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.ColorImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.PreDefinedColorDefinitionImpl <em>Pre Defined Color Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.PreDefinedColorDefinitionImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getPreDefinedColorDefinition()
     * @generated
     */
    EClass PRE_DEFINED_COLOR_DEFINITION = eINSTANCE.getPreDefinedColorDefinition();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_DEFINED_COLOR_DEFINITION__COLOR = eINSTANCE.getPreDefinedColorDefinition_Color();

    /**
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.PreDefinedColor <em>Pre Defined Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.PreDefinedColor
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getPreDefinedColor()
     * @generated
     */
    EEnum PRE_DEFINED_COLOR = eINSTANCE.getPreDefinedColor();

  }

} //SPrototyperPackage
