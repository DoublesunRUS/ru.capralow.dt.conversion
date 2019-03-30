/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Object Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getConfigurationObjectName <em>Configuration Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroup <em>For Group</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAttributeRules <em>Attribute Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventPrefix <em>On Sending Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventPrefix <em>Before Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventPrefix <em>On Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationFields <em>Identification Fields</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule()
 * @model
 * @generated
 */
public interface CmObjectRule extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getName <em>Name</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_IsDisabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIsDisabled <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disabled</em>' attribute.
	 * @see #getIsDisabled()
	 * @generated
	 */
	void setIsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' reference.
	 * @see #setConfigurationObject(MdObject)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ConfigurationObject()
	 * @model
	 * @generated
	 */
	MdObject getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getConfigurationObject <em>Configuration Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' reference.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(MdObject value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #setConfigurationObjectName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ConfigurationObjectName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationObjectName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getConfigurationObjectName <em>Configuration Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #getConfigurationObjectName()
	 * @generated
	 */
	void setConfigurationObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object Formatted Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Formatted Name</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ConfigurationObjectFormattedName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; result = \"\";\nboolean _startsWith = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0421\\u043F\\u0440\\u0430\\u0432\\u043E\\u0447\\u043D\\u0438\\u043A\\u0438\");\nif (_startsWith)\n{\n\t&lt;%java.lang.String%&gt; _get = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t&lt;%java.lang.String%&gt; _plus = (\"\\u0421\\u043F\\u0440\\u0430\\u0432\\u043E\\u0447\\u043D\\u0438\\u043A.\" + _get);\n\tresult = _plus;\n}\nelse\n{\n\tboolean _startsWith_1 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0414\\u043E\\u043A\\u0443\\u043C\\u0435\\u043D\\u0442\\u044B\");\n\tif (_startsWith_1)\n\t{\n\t\t&lt;%java.lang.String%&gt; _get_1 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t&lt;%java.lang.String%&gt; _plus_1 = (\"\\u0414\\u043E\\u043A\\u0443\\u043C\\u0435\\u043D\\u0442.\" + _get_1);\n\t\tresult = _plus_1;\n\t}\n\telse\n\t{\n\t\tboolean _startsWith_2 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u0435\\u0440\\u0435\\u0447\\u0438\\u0441\\u043B\\u0435\\u043D\\u0438\\u044F\");\n\t\tif (_startsWith_2)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _get_2 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t&lt;%java.lang.String%&gt; _plus_2 = (\"\\u041F\\u0435\\u0440\\u0435\\u0447\\u0438\\u0441\\u043B\\u0435\\u043D\\u0438\\u0435.\" + _get_2);\n\t\t\tresult = _plus_2;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tboolean _startsWith_3 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u043B\\u0430\\u043D\\u044B\\u0412\\u0438\\u0434\\u043E\\u0432\\u0425\\u0430\\u0440\\u0430\\u043A\\u0442\\u0435\\u0440\\u0438\\u0441\\u0442\\u0438\\u043A\");\n\t\t\tif (_startsWith_3)\n\t\t\t{\n\t\t\t\t&lt;%java.lang.String%&gt; _get_3 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t&lt;%java.lang.String%&gt; _plus_3 = (\"\\u041F\\u043B\\u0430\\u043D\\u0412\\u0438\\u0434\\u043E\\u0432\\u0425\\u0430\\u0440\\u0430\\u043A\\u0442\\u0435\\u0440\\u0438\\u0441\\u0442\\u0438\\u043A.\" + _get_3);\n\t\t\t\tresult = _plus_3;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tboolean _startsWith_4 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u043B\\u0430\\u043D\\u044B\\u0412\\u0438\\u0434\\u043E\\u0432\\u0420\\u0430\\u0441\\u0447\\u0435\\u0442\\u0430\");\n\t\t\t\tif (_startsWith_4)\n\t\t\t\t{\n\t\t\t\t\t&lt;%java.lang.String%&gt; _get_4 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t\t&lt;%java.lang.String%&gt; _plus_4 = (\"\\u041F\\u043B\\u0430\\u043D\\u0412\\u0438\\u0434\\u043E\\u0432\\u0420\\u0430\\u0441\\u0447\\u0435\\u0442\\u0430.\" + _get_4);\n\t\t\t\t\tresult = _plus_4;\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tboolean _startsWith_5 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0420\\u0435\\u0433\\u0438\\u0441\\u0442\\u0440\\u044B\\u0421\\u0432\\u0435\\u0434\\u0435\\u043D\\u0438\\u0439\");\n\t\t\t\t\tif (_startsWith_5)\n\t\t\t\t\t{\n\t\t\t\t\t\t&lt;%java.lang.String%&gt; _get_5 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t\t\t&lt;%java.lang.String%&gt; _plus_5 = (\"\\u0420\\u0435\\u0433\\u0438\\u0441\\u0442\\u0440\\u0421\\u0432\\u0435\\u0434\\u0435\\u043D\\u0438\\u0439.\" + _get_5);\n\t\t\t\t\t\tresult = _plus_5;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	String getConfigurationObjectFormattedName();

	/**
	 * Returns the value of the '<em><b>Format Object</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Object</em>' attribute.
	 * @see #setFormatObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_FormatObject()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getFormatObject <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Object</em>' attribute.
	 * @see #getFormatObject()
	 * @generated
	 */
	void setFormatObject(String value);

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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ForSending()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForSending <em>For Sending</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ForReceiving()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForReceiving <em>For Receiving</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_ForGroup()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForGroup();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroup <em>For Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Group</em>' attribute.
	 * @see #getForGroup()
	 * @generated
	 */
	void setForGroup(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_AttributeRules()
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnSendingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnSendingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnSendingEventPrefix()
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnSendingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnSendingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_BeforeReceivingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_BeforeReceivingEventPrefix()
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_BeforeReceivingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnReceivingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnReceivingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnReceivingEventPrefix()
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnReceivingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnReceivingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_AfterReceivingAlgorithm()
	 * @model
	 * @generated
	 */
	CmAlgorithm getAfterReceivingAlgorithm();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Receiving Algorithm</em>' reference.
	 * @see #getAfterReceivingAlgorithm()
	 * @generated
	 */
	void setAfterReceivingAlgorithm(CmAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Identification Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant
	 * @see #setIdentificationVariant(CmIdentificationVariant)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_IdentificationVariant()
	 * @model unique="false"
	 * @generated
	 */
	CmIdentificationVariant getIdentificationVariant();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_IdentificationFields()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIdentificationFields();

	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_Subsystems()
	 * @model
	 * @generated
	 */
	EList<CmSubsystem> getSubsystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.Boolean%&gt; _forGroup = this.getForGroup();\nif ((_forGroup).booleanValue())\n{\n\treturn \"\\u0418\\u0441\\u0442\\u0438\\u043D\\u0430\";\n}\nelse\n{\n\treturn \"\\u041B\\u043E\\u0436\\u044C\";\n}'"
	 * @generated
	 */
	String getForGroupDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onSendingEventPrefix = this.getOnSendingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onSendingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onSendingEvent = this.getOnSendingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onSendingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onSendingEventSuffix = this.getOnSendingEventSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _onSendingEventSuffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
	 * @generated
	 */
	String getOnSendingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _length = this.getOnSendingEvent().length();\nboolean _equals = (_length == 0);\nif (_equals)\n{\n\treturn \"\";\n}\nelse\n{\n\treturn \"\\u041F\\u041A\\u041E_&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E_\\u041F\\u0440\\u0438\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0435\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041A\\u041E\", this.getName());\n}'"
	 * @generated
	 */
	String getOnSendingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _beforeReceivingEventPrefix = this.getBeforeReceivingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_beforeReceivingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _beforeReceivingEvent = this.getBeforeReceivingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _beforeReceivingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _beforeReceivingEventSuffix = this.getBeforeReceivingEventSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _beforeReceivingEventSuffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
	 * @generated
	 */
	String getBeforeReceivingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onReceivingEventPrefix = this.getOnReceivingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onReceivingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onReceivingEvent = this.getOnReceivingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onReceivingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onReceivingEventSuffix = this.getOnReceivingEventSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _onReceivingEventSuffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
	 * @generated
	 */
	String getOnReceivingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cmSubsystemUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (((cmSubsystem == null) || &lt;%com.google.common.base.Objects%&gt;.equal(cmSubsystem.getSpecialSubsystemType(), &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt;.ALL)))\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem%&gt;&gt; _subsystems = this.getSubsystems();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem%&gt; subsystem : _subsystems)\n{\n\tboolean _equals = subsystem.equals(cmSubsystem);\n\tif (_equals)\n\t{\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n\t}\n}\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt; _specialSubsystemType = cmSubsystem.getSpecialSubsystemType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_specialSubsystemType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt;.EMPTY));\nif (_notEquals)\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(false);\n}\nint _size = this.getSubsystems().size();\nboolean _notEquals_1 = (_size != 0);\nif (_notEquals_1)\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(false);\n}\nreturn &lt;%java.lang.Boolean%&gt;.valueOf(true);'"
	 * @generated
	 */
	Boolean includedInSubsystem(CmSubsystem cmSubsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; nameString = this.getName();\nboolean _isEmpty = this.getName().isEmpty();\nif (_isEmpty)\n{\n\tnameString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; configurationString = this.getConfigurationObjectName();\nboolean _isEmpty_1 = this.getConfigurationObjectName().isEmpty();\nif (_isEmpty_1)\n{\n\tconfigurationString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; formatString = this.getFormatObject();\nboolean _isEmpty_2 = this.getFormatObject().isEmpty();\nif (_isEmpty_2)\n{\n\tformatString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; routeString = \"&lt;\\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041D\\u0435\\u0417\\u0430\\u0434\\u0430\\u043D\\u043E&gt;\";\n&lt;%java.lang.Boolean%&gt; _forSending = this.getForSending();\nif ((_forSending).booleanValue())\n{\n\trouteString = \"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\";\n}\n&lt;%java.lang.Boolean%&gt; _forReceiving = this.getForReceiving();\nif ((_forReceiving).booleanValue())\n{\n\trouteString = \"\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\";\n}\nif (((this.getForSending()).booleanValue() &amp;&amp; (this.getForReceiving()).booleanValue()))\n{\n\trouteString = \"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\\u0418\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\";\n}\nreturn (((((((\"name:\" + nameString) + \" md:\") + configurationString) + \" xdto:\") + formatString) + \" \") + routeString);'"
	 * @generated
	 */
	String toString();

} // CmObjectRule
