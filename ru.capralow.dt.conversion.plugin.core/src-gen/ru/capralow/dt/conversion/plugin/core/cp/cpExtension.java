/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import com._1c.g5.v8.bm.core.IBmObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cp Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationName <em>Configuration Name</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpExtension()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface cpExtension extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' attribute.
	 * @see #setConfigurationObject(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpExtension_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationObject <em>Configuration Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' attribute.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(Object value);

	/**
	 * Returns the value of the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Name</em>' attribute.
	 * @see #setConfigurationName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpExtension_ConfigurationName()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

} // cpExtension
