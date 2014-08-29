/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.AcceleoExpression;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPRepresentation;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.SPrototyperFactory;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;
import fr.obeo.dsl.sPrototyper.VarRef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPrototyperPackageImpl extends EPackageImpl implements SPrototyperPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sPrototyperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spViewpointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spRepresentationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tablePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acceleoExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelRefEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SPrototyperPackageImpl()
  {
    super(eNS_URI, SPrototyperFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SPrototyperPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SPrototyperPackage init()
  {
    if (isInited) return (SPrototyperPackage)EPackage.Registry.INSTANCE.getEPackage(SPrototyperPackage.eNS_URI);

    // Obtain or create and register package
    SPrototyperPackageImpl theSPrototyperPackage = (SPrototyperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SPrototyperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SPrototyperPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSPrototyperPackage.createPackageContents();

    // Initialize created meta-data
    theSPrototyperPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSPrototyperPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SPrototyperPackage.eNS_URI, theSPrototyperPackage);
    return theSPrototyperPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPrototyper()
  {
    return sPrototyperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPrototyper_Name()
  {
    return (EAttribute)sPrototyperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPrototyper_Qualifier()
  {
    return (EAttribute)sPrototyperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPrototyper_Viewpoints()
  {
    return (EReference)sPrototyperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPViewpoint()
  {
    return spViewpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPViewpoint_Name()
  {
    return (EAttribute)spViewpointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPViewpoint_Shortcut()
  {
    return (EAttribute)spViewpointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPViewpoint_Extension()
  {
    return (EAttribute)spViewpointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPViewpoint_Representations()
  {
    return (EReference)spViewpointEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPRepresentation()
  {
    return spRepresentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPTable()
  {
    return spTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPTable_Name()
  {
    return (EAttribute)spTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPTable_Label()
  {
    return (EAttribute)spTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPTable_Title()
  {
    return (EAttribute)spTableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPTable_Metamodels()
  {
    return (EReference)spTableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPTable_Root()
  {
    return (EAttribute)spTableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPTable_Elements()
  {
    return (EReference)spTableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPTable_Properties()
  {
    return (EReference)spTableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableElement()
  {
    return tableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_EClass()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_Expression()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_CanCreate()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_SubElements()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableProperty()
  {
    return tablePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableProperty_Feature()
  {
    return (EAttribute)tablePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableProperty_Label()
  {
    return (EAttribute)tablePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableProperty_Expression()
  {
    return (EReference)tablePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPExpression()
  {
    return spExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPExpression_Value()
  {
    return (EAttribute)spExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcceleoExpression()
  {
    return acceleoExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarRef()
  {
    return varRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureRef()
  {
    return featureRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodelRef()
  {
    return metamodelRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodelRef_Metamodel()
  {
    return (EAttribute)metamodelRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyperFactory getSPrototyperFactory()
  {
    return (SPrototyperFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sPrototyperEClass = createEClass(SPROTOTYPER);
    createEAttribute(sPrototyperEClass, SPROTOTYPER__NAME);
    createEAttribute(sPrototyperEClass, SPROTOTYPER__QUALIFIER);
    createEReference(sPrototyperEClass, SPROTOTYPER__VIEWPOINTS);

    spViewpointEClass = createEClass(SP_VIEWPOINT);
    createEAttribute(spViewpointEClass, SP_VIEWPOINT__NAME);
    createEAttribute(spViewpointEClass, SP_VIEWPOINT__SHORTCUT);
    createEAttribute(spViewpointEClass, SP_VIEWPOINT__EXTENSION);
    createEReference(spViewpointEClass, SP_VIEWPOINT__REPRESENTATIONS);

    spRepresentationEClass = createEClass(SP_REPRESENTATION);

    spTableEClass = createEClass(SP_TABLE);
    createEAttribute(spTableEClass, SP_TABLE__NAME);
    createEAttribute(spTableEClass, SP_TABLE__LABEL);
    createEAttribute(spTableEClass, SP_TABLE__TITLE);
    createEReference(spTableEClass, SP_TABLE__METAMODELS);
    createEAttribute(spTableEClass, SP_TABLE__ROOT);
    createEReference(spTableEClass, SP_TABLE__ELEMENTS);
    createEReference(spTableEClass, SP_TABLE__PROPERTIES);

    tableElementEClass = createEClass(TABLE_ELEMENT);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__ECLASS);
    createEReference(tableElementEClass, TABLE_ELEMENT__EXPRESSION);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__CAN_CREATE);
    createEReference(tableElementEClass, TABLE_ELEMENT__SUB_ELEMENTS);

    tablePropertyEClass = createEClass(TABLE_PROPERTY);
    createEAttribute(tablePropertyEClass, TABLE_PROPERTY__FEATURE);
    createEAttribute(tablePropertyEClass, TABLE_PROPERTY__LABEL);
    createEReference(tablePropertyEClass, TABLE_PROPERTY__EXPRESSION);

    spExpressionEClass = createEClass(SP_EXPRESSION);
    createEAttribute(spExpressionEClass, SP_EXPRESSION__VALUE);

    acceleoExpressionEClass = createEClass(ACCELEO_EXPRESSION);

    varRefEClass = createEClass(VAR_REF);

    featureRefEClass = createEClass(FEATURE_REF);

    metamodelRefEClass = createEClass(METAMODEL_REF);
    createEAttribute(metamodelRefEClass, METAMODEL_REF__METAMODEL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    spTableEClass.getESuperTypes().add(this.getSPRepresentation());
    acceleoExpressionEClass.getESuperTypes().add(this.getSPExpression());
    varRefEClass.getESuperTypes().add(this.getSPExpression());
    featureRefEClass.getESuperTypes().add(this.getSPExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(sPrototyperEClass, SPrototyper.class, "SPrototyper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPrototyper_Name(), ecorePackage.getEString(), "name", null, 0, 1, SPrototyper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPrototyper_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1, SPrototyper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPrototyper_Viewpoints(), this.getSPViewpoint(), null, "viewpoints", null, 0, -1, SPrototyper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spViewpointEClass, SPViewpoint.class, "SPViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPViewpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, SPViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPViewpoint_Shortcut(), ecorePackage.getEString(), "shortcut", null, 0, 1, SPViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPViewpoint_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, SPViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPViewpoint_Representations(), this.getSPRepresentation(), null, "representations", null, 0, -1, SPViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spRepresentationEClass, SPRepresentation.class, "SPRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(spTableEClass, SPTable.class, "SPTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPTable_Label(), ecorePackage.getEString(), "label", null, 0, 1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPTable_Title(), ecorePackage.getEString(), "title", null, 0, 1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPTable_Metamodels(), this.getMetamodelRef(), null, "metamodels", null, 0, -1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPTable_Root(), ecorePackage.getEString(), "root", null, 0, 1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPTable_Elements(), this.getTableElement(), null, "elements", null, 0, -1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPTable_Properties(), this.getTableProperty(), null, "properties", null, 0, -1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableElementEClass, TableElement.class, "TableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableElement_EClass(), ecorePackage.getEString(), "eClass", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_CanCreate(), ecorePackage.getEBoolean(), "canCreate", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_SubElements(), this.getTableElement(), null, "subElements", null, 0, -1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tablePropertyEClass, TableProperty.class, "TableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableProperty_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableProperty_Label(), ecorePackage.getEString(), "label", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableProperty_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spExpressionEClass, SPExpression.class, "SPExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, SPExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acceleoExpressionEClass, AcceleoExpression.class, "AcceleoExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varRefEClass, VarRef.class, "VarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureRefEClass, FeatureRef.class, "FeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metamodelRefEClass, MetamodelRef.class, "MetamodelRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetamodelRef_Metamodel(), ecorePackage.getEString(), "metamodel", null, 0, 1, MetamodelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SPrototyperPackageImpl
