/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.BorderStyleDefinition;
import fr.obeo.dsl.sPrototyper.ContainerColorDefinition;
import fr.obeo.dsl.sPrototyper.ContainerStyleDefinition;
import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Style Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerStyleDefinitionImpl#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerStyleDefinitionImpl extends MinimalEObjectImpl.Container implements ContainerStyleDefinition
{
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
  protected ContainerStyleDefinitionImpl()
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
    return SPrototyperPackage.Literals.CONTAINER_STYLE_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR, oldColor, newColor);
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
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR, newColor, newColor));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL, oldLabel, newLabel);
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
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL, newLabel, newLabel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER, oldBorder, newBorder);
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
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER, newBorder, newBorder));
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
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR:
        return basicSetColor(null, msgs);
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL:
        return basicSetLabel(null, msgs);
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER:
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
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR:
        return getColor();
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL:
        return getLabel();
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER:
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
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR:
        setColor((ContainerColorDefinition)newValue);
        return;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL:
        setLabel((LabelStyleDefinition)newValue);
        return;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER:
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
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR:
        setColor((ContainerColorDefinition)null);
        return;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL:
        setLabel((LabelStyleDefinition)null);
        return;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER:
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
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__COLOR:
        return color != null;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__LABEL:
        return label != null;
      case SPrototyperPackage.CONTAINER_STYLE_DEFINITION__BORDER:
        return border != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainerStyleDefinitionImpl
