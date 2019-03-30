/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cp Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getAvailableFormatVersions <em>Available Format Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getCoreObjects <em>Core Objects</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration()
 * @model
 * @generated
 */
public interface cpConfiguration extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationObject <em>Configuration Object</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_ConfigurationName()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_StoreVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpExtension> getExtensions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus
	 * @see #setStatus(ConfigurationStatus)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_Status()
	 * @model unique="false"
	 * @generated
	 */
	ConfigurationStatus getStatus();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Available Format Versions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Format Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Format Versions</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_AvailableFormatVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpFormatVersion> getAvailableFormatVersions();

	/**
	 * Returns the value of the '<em><b>Core Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Objects</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Objects</em>' attribute list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getcpConfiguration_CoreObjects()
	 * @model unique="false"
	 * @generated
	 */
	EList<Object> getCoreObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.String%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.String%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion%&gt;&gt; _availableFormatVersions = this.getAvailableFormatVersions();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion%&gt; formatVersion : _availableFormatVersions)\n{\n\tresult.add(formatVersion.getVersion());\n}\nreturn result;'"
	 * @generated
	 */
	EList<String> getVersions();

} // cpConfiguration
