/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.LabelStyleDefinition;
import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.SolidColorDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Style Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.LabelStyleDefinitionImpl#isItalic <em>Italic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelStyleDefinitionImpl extends MinimalEObjectImpl.Container implements LabelStyleDefinition
{
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
  protected SolidColorDefinition color;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBold()
   * @generated
   * @ordered
   */
  protected static final boolean BOLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBold()
   * @generated
   * @ordered
   */
  protected boolean bold = BOLD_EDEFAULT;

  /**
   * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalic()
   * @generated
   * @ordered
   */
  protected static final boolean ITALIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalic()
   * @generated
   * @ordered
   */
  protected boolean italic = ITALIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelStyleDefinitionImpl()
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
    return SPrototyperPackage.Literals.LABEL_STYLE_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolidColorDefinition getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(SolidColorDefinition newColor, NotificationChain msgs)
  {
    SolidColorDefinition oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(SolidColorDefinition newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBold()
  {
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBold(boolean newBold)
  {
    boolean oldBold = bold;
    bold = newBold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__BOLD, oldBold, bold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isItalic()
  {
    return italic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItalic(boolean newItalic)
  {
    boolean oldItalic = italic;
    italic = newItalic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.LABEL_STYLE_DEFINITION__ITALIC, oldItalic, italic));
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
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR:
        return basicSetColor(null, msgs);
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
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION:
        return getExpression();
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR:
        return getColor();
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__SIZE:
        return getSize();
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__BOLD:
        return isBold();
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__ITALIC:
        return isItalic();
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
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION:
        setExpression((SPExpression)newValue);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR:
        setColor((SolidColorDefinition)newValue);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__SIZE:
        setSize((Integer)newValue);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__BOLD:
        setBold((Boolean)newValue);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__ITALIC:
        setItalic((Boolean)newValue);
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
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION:
        setExpression((SPExpression)null);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR:
        setColor((SolidColorDefinition)null);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__BOLD:
        setBold(BOLD_EDEFAULT);
        return;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__ITALIC:
        setItalic(ITALIC_EDEFAULT);
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
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__EXPRESSION:
        return expression != null;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__COLOR:
        return color != null;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__SIZE:
        return size != SIZE_EDEFAULT;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__BOLD:
        return bold != BOLD_EDEFAULT;
      case SPrototyperPackage.LABEL_STYLE_DEFINITION__ITALIC:
        return italic != ITALIC_EDEFAULT;
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
    result.append(" (size: ");
    result.append(size);
    result.append(", bold: ");
    result.append(bold);
    result.append(", italic: ");
    result.append(italic);
    result.append(')');
    return result.toString();
  }

} //LabelStyleDefinitionImpl
