/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule()
 * @model
 * @generated
 */
public interface ConversionModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_StoreVersion()
	 * @model default="1" unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmSubsystem> getSubsystems();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_Params()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getParams();

	/**
	 * Returns the value of the '<em><b>Before Convertation Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #setBeforeConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeConvertationEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #getBeforeConvertationEvent()
	 * @generated
	 */
	void setBeforeConvertationEvent(String value);

	/**
	 * Returns the value of the '<em><b>Before Convertation Event Prefix</b></em>' attribute.
	 * The default value is <code>"\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event Prefix</em>' attribute.
	 * @see #setBeforeConvertationEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeConvertationEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation Event Prefix</em>' attribute.
	 * @see #getBeforeConvertationEventPrefix()
	 * @generated
	 */
	void setBeforeConvertationEventPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Before Convertation Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event Suffix</em>' attribute.
	 * @see #setBeforeConvertationEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeConvertationEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation Event Suffix</em>' attribute.
	 * @see #getBeforeConvertationEventSuffix()
	 * @generated
	 */
	void setBeforeConvertationEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>After Convertation Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event</em>' attribute.
	 * @see #setAfterConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_AfterConvertationEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getAfterConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation Event</em>' attribute.
	 * @see #getAfterConvertationEvent()
	 * @generated
	 */
	void setAfterConvertationEvent(String value);

	/**
	 * Returns the value of the '<em><b>After Convertation Event Prefix</b></em>' attribute.
	 * The default value is <code>"\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Prefix</em>' attribute.
	 * @see #setAfterConvertationEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_AfterConvertationEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getAfterConvertationEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation Event Prefix</em>' attribute.
	 * @see #getAfterConvertationEventPrefix()
	 * @generated
	 */
	void setAfterConvertationEventPrefix(String value);

	/**
	 * Returns the value of the '<em><b>After Convertation Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Suffix</em>' attribute.
	 * @see #setAfterConvertationEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_AfterConvertationEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getAfterConvertationEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation Event Suffix</em>' attribute.
	 * @see #getAfterConvertationEventSuffix()
	 * @generated
	 */
	void setAfterConvertationEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Before Filling Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event</em>' attribute.
	 * @see #setBeforeFillingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeFillingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeFillingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event</em>' attribute.
	 * @see #getBeforeFillingEvent()
	 * @generated
	 */
	void setBeforeFillingEvent(String value);

	/**
	 * Returns the value of the '<em><b>Before Filling Event Prefix</b></em>' attribute.
	 * The default value is <code>"\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Prefix</em>' attribute.
	 * @see #setBeforeFillingEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeFillingEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getBeforeFillingEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event Prefix</em>' attribute.
	 * @see #getBeforeFillingEventPrefix()
	 * @generated
	 */
	void setBeforeFillingEventPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Before Filling Event Suffix</b></em>' attribute.
	 * The default value is <code>"\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Suffix</em>' attribute.
	 * @see #setBeforeFillingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_BeforeFillingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeFillingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event Suffix</em>' attribute.
	 * @see #getBeforeFillingEventSuffix()
	 * @generated
	 */
	void setBeforeFillingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Data Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_DataRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmDataRule> getDataRules();

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_ObjectRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

	/**
	 * Returns the value of the '<em><b>Predefineds</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefineds</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_Predefineds()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmPredefined> getPredefineds();

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getConversionModule_Algorithms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmAlgorithm> getAlgorithms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" mdSubsystemUnique="false"
	 * @generated
	 */
	CmSubsystem getSubsystem(Subsystem mdSubsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getAfterConvertationEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getBeforeFillingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 * @generated
	 */
	CmDataRule getDataRule(String ruleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<CmDataRule> getSendingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" subsystemUnique="false"
	 * @generated
	 */
	EList<CmDataRule> getSendingDataRules(CmSubsystem subsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<CmDataRule> getReceivingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" subsystemUnique="false"
	 * @generated
	 */
	EList<CmDataRule> getReceivingDataRules(CmSubsystem subsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 * @generated
	 */
	CmObjectRule getObjectRule(String ruleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<CmObjectRule> getSendingObjectRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cmSubsystemUnique="false"
	 * @generated
	 */
	EList<CmObjectRule> getSendingObjectRules(CmSubsystem cmSubsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<CmObjectRule> getReceivingObjectRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cmSubsystemUnique="false"
	 * @generated
	 */
	EList<CmObjectRule> getReceivingObjectRules(CmSubsystem cmSubsystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" algorithmNameUnique="false"
	 * @generated
	 */
	CmAlgorithm getAlgorithm(String algorithmName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" algorithmNameUnique="false"
	 * @generated
	 */
	String getAllAlgorithmsText(String algorithmName);

} // ConversionModule
