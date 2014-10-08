/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPrototyperFactoryImpl extends EFactoryImpl implements SPrototyperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SPrototyperFactory init()
  {
    try
    {
      SPrototyperFactory theSPrototyperFactory = (SPrototyperFactory)EPackage.Registry.INSTANCE.getEFactory(SPrototyperPackage.eNS_URI);
      if (theSPrototyperFactory != null)
      {
        return theSPrototyperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SPrototyperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyperFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SPrototyperPackage.SPROTOTYPER: return createSPrototyper();
      case SPrototyperPackage.SP_VIEWPOINT: return createSPViewpoint();
      case SPrototyperPackage.SP_REPRESENTATION: return createSPRepresentation();
      case SPrototyperPackage.SP_TABLE: return createSPTable();
      case SPrototyperPackage.TABLE_ELEMENT: return createTableElement();
      case SPrototyperPackage.TABLE_PROPERTY: return createTableProperty();
      case SPrototyperPackage.SP_DIAGRAM: return createSPDiagram();
      case SPrototyperPackage.DIAGRAM_ELEMENT: return createDiagramElement();
      case SPrototyperPackage.CONTAINER: return createContainer();
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION: return createContainerStyleDefinition();
      case SPrototyperPackage.CONTAINER_COLOR_DEFINITION: return createContainerColorDefinition();
      case SPrototyperPackage.NODE: return createNode();
      case SPrototyperPackage.NODE_STYLE_DEFINITION: return createNodeStyleDefinition();
      case SPrototyperPackage.SOLID_COLOR_DEFINITION: return createSolidColorDefinition();
      case SPrototyperPackage.GRADIENT_COLOR_DEFINITION: return createGradientColorDefinition();
      case SPrototyperPackage.LABEL_STYLE_DEFINITION: return createLabelStyleDefinition();
      case SPrototyperPackage.BORDER_STYLE_DEFINITION: return createBorderStyleDefinition();
      case SPrototyperPackage.SP_EXPRESSION: return createSPExpression();
      case SPrototyperPackage.REQUEST_EXPRESSION: return createRequestExpression();
      case SPrototyperPackage.REQUEST_OR_CREATE_EXPRESSION: return createRequestOrCreateExpression();
      case SPrototyperPackage.ACCELEO_EXPRESSION: return createAcceleoExpression();
      case SPrototyperPackage.VAR_REF: return createVarRef();
      case SPrototyperPackage.FEATURE_REF: return createFeatureRef();
      case SPrototyperPackage.SERVICE_REF: return createServiceRef();
      case SPrototyperPackage.METAMODEL_USAGE: return createMetamodelUsage();
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE: return createJavaServiceClassReference();
      case SPrototyperPackage.COLOR: return createColor();
      case SPrototyperPackage.PRE_DEFINED_COLOR_DEFINITION: return createPreDefinedColorDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SPrototyperPackage.PRE_DEFINED_COLOR:
        return createPreDefinedColorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SPrototyperPackage.PRE_DEFINED_COLOR:
        return convertPreDefinedColorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyper createSPrototyper()
  {
    SPrototyperImpl sPrototyper = new SPrototyperImpl();
    return sPrototyper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPViewpoint createSPViewpoint()
  {
    SPViewpointImpl spViewpoint = new SPViewpointImpl();
    return spViewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPRepresentation createSPRepresentation()
  {
    SPRepresentationImpl spRepresentation = new SPRepresentationImpl();
    return spRepresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPTable createSPTable()
  {
    SPTableImpl spTable = new SPTableImpl();
    return spTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableElement createTableElement()
  {
    TableElementImpl tableElement = new TableElementImpl();
    return tableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableProperty createTableProperty()
  {
    TablePropertyImpl tableProperty = new TablePropertyImpl();
    return tableProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPDiagram createSPDiagram()
  {
    SPDiagramImpl spDiagram = new SPDiagramImpl();
    return spDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramElement createDiagramElement()
  {
    DiagramElementImpl diagramElement = new DiagramElementImpl();
    return diagramElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.obeo.dsl.sPrototyper.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStyleDefinition createContainerStyleDefinition()
  {
    ContainerStyleDefinitionImpl containerStyleDefinition = new ContainerStyleDefinitionImpl();
    return containerStyleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerColorDefinition createContainerColorDefinition()
  {
    ContainerColorDefinitionImpl containerColorDefinition = new ContainerColorDefinitionImpl();
    return containerColorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStyleDefinition createNodeStyleDefinition()
  {
    NodeStyleDefinitionImpl nodeStyleDefinition = new NodeStyleDefinitionImpl();
    return nodeStyleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolidColorDefinition createSolidColorDefinition()
  {
    SolidColorDefinitionImpl solidColorDefinition = new SolidColorDefinitionImpl();
    return solidColorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GradientColorDefinition createGradientColorDefinition()
  {
    GradientColorDefinitionImpl gradientColorDefinition = new GradientColorDefinitionImpl();
    return gradientColorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelStyleDefinition createLabelStyleDefinition()
  {
    LabelStyleDefinitionImpl labelStyleDefinition = new LabelStyleDefinitionImpl();
    return labelStyleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyleDefinition createBorderStyleDefinition()
  {
    BorderStyleDefinitionImpl borderStyleDefinition = new BorderStyleDefinitionImpl();
    return borderStyleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPExpression createSPExpression()
  {
    SPExpressionImpl spExpression = new SPExpressionImpl();
    return spExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestExpression createRequestExpression()
  {
    RequestExpressionImpl requestExpression = new RequestExpressionImpl();
    return requestExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestOrCreateExpression createRequestOrCreateExpression()
  {
    RequestOrCreateExpressionImpl requestOrCreateExpression = new RequestOrCreateExpressionImpl();
    return requestOrCreateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcceleoExpression createAcceleoExpression()
  {
    AcceleoExpressionImpl acceleoExpression = new AcceleoExpressionImpl();
    return acceleoExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureRef createFeatureRef()
  {
    FeatureRefImpl featureRef = new FeatureRefImpl();
    return featureRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceRef createServiceRef()
  {
    ServiceRefImpl serviceRef = new ServiceRefImpl();
    return serviceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelUsage createMetamodelUsage()
  {
    MetamodelUsageImpl metamodelUsage = new MetamodelUsageImpl();
    return metamodelUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaServiceClassReference createJavaServiceClassReference()
  {
    JavaServiceClassReferenceImpl javaServiceClassReference = new JavaServiceClassReferenceImpl();
    return javaServiceClassReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreDefinedColorDefinition createPreDefinedColorDefinition()
  {
    PreDefinedColorDefinitionImpl preDefinedColorDefinition = new PreDefinedColorDefinitionImpl();
    return preDefinedColorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreDefinedColor createPreDefinedColorFromString(EDataType eDataType, String initialValue)
  {
    PreDefinedColor result = PreDefinedColor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPreDefinedColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyperPackage getSPrototyperPackage()
  {
    return (SPrototyperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SPrototyperPackage getPackage()
  {
    return SPrototyperPackage.eINSTANCE;
  }

} //SPrototyperFactoryImpl
