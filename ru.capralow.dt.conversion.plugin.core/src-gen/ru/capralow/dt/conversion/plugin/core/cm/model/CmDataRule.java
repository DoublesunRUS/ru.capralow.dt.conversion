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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Processing Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_OnProcessingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getOnProcessingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Processing Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Selection Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmDataRule_DataSelectionEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDataSelectionEventPrefix();

	/**
	 * Returns the value of the '<em><b>Data Selection Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438"</code>.
	 * <!-- begin-user-doc -->
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
	 * @generated
	 */
	String getOnProcessingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getOnProcessingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getDataSelectionEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getDataSelectionEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getDataCleaningDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cmSubsystemUnique="false"
	 * @generated
	 */
	Boolean includedInSubsystem(CmSubsystem cmSubsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // CmDataRule
