/**
 */
package fr.obeo.dsl.sPrototyper.util;

import fr.obeo.dsl.sPrototyper.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage
 * @generated
 */
public class SPrototyperAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SPrototyperPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyperAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SPrototyperPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPrototyperSwitch<Adapter> modelSwitch =
    new SPrototyperSwitch<Adapter>()
    {
      @Override
      public Adapter caseSPrototyper(SPrototyper object)
      {
        return createSPrototyperAdapter();
      }
      @Override
      public Adapter caseSPViewpoint(SPViewpoint object)
      {
        return createSPViewpointAdapter();
      }
      @Override
      public Adapter caseSPRepresentation(SPRepresentation object)
      {
        return createSPRepresentationAdapter();
      }
      @Override
      public Adapter caseSPTable(SPTable object)
      {
        return createSPTableAdapter();
      }
      @Override
      public Adapter caseTableElement(TableElement object)
      {
        return createTableElementAdapter();
      }
      @Override
      public Adapter caseTableProperty(TableProperty object)
      {
        return createTablePropertyAdapter();
      }
      @Override
      public Adapter caseSPExpression(SPExpression object)
      {
        return createSPExpressionAdapter();
      }
      @Override
      public Adapter caseAcceleoExpression(AcceleoExpression object)
      {
        return createAcceleoExpressionAdapter();
      }
      @Override
      public Adapter caseVarRef(VarRef object)
      {
        return createVarRefAdapter();
      }
      @Override
      public Adapter caseFeatureRef(FeatureRef object)
      {
        return createFeatureRefAdapter();
      }
      @Override
      public Adapter caseMetamodelRef(MetamodelRef object)
      {
        return createMetamodelRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.SPrototyper <em>SPrototyper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.SPrototyper
   * @generated
   */
  public Adapter createSPrototyperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.SPViewpoint <em>SP Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.SPViewpoint
   * @generated
   */
  public Adapter createSPViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.SPRepresentation <em>SP Representation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.SPRepresentation
   * @generated
   */
  public Adapter createSPRepresentationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.SPTable <em>SP Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.SPTable
   * @generated
   */
  public Adapter createSPTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.TableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.TableElement
   * @generated
   */
  public Adapter createTableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.TableProperty <em>Table Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.TableProperty
   * @generated
   */
  public Adapter createTablePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.SPExpression <em>SP Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.SPExpression
   * @generated
   */
  public Adapter createSPExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.AcceleoExpression <em>Acceleo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.AcceleoExpression
   * @generated
   */
  public Adapter createAcceleoExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.VarRef
   * @generated
   */
  public Adapter createVarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.FeatureRef <em>Feature Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.FeatureRef
   * @generated
   */
  public Adapter createFeatureRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.obeo.dsl.sPrototyper.MetamodelRef <em>Metamodel Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.obeo.dsl.sPrototyper.MetamodelRef
   * @generated
   */
  public Adapter createMetamodelRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SPrototyperAdapterFactory
