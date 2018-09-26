/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getForGroup <em>For Group</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getIdentificationVariant <em>Identification Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnSendingEvent <em>On Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnSendingEventPrefix <em>On Sending Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeReceivingEvent <em>Before Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeReceivingEventPrefix <em>Before Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnReceivingEvent <em>On Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnReceivingEventPrefix <em>On Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl#getAttributeRules <em>Attribute Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmObjectRuleImpl extends MinimalEObjectImpl.Container implements CmObjectRule {
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
	public ConversionModule getConversionModule() {
		return (ConversionModule)eGet(CmPackage.Literals.CM_OBJECT_RULE__CONVERSION_MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionModule(ConversionModule newConversionModule) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__CONVERSION_MODULE, newConversionModule);
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
	public Boolean getForGroup() {
		return (Boolean)eGet(CmPackage.Literals.CM_OBJECT_RULE__FOR_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForGroup(Boolean newForGroup) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__FOR_GROUP, newForGroup);
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
	public String getOnSendingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0435\u0414\u0430\u043D\u043D\u044B\u0445(\u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u0414\u0430\u043D\u043D\u044B\u0435XDTO, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430, \u0421\u0442\u0435\u043A\u0412\u044B\u0433\u0440\u0443\u0437\u043A\u0438)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSendingEventSuffix(String newOnSendingEventSuffix) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX, newOnSendingEventSuffix);
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
	public String getBeforeReceivingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438\u0414\u0430\u043D\u043D\u044B\u0445XDTO(\u0414\u0430\u043D\u043D\u044B\u0435XDTO, \u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0435\u0414\u0430\u043D\u043D\u044B\u0435, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeReceivingEventSuffix(String newBeforeReceivingEventSuffix) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX, newBeforeReceivingEventSuffix);
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
	public String getOnReceivingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0435\u0440\u0435\u0434\u0417\u0430\u043F\u0438\u0441\u044C\u044E\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0445\u0414\u0430\u043D\u043D\u044B\u0445(\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0435\u0414\u0430\u043D\u043D\u044B\u0435, \u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u044F\u0421\u0432\u043E\u0439\u0441\u0442\u0432, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReceivingEventSuffix(String newOnReceivingEventSuffix) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX, newOnReceivingEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm getAfterReceivingAlgorithm() {
		return (CmAlgorithm)eGet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterReceivingAlgorithm(CmAlgorithm newAfterReceivingAlgorithm) {
		eSet(CmPackage.Literals.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM, newAfterReceivingAlgorithm);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventText() {
		String _onSendingEventPrefix = this.getOnSendingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onSendingEventPrefix + _lineSeparator);
		String _onSendingEvent = this.getOnSendingEvent();
		String _plus_1 = (_plus + _onSendingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onSendingEventSuffix = this.getOnSendingEventSuffix();
		String result = (_plus_2 + _onSendingEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventText() {
		String _beforeReceivingEventPrefix = this.getBeforeReceivingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeReceivingEventPrefix + _lineSeparator);
		String _beforeReceivingEvent = this.getBeforeReceivingEvent();
		String _plus_1 = (_plus + _beforeReceivingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeReceivingEventSuffix = this.getBeforeReceivingEventSuffix();
		String result = (_plus_2 + _beforeReceivingEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventText() {
		String _onReceivingEventPrefix = this.getOnReceivingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onReceivingEventPrefix + _lineSeparator);
		String _onReceivingEvent = this.getOnReceivingEvent();
		String _plus_1 = (_plus + _onReceivingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onReceivingEventSuffix = this.getOnReceivingEventSuffix();
		String result = (_plus_2 + _onReceivingEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CmPackage.CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT:
				return getOnSendingEventText();
			case CmPackage.CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT:
				return getBeforeReceivingEventText();
			case CmPackage.CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT:
				return getOnReceivingEventText();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmObjectRuleImpl
