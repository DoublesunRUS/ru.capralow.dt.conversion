/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getConfigurationValueName <em>Configuration Value Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getFormatValue <em>Format Value</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue()
 * @model
 * @generated
 */
public interface CmPredefinedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Value Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value Name</em>' attribute.
	 * @see #setConfigurationValueName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue_ConfigurationValueName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationValueName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getConfigurationValueName <em>Configuration Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value Name</em>' attribute.
	 * @see #getConfigurationValueName()
	 * @generated
	 */
	void setConfigurationValueName(String value);

	/**
	 * Returns the value of the '<em><b>Format Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Value</em>' attribute.
	 * @see #setFormatValue(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue_FormatValue()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getFormatValue <em>Format Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Value</em>' attribute.
	 * @see #getFormatValue()
	 * @generated
	 */
	void setFormatValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getConfigurationValueFormattedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getFormatValueName();

} // CmPredefinedValue
