/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForGroup <em>For Group</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAttributeRules <em>Attribute Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEventPrefix <em>On Sending Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEventPrefix <em>Before Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEventPrefix <em>On Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIdentificationFields <em>Identification Fields</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule()
 * @model
 * @generated
 */
public interface CmObjectRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversion Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Module</em>' container reference.
	 * @see #setConversionModule(ConversionModule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_ConversionModule()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules
	 * @model opposite="objectRules" transient="false"
	 * @generated
	 */
	ConversionModule getConversionModule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConversionModule <em>Conversion Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Module</em>' container reference.
	 * @see #getConversionModule()
	 * @generated
	 */
	void setConversionModule(ConversionModule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disabled</em>' attribute.
	 * @see #setIsDisabled(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_IsDisabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsDisabled <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disabled</em>' attribute.
	 * @see #getIsDisabled()
	 * @generated
	 */
	void setIsDisabled(Boolean value);

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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConfigurationObject <em>Configuration Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' attribute.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(Object value);

	/**
	 * Returns the value of the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Object</em>' attribute.
	 * @see #setFormatObject(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_FormatObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getFormatObject <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Object</em>' attribute.
	 * @see #getFormatObject()
	 * @generated
	 */
	void setFormatObject(Object value);

	/**
	 * Returns the value of the '<em><b>For Sending</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Sending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Sending</em>' attribute.
	 * @see #setForSending(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_ForSending()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForSending <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Sending</em>' attribute.
	 * @see #getForSending()
	 * @generated
	 */
	void setForSending(Boolean value);

	/**
	 * Returns the value of the '<em><b>For Receiving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Receiving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Receiving</em>' attribute.
	 * @see #setForReceiving(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_ForReceiving()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForReceiving <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Receiving</em>' attribute.
	 * @see #getForReceiving()
	 * @generated
	 */
	void setForReceiving(Boolean value);

	/**
	 * Returns the value of the '<em><b>For Group</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Group</em>' attribute.
	 * @see #setForGroup(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_ForGroup()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForGroup();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForGroup <em>For Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Group</em>' attribute.
	 * @see #getForGroup()
	 * @generated
	 */
	void setForGroup(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_AttributeRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmAttributeRule> getAttributeRules();

	/**
	 * Returns the value of the '<em><b>On Sending Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Sending Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Sending Event</em>' attribute.
	 * @see #setOnSendingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnSendingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnSendingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Sending Event</em>' attribute.
	 * @see #getOnSendingEvent()
	 * @generated
	 */
	void setOnSendingEvent(String value);

	/**
	 * Returns the value of the '<em><b>On Sending Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Sending Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Sending Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnSendingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041A\\u041E_&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E_\\u041F\\u0440\\u0438\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0435\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445(\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435\\u0418\\u0411, \\u0414\\u0430\\u043D\\u043D\\u044B\\u0435XDTO, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430, \\u0421\\u0442\\u0435\\u043A\\u0412\\u044B\\u0433\\u0440\\u0443\\u0437\\u043A\\u0438)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E\", this.getName());'"
	 * @generated
	 */
	String getOnSendingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Sending Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Sending Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Sending Event Suffix</em>' attribute.
	 * @see #setOnSendingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnSendingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnSendingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Sending Event Suffix</em>' attribute.
	 * @see #getOnSendingEventSuffix()
	 * @generated
	 */
	void setOnSendingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Before Receiving Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Receiving Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Receiving Event</em>' attribute.
	 * @see #setBeforeReceivingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_BeforeReceivingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Receiving Event</em>' attribute.
	 * @see #getBeforeReceivingEvent()
	 * @generated
	 */
	void setBeforeReceivingEvent(String value);

	/**
	 * Returns the value of the '<em><b>Before Receiving Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Receiving Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Receiving Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_BeforeReceivingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041A\\u041E_&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E_\\u041F\\u0440\\u0438\\u041A\\u043E\\u043D\\u0432\\u0435\\u0440\\u0442\\u0430\\u0446\\u0438\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445XDTO(\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435XDTO, \\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u043D\\u044B\\u0435\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E\", this.getName());'"
	 * @generated
	 */
	String getBeforeReceivingEventPrefix();

	/**
	 * Returns the value of the '<em><b>Before Receiving Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Receiving Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Receiving Event Suffix</em>' attribute.
	 * @see #setBeforeReceivingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_BeforeReceivingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Receiving Event Suffix</em>' attribute.
	 * @see #getBeforeReceivingEventSuffix()
	 * @generated
	 */
	void setBeforeReceivingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>On Receiving Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Receiving Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Receiving Event</em>' attribute.
	 * @see #setOnReceivingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnReceivingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnReceivingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Receiving Event</em>' attribute.
	 * @see #getOnReceivingEvent()
	 * @generated
	 */
	void setOnReceivingEvent(String value);

	/**
	 * Returns the value of the '<em><b>On Receiving Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Receiving Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Receiving Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnReceivingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041A\\u041E_&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E_\\u041F\\u0435\\u0440\\u0435\\u0434\\u0417\\u0430\\u043F\\u0438\\u0441\\u044C\\u044E\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u043D\\u044B\\u0445\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445(\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u043D\\u044B\\u0435\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435, \\u0414\\u0430\\u043D\\u043D\\u044B\\u0435\\u0418\\u0411, \\u041A\\u043E\\u043D\\u0432\\u0435\\u0440\\u0442\\u0430\\u0446\\u0438\\u044F\\u0421\\u0432\\u043E\\u0439\\u0441\\u0442\\u0432, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E\", this.getName());'"
	 * @generated
	 */
	String getOnReceivingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Receiving Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Receiving Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Receiving Event Suffix</em>' attribute.
	 * @see #setOnReceivingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_OnReceivingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnReceivingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Receiving Event Suffix</em>' attribute.
	 * @see #getOnReceivingEventSuffix()
	 * @generated
	 */
	void setOnReceivingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>After Receiving Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Receiving Algorithm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Receiving Algorithm</em>' reference.
	 * @see #setAfterReceivingAlgorithm(CmAlgorithm)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_AfterReceivingAlgorithm()
	 * @model
	 * @generated
	 */
	CmAlgorithm getAfterReceivingAlgorithm();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Receiving Algorithm</em>' reference.
	 * @see #getAfterReceivingAlgorithm()
	 * @generated
	 */
	void setAfterReceivingAlgorithm(CmAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Identification Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant
	 * @see #setIdentificationVariant(CmIdentificationVariant)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_IdentificationVariant()
	 * @model unique="false"
	 * @generated
	 */
	CmIdentificationVariant getIdentificationVariant();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant
	 * @see #getIdentificationVariant()
	 * @generated
	 */
	void setIdentificationVariant(CmIdentificationVariant value);

	/**
	 * Returns the value of the '<em><b>Identification Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Fields</em>' attribute list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmObjectRule_IdentificationFields()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIdentificationFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.Object%&gt; _configurationObject = this.getConfigurationObject();\nboolean _tripleEquals = (_configurationObject == null);\nif (_tripleEquals)\n{\n\treturn \"\";\n}\nelse\n{\n\treturn this.getConfigurationObject().toString();\n}'"
	 * @generated
	 */
	String getConfigurationObjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.Object%&gt; _formatObject = this.getFormatObject();\nboolean _tripleEquals = (_formatObject == null);\nif (_tripleEquals)\n{\n\treturn \"\";\n}\nelse\n{\n\treturn this.getFormatObject().toString();\n}'"
	 * @generated
	 */
	String getFormatObjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onSendingEventPrefix = this.getOnSendingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onSendingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onSendingEvent = this.getOnSendingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onSendingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onSendingEventSuffix = this.getOnSendingEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _onSendingEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getOnSendingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _beforeReceivingEventPrefix = this.getBeforeReceivingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_beforeReceivingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _beforeReceivingEvent = this.getBeforeReceivingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _beforeReceivingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _beforeReceivingEventSuffix = this.getBeforeReceivingEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _beforeReceivingEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getBeforeReceivingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onReceivingEventPrefix = this.getOnReceivingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onReceivingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onReceivingEvent = this.getOnReceivingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onReceivingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onReceivingEventSuffix = this.getOnReceivingEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _onReceivingEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getOnReceivingEventText();

} // CmObjectRule
