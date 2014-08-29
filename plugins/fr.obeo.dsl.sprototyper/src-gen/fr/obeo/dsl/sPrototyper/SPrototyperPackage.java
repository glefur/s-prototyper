/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The number of structural features of the '<em>SP Representation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_REPRESENTATION_FEATURE_COUNT = 0;

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
  int SP_TABLE__NAME = SP_REPRESENTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__LABEL = SP_REPRESENTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__TITLE = SP_REPRESENTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__METAMODELS = SP_REPRESENTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__ROOT = SP_REPRESENTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__ELEMENTS = SP_REPRESENTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE__PROPERTIES = SP_REPRESENTATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>SP Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_TABLE_FEATURE_COUNT = SP_REPRESENTATION_FEATURE_COUNT + 7;

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
   * The meta object id for the '{@link fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl <em>SP Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.dsl.sPrototyper.impl.SPExpressionImpl
   * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPExpression()
   * @generated
   */
  int SP_EXPRESSION = 6;

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
  int ACCELEO_EXPRESSION = 7;

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
  int VAR_REF = 8;

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
  int FEATURE_REF = 9;

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
  int METAMODEL_REF = 10;

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
   * Returns the meta object for class '{@link fr.obeo.dsl.sPrototyper.SPTable <em>SP Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Table</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable
   * @generated
   */
  EClass getSPTable();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getName()
   * @see #getSPTable()
   * @generated
   */
  EAttribute getSPTable_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPTable#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getLabel()
   * @see #getSPTable()
   * @generated
   */
  EAttribute getSPTable_Label();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPTable#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getTitle()
   * @see #getSPTable()
   * @generated
   */
  EAttribute getSPTable_Title();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.sPrototyper.SPTable#getMetamodels <em>Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodels</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getMetamodels()
   * @see #getSPTable()
   * @generated
   */
  EReference getSPTable_Metamodels();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.dsl.sPrototyper.SPTable#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see fr.obeo.dsl.sPrototyper.SPTable#getRoot()
   * @see #getSPTable()
   * @generated
   */
  EAttribute getSPTable_Root();

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
     * The meta object literal for the '{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl <em>SP Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.dsl.sPrototyper.impl.SPTableImpl
     * @see fr.obeo.dsl.sPrototyper.impl.SPrototyperPackageImpl#getSPTable()
     * @generated
     */
    EClass SP_TABLE = eINSTANCE.getSPTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_TABLE__NAME = eINSTANCE.getSPTable_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_TABLE__LABEL = eINSTANCE.getSPTable_Label();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_TABLE__TITLE = eINSTANCE.getSPTable_Title();

    /**
     * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_TABLE__METAMODELS = eINSTANCE.getSPTable_Metamodels();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_TABLE__ROOT = eINSTANCE.getSPTable_Root();

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

  }

} //SPrototyperPackage
