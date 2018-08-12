/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cp Format Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpFormatVersion()
 * @model
 * @generated
 */
public interface cpFormatVersion extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpFormatVersion_ConfigurationName()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpFormatVersion_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpFormatVersion_ConfigurationName()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpFormatVersion_Module()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" containment="true"
	 * @generated
	 */
	Object getModule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Object value);

} // cpFormatVersion
