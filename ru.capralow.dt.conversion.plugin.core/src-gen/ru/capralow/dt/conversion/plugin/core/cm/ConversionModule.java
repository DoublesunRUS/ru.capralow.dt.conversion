/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI <em>Module URI</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule()
 * @model
 * @generated
 */
public interface ConversionModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_StoreVersion()
	 * @model default="1" unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>Module URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module URI</em>' attribute.
	 * @see #setModuleURI(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_ModuleURI()
	 * @model unique="false"
	 * @generated
	 */
	Object getModuleURI();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI <em>Module URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module URI</em>' attribute.
	 * @see #getModuleURI()
	 * @generated
	 */
	void setModuleURI(Object value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute.
	 * @see #setParams(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Params()
	 * @model unique="false"
	 * @generated
	 */
	String getParams();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' attribute.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(String value);

	/**
	 * Returns the value of the '<em><b>Before Convertation Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #setBeforeConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event Prefix</em>' attribute.
	 * @see #setBeforeConvertationEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event Suffix</em>' attribute.
	 * @see #setBeforeConvertationEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeConvertationEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>After Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event</em>' attribute.
	 * @see #setAfterConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getAfterConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>After Convertation Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Prefix</em>' attribute.
	 * @see #setAfterConvertationEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getAfterConvertationEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>After Convertation Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Suffix</em>' attribute.
	 * @see #setAfterConvertationEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getAfterConvertationEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Before Filling Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event</em>' attribute.
	 * @see #setBeforeFillingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEvent()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBeforeFillingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Before Filling Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Prefix</em>' attribute.
	 * @see #setBeforeFillingEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
	 * @generated
	 */
	String getBeforeFillingEventPrefix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Before Filling Event Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Suffix</em>' attribute.
	 * @see #setBeforeFillingEventSuffix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEventSuffix()
	 * @model default="\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b" unique="false"
	 * @generated
	 */
	String getBeforeFillingEventSuffix();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event Suffix</em>' attribute.
	 * @see #getBeforeFillingEventSuffix()
	 * @generated
	 */
	void setBeforeFillingEventSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Data Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule}.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_DataRules()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule
	 * @model opposite="conversionModule" containment="true"
	 * @generated
	 */
	EList<CmDataRule> getDataRules();

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_ObjectRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

	/**
	 * Returns the value of the '<em><b>Predefineds</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefineds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefineds</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Predefineds()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmPredefined> getPredefineds();

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm}.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Algorithms()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule
	 * @model opposite="conversionModule" containment="true"
	 * @generated
	 */
	EList<CmAlgorithm> getAlgorithms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _beforeConvertationEventPrefix = this.getBeforeConvertationEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_beforeConvertationEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _beforeConvertationEvent = this.getBeforeConvertationEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _beforeConvertationEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _beforeConvertationEventSuffix = this.getBeforeConvertationEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _beforeConvertationEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getBeforeConvertationEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _afterConvertationEventPrefix = this.getAfterConvertationEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_afterConvertationEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _afterConvertationEvent = this.getAfterConvertationEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _afterConvertationEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _afterConvertationEventSuffix = this.getAfterConvertationEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _afterConvertationEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getAfterConvertationEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _beforeFillingEventPrefix = this.getBeforeFillingEventPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_beforeFillingEventPrefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _beforeFillingEvent = this.getBeforeFillingEvent();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _beforeFillingEvent);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _beforeFillingEventSuffix = this.getBeforeFillingEventSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _beforeFillingEventSuffix);\nreturn result;'"
	 * @generated
	 */
	String getBeforeFillingEventText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.String%&gt; _name = dataRule.getName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(ruleName, _name);\n\tif (_equals)\n\t{\n\t\treturn dataRule;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	CmDataRule getDataRule(String ruleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _forSending = dataRule.getForSending();\n\tif ((_forSending).booleanValue())\n\t{\n\t\tresult.add(dataRule);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<Object> getSendingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _forReceiving = dataRule.getForReceiving();\n\tif ((_forReceiving).booleanValue())\n\t{\n\t\tresult.add(dataRule);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<Object> getReceivingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule%&gt;&gt; _objectRules = this.getObjectRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule%&gt; objectRule : _objectRules)\n{\n\t&lt;%java.lang.String%&gt; _name = objectRule.getName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(ruleName, _name);\n\tif (_equals)\n\t{\n\t\treturn objectRule;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	CmObjectRule getObjectRule(String ruleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" algorithmNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm%&gt;&gt; _algorithms = this.getAlgorithms();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm%&gt; algorithm : _algorithms)\n{\n\t&lt;%java.lang.String%&gt; _name = algorithm.getName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(algorithmName, _name);\n\tif (_equals)\n\t{\n\t\treturn algorithm;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	CmAlgorithm getAlgorithm(String algorithmName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" algorithmNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; result = \"\";\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm%&gt;&gt; _algorithms = this.getAlgorithms();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm%&gt; algorithm : _algorithms)\n{\n\t&lt;%java.lang.String%&gt; _name = algorithm.getName();\n\tboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(algorithmName, _name));\n\tif (_notEquals)\n\t{\n\t\t&lt;%java.lang.String%&gt; _result = result;\n\t\t&lt;%java.lang.String%&gt; _algorithmText = algorithm.getAlgorithmText();\n\t\t&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n\t\t&lt;%java.lang.String%&gt; _plus = (_algorithmText + _lineSeparator);\n\t\tresult = (_result + _plus);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	String getAllAlgorithmsText(String algorithmName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; result = \"\";\n&lt;%java.lang.String%&gt; _result = result;\nresult = (_result + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\\u041A\\u043E\\u043D\\u0432\\u0435\\u0440\\u0442\\u0430\\u0446\\u0438\\u0438\");\n&lt;%java.lang.String%&gt; _result_1 = result;\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_lineSeparator + _lineSeparator_1);\nresult = (_result_1 + _plus);\n&lt;%java.lang.String%&gt; _result_2 = result;\n&lt;%java.lang.String%&gt; _beforeConvertationEventText = this.getBeforeConvertationEventText();\nresult = (_result_2 + _beforeConvertationEventText);\n&lt;%java.lang.String%&gt; _result_3 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_3 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_1 = (_lineSeparator_2 + _lineSeparator_3);\nresult = (_result_3 + _plus_1);\n&lt;%java.lang.String%&gt; _result_4 = result;\n&lt;%java.lang.String%&gt; _afterConvertationEventText = this.getAfterConvertationEventText();\nresult = (_result_4 + _afterConvertationEventText);\n&lt;%java.lang.String%&gt; _result_5 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_4 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_5 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_lineSeparator_4 + _lineSeparator_5);\nresult = (_result_5 + _plus_2);\n&lt;%java.lang.String%&gt; _result_6 = result;\n&lt;%java.lang.String%&gt; _beforeFillingEventText = this.getBeforeFillingEventText();\nresult = (_result_6 + _beforeFillingEventText);\n&lt;%java.lang.String%&gt; _result_7 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_6 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_7 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_3 = (_lineSeparator_6 + _lineSeparator_7);\nresult = (_result_7 + _plus_3);\n&lt;%java.lang.String%&gt; _result_8 = result;\n&lt;%java.lang.String%&gt; _replace = \"// \\u0412\\u043E\\u0437\\u0432\\u0440\\u0430\\u0449\\u0430\\u0435\\u0442 \\u0432\\u0435\\u0440\\u0441\\u0438\\u044E \\u0444\\u043E\\u0440\\u043C\\u0430\\u0442\\u0430 \\u043C\\u0435\\u043D\\u0435\\u0434\\u0436\\u0435\\u0440\\u0430 \\u043E\\u0431\\u043C\\u0435\\u043D\\u0430.\\r\\n// \\u0412\\u043E\\u0437\\u0432\\u0440\\u0430\\u0449\\u0430\\u0435\\u043C\\u043E\\u0435 \\u0437\\u043D\\u0430\\u0447\\u0435\\u043D\\u0438\\u0435:\\r\\n//  \\u0427\\u0438\\u0441\\u043B\\u043E - \\u043D\\u043E\\u043C\\u0435\\u0440 \\u0432\\u0435\\u0440\\u0441\\u0438\\u0438.\\r\\n\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u044F \\u0412\\u0435\\u0440\\u0441\\u0438\\u044F\\u0424\\u043E\\u0440\\u043C\\u0430\\u0442\\u0430\\u041C\\u0435\\u043D\\u0435\\u0434\\u0436\\u0435\\u0440\\u0430\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430() \\u042D\\u043A\\u0441\\u043F\\u043E\\u0440\\u0442\\r\\n\\t\\u0412\\u043E\\u0437\\u0432\\u0440\\u0430\\u0442 &amp;\\u0412\\u0435\\u0440\\u0441\\u0438\\u044F\\u0424\\u043E\\u0440\\u043C\\u0430\\u0442\\u0430\\u041C\\u0435\\u043D\\u0435\\u0434\\u0436\\u0435\\u0440\\u0430\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430;\\r\\n\\u041A\\u043E\\u043D\\u0435\\u0446\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u0438\".replace(\"&amp;\\u0412\\u0435\\u0440\\u0441\\u0438\\u044F\\u0424\\u043E\\u0440\\u043C\\u0430\\u0442\\u0430\\u041C\\u0435\\u043D\\u0435\\u0434\\u0436\\u0435\\u0440\\u0430\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430\", this.getStoreVersion());\nresult = (_result_8 + _replace);\n&lt;%java.lang.String%&gt; _result_9 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_8 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_9 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_4 = (_lineSeparator_8 + _lineSeparator_9);\nresult = (_result_9 + _plus_4);\n&lt;%java.lang.String%&gt; _result_10 = result;\nresult = (_result_10 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041A\\u043E\\u043D\\u0435\\u0446\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u0438\");\n&lt;%java.lang.String%&gt; _result_11 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_10 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_11 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_5 = (_lineSeparator_10 + _lineSeparator_11);\nresult = (_result_11 + _plus_5);\n&lt;%java.lang.String%&gt; _result_12 = result;\nresult = (_result_12 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041F\\u041E\\u0414\");\n&lt;%java.lang.String%&gt; _result_13 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_12 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_13 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_6 = (_lineSeparator_12 + _lineSeparator_13);\nresult = (_result_13 + _plus_6);\n&lt;%java.lang.String%&gt; dataRulesDeclarationText = \"\";\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_14 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_7 = (\"\\t\\u0415\\u0441\\u043B\\u0438 \\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430 = \\\"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\\\" \\u0422\\u043E\\u0433\\u0434\\u0430\" + _lineSeparator_14);\ndataRulesDeclarationText = (_dataRulesDeclarationText + _plus_7);\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText_1 = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_15 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_8 = (\"\\t\\t\\u0415\\u0441\\u043B\\u0438 \\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445.\\u041A\\u043E\\u043B\\u043E\\u043D\\u043A\\u0438.\\u041D\\u0430\\u0439\\u0442\\u0438(\\\"\\u041E\\u0447\\u0438\\u0441\\u0442\\u043A\\u0430\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445\\\") = \\u041D\\u0435\\u043E\\u043F\\u0440\\u0435\\u0434\\u0435\\u043B\\u0435\\u043D\\u043E \\u0422\\u043E\\u0433\\u0434\\u0430\" + _lineSeparator_15);\ndataRulesDeclarationText = (_dataRulesDeclarationText_1 + _plus_8);\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText_2 = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_16 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_9 = (\"\\t\\t\\t\\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445.\\u041A\\u043E\\u043B\\u043E\\u043D\\u043A\\u0438.\\u0414\\u043E\\u0431\\u0430\\u0432\\u0438\\u0442\\u044C(\\\"\\u041E\\u0447\\u0438\\u0441\\u0442\\u043A\\u0430\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445\\\");\" + _lineSeparator_16);\ndataRulesDeclarationText = (_dataRulesDeclarationText_2 + _plus_9);\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText_3 = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_17 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_10 = (\"\\t\\t\\u041A\\u043E\\u043D\\u0435\\u0446\\u0415\\u0441\\u043B\\u0438;\" + _lineSeparator_17);\ndataRulesDeclarationText = (_dataRulesDeclarationText_3 + _plus_10);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _forSending = dataRule.getForSending();\n\tif ((_forSending).booleanValue())\n\t{\n\t\t&lt;%java.lang.String%&gt; _dataRulesDeclarationText_4 = dataRulesDeclarationText;\n\t\t&lt;%java.lang.String%&gt; _name = dataRule.getName();\n\t\t&lt;%java.lang.String%&gt; _plus_11 = (\"\\t\\t\\u0414\\u043E\\u0431\\u0430\\u0432\\u0438\\u0442\\u044C\\u041F\\u041E\\u0414_\" + _name);\n\t\t&lt;%java.lang.String%&gt; _plus_12 = (_plus_11 + \"(\\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445);\");\n\t\t&lt;%java.lang.String%&gt; _lineSeparator_18 = &lt;%java.lang.System%&gt;.lineSeparator();\n\t\t&lt;%java.lang.String%&gt; _plus_13 = (_plus_12 + _lineSeparator_18);\n\t\tdataRulesDeclarationText = (_dataRulesDeclarationText_4 + _plus_13);\n\t}\n}\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText_5 = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_19 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_14 = (\"\\t\\u0418\\u043D\\u0430\\u0447\\u0435\\u0415\\u0441\\u043B\\u0438 \\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430 = \\\"\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\\\" \\u0422\\u043E\\u0433\\u0434\\u0430\" + _lineSeparator_19);\ndataRulesDeclarationText = (_dataRulesDeclarationText_5 + _plus_14);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules_1 = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule_1 : _dataRules_1)\n{\n\t&lt;%java.lang.Boolean%&gt; _forReceiving = dataRule_1.getForReceiving();\n\tif ((_forReceiving).booleanValue())\n\t{\n\t\t&lt;%java.lang.String%&gt; _dataRulesDeclarationText_6 = dataRulesDeclarationText;\n\t\t&lt;%java.lang.String%&gt; _name_1 = dataRule_1.getName();\n\t\t&lt;%java.lang.String%&gt; _plus_15 = (\"\\t\\t\\u0414\\u043E\\u0431\\u0430\\u0432\\u0438\\u0442\\u044C\\u041F\\u041E\\u0414_\" + _name_1);\n\t\t&lt;%java.lang.String%&gt; _plus_16 = (_plus_15 + \"(\\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445);\");\n\t\t&lt;%java.lang.String%&gt; _lineSeparator_20 = &lt;%java.lang.System%&gt;.lineSeparator();\n\t\t&lt;%java.lang.String%&gt; _plus_17 = (_plus_16 + _lineSeparator_20);\n\t\tdataRulesDeclarationText = (_dataRulesDeclarationText_6 + _plus_17);\n\t}\n}\n&lt;%java.lang.String%&gt; _dataRulesDeclarationText_7 = dataRulesDeclarationText;\n&lt;%java.lang.String%&gt; _lineSeparator_21 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_18 = (\"\\t\\u041A\\u043E\\u043D\\u0435\\u0446\\u0415\\u0441\\u043B\\u0438;\" + _lineSeparator_21);\ndataRulesDeclarationText = (_dataRulesDeclarationText_7 + _plus_18);\n&lt;%java.lang.String%&gt; _result_14 = result;\n&lt;%java.lang.String%&gt; _replace_1 = \"// \\u0417\\u0430\\u043F\\u043E\\u043B\\u043D\\u044F\\u0435\\u0442 \\u0442\\u0430\\u0431\\u043B\\u0438\\u0446\\u0443 \\u043F\\u0440\\u0430\\u0432\\u0438\\u043B \\u043E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438 \\u0434\\u0430\\u043D\\u043D\\u044B\\u0445.\\r\\n//\\r\\n// \\u041F\\u0430\\u0440\\u0430\\u043C\\u0435\\u0442\\u0440\\u044B:\\r\\n//  \\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430 - \\u0441\\u0442\\u0440\\u043E\\u043A\\u0430 (\\\"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\\\" \\u043B\\u0438\\u0431\\u043E \\\"\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\\\").\\r\\n//  \\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445 - \\u0442\\u0430\\u0431\\u043B\\u0438\\u0446\\u0430 \\u0437\\u043D\\u0430\\u0447\\u0435\\u043D\\u0438\\u0439, \\u0432 \\u043A\\u043E\\u0442\\u043E\\u0440\\u0443\\u044E \\u0434\\u043E\\u0431\\u0430\\u0432\\u043B\\u044F\\u044E\\u0442\\u0441\\u044F \\u043F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430. \\r\\n\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430 \\u0417\\u0430\\u043F\\u043E\\u043B\\u043D\\u0438\\u0442\\u044C\\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445(\\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041E\\u0431\\u043C\\u0435\\u043D\\u0430, \\u041F\\u0440\\u0430\\u0432\\u0438\\u043B\\u0430\\u041E\\u0431\\u0440\\u0430\\u0431\\u043E\\u0442\\u043A\\u0438\\u0414\\u0430\\u043D\\u043D\\u044B\\u0445) \\u042D\\u043A\\u0441\\u043F\\u043E\\u0440\\u0442\\r\\n&amp;\\u0422\\u0435\\u043B\\u043E\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\\r\\n\\u041A\\u043E\\u043D\\u0435\\u0446\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\".replace(\"&amp;\\u0422\\u0435\\u043B\\u043E\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\", dataRulesDeclarationText);\nresult = (_result_14 + _replace_1);\n&lt;%java.lang.String%&gt; _result_15 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_22 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_23 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_19 = (_lineSeparator_22 + _lineSeparator_23);\nresult = (_result_15 + _plus_19);\n&lt;%java.lang.String%&gt; _result_16 = result;\nresult = (_result_16 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\");\n&lt;%java.lang.String%&gt; _result_17 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_24 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_25 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_20 = (_lineSeparator_24 + _lineSeparator_25);\nresult = (_result_17 + _plus_20);\n&lt;%java.lang.String%&gt; _result_18 = result;\nresult = (_result_18 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041A\\u043E\\u043D\\u0435\\u0446\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u0438\");\n&lt;%java.lang.String%&gt; _result_19 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_26 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_27 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_21 = (_lineSeparator_26 + _lineSeparator_27);\nresult = (_result_19 + _plus_21);\n&lt;%java.lang.String%&gt; _result_20 = result;\nresult = (_result_20 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\");\n&lt;%java.lang.String%&gt; _result_21 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_28 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_29 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_22 = (_lineSeparator_28 + _lineSeparator_29);\nresult = (_result_21 + _plus_22);\n&lt;%java.lang.String%&gt; _result_22 = result;\nresult = (_result_22 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041A\\u043E\\u043D\\u0435\\u0446\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u0438\");\n&lt;%java.lang.String%&gt; _result_23 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_30 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_31 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_23 = (_lineSeparator_30 + _lineSeparator_31);\nresult = (_result_23 + _plus_23);\n&lt;%java.lang.String%&gt; _result_24 = result;\nresult = (_result_24 + \"#\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u044C \\u041A\\u043E\\u043D\\u0435\\u0446\\u041E\\u0431\\u043B\\u0430\\u0441\\u0442\\u0438\");\n&lt;%java.lang.String%&gt; _result_25 = result;\n&lt;%java.lang.String%&gt; _lineSeparator_32 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _lineSeparator_33 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_24 = (_lineSeparator_32 + _lineSeparator_33);\nresult = (_result_25 + _plus_24);\nreturn result;'"
	 * @generated
	 */
	String getModuleTextV2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _storeVersion = this.getStoreVersion();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_storeVersion, \"1\");\nif (_equals)\n{\n\treturn this.getModuleTextV2();\n}\nelse\n{\n\treturn this.getModuleTextV2();\n}'"
	 * @generated
	 */
	String getModuleText();

} // ConversionModule
