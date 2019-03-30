/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl#getConfigurationValue <em>Configuration Value</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl#getFormatValue <em>Format Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedMapImpl extends MinimalEObjectImpl.Container implements CmPredefinedMap {
	/**
	 * The default value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected String configurationValue = CONFIGURATION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatValue() <em>Format Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatValue() <em>Format Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatValue()
	 * @generated
	 * @ordered
	 */
	protected String formatValue = FORMAT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmPredefinedMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationValue() {
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationValue(String newConfigurationValue) {
		String oldConfigurationValue = configurationValue;
		configurationValue = newConfigurationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_MAP__CONFIGURATION_VALUE, oldConfigurationValue, configurationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatValue() {
		return formatValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatValue(String newFormatValue) {
		String oldFormatValue = formatValue;
		formatValue = newFormatValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_MAP__FORMAT_VALUE, oldFormatValue, formatValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationValueName() {
		String _configurationValue = this.getConfigurationValue();
		boolean _tripleEquals = (_configurationValue == null);
		if (_tripleEquals) {
			return "";
		}
		String configurationValueName = this.getConfigurationValue().toString();
		int _indexOf = configurationValueName.indexOf(".");
		int _plus = (_indexOf + 1);
		configurationValueName = configurationValueName.substring(_plus);
		int _indexOf_1 = configurationValueName.indexOf(".");
		int _plus_1 = (_indexOf_1 + 1);
		configurationValueName = configurationValueName.substring(_plus_1);
		return configurationValueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatValueName() {
		String _formatValue = this.getFormatValue();
		boolean _tripleEquals = (_formatValue == null);
		if (_tripleEquals) {
			return "";
		}
		return this.getFormatValue().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_PREDEFINED_MAP__CONFIGURATION_VALUE:
				return getConfigurationValue();
			case cmPackage.CM_PREDEFINED_MAP__FORMAT_VALUE:
				return getFormatValue();
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
			case cmPackage.CM_PREDEFINED_MAP__CONFIGURATION_VALUE:
				setConfigurationValue((String)newValue);
				return;
			case cmPackage.CM_PREDEFINED_MAP__FORMAT_VALUE:
				setFormatValue((String)newValue);
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
			case cmPackage.CM_PREDEFINED_MAP__CONFIGURATION_VALUE:
				setConfigurationValue(CONFIGURATION_VALUE_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED_MAP__FORMAT_VALUE:
				setFormatValue(FORMAT_VALUE_EDEFAULT);
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
			case cmPackage.CM_PREDEFINED_MAP__CONFIGURATION_VALUE:
				return CONFIGURATION_VALUE_EDEFAULT == null ? configurationValue != null : !CONFIGURATION_VALUE_EDEFAULT.equals(configurationValue);
			case cmPackage.CM_PREDEFINED_MAP__FORMAT_VALUE:
				return FORMAT_VALUE_EDEFAULT == null ? formatValue != null : !FORMAT_VALUE_EDEFAULT.equals(formatValue);
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
			case cmPackage.CM_PREDEFINED_MAP___GET_CONFIGURATION_VALUE_NAME:
				return getConfigurationValueName();
			case cmPackage.CM_PREDEFINED_MAP___GET_FORMAT_VALUE_NAME:
				return getFormatValueName();
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
		result.append(" (configurationValue: "); //$NON-NLS-1$
		result.append(configurationValue);
		result.append(", formatValue: "); //$NON-NLS-1$
		result.append(formatValue);
		result.append(')');
		return result.toString();
	}

} //CmPredefinedMapImpl
