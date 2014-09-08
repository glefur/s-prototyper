/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.SPDiagram;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SP Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPDiagramImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPDiagramImpl extends SPRepresentationImpl implements SPDiagram
{
  /**
   * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodels()
   * @generated
   * @ordered
   */
  protected EList<MetamodelRef> metamodels;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<DiagramElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPDiagramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SPrototyperPackage.Literals.SP_DIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelRef> getMetamodels()
  {
    if (metamodels == null)
    {
      metamodels = new EObjectContainmentEList<MetamodelRef>(MetamodelRef.class, this, SPrototyperPackage.SP_DIAGRAM__METAMODELS);
    }
    return metamodels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiagramElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, SPrototyperPackage.SP_DIAGRAM__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SPrototyperPackage.SP_DIAGRAM__METAMODELS:
        return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
      case SPrototyperPackage.SP_DIAGRAM__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SPrototyperPackage.SP_DIAGRAM__METAMODELS:
        return getMetamodels();
      case SPrototyperPackage.SP_DIAGRAM__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SPrototyperPackage.SP_DIAGRAM__METAMODELS:
        getMetamodels().clear();
        getMetamodels().addAll((Collection<? extends MetamodelRef>)newValue);
        return;
      case SPrototyperPackage.SP_DIAGRAM__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends DiagramElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SPrototyperPackage.SP_DIAGRAM__METAMODELS:
        getMetamodels().clear();
        return;
      case SPrototyperPackage.SP_DIAGRAM__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SPrototyperPackage.SP_DIAGRAM__METAMODELS:
        return metamodels != null && !metamodels.isEmpty();
      case SPrototyperPackage.SP_DIAGRAM__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SPDiagramImpl
