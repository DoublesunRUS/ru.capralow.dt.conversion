/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model.impl;

import com._1c.g5.v8.dt.xdto.model.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.edPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ed Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl#getXdtoProperty <em>Xdto Property</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl#getIsKey <em>Is Key</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdPropertyImpl extends MinimalEObjectImpl.Container implements EdProperty {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getXdtoProperty() <em>Xdto Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdtoProperty()
	 * @generated
	 * @ordered
	 */
	protected Property xdtoProperty;

	/**
	 * The default value of the '{@link #getIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_KEY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsKey()
	 * @generated
	 * @ordered
	 */
	protected Boolean isKey = IS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edPackage.Literals.ED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getXdtoProperty() {
		if (xdtoProperty != null && xdtoProperty.eIsProxy()) {
			InternalEObject oldXdtoProperty = (InternalEObject)xdtoProperty;
			xdtoProperty = (Property)eResolveProxy(oldXdtoProperty);
			if (xdtoProperty != oldXdtoProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edPackage.ED_PROPERTY__XDTO_PROPERTY, oldXdtoProperty, xdtoProperty));
			}
		}
		return xdtoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetXdtoProperty() {
		return xdtoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXdtoProperty(Property newXdtoProperty) {
		Property oldXdtoProperty = xdtoProperty;
		xdtoProperty = newXdtoProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_PROPERTY__XDTO_PROPERTY, oldXdtoProperty, xdtoProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsKey() {
		return isKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsKey(Boolean newIsKey) {
		Boolean oldIsKey = isKey;
		isKey = newIsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_PROPERTY__IS_KEY, oldIsKey, isKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ED_PROPERTY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edPackage.ED_PROPERTY__NAME:
				return getName();
			case edPackage.ED_PROPERTY__XDTO_PROPERTY:
				if (resolve) return getXdtoProperty();
				return basicGetXdtoProperty();
			case edPackage.ED_PROPERTY__IS_KEY:
				return getIsKey();
			case edPackage.ED_PROPERTY__TYPE:
				return getType();
			case edPackage.ED_PROPERTY__REQUIRED:
				return getRequired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edPackage.ED_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case edPackage.ED_PROPERTY__XDTO_PROPERTY:
				setXdtoProperty((Property)newValue);
				return;
			case edPackage.ED_PROPERTY__IS_KEY:
				setIsKey((Boolean)newValue);
				return;
			case edPackage.ED_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case edPackage.ED_PROPERTY__REQUIRED:
				setRequired((Boolean)newValue);
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
			case edPackage.ED_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case edPackage.ED_PROPERTY__XDTO_PROPERTY:
				setXdtoProperty((Property)null);
				return;
			case edPackage.ED_PROPERTY__IS_KEY:
				setIsKey(IS_KEY_EDEFAULT);
				return;
			case edPackage.ED_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case edPackage.ED_PROPERTY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case edPackage.ED_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case edPackage.ED_PROPERTY__XDTO_PROPERTY:
				return xdtoProperty != null;
			case edPackage.ED_PROPERTY__IS_KEY:
				return IS_KEY_EDEFAULT == null ? isKey != null : !IS_KEY_EDEFAULT.equals(isKey);
			case edPackage.ED_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case edPackage.ED_PROPERTY__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isKey: "); //$NON-NLS-1$
		result.append(isKey);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", required: "); //$NON-NLS-1$
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //EdPropertyImpl
