/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.EnumValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedEnumValue()
 * @model
 * @generated
 */
public interface CmPredefinedEnumValue extends CmPredefinedValue {
	/**
	 * Returns the value of the '<em><b>Configuration Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value</em>' reference.
	 * @see #setConfigurationValue(EnumValue)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedEnumValue_ConfigurationValue()
	 * @model
	 * @generated
	 */
	EnumValue getConfigurationValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue#getConfigurationValue <em>Configuration Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value</em>' reference.
	 * @see #getConfigurationValue()
	 * @generated
	 */
	void setConfigurationValue(EnumValue value);

} // CmPredefinedEnumValue
