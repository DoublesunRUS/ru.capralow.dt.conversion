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
	 * The default value is <code>"\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Convertation Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Prefix</em>' attribute.
	 * @see #setAfterConvertationEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
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
	 * The default value is <code>"\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Filling Event Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Prefix</em>' attribute.
	 * @see #setBeforeFillingEventPrefix(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEventPrefix()
	 * @model default="\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442" unique="false"
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

} // ConversionModule
