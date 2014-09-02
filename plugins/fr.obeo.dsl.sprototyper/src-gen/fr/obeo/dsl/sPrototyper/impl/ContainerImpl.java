/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.BorderStyleDefinition;
import fr.obeo.dsl.sPrototyper.ContainerColorDefinition;
import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends DiagramElementImpl implements fr.obeo.dsl.sPrototyper.Container
{
  /**
   * The default value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerType()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerType()
   * @generated
   * @ordered
   */
  protected String containerType = CONTAINER_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected ContainerColorDefinition color;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected LabelStyleDefinition label;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected BorderStyleDefinition border;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerImpl()
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
    return SPrototyperPackage.Literals.CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerType()
  {
    return containerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerType(String newContainerType)
  {
    String oldContainerType = containerType;
    containerType = newContainerType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__CONTAINER_TYPE, oldContainerType, containerType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__ECLASS, oldEClass, eClass));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerColorDefinition getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(ContainerColorDefinition newColor, NotificationChain msgs)
  {
    ContainerColorDefinition oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(ContainerColorDefinition newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelStyleDefinition getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(LabelStyleDefinition newLabel, NotificationChain msgs)
  {
    LabelStyleDefinition oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(LabelStyleDefinition newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyleDefinition getBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorder(BorderStyleDefinition newBorder, NotificationChain msgs)
  {
    BorderStyleDefinition oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__BORDER, oldBorder, newBorder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(BorderStyleDefinition newBorder)
  {
    if (newBorder != border)
    {
      NotificationChain msgs = null;
      if (border != null)
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__BORDER, newBorder, newBorder));
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
      case SPrototyperPackage.CONTAINER__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SPrototyperPackage.CONTAINER__COLOR:
        return basicSetColor(null, msgs);
      case SPrototyperPackage.CONTAINER__LABEL:
        return basicSetLabel(null, msgs);
      case SPrototyperPackage.CONTAINER__BORDER:
        return basicSetBorder(null, msgs);
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
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        return getContainerType();
      case SPrototyperPackage.CONTAINER__ECLASS:
        return getEClass();
      case SPrototyperPackage.CONTAINER__EXPRESSION:
        return getExpression();
      case SPrototyperPackage.CONTAINER__COLOR:
        return getColor();
      case SPrototyperPackage.CONTAINER__LABEL:
        return getLabel();
      case SPrototyperPackage.CONTAINER__BORDER:
        return getBorder();
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
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        setContainerType((String)newValue);
        return;
      case SPrototyperPackage.CONTAINER__ECLASS:
        setEClass((String)newValue);
        return;
      case SPrototyperPackage.CONTAINER__EXPRESSION:
        setExpression((SPExpression)newValue);
        return;
      case SPrototyperPackage.CONTAINER__COLOR:
        setColor((ContainerColorDefinition)newValue);
        return;
      case SPrototyperPackage.CONTAINER__LABEL:
        setLabel((LabelStyleDefinition)newValue);
        return;
      case SPrototyperPackage.CONTAINER__BORDER:
        setBorder((BorderStyleDefinition)newValue);
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
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        setContainerType(CONTAINER_TYPE_EDEFAULT);
        return;
      case SPrototyperPackage.CONTAINER__ECLASS:
        setEClass(ECLASS_EDEFAULT);
        return;
      case SPrototyperPackage.CONTAINER__EXPRESSION:
        setExpression((SPExpression)null);
        return;
      case SPrototyperPackage.CONTAINER__COLOR:
        setColor((ContainerColorDefinition)null);
        return;
      case SPrototyperPackage.CONTAINER__LABEL:
        setLabel((LabelStyleDefinition)null);
        return;
      case SPrototyperPackage.CONTAINER__BORDER:
        setBorder((BorderStyleDefinition)null);
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
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        return CONTAINER_TYPE_EDEFAULT == null ? containerType != null : !CONTAINER_TYPE_EDEFAULT.equals(containerType);
      case SPrototyperPackage.CONTAINER__ECLASS:
        return ECLASS_EDEFAULT == null ? eClass != null : !ECLASS_EDEFAULT.equals(eClass);
      case SPrototyperPackage.CONTAINER__EXPRESSION:
        return expression != null;
      case SPrototyperPackage.CONTAINER__COLOR:
        return color != null;
      case SPrototyperPackage.CONTAINER__LABEL:
        return label != null;
      case SPrototyperPackage.CONTAINER__BORDER:
        return border != null;
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
    result.append(" (containerType: ");
    result.append(containerType);
    result.append(", eClass: ");
    result.append(eClass);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
