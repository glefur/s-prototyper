/**
 */
package fr.obeo.dsl.sPrototyper.util;

import fr.obeo.dsl.sPrototyper.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage
 * @generated
 */
public class SPrototyperSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SPrototyperPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPrototyperSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SPrototyperPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SPrototyperPackage.SPROTOTYPER:
      {
        SPrototyper sPrototyper = (SPrototyper)theEObject;
        T result = caseSPrototyper(sPrototyper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SP_VIEWPOINT:
      {
        SPViewpoint spViewpoint = (SPViewpoint)theEObject;
        T result = caseSPViewpoint(spViewpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SP_REPRESENTATION:
      {
        SPRepresentation spRepresentation = (SPRepresentation)theEObject;
        T result = caseSPRepresentation(spRepresentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SP_TABLE:
      {
        SPTable spTable = (SPTable)theEObject;
        T result = caseSPTable(spTable);
        if (result == null) result = caseSPRepresentation(spTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.TABLE_ELEMENT:
      {
        TableElement tableElement = (TableElement)theEObject;
        T result = caseTableElement(tableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.TABLE_PROPERTY:
      {
        TableProperty tableProperty = (TableProperty)theEObject;
        T result = caseTableProperty(tableProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SP_DIAGRAM:
      {
        SPDiagram spDiagram = (SPDiagram)theEObject;
        T result = caseSPDiagram(spDiagram);
        if (result == null) result = caseSPRepresentation(spDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.DIAGRAM_ELEMENT:
      {
        DiagramElement diagramElement = (DiagramElement)theEObject;
        T result = caseDiagramElement(diagramElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = caseDiagramElement(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SOLID_COLOR_DEFINITION:
      {
        SolidColorDefinition solidColorDefinition = (SolidColorDefinition)theEObject;
        T result = caseSolidColorDefinition(solidColorDefinition);
        if (result == null) result = caseContainerColorDefinition(solidColorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.CONTAINER_COLOR_DEFINITION:
      {
        ContainerColorDefinition containerColorDefinition = (ContainerColorDefinition)theEObject;
        T result = caseContainerColorDefinition(containerColorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.GRADIENT_COLOR_DEFINITION:
      {
        GradientColorDefinition gradientColorDefinition = (GradientColorDefinition)theEObject;
        T result = caseGradientColorDefinition(gradientColorDefinition);
        if (result == null) result = caseContainerColorDefinition(gradientColorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.LABEL_STYLE_DEFINITION:
      {
        LabelStyleDefinition labelStyleDefinition = (LabelStyleDefinition)theEObject;
        T result = caseLabelStyleDefinition(labelStyleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.BORDER_STYLE_DEFINITION:
      {
        BorderStyleDefinition borderStyleDefinition = (BorderStyleDefinition)theEObject;
        T result = caseBorderStyleDefinition(borderStyleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.SP_EXPRESSION:
      {
        SPExpression spExpression = (SPExpression)theEObject;
        T result = caseSPExpression(spExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.ACCELEO_EXPRESSION:
      {
        AcceleoExpression acceleoExpression = (AcceleoExpression)theEObject;
        T result = caseAcceleoExpression(acceleoExpression);
        if (result == null) result = caseSPExpression(acceleoExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.VAR_REF:
      {
        VarRef varRef = (VarRef)theEObject;
        T result = caseVarRef(varRef);
        if (result == null) result = caseSPExpression(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.FEATURE_REF:
      {
        FeatureRef featureRef = (FeatureRef)theEObject;
        T result = caseFeatureRef(featureRef);
        if (result == null) result = caseSPExpression(featureRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPrototyperPackage.METAMODEL_REF:
      {
        MetamodelRef metamodelRef = (MetamodelRef)theEObject;
        T result = caseMetamodelRef(metamodelRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPrototyper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPrototyper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPrototyper(SPrototyper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP Viewpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPViewpoint(SPViewpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP Representation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP Representation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPRepresentation(SPRepresentation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPTable(SPTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableElement(TableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableProperty(TableProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPDiagram(SPDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagramElement(DiagramElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Solid Color Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Solid Color Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSolidColorDefinition(SolidColorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Color Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Color Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerColorDefinition(ContainerColorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gradient Color Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gradient Color Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGradientColorDefinition(GradientColorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Style Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Style Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelStyleDefinition(LabelStyleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Style Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Style Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderStyleDefinition(BorderStyleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPExpression(SPExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acceleo Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acceleo Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceleoExpression(AcceleoExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRef(VarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureRef(FeatureRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodel Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodel Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodelRef(MetamodelRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SPrototyperSwitch
