/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedValueImpl#getConfigurationValueName <em>Configuration Value Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedValueImpl#getFormatValue <em>Format Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedValueImpl extends MinimalEObjectImpl.Container implements CmPredefinedValue {
	/**
	 * The default value of the '{@link #getConfigurationValueName() <em>Configuration Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValueName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_VALUE_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationValueName() <em>Configuration Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValueName()
	 * @generated
	 * @ordered
	 */
	protected String configurationValueName = CONFIGURATION_VALUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatValue() <em>Format Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_VALUE_EDEFAULT = ""; //$NON-NLS-1$

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
	protected CmPredefinedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationValueName() {
		return configurationValueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationValueName(String newConfigurationValueName) {
		String oldConfigurationValueName = configurationValueName;
		configurationValueName = newConfigurationValueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_VALUE__CONFIGURATION_VALUE_NAME, oldConfigurationValueName, configurationValueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatValue() {
		return formatValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatValue(String newFormatValue) {
		String oldFormatValue = formatValue;
		formatValue = newFormatValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_VALUE__FORMAT_VALUE, oldFormatValue, formatValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationValueFormattedName() {
		boolean _isEmpty = this.getConfigurationValueName().isEmpty();
		if (_isEmpty) {
			return "";
		}
		String configurationValueFormattedName = this.getConfigurationValueName().toString();
		int _indexOf = configurationValueFormattedName.indexOf(".");
		int _plus = (_indexOf + 1);
		configurationValueFormattedName = configurationValueFormattedName.substring(_plus);
		int _indexOf_1 = configurationValueFormattedName.indexOf(".");
		int _plus_1 = (_indexOf_1 + 1);
		configurationValueFormattedName = configurationValueFormattedName.substring(_plus_1);
		return configurationValueFormattedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatValueName() {
		boolean _isEmpty = this.getFormatValue().isEmpty();
		if (_isEmpty) {
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
			case cmPackage.CM_PREDEFINED_VALUE__CONFIGURATION_VALUE_NAME:
				return getConfigurationValueName();
			case cmPackage.CM_PREDEFINED_VALUE__FORMAT_VALUE:
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
			case cmPackage.CM_PREDEFINED_VALUE__CONFIGURATION_VALUE_NAME:
				setConfigurationValueName((String)newValue);
				return;
			case cmPackage.CM_PREDEFINED_VALUE__FORMAT_VALUE:
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
			case cmPackage.CM_PREDEFINED_VALUE__CONFIGURATION_VALUE_NAME:
				setConfigurationValueName(CONFIGURATION_VALUE_NAME_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED_VALUE__FORMAT_VALUE:
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
			case cmPackage.CM_PREDEFINED_VALUE__CONFIGURATION_VALUE_NAME:
				return CONFIGURATION_VALUE_NAME_EDEFAULT == null ? configurationValueName != null : !CONFIGURATION_VALUE_NAME_EDEFAULT.equals(configurationValueName);
			case cmPackage.CM_PREDEFINED_VALUE__FORMAT_VALUE:
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
			case cmPackage.CM_PREDEFINED_VALUE___GET_CONFIGURATION_VALUE_FORMATTED_NAME:
				return getConfigurationValueFormattedName();
			case cmPackage.CM_PREDEFINED_VALUE___GET_FORMAT_VALUE_NAME:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (configurationValueName: "); //$NON-NLS-1$
		result.append(configurationValueName);
		result.append(", formatValue: "); //$NON-NLS-1$
		result.append(formatValue);
		result.append(')');
		return result.toString();
	}

} //CmPredefinedValueImpl
