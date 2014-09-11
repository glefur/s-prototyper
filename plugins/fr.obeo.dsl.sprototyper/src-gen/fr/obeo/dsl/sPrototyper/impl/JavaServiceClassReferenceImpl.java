/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.JavaServiceClassReference;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Service Class Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.JavaServiceClassReferenceImpl#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaServiceClassReferenceImpl extends MinimalEObjectImpl.Container implements JavaServiceClassReference
{
  /**
   * The default value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected static final String JAVA_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected String javaClass = JAVA_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaServiceClassReferenceImpl()
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
    return SPrototyperPackage.Literals.JAVA_SERVICE_CLASS_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaClass()
  {
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaClass(String newJavaClass)
  {
    String oldJavaClass = javaClass;
    javaClass = newJavaClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS, oldJavaClass, javaClass));
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
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS:
        return getJavaClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS:
        setJavaClass((String)newValue);
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
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS:
        setJavaClass(JAVA_CLASS_EDEFAULT);
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
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS:
        return JAVA_CLASS_EDEFAULT == null ? javaClass != null : !JAVA_CLASS_EDEFAULT.equals(javaClass);
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
    result.append(" (javaClass: ");
    result.append(javaClass);
    result.append(')');
    return result.toString();
  }

} //JavaServiceClassReferenceImpl
