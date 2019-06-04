/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Object Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIsDisabled <em>Is Disabled</em>}</li>
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
public interface CmObjectRule extends CmObject {
	/**
	 * Returns the value of the '<em><b>Is Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
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
	 * Returns the value of the '<em><b>For Group</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
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
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_AttributeRules()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<CmAttributeRule> getAttributeRules();

	/**
	 * Returns the value of the '<em><b>On Sending Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Sending Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnSendingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getOnSendingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Sending Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Receiving Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_BeforeReceivingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getBeforeReceivingEventPrefix();

	/**
	 * Returns the value of the '<em><b>Before Receiving Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Receiving Event Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObjectRule_OnReceivingEventPrefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getOnReceivingEventPrefix();

	/**
	 * Returns the value of the '<em><b>On Receiving Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
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
	 * @generated
	 */
	String getForGroupDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getOnSendingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getOnSendingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getBeforeReceivingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getOnReceivingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getOnReceivingEventDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getAfterReceivingAlgorithmDeclaration();

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

} // CmObjectRule
