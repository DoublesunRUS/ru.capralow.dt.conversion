/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import com._1c.g5.v8.bm.core.IBmObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getIsFolder <em>Is Folder</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getValid <em>Valid</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getCode <em>Code</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdClass <em>Md Class</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getAttributeSendMode <em>Attribute Send Mode</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectSelectionRules <em>Object Selection Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getExchangePlanSelectionRules <em>Exchange Plan Selection Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface RegistrationRule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Is Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Folder</em>' attribute.
	 * @see #setIsFolder(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_IsFolder()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsFolder();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getIsFolder <em>Is Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Folder</em>' attribute.
	 * @see #getIsFolder()
	 * @generated
	 */
	void setIsFolder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_Valid()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getValid();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #getValid()
	 * @generated
	 */
	void setValid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Md Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Md Object</em>' attribute.
	 * @see #setMdObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_MdObject()
	 * @model unique="false"
	 * @generated
	 */
	String getMdObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdObject <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Md Object</em>' attribute.
	 * @see #getMdObject()
	 * @generated
	 */
	void setMdObject(String value);

	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_ObjectName()
	 * @model unique="false"
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Md Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Md Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Md Class</em>' attribute.
	 * @see #setMdClass(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_MdClass()
	 * @model unique="false"
	 * @generated
	 */
	String getMdClass();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdClass <em>Md Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Md Class</em>' attribute.
	 * @see #getMdClass()
	 * @generated
	 */
	void setMdClass(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Send Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Send Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Send Mode</em>' attribute.
	 * @see #setAttributeSendMode(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_AttributeSendMode()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeSendMode();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getAttributeSendMode <em>Attribute Send Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Send Mode</em>' attribute.
	 * @see #getAttributeSendMode()
	 * @generated
	 */
	void setAttributeSendMode(String value);

	/**
	 * Returns the value of the '<em><b>Object Selection Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Selection Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Selection Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_ObjectSelectionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectSelectionRule> getObjectSelectionRules();

	/**
	 * Returns the value of the '<em><b>Exchange Plan Selection Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Plan Selection Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Plan Selection Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getRegistrationRule_ExchangePlanSelectionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangePlanSelectionRule> getExchangePlanSelectionRules();

} // RegistrationRule
