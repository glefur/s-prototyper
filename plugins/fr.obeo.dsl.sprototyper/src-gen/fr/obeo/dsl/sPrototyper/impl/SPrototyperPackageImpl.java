/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.AcceleoExpression;
import fr.obeo.dsl.sPrototyper.BorderStyleDefinition;
import fr.obeo.dsl.sPrototyper.Color;
import fr.obeo.dsl.sPrototyper.ContainerColorDefinition;
import fr.obeo.dsl.sPrototyper.ContainerStyleDefinition;
import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.GradientColorDefinition;
import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.Node;
import fr.obeo.dsl.sPrototyper.NodeStyleDefinition;
import fr.obeo.dsl.sPrototyper.PreDefinedColor;
import fr.obeo.dsl.sPrototyper.PreDefinedColorDefinition;
import fr.obeo.dsl.sPrototyper.SPDiagram;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPRepresentation;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.SPrototyperFactory;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.SolidColorDefinition;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;
import fr.obeo.dsl.sPrototyper.VarRef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass spDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerStyleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerColorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeStyleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass solidColorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gradientColorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelStyleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderStyleDefinitionEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preDefinedColorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum preDefinedColorEEnum = null;

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
  public EAttribute getSPRepresentation_Name()
  {
    return (EAttribute)spRepresentationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPRepresentation_Label()
  {
    return (EAttribute)spRepresentationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPRepresentation_Title()
  {
    return (EAttribute)spRepresentationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPRepresentation_Metamodels()
  {
    return (EReference)spRepresentationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPRepresentation_Root()
  {
    return (EAttribute)spRepresentationEClass.getEStructuralFeatures().get(4);
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
  public EReference getSPTable_Elements()
  {
    return (EReference)spTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPTable_Properties()
  {
    return (EReference)spTableEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getTableElement_Creatable()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_Recursive()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_EClass()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_Expression()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_SubElements()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(4);
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
  public EClass getSPDiagram()
  {
    return spDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSPDiagram_Elements()
  {
    return (EReference)spDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagramElement()
  {
    return diagramElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_Creatable()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_Name()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_EClass()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramElement_Expression()
  {
    return (EReference)diagramElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Recursive()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_ContainerType()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Style()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Elements()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerStyleDefinition()
  {
    return containerStyleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStyleDefinition_Color()
  {
    return (EReference)containerStyleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStyleDefinition_Label()
  {
    return (EReference)containerStyleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStyleDefinition_Border()
  {
    return (EReference)containerStyleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerColorDefinition()
  {
    return containerColorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Style()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeStyleDefinition()
  {
    return nodeStyleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStyleDefinition_Color()
  {
    return (EReference)nodeStyleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStyleDefinition_Label()
  {
    return (EReference)nodeStyleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStyleDefinition_Border()
  {
    return (EReference)nodeStyleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSolidColorDefinition()
  {
    return solidColorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSolidColorDefinition_Color()
  {
    return (EReference)solidColorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGradientColorDefinition()
  {
    return gradientColorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradientColorDefinition_From()
  {
    return (EReference)gradientColorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGradientColorDefinition_To()
  {
    return (EReference)gradientColorDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelStyleDefinition()
  {
    return labelStyleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelStyleDefinition_Expression()
  {
    return (EReference)labelStyleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelStyleDefinition_Color()
  {
    return (EReference)labelStyleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelStyleDefinition_Size()
  {
    return (EAttribute)labelStyleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelStyleDefinition_Bold()
  {
    return (EAttribute)labelStyleDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelStyleDefinition_Italic()
  {
    return (EAttribute)labelStyleDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderStyleDefinition()
  {
    return borderStyleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderStyleDefinition_Color()
  {
    return (EReference)borderStyleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyleDefinition_Size()
  {
    return (EAttribute)borderStyleDefinitionEClass.getEStructuralFeatures().get(1);
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
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreDefinedColorDefinition()
  {
    return preDefinedColorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreDefinedColorDefinition_Color()
  {
    return (EAttribute)preDefinedColorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPreDefinedColor()
  {
    return preDefinedColorEEnum;
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
    createEAttribute(spRepresentationEClass, SP_REPRESENTATION__NAME);
    createEAttribute(spRepresentationEClass, SP_REPRESENTATION__LABEL);
    createEAttribute(spRepresentationEClass, SP_REPRESENTATION__TITLE);
    createEReference(spRepresentationEClass, SP_REPRESENTATION__METAMODELS);
    createEAttribute(spRepresentationEClass, SP_REPRESENTATION__ROOT);

    spTableEClass = createEClass(SP_TABLE);
    createEReference(spTableEClass, SP_TABLE__ELEMENTS);
    createEReference(spTableEClass, SP_TABLE__PROPERTIES);

    tableElementEClass = createEClass(TABLE_ELEMENT);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__CREATABLE);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__RECURSIVE);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__ECLASS);
    createEReference(tableElementEClass, TABLE_ELEMENT__EXPRESSION);
    createEReference(tableElementEClass, TABLE_ELEMENT__SUB_ELEMENTS);

    tablePropertyEClass = createEClass(TABLE_PROPERTY);
    createEAttribute(tablePropertyEClass, TABLE_PROPERTY__FEATURE);
    createEAttribute(tablePropertyEClass, TABLE_PROPERTY__LABEL);
    createEReference(tablePropertyEClass, TABLE_PROPERTY__EXPRESSION);

    spDiagramEClass = createEClass(SP_DIAGRAM);
    createEReference(spDiagramEClass, SP_DIAGRAM__ELEMENTS);

    diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__CREATABLE);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__NAME);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ECLASS);
    createEReference(diagramElementEClass, DIAGRAM_ELEMENT__EXPRESSION);

    containerEClass = createEClass(CONTAINER);
    createEAttribute(containerEClass, CONTAINER__RECURSIVE);
    createEAttribute(containerEClass, CONTAINER__CONTAINER_TYPE);
    createEReference(containerEClass, CONTAINER__STYLE);
    createEReference(containerEClass, CONTAINER__ELEMENTS);

    containerStyleDefinitionEClass = createEClass(CONTAINER_STYLE_DEFINITION);
    createEReference(containerStyleDefinitionEClass, CONTAINER_STYLE_DEFINITION__COLOR);
    createEReference(containerStyleDefinitionEClass, CONTAINER_STYLE_DEFINITION__LABEL);
    createEReference(containerStyleDefinitionEClass, CONTAINER_STYLE_DEFINITION__BORDER);

    containerColorDefinitionEClass = createEClass(CONTAINER_COLOR_DEFINITION);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__STYLE);

    nodeStyleDefinitionEClass = createEClass(NODE_STYLE_DEFINITION);
    createEReference(nodeStyleDefinitionEClass, NODE_STYLE_DEFINITION__COLOR);
    createEReference(nodeStyleDefinitionEClass, NODE_STYLE_DEFINITION__LABEL);
    createEReference(nodeStyleDefinitionEClass, NODE_STYLE_DEFINITION__BORDER);

    solidColorDefinitionEClass = createEClass(SOLID_COLOR_DEFINITION);
    createEReference(solidColorDefinitionEClass, SOLID_COLOR_DEFINITION__COLOR);

    gradientColorDefinitionEClass = createEClass(GRADIENT_COLOR_DEFINITION);
    createEReference(gradientColorDefinitionEClass, GRADIENT_COLOR_DEFINITION__FROM);
    createEReference(gradientColorDefinitionEClass, GRADIENT_COLOR_DEFINITION__TO);

    labelStyleDefinitionEClass = createEClass(LABEL_STYLE_DEFINITION);
    createEReference(labelStyleDefinitionEClass, LABEL_STYLE_DEFINITION__EXPRESSION);
    createEReference(labelStyleDefinitionEClass, LABEL_STYLE_DEFINITION__COLOR);
    createEAttribute(labelStyleDefinitionEClass, LABEL_STYLE_DEFINITION__SIZE);
    createEAttribute(labelStyleDefinitionEClass, LABEL_STYLE_DEFINITION__BOLD);
    createEAttribute(labelStyleDefinitionEClass, LABEL_STYLE_DEFINITION__ITALIC);

    borderStyleDefinitionEClass = createEClass(BORDER_STYLE_DEFINITION);
    createEReference(borderStyleDefinitionEClass, BORDER_STYLE_DEFINITION__COLOR);
    createEAttribute(borderStyleDefinitionEClass, BORDER_STYLE_DEFINITION__SIZE);

    spExpressionEClass = createEClass(SP_EXPRESSION);
    createEAttribute(spExpressionEClass, SP_EXPRESSION__VALUE);

    acceleoExpressionEClass = createEClass(ACCELEO_EXPRESSION);

    varRefEClass = createEClass(VAR_REF);

    featureRefEClass = createEClass(FEATURE_REF);

    metamodelRefEClass = createEClass(METAMODEL_REF);
    createEAttribute(metamodelRefEClass, METAMODEL_REF__METAMODEL);

    colorEClass = createEClass(COLOR);

    preDefinedColorDefinitionEClass = createEClass(PRE_DEFINED_COLOR_DEFINITION);
    createEAttribute(preDefinedColorDefinitionEClass, PRE_DEFINED_COLOR_DEFINITION__COLOR);

    // Create enums
    preDefinedColorEEnum = createEEnum(PRE_DEFINED_COLOR);
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
    spDiagramEClass.getESuperTypes().add(this.getSPRepresentation());
    containerEClass.getESuperTypes().add(this.getDiagramElement());
    nodeEClass.getESuperTypes().add(this.getDiagramElement());
    solidColorDefinitionEClass.getESuperTypes().add(this.getContainerColorDefinition());
    gradientColorDefinitionEClass.getESuperTypes().add(this.getContainerColorDefinition());
    acceleoExpressionEClass.getESuperTypes().add(this.getSPExpression());
    varRefEClass.getESuperTypes().add(this.getSPExpression());
    featureRefEClass.getESuperTypes().add(this.getSPExpression());
    preDefinedColorDefinitionEClass.getESuperTypes().add(this.getColor());

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
    initEAttribute(getSPRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, SPRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPRepresentation_Label(), ecorePackage.getEString(), "label", null, 0, 1, SPRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPRepresentation_Title(), ecorePackage.getEString(), "title", null, 0, 1, SPRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPRepresentation_Metamodels(), this.getMetamodelRef(), null, "metamodels", null, 0, -1, SPRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSPRepresentation_Root(), ecorePackage.getEString(), "root", null, 0, 1, SPRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spTableEClass, SPTable.class, "SPTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSPTable_Elements(), this.getTableElement(), null, "elements", null, 0, -1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSPTable_Properties(), this.getTableProperty(), null, "properties", null, 0, -1, SPTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableElementEClass, TableElement.class, "TableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableElement_Creatable(), ecorePackage.getEBoolean(), "creatable", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_Recursive(), ecorePackage.getEBoolean(), "recursive", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_EClass(), ecorePackage.getEString(), "eClass", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_SubElements(), this.getTableElement(), null, "subElements", null, 0, -1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tablePropertyEClass, TableProperty.class, "TableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableProperty_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableProperty_Label(), ecorePackage.getEString(), "label", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableProperty_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, TableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spDiagramEClass, SPDiagram.class, "SPDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSPDiagram_Elements(), this.getDiagramElement(), null, "elements", null, 0, -1, SPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiagramElement_Creatable(), ecorePackage.getEBoolean(), "creatable", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_EClass(), ecorePackage.getEString(), "eClass", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagramElement_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerEClass, fr.obeo.dsl.sPrototyper.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainer_Recursive(), ecorePackage.getEBoolean(), "recursive", null, 0, 1, fr.obeo.dsl.sPrototyper.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_ContainerType(), ecorePackage.getEString(), "containerType", null, 0, 1, fr.obeo.dsl.sPrototyper.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Style(), this.getContainerStyleDefinition(), null, "style", null, 0, 1, fr.obeo.dsl.sPrototyper.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Elements(), this.getDiagramElement(), null, "elements", null, 0, -1, fr.obeo.dsl.sPrototyper.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerStyleDefinitionEClass, ContainerStyleDefinition.class, "ContainerStyleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerStyleDefinition_Color(), this.getContainerColorDefinition(), null, "color", null, 0, 1, ContainerStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerStyleDefinition_Label(), this.getLabelStyleDefinition(), null, "label", null, 0, 1, ContainerStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerStyleDefinition_Border(), this.getBorderStyleDefinition(), null, "border", null, 0, 1, ContainerStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerColorDefinitionEClass, ContainerColorDefinition.class, "ContainerColorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_Style(), this.getNodeStyleDefinition(), null, "style", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeStyleDefinitionEClass, NodeStyleDefinition.class, "NodeStyleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeStyleDefinition_Color(), this.getSolidColorDefinition(), null, "color", null, 0, 1, NodeStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStyleDefinition_Label(), this.getLabelStyleDefinition(), null, "label", null, 0, 1, NodeStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStyleDefinition_Border(), this.getBorderStyleDefinition(), null, "border", null, 0, 1, NodeStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(solidColorDefinitionEClass, SolidColorDefinition.class, "SolidColorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSolidColorDefinition_Color(), this.getColor(), null, "color", null, 0, 1, SolidColorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gradientColorDefinitionEClass, GradientColorDefinition.class, "GradientColorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGradientColorDefinition_From(), this.getColor(), null, "from", null, 0, 1, GradientColorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGradientColorDefinition_To(), this.getColor(), null, "to", null, 0, 1, GradientColorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelStyleDefinitionEClass, LabelStyleDefinition.class, "LabelStyleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabelStyleDefinition_Expression(), this.getSPExpression(), null, "expression", null, 0, 1, LabelStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLabelStyleDefinition_Color(), this.getSolidColorDefinition(), null, "color", null, 0, 1, LabelStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelStyleDefinition_Size(), ecorePackage.getEInt(), "size", null, 0, 1, LabelStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelStyleDefinition_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, LabelStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelStyleDefinition_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, LabelStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderStyleDefinitionEClass, BorderStyleDefinition.class, "BorderStyleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorderStyleDefinition_Color(), this.getSolidColorDefinition(), null, "color", null, 0, 1, BorderStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyleDefinition_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BorderStyleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spExpressionEClass, SPExpression.class, "SPExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, SPExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acceleoExpressionEClass, AcceleoExpression.class, "AcceleoExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varRefEClass, VarRef.class, "VarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureRefEClass, FeatureRef.class, "FeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metamodelRefEClass, MetamodelRef.class, "MetamodelRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetamodelRef_Metamodel(), ecorePackage.getEString(), "metamodel", null, 0, 1, MetamodelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preDefinedColorDefinitionEClass, PreDefinedColorDefinition.class, "PreDefinedColorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreDefinedColorDefinition_Color(), this.getPreDefinedColor(), "color", null, 0, 1, PreDefinedColorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(preDefinedColorEEnum, PreDefinedColor.class, "PreDefinedColor");
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.WHITE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.BLACK);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.BLUE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_BLUE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_BLUE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.CHOCOLATE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_CHOCOLATE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_CHOCOLATE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.GRAY);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_GRAY);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_GRAY);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.GREEN);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_GREEN);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_GREEN);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.ORANGE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_ORANGE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_ORANGE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.PURPLE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_PURPLE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_PURPLE);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.RED);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_RED);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_RED);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.YELLOW);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.LIGHT_YELLOW);
    addEEnumLiteral(preDefinedColorEEnum, PreDefinedColor.DARK_YELLOW);

    // Create resource
    createResource(eNS_URI);
  }

} //SPrototyperPackageImpl
