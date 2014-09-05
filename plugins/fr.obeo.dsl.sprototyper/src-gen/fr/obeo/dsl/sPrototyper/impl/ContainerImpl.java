/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.ContainerStyleDefinition;
import fr.obeo.dsl.sPrototyper.DiagramElement;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.ContainerImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends DiagramElementImpl implements fr.obeo.dsl.sPrototyper.Container
{
  /**
   * The default value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecursive()
   * @generated
   * @ordered
   */
  protected static final boolean RECURSIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecursive()
   * @generated
   * @ordered
   */
  protected boolean recursive = RECURSIVE_EDEFAULT;

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
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected ContainerStyleDefinition style;

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
  public boolean isRecursive()
  {
    return recursive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecursive(boolean newRecursive)
  {
    boolean oldRecursive = recursive;
    recursive = newRecursive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__RECURSIVE, oldRecursive, recursive));
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
  public ContainerStyleDefinition getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(ContainerStyleDefinition newStyle, NotificationChain msgs)
  {
    ContainerStyleDefinition oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(ContainerStyleDefinition newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.CONTAINER__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.CONTAINER__STYLE, newStyle, newStyle));
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
      elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, SPrototyperPackage.CONTAINER__ELEMENTS);
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
      case SPrototyperPackage.CONTAINER__STYLE:
        return basicSetStyle(null, msgs);
      case SPrototyperPackage.CONTAINER__ELEMENTS:
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
      case SPrototyperPackage.CONTAINER__RECURSIVE:
        return isRecursive();
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        return getContainerType();
      case SPrototyperPackage.CONTAINER__STYLE:
        return getStyle();
      case SPrototyperPackage.CONTAINER__ELEMENTS:
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
      case SPrototyperPackage.CONTAINER__RECURSIVE:
        setRecursive((Boolean)newValue);
        return;
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        setContainerType((String)newValue);
        return;
      case SPrototyperPackage.CONTAINER__STYLE:
        setStyle((ContainerStyleDefinition)newValue);
        return;
      case SPrototyperPackage.CONTAINER__ELEMENTS:
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
      case SPrototyperPackage.CONTAINER__RECURSIVE:
        setRecursive(RECURSIVE_EDEFAULT);
        return;
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        setContainerType(CONTAINER_TYPE_EDEFAULT);
        return;
      case SPrototyperPackage.CONTAINER__STYLE:
        setStyle((ContainerStyleDefinition)null);
        return;
      case SPrototyperPackage.CONTAINER__ELEMENTS:
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
      case SPrototyperPackage.CONTAINER__RECURSIVE:
        return recursive != RECURSIVE_EDEFAULT;
      case SPrototyperPackage.CONTAINER__CONTAINER_TYPE:
        return CONTAINER_TYPE_EDEFAULT == null ? containerType != null : !CONTAINER_TYPE_EDEFAULT.equals(containerType);
      case SPrototyperPackage.CONTAINER__STYLE:
        return style != null;
      case SPrototyperPackage.CONTAINER__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (recursive: ");
    result.append(recursive);
    result.append(", containerType: ");
    result.append(containerType);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
