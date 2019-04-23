/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model.impl;

import com._1c.g5.v8.dt.xdto.model.ObjectType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.edPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ed Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl#getMainName <em>Main Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl#getKeysName <em>Keys Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl#getXdtoMainObject <em>Xdto Main Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl#getXdtoKeysObject <em>Xdto Keys Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl#getMainProperties <em>Main Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdObjectImpl extends MinimalEObjectImpl.Container implements EdObject {
	/**
	 * The default value of the '{@link #getMainName() <em>Main Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMainName() <em>Main Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainName()
	 * @generated
	 * @ordered
	 */
	protected String mainName = MAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeysName() <em>Keys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYS_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getKeysName() <em>Keys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysName()
	 * @generated
	 * @ordered
	 */
	protected String keysName = KEYS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXdtoMainObject() <em>Xdto Main Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdtoMainObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectType xdtoMainObject;

	/**
	 * The cached value of the '{@link #getXdtoKeysObject() <em>Xdto Keys Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdtoKeysObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectType xdtoKeysObject;

	/**
	 * The cached value of the '{@link #getMainProperties() <em>Main Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EdProperty> mainProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edPackage.Literals.ED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainName() {
		return mainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainName(String newMainName) {
		String oldMainName = mainName;
		mainName = newMainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_OBJECT__MAIN_NAME, oldMainName, mainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeysName() {
		return keysName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeysName(String newKeysName) {
		String oldKeysName = keysName;
		keysName = newKeysName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_OBJECT__KEYS_NAME, oldKeysName, keysName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getXdtoMainObject() {
		if (xdtoMainObject != null && xdtoMainObject.eIsProxy()) {
			InternalEObject oldXdtoMainObject = (InternalEObject)xdtoMainObject;
			xdtoMainObject = (ObjectType)eResolveProxy(oldXdtoMainObject);
			if (xdtoMainObject != oldXdtoMainObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edPackage.ED_OBJECT__XDTO_MAIN_OBJECT, oldXdtoMainObject, xdtoMainObject));
			}
		}
		return xdtoMainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetXdtoMainObject() {
		return xdtoMainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXdtoMainObject(ObjectType newXdtoMainObject) {
		ObjectType oldXdtoMainObject = xdtoMainObject;
		xdtoMainObject = newXdtoMainObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_OBJECT__XDTO_MAIN_OBJECT, oldXdtoMainObject, xdtoMainObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getXdtoKeysObject() {
		if (xdtoKeysObject != null && xdtoKeysObject.eIsProxy()) {
			InternalEObject oldXdtoKeysObject = (InternalEObject)xdtoKeysObject;
			xdtoKeysObject = (ObjectType)eResolveProxy(oldXdtoKeysObject);
			if (xdtoKeysObject != oldXdtoKeysObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edPackage.ED_OBJECT__XDTO_KEYS_OBJECT, oldXdtoKeysObject, xdtoKeysObject));
			}
		}
		return xdtoKeysObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetXdtoKeysObject() {
		return xdtoKeysObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXdtoKeysObject(ObjectType newXdtoKeysObject) {
		ObjectType oldXdtoKeysObject = xdtoKeysObject;
		xdtoKeysObject = newXdtoKeysObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_OBJECT__XDTO_KEYS_OBJECT, oldXdtoKeysObject, xdtoKeysObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdProperty> getMainProperties() {
		if (mainProperties == null) {
			mainProperties = new EObjectContainmentEList<EdProperty>(EdProperty.class, this, edPackage.ED_OBJECT__MAIN_PROPERTIES);
		}
		return mainProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdProperty getProperty(final String name) {
		EList<EdProperty> _mainProperties = this.getMainProperties();
		for (final EdProperty edProperty : _mainProperties) {
			boolean _equals = name.equals(edProperty.getName());
			if (_equals) {
				return edProperty;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdProperty> getKeyProperties() {
		final BasicEList<EdProperty> keyProperties = XcoreCollectionLiterals.<EdProperty>newBasicEList();
		EList<EdProperty> _mainProperties = this.getMainProperties();
		for (final EdProperty edProperty : _mainProperties) {
			Boolean _isKey = edProperty.getIsKey();
			if ((_isKey).booleanValue()) {
				keyProperties.add(edProperty);
			}
		}
		return keyProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case edPackage.ED_OBJECT__MAIN_PROPERTIES:
				return ((InternalEList<?>)getMainProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edPackage.ED_OBJECT__MAIN_NAME:
				return getMainName();
			case edPackage.ED_OBJECT__KEYS_NAME:
				return getKeysName();
			case edPackage.ED_OBJECT__XDTO_MAIN_OBJECT:
				if (resolve) return getXdtoMainObject();
				return basicGetXdtoMainObject();
			case edPackage.ED_OBJECT__XDTO_KEYS_OBJECT:
				if (resolve) return getXdtoKeysObject();
				return basicGetXdtoKeysObject();
			case edPackage.ED_OBJECT__MAIN_PROPERTIES:
				return getMainProperties();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edPackage.ED_OBJECT__MAIN_NAME:
				setMainName((String)newValue);
				return;
			case edPackage.ED_OBJECT__KEYS_NAME:
				setKeysName((String)newValue);
				return;
			case edPackage.ED_OBJECT__XDTO_MAIN_OBJECT:
				setXdtoMainObject((ObjectType)newValue);
				return;
			case edPackage.ED_OBJECT__XDTO_KEYS_OBJECT:
				setXdtoKeysObject((ObjectType)newValue);
				return;
			case edPackage.ED_OBJECT__MAIN_PROPERTIES:
				getMainProperties().clear();
				getMainProperties().addAll((Collection<? extends EdProperty>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case edPackage.ED_OBJECT__MAIN_NAME:
				setMainName(MAIN_NAME_EDEFAULT);
				return;
			case edPackage.ED_OBJECT__KEYS_NAME:
				setKeysName(KEYS_NAME_EDEFAULT);
				return;
			case edPackage.ED_OBJECT__XDTO_MAIN_OBJECT:
				setXdtoMainObject((ObjectType)null);
				return;
			case edPackage.ED_OBJECT__XDTO_KEYS_OBJECT:
				setXdtoKeysObject((ObjectType)null);
				return;
			case edPackage.ED_OBJECT__MAIN_PROPERTIES:
				getMainProperties().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case edPackage.ED_OBJECT__MAIN_NAME:
				return MAIN_NAME_EDEFAULT == null ? mainName != null : !MAIN_NAME_EDEFAULT.equals(mainName);
			case edPackage.ED_OBJECT__KEYS_NAME:
				return KEYS_NAME_EDEFAULT == null ? keysName != null : !KEYS_NAME_EDEFAULT.equals(keysName);
			case edPackage.ED_OBJECT__XDTO_MAIN_OBJECT:
				return xdtoMainObject != null;
			case edPackage.ED_OBJECT__XDTO_KEYS_OBJECT:
				return xdtoKeysObject != null;
			case edPackage.ED_OBJECT__MAIN_PROPERTIES:
				return mainProperties != null && !mainProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case edPackage.ED_OBJECT___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
			case edPackage.ED_OBJECT___GET_KEY_PROPERTIES:
				return getKeyProperties();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mainName: "); //$NON-NLS-1$
		result.append(mainName);
		result.append(", keysName: "); //$NON-NLS-1$
		result.append(keysName);
		result.append(')');
		return result.toString();
	}

} //EdObjectImpl
