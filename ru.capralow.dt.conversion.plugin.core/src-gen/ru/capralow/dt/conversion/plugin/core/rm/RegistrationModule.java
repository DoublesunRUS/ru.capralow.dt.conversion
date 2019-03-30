/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import com._1c.g5.v8.bm.core.IBmObject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleVersion <em>Module Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleCreationDate <em>Module Creation Date</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanName <em>Exchange Plan Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationSynonym <em>Configuration Synonym</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationVersion <em>Configuration Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanContent <em>Exchange Plan Content</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRegistrationRules <em>Registration Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface RegistrationModule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Module Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Ref</em>' attribute.
	 * @see #setModuleRef(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ModuleRef()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleRef();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleRef <em>Module Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Ref</em>' attribute.
	 * @see #getModuleRef()
	 * @generated
	 */
	void setModuleRef(String value);

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ModuleName()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Module Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Version</em>' attribute.
	 * @see #setModuleVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ModuleVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleVersion <em>Module Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Version</em>' attribute.
	 * @see #getModuleVersion()
	 * @generated
	 */
	void setModuleVersion(String value);

	/**
	 * Returns the value of the '<em><b>Module Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Creation Date</em>' attribute.
	 * @see #setModuleCreationDate(Date)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ModuleCreationDate()
	 * @model unique="false" dataType="ru.capralow.dt.conversion.plugin.core.rm.Date"
	 * @generated
	 */
	Date getModuleCreationDate();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleCreationDate <em>Module Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Creation Date</em>' attribute.
	 * @see #getModuleCreationDate()
	 * @generated
	 */
	void setModuleCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Exchange Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Plan Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Plan Name</em>' attribute.
	 * @see #setExchangePlanName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ExchangePlanName()
	 * @model unique="false"
	 * @generated
	 */
	String getExchangePlanName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanName <em>Exchange Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Plan Name</em>' attribute.
	 * @see #getExchangePlanName()
	 * @generated
	 */
	void setExchangePlanName(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Plan Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Plan Md Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Plan Md Object</em>' attribute.
	 * @see #setExchangePlanMdObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ExchangePlanMdObject()
	 * @model unique="false"
	 * @generated
	 */
	String getExchangePlanMdObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Plan Md Object</em>' attribute.
	 * @see #getExchangePlanMdObject()
	 * @generated
	 */
	void setExchangePlanMdObject(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Version</em>' attribute.
	 * @see #setRuntimeVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_RuntimeVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getRuntimeVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRuntimeVersion <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Version</em>' attribute.
	 * @see #getRuntimeVersion()
	 * @generated
	 */
	void setRuntimeVersion(String value);

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
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ConfigurationName()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Synonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Synonym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Synonym</em>' attribute.
	 * @see #setConfigurationSynonym(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ConfigurationSynonym()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationSynonym();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationSynonym <em>Configuration Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Synonym</em>' attribute.
	 * @see #getConfigurationSynonym()
	 * @generated
	 */
	void setConfigurationSynonym(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Version</em>' attribute.
	 * @see #setConfigurationVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ConfigurationVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationVersion <em>Configuration Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Version</em>' attribute.
	 * @see #getConfigurationVersion()
	 * @generated
	 */
	void setConfigurationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Plan Content</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Plan Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Plan Content</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_ExchangePlanContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangePlanContent> getExchangePlanContent();

	/**
	 * Returns the value of the '<em><b>Registration Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationModule_RegistrationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegistrationRule> getRegistrationRules();

} // RegistrationModule
