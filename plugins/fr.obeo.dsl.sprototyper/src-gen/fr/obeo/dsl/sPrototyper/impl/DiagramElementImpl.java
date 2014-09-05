/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl#isCreatable <em>Creatable</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.DiagramElementImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement
{
  /**
   * The default value of the '{@link #isCreatable() <em>Creatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreatable()
   * @generated
   * @ordered
   */
  protected static final boolean CREATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCreatable() <em>Creatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreatable()
   * @generated
   * @ordered
   */
  protected boolean creatable = CREATABLE_EDEFAULT;

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
   * The default value of the '{@link #getEClass() <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected static final String ECLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEClass() <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected String eClass = ECLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected SPExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramElementImpl()
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
    return SPrototyperPackage.Literals.DIAGRAM_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreatable()
  {
    return creatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatable(boolean newCreatable)
  {
    boolean oldCreatable = creatable;
    creatable = newCreatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.DIAGRAM_ELEMENT__CREATABLE, oldCreatable, creatable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.DIAGRAM_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEClass()
  {
    return eClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEClass(String newEClass)
  {
    String oldEClass = eClass;
    eClass = newEClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.DIAGRAM_ELEMENT__ECLASS, oldEClass, eClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(SPExpression newExpression, NotificationChain msgs)
  {
    SPExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(SPExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION, newExpression, newExpression));
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
      case SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case SPrototyperPackage.DIAGRAM_ELEMENT__CREATABLE:
        return isCreatable();
      case SPrototyperPackage.DIAGRAM_ELEMENT__NAME:
        return getName();
      case SPrototyperPackage.DIAGRAM_ELEMENT__ECLASS:
        return getEClass();
      case SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION:
        return getExpression();
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
      case SPrototyperPackage.DIAGRAM_ELEMENT__CREATABLE:
        setCreatable((Boolean)newValue);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__ECLASS:
        setEClass((String)newValue);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION:
        setExpression((SPExpression)newValue);
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
      case SPrototyperPackage.DIAGRAM_ELEMENT__CREATABLE:
        setCreatable(CREATABLE_EDEFAULT);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__ECLASS:
        setEClass(ECLASS_EDEFAULT);
        return;
      case SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION:
        setExpression((SPExpression)null);
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
      case SPrototyperPackage.DIAGRAM_ELEMENT__CREATABLE:
        return creatable != CREATABLE_EDEFAULT;
      case SPrototyperPackage.DIAGRAM_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SPrototyperPackage.DIAGRAM_ELEMENT__ECLASS:
        return ECLASS_EDEFAULT == null ? eClass != null : !ECLASS_EDEFAULT.equals(eClass);
      case SPrototyperPackage.DIAGRAM_ELEMENT__EXPRESSION:
        return expression != null;
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
    result.append(" (creatable: ");
    result.append(creatable);
    result.append(", name: ");
    result.append(name);
    result.append(", eClass: ");
    result.append(eClass);
    result.append(')');
    return result.toString();
  }

} //DiagramElementImpl
