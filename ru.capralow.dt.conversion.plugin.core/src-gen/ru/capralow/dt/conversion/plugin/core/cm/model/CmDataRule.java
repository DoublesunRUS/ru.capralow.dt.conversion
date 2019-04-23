/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Data Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventPrefix <em>On Processing Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventPrefix <em>Data Selection Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule()
 * @model
 * @generated
 */
public interface CmDataRule extends CmObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_IsDisabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDisabled <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disabled</em>' attribute.
	 * @see #getIsDisabled()
	 * @generated
	 */
	void setIsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Selection Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant
	 * @see #setSelectionVariant(CmSelectionVariant)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_SelectionVariant()
	 * @model unique="false"
	 * @generated
	 */
	CmSelectionVariant getSelectionVariant();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSelectionVariant <em>Selection Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_OnProcessingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getOnProcessingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_OnProcessingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.Boolean%&gt; _forSending = this.getForSending();\nif ((_forSending).booleanValue())\n{\n\treturn \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u041F\\u0440\\u0438\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0435(\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435\\u0418\\u0411, \\u0418\\u0441\\u043F\\u043E\\u043B\\u044C\\u0437\\u043E\\u0432\\u0430\\u043D\\u0438\\u0435\\u041F\\u041A\\u041E, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());\n}\nelse\n{\n\treturn \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u041F\\u041E\\u0414_&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414_\\u041F\\u0440\\u0438\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0435(\\u0414\\u0430\\u043D\\u043D\\u044B\\u0435XDTO, \\u0418\\u0441\\u043F\\u043E\\u043B\\u044C\\u0437\\u043E\\u0432\\u0430\\u043D\\u0438\\u0435\\u041F\\u041A\\u041E, \\u041A\\u043E\\u043C\\u043F\\u043E\\u043D\\u0435\\u043D\\u0442\\u044B\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430)\".replace(\"&amp;\\u0418\\u043C\\u044F\\u041F\\u041E\\u0414\", this.getName());\n}'"
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_OnProcessingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getOnProcessingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_DataSelectionEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getDataSelectionEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_DataSelectionEventPrefix()
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_DataSelectionEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438" unique="false"
	 * @generated
	 */
	String getDataSelectionEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_IsDataCleaning()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsDataCleaning();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Cleaning</em>' attribute.
	 * @see #getIsDataCleaning()
	 * @generated
	 */
	void setIsDataCleaning(Boolean value);

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_ObjectRules()
	 * @model
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_Subsystems()
	 * @model
	 * @generated
	 */
	EList<CmSubsystem> getSubsystems();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(CmGroup)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_Group()
	 * @model
	 * @generated
	 */
	CmGroup getGroup();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(CmGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _onProcessingEventPrefix = this.getOnProcessingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_onProcessingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _onProcessingEvent = this.getOnProcessingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _onProcessingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _onProcessingEventSuffix = this.getOnProcessingEventSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _onProcessingEventSuffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _dataSelectionEventPrefix = this.getDataSelectionEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_dataSelectionEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _dataSelectionEvent = this.getDataSelectionEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _dataSelectionEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _dataSelectionEventSuffix = this.getDataSelectionEventSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _dataSelectionEventSuffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cmSubsystemUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (((cmSubsystem == null) || &lt;%com.google.common.base.Objects%&gt;.equal(cmSubsystem.getSpecialSubsystemType(), &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt;.ALL)))\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem%&gt;&gt; _subsystems = this.getSubsystems();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem%&gt; subsystem : _subsystems)\n{\n\tboolean _equals = subsystem.equals(cmSubsystem);\n\tif (_equals)\n\t{\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n\t}\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule%&gt;&gt; _objectRules = this.getObjectRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule%&gt; objectRule : _objectRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _includedInSubsystem = objectRule.includedInSubsystem(cmSubsystem);\n\tif ((_includedInSubsystem).booleanValue())\n\t{\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n\t}\n}\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt; _specialSubsystemType = cmSubsystem.getSpecialSubsystemType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_specialSubsystemType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType%&gt;.EMPTY));\nif (_notEquals)\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(false);\n}\nint _size = this.getSubsystems().size();\nboolean _notEquals_1 = (_size != 0);\nif (_notEquals_1)\n{\n\treturn &lt;%java.lang.Boolean%&gt;.valueOf(false);\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule%&gt;&gt; _objectRules_1 = this.getObjectRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule%&gt; objectRule_1 : _objectRules_1)\n{\n\tint _size_1 = objectRule_1.getSubsystems().size();\n\tboolean _notEquals_2 = (_size_1 != 0);\n\tif (_notEquals_2)\n\t{\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(false);\n\t}\n}\nreturn &lt;%java.lang.Boolean%&gt;.valueOf(true);'"
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

} // CmDataRule
