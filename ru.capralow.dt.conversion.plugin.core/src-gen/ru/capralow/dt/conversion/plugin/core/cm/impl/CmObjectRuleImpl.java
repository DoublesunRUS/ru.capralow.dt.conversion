/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getIsForGroup <em>Is For Group</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getIdentificationVariant <em>Identification Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeSendingEvent <em>Before Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeSendingEventMethod <em>Before Sending Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnSendingEvent <em>On Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnSendingEventMethod <em>On Sending Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeReceivingEvent <em>Before Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeReceivingEventMethod <em>Before Receiving Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnReceivingEvent <em>On Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnReceivingEventMethod <em>On Receiving Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getAfterReceivingAlgorithmName <em>After Receiving Algorithm Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getAfterReceivingAlgorithmMethod <em>After Receiving Algorithm Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getAttributeRules <em>Attribute Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmObjectRuleImpl extends BmObject implements CmObjectRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_OBJECT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDisabled() {
		return (Boolean)eGet(CmPackage.Literals.CM_OBJECT_RULE__IS_DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisabled(Boolean newIsDisabled) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__IS_DISABLED, newIsDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConfigurationObject() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFormatObject() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__FORMAT_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatObject(Object newFormatObject) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__FORMAT_OBJECT, newFormatObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForSending() {
		return (Boolean)eGet(CmPackage.Literals.CM_OBJECT_RULE__FOR_SENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForSending(Boolean newForSending) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__FOR_SENDING, newForSending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForReceiving() {
		return (Boolean)eGet(CmPackage.Literals.CM_OBJECT_RULE__FOR_RECEIVING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReceiving(Boolean newForReceiving) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__FOR_RECEIVING, newForReceiving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsForGroup() {
		return (Boolean)eGet(CmPackage.Literals.CM_OBJECT_RULE__IS_FOR_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForGroup(Boolean newIsForGroup) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__IS_FOR_GROUP, newIsForGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmIdentificationVariant getIdentificationVariant() {
		return (CmIdentificationVariant)eGet(CmPackage.Literals.CM_OBJECT_RULE__IDENTIFICATION_VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationVariant(CmIdentificationVariant newIdentificationVariant) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__IDENTIFICATION_VARIANT, newIdentificationVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeSendingEvent() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_SENDING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeSendingEvent(String newBeforeSendingEvent) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_SENDING_EVENT, newBeforeSendingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBeforeSendingEventMethod() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_SENDING_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeSendingEventMethod(Object newBeforeSendingEventMethod) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_SENDING_EVENT_METHOD, newBeforeSendingEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEvent() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSendingEvent(String newOnSendingEvent) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT, newOnSendingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOnSendingEventMethod() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSendingEventMethod(Object newOnSendingEventMethod) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT_METHOD, newOnSendingEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEvent() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeReceivingEvent(String newBeforeReceivingEvent) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT, newBeforeReceivingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBeforeReceivingEventMethod() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeReceivingEventMethod(Object newBeforeReceivingEventMethod) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_METHOD, newBeforeReceivingEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEvent() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReceivingEvent(String newOnReceivingEvent) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT, newOnReceivingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOnReceivingEventMethod() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReceivingEventMethod(Object newOnReceivingEventMethod) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT_METHOD, newOnReceivingEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterReceivingAlgorithmName() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterReceivingAlgorithmName(String newAfterReceivingAlgorithmName) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM_NAME, newAfterReceivingAlgorithmName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAfterReceivingAlgorithmMethod() {
		return (Object)eGet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterReceivingAlgorithmMethod(Object newAfterReceivingAlgorithmMethod) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM_METHOD, newAfterReceivingAlgorithmMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmAttributeRule> getAttributeRules() {
		return (EList<CmAttributeRule>)eGet(CmPackage.Literals.CM_OBJECT_RULE__ATTRIBUTE_RULES, true);
	}

} //CmObjectRuleImpl
