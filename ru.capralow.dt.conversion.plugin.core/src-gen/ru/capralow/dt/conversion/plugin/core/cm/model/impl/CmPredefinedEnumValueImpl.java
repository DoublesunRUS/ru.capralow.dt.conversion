/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.EnumValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedEnumValueImpl#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedEnumValueImpl extends CmPredefinedValueImpl implements CmPredefinedEnumValue {
	/**
	 * The cached value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected EnumValue configurationValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmPredefinedEnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED_ENUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue getConfigurationValue() {
		if (configurationValue != null && configurationValue.eIsProxy()) {
			InternalEObject oldConfigurationValue = (InternalEObject)configurationValue;
			configurationValue = (EnumValue)eResolveProxy(oldConfigurationValue);
			if (configurationValue != oldConfigurationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE, oldConfigurationValue, configurationValue));
			}
		}
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue basicGetConfigurationValue() {
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationValue(EnumValue newConfigurationValue) {
		EnumValue oldConfigurationValue = configurationValue;
		configurationValue = newConfigurationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE, oldConfigurationValue, configurationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE:
				if (resolve) return getConfigurationValue();
				return basicGetConfigurationValue();
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
			case cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE:
				setConfigurationValue((EnumValue)newValue);
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
			case cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE:
				setConfigurationValue((EnumValue)null);
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
			case cmPackage.CM_PREDEFINED_ENUM_VALUE__CONFIGURATION_VALUE:
				return configurationValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CmPredefinedEnumValueImpl
