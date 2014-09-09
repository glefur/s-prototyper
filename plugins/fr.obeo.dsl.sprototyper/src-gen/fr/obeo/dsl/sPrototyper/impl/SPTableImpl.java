/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.MetamodelUsage;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SP Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPTableImpl extends SPRepresentationImpl implements SPTable
{
  /**
   * The cached value of the '{@link #getUsages() <em>Usages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsages()
   * @generated
   * @ordered
   */
  protected EList<MetamodelUsage> usages;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected EClass root;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<TableElement> elements;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<TableProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPTableImpl()
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
    return SPrototyperPackage.Literals.SP_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelUsage> getUsages()
  {
    if (usages == null)
    {
      usages = new EObjectContainmentEList<MetamodelUsage>(MetamodelUsage.class, this, SPrototyperPackage.SP_TABLE__USAGES);
    }
    return usages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    if (root != null && root.eIsProxy())
    {
      InternalEObject oldRoot = (InternalEObject)root;
      root = (EClass)eResolveProxy(oldRoot);
      if (root != oldRoot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPrototyperPackage.SP_TABLE__ROOT, oldRoot, root));
      }
    }
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(EClass newRoot)
  {
    EClass oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_TABLE__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<TableElement>(TableElement.class, this, SPrototyperPackage.SP_TABLE__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<TableProperty>(TableProperty.class, this, SPrototyperPackage.SP_TABLE__PROPERTIES);
    }
    return properties;
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
      case SPrototyperPackage.SP_TABLE__USAGES:
        return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case SPrototyperPackage.SP_TABLE__USAGES:
        return getUsages();
      case SPrototyperPackage.SP_TABLE__ROOT:
        if (resolve) return getRoot();
        return basicGetRoot();
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        return getElements();
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        return getProperties();
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
      case SPrototyperPackage.SP_TABLE__USAGES:
        getUsages().clear();
        getUsages().addAll((Collection<? extends MetamodelUsage>)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__ROOT:
        setRoot((EClass)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends TableElement>)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends TableProperty>)newValue);
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
      case SPrototyperPackage.SP_TABLE__USAGES:
        getUsages().clear();
        return;
      case SPrototyperPackage.SP_TABLE__ROOT:
        setRoot((EClass)null);
        return;
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        getElements().clear();
        return;
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        getProperties().clear();
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
      case SPrototyperPackage.SP_TABLE__USAGES:
        return usages != null && !usages.isEmpty();
      case SPrototyperPackage.SP_TABLE__ROOT:
        return root != null;
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SPTableImpl
