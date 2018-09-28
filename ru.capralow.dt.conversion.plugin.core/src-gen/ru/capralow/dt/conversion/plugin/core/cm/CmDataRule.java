/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEventPrefix <em>On Processing Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEventPrefix <em>Data Selection Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getObjectRules <em>Object Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule()
 * @model
 * @generated
 */
public interface CmDataRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversion Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules <em>Data Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Module</em>' container reference.
	 * @see #setConversionModule(ConversionModule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ConversionModule()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules
	 * @model opposite="dataRules" transient="false"
	 * @generated
	 */
	ConversionModule getConversionModule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule <em>Conversion Module</em>}' container reference.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName <em>Name</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_IsDisabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled <em>Is Disabled</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject <em>Configuration Object</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_FormatObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject <em>Format Object</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ForSending()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending <em>For Sending</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ForReceiving()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Receiving</em>' attribute.
	 * @see #getForReceiving()
	 * @generated
	 */
	void setForReceiving(Boolean value);

	/**
	 * Returns the value of the '<em><b>Selection Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see #setSelectionVariant(CmSelectionVariant)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_SelectionVariant()
	 * @model unique="false"
	 * @generated
	 */
	CmSelectionVariant getSelectionVariant();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant <em>Selection Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see #getSelectionVariant()
	 * @generated
	 */
	void setSelectionVariant(CmSelectionVariant value);

	/**
	 * Returns the value of the '<em><b>On Processing Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Processing Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Processing Event</em>' attribute.
	 * @see #setOnProcessingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_OnProcessingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnProcessingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Processing Event</em>' attribute.
	 * @see #getOnProcessingEvent()
	 * @generated
	 */
	void setOnProcessingEvent(String value);

	/**
	 * Returns the value of the '<em><b>On Processing Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Processing Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Processing Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_OnProcessingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u041F\\u0440\\u0438\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0435(\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435\\u0418\\u0411, \\u0418\\u0441\\u043F\\u043E\\u043B\\u044C\\u0437\\u043E\\u0432\\u0430\\u043D\\u0438\\u0435\\u041F\\u041E\\u0414, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());'"
	 * @generated
	 */
	String getOnProcessingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Processing Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Processing Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Processing Event Suffix</em>' attribute.
	 * @see #setOnProcessingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_OnProcessingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnProcessingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Processing Event Suffix</em>' attribute.
	 * @see #getOnProcessingEventSuffix()
	 * @generated
	 */
	void setOnProcessingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Data Selection Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Selection Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Selection Event</em>' attribute.
	 * @see #setDataSelectionEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_DataSelectionEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getDataSelectionEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Selection Event</em>' attribute.
	 * @see #getDataSelectionEvent()
	 * @generated
	 */
	void setDataSelectionEvent(String value);

	/**
	 * Returns the value of the '<em><b>Data Selection Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Selection Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Selection Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_DataSelectionEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return \"\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u044F \\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u0412\\u044B\\u0431\\u043E\\u0440\\u043A\\u0430\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445(\\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());'"
	 * @generated
	 */
	String getDataSelectionEventPrefix();

	/**
	 * Returns the value of the '<em><b>Data Selection Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Selection Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Selection Event Suffix</em>' attribute.
	 * @see #setDataSelectionEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_DataSelectionEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438" unique="false"
	 * @generated
	 */
	String getDataSelectionEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Selection Event Suffix</em>' attribute.
	 * @see #getDataSelectionEventSuffix()
	 * @generated
	 */
	void setDataSelectionEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Data Cleaning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Cleaning</em>' attribute.
	 * @see #setIsDataCleaning(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_IsDataCleaning()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDataCleaning();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Cleaning</em>' attribute.
	 * @see #getIsDataCleaning()
	 * @generated
	 */
	void setIsDataCleaning(Boolean value);

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ObjectRules()
	 * @model
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onProcessingEventPrefix = this.getOnProcessingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onProcessingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onProcessingEvent = this.getOnProcessingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onProcessingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onProcessingEventSuffix = this.getOnProcessingEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _onProcessingEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getOnProcessingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _length = this.getOnProcessingEvent().length();\nboolean _equals = (_length == 0);\nif (_equals)\n{\n\treturn \"\";\n}\nelse\n{\n\treturn \"\\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u041F\\u0440\\u0438\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0435\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());\n}'"
	 * @generated
	 */
	String getOnProcessingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _dataSelectionEventPrefix = this.getDataSelectionEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_dataSelectionEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _dataSelectionEvent = this.getDataSelectionEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _dataSelectionEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _dataSelectionEventSuffix = this.getDataSelectionEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _dataSelectionEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getDataSelectionEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _length = this.getDataSelectionEvent().length();\nboolean _equals = (_length == 0);\nif (_equals)\n{\n\treturn \"\";\n}\nelse\n{\n\treturn \"\\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u0412\\u044B\\u0431\\u043E\\u0440\\u043A\\u0430\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());\n}'"
	 * @generated
	 */
	String getDataSelectionEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.Boolean%&gt; _isDataCleaning = this.getIsDataCleaning();\nif ((_isDataCleaning).booleanValue())\n{\n\treturn \"\\u0418\\u0441\\u0442\\u0438\\u043D\\u0430\";\n}\nelse\n{\n\treturn \"\\u041B\\u043E\\u0436\\u044C\";\n}'"
	 * @generated
	 */
	String getDataCleaningDeclaration();

} // CmDataRule
