/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.*;

import org.eclipse.emf.ecore.EClass;
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
      SPrototyperFactory theSPrototyperFactory = (SPrototyperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/SPrototyper"); 
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
      case SPrototyperPackage.SP_EXPRESSION: return createSPExpression();
      case SPrototyperPackage.ACCELEO_EXPRESSION: return createAcceleoExpression();
      case SPrototyperPackage.VAR_REF: return createVarRef();
      case SPrototyperPackage.FEATURE_REF: return createFeatureRef();
      case SPrototyperPackage.METAMODEL_REF: return createMetamodelRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public MetamodelRef createMetamodelRef()
  {
    MetamodelRefImpl metamodelRef = new MetamodelRefImpl();
    return metamodelRef;
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
