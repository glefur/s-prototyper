/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.JavaServiceClassReference;
import fr.obeo.dsl.sPrototyper.SPRepresentation;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
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
 * An implementation of the model object '<em><b>SP Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPViewpointImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPViewpointImpl extends MinimalEObjectImpl.Container implements SPViewpoint
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
   * The default value of the '{@link #getShortcut() <em>Shortcut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortcut()
   * @generated
   * @ordered
   */
  protected static final String SHORTCUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortcut() <em>Shortcut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortcut()
   * @generated
   * @ordered
   */
  protected String shortcut = SHORTCUT_EDEFAULT;

  /**
   * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected String extension = EXTENSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceClass()
   * @generated
   * @ordered
   */
  protected EList<JavaServiceClassReference> serviceClass;

  /**
   * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentations()
   * @generated
   * @ordered
   */
  protected EList<SPRepresentation> representations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPViewpointImpl()
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
    return SPrototyperPackage.Literals.SP_VIEWPOINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_VIEWPOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortcut()
  {
    return shortcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortcut(String newShortcut)
  {
    String oldShortcut = shortcut;
    shortcut = newShortcut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_VIEWPOINT__SHORTCUT, oldShortcut, shortcut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(String newExtension)
  {
    String oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_VIEWPOINT__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JavaServiceClassReference> getServiceClass()
  {
    if (serviceClass == null)
    {
      serviceClass = new EObjectContainmentEList<JavaServiceClassReference>(JavaServiceClassReference.class, this, SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS);
    }
    return serviceClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SPRepresentation> getRepresentations()
  {
    if (representations == null)
    {
      representations = new EObjectContainmentEList<SPRepresentation>(SPRepresentation.class, this, SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS);
    }
    return representations;
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
      case SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS:
        return ((InternalEList<?>)getServiceClass()).basicRemove(otherEnd, msgs);
      case SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS:
        return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
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
      case SPrototyperPackage.SP_VIEWPOINT__NAME:
        return getName();
      case SPrototyperPackage.SP_VIEWPOINT__SHORTCUT:
        return getShortcut();
      case SPrototyperPackage.SP_VIEWPOINT__EXTENSION:
        return getExtension();
      case SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS:
        return getServiceClass();
      case SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS:
        return getRepresentations();
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
      case SPrototyperPackage.SP_VIEWPOINT__NAME:
        setName((String)newValue);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__SHORTCUT:
        setShortcut((String)newValue);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__EXTENSION:
        setExtension((String)newValue);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS:
        getServiceClass().clear();
        getServiceClass().addAll((Collection<? extends JavaServiceClassReference>)newValue);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS:
        getRepresentations().clear();
        getRepresentations().addAll((Collection<? extends SPRepresentation>)newValue);
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
      case SPrototyperPackage.SP_VIEWPOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__SHORTCUT:
        setShortcut(SHORTCUT_EDEFAULT);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS:
        getServiceClass().clear();
        return;
      case SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS:
        getRepresentations().clear();
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
      case SPrototyperPackage.SP_VIEWPOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SPrototyperPackage.SP_VIEWPOINT__SHORTCUT:
        return SHORTCUT_EDEFAULT == null ? shortcut != null : !SHORTCUT_EDEFAULT.equals(shortcut);
      case SPrototyperPackage.SP_VIEWPOINT__EXTENSION:
        return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
      case SPrototyperPackage.SP_VIEWPOINT__SERVICE_CLASS:
        return serviceClass != null && !serviceClass.isEmpty();
      case SPrototyperPackage.SP_VIEWPOINT__REPRESENTATIONS:
        return representations != null && !representations.isEmpty();
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
    result.append(", shortcut: ");
    result.append(shortcut);
    result.append(", extension: ");
    result.append(extension);
    result.append(')');
    return result.toString();
  }

} //SPViewpointImpl
