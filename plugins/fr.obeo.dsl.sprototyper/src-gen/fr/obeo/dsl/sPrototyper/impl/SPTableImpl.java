/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.MetamodelRef;
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
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.SPTableImpl#getMetamodels <em>Metamodels</em>}</li>
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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodels()
   * @generated
   * @ordered
   */
  protected EList<MetamodelRef> metamodels;

  /**
   * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected static final String ROOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected String root = ROOT_EDEFAULT;

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
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_TABLE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.SP_TABLE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelRef> getMetamodels()
  {
    if (metamodels == null)
    {
      metamodels = new EObjectContainmentEList<MetamodelRef>(MetamodelRef.class, this, SPrototyperPackage.SP_TABLE__METAMODELS);
    }
    return metamodels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(String newRoot)
  {
    String oldRoot = root;
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
      case SPrototyperPackage.SP_TABLE__METAMODELS:
        return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
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
      case SPrototyperPackage.SP_TABLE__NAME:
        return getName();
      case SPrototyperPackage.SP_TABLE__LABEL:
        return getLabel();
      case SPrototyperPackage.SP_TABLE__TITLE:
        return getTitle();
      case SPrototyperPackage.SP_TABLE__METAMODELS:
        return getMetamodels();
      case SPrototyperPackage.SP_TABLE__ROOT:
        return getRoot();
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
      case SPrototyperPackage.SP_TABLE__NAME:
        setName((String)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__LABEL:
        setLabel((String)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__TITLE:
        setTitle((String)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__METAMODELS:
        getMetamodels().clear();
        getMetamodels().addAll((Collection<? extends MetamodelRef>)newValue);
        return;
      case SPrototyperPackage.SP_TABLE__ROOT:
        setRoot((String)newValue);
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
      case SPrototyperPackage.SP_TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SPrototyperPackage.SP_TABLE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SPrototyperPackage.SP_TABLE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case SPrototyperPackage.SP_TABLE__METAMODELS:
        getMetamodels().clear();
        return;
      case SPrototyperPackage.SP_TABLE__ROOT:
        setRoot(ROOT_EDEFAULT);
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
      case SPrototyperPackage.SP_TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SPrototyperPackage.SP_TABLE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SPrototyperPackage.SP_TABLE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case SPrototyperPackage.SP_TABLE__METAMODELS:
        return metamodels != null && !metamodels.isEmpty();
      case SPrototyperPackage.SP_TABLE__ROOT:
        return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
      case SPrototyperPackage.SP_TABLE__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case SPrototyperPackage.SP_TABLE__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(", label: ");
    result.append(label);
    result.append(", title: ");
    result.append(title);
    result.append(", root: ");
    result.append(root);
    result.append(')');
    return result.toString();
  }

} //SPTableImpl
