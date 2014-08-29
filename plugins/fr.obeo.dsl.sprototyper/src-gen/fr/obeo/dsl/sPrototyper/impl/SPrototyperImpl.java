/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPrototyper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPrototyperImpl#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPrototyperImpl extends MinimalEObjectImpl.Container implements SPrototyper
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected String qualifier = QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoints()
   * @generated
   * @ordered
   */
  protected EList<SPViewpoint> viewpoints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPrototyperImpl()
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
    return SPrototyperPackage.Literals.SPROTOTYPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SPROTOTYPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(String newQualifier)
  {
    String oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SPROTOTYPER__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SPViewpoint> getViewpoints()
  {
    if (viewpoints == null)
    {
      viewpoints = new EObjectContainmentEList<SPViewpoint>(SPViewpoint.class, this, SPrototyperPackage.SPROTOTYPER__VIEWPOINTS);
    }
    return viewpoints;
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
      case SPrototyperPackage.SPROTOTYPER__VIEWPOINTS:
        return ((InternalEList<?>)getViewpoints()).basicRemove(otherEnd, msgs);
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
      case SPrototyperPackage.SPROTOTYPER__NAME:
        return getName();
      case SPrototyperPackage.SPROTOTYPER__QUALIFIER:
        return getQualifier();
      case SPrototyperPackage.SPROTOTYPER__VIEWPOINTS:
        return getViewpoints();
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
      case SPrototyperPackage.SPROTOTYPER__NAME:
        setName((String)newValue);
        return;
      case SPrototyperPackage.SPROTOTYPER__QUALIFIER:
        setQualifier((String)newValue);
        return;
      case SPrototyperPackage.SPROTOTYPER__VIEWPOINTS:
        getViewpoints().clear();
        getViewpoints().addAll((Collection<? extends SPViewpoint>)newValue);
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
      case SPrototyperPackage.SPROTOTYPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SPrototyperPackage.SPROTOTYPER__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
      case SPrototyperPackage.SPROTOTYPER__VIEWPOINTS:
        getViewpoints().clear();
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
      case SPrototyperPackage.SPROTOTYPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SPrototyperPackage.SPROTOTYPER__QUALIFIER:
        return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
      case SPrototyperPackage.SPROTOTYPER__VIEWPOINTS:
        return viewpoints != null && !viewpoints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", qualifier: ");
    result.append(qualifier);
    result.append(')');
    return result.toString();
  }

} //SPrototyperImpl
