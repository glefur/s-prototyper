/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.JavaServiceClassReference;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

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
   * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected JvmTypeReference javaClass;

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
  public JvmTypeReference getJavaClass()
  {
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJavaClass(JvmTypeReference newJavaClass, NotificationChain msgs)
  {
    JvmTypeReference oldJavaClass = javaClass;
    javaClass = newJavaClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS, oldJavaClass, newJavaClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaClass(JvmTypeReference newJavaClass)
  {
    if (newJavaClass != javaClass)
    {
      NotificationChain msgs = null;
      if (javaClass != null)
        msgs = ((InternalEObject)javaClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS, null, msgs);
      if (newJavaClass != null)
        msgs = ((InternalEObject)newJavaClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS, null, msgs);
      msgs = basicSetJavaClass(newJavaClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS, newJavaClass, newJavaClass));
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
      case SPrototyperPackage.JAVA_SERVICE_CLASS_REFERENCE__JAVA_CLASS:
        return basicSetJavaClass(null, msgs);
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
        setJavaClass((JvmTypeReference)newValue);
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
        setJavaClass((JvmTypeReference)null);
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
        return javaClass != null;
    }
    return super.eIsSet(featureID);
  }

} //JavaServiceClassReferenceImpl
