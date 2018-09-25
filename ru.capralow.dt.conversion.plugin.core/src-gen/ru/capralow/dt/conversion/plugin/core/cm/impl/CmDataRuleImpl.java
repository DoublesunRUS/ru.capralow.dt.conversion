/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getOnProcessingEventPrefix <em>On Processing Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getDataSelectionEventPrefix <em>Data Selection Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl#getObjectRules <em>Object Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmDataRuleImpl extends MinimalEObjectImpl.Container implements CmDataRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmDataRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_DATA_RULE;
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
		return (ConversionModule)eGet(CmPackage.Literals.CM_DATA_RULE__CONVERSION_MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionModule(ConversionModule newConversionModule) {
		eSet(CmPackage.Literals.CM_DATA_RULE__CONVERSION_MODULE, newConversionModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CmPackage.Literals.CM_DATA_RULE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CM_DATA_RULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDisabled() {
		return (Boolean)eGet(CmPackage.Literals.CM_DATA_RULE__IS_DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisabled(Boolean newIsDisabled) {
		eSet(CmPackage.Literals.CM_DATA_RULE__IS_DISABLED, newIsDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConfigurationObject() {
		return (Object)eGet(CmPackage.Literals.CM_DATA_RULE__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CmPackage.Literals.CM_DATA_RULE__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFormatObject() {
		return (Object)eGet(CmPackage.Literals.CM_DATA_RULE__FORMAT_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatObject(Object newFormatObject) {
		eSet(CmPackage.Literals.CM_DATA_RULE__FORMAT_OBJECT, newFormatObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForSending() {
		return (Boolean)eGet(CmPackage.Literals.CM_DATA_RULE__FOR_SENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForSending(Boolean newForSending) {
		eSet(CmPackage.Literals.CM_DATA_RULE__FOR_SENDING, newForSending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForReceiving() {
		return (Boolean)eGet(CmPackage.Literals.CM_DATA_RULE__FOR_RECEIVING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReceiving(Boolean newForReceiving) {
		eSet(CmPackage.Literals.CM_DATA_RULE__FOR_RECEIVING, newForReceiving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSelectionVariant getSelectionVariant() {
		return (CmSelectionVariant)eGet(CmPackage.Literals.CM_DATA_RULE__SELECTION_VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionVariant(CmSelectionVariant newSelectionVariant) {
		eSet(CmPackage.Literals.CM_DATA_RULE__SELECTION_VARIANT, newSelectionVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEvent() {
		return (String)eGet(CmPackage.Literals.CM_DATA_RULE__ON_PROCESSING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProcessingEvent(String newOnProcessingEvent) {
		eSet(CmPackage.Literals.CM_DATA_RULE__ON_PROCESSING_EVENT, newOnProcessingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041E\u0414_|||\u0418\u041C\u042F|||_\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435(\u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435\u041F\u041A\u041E, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("|||\u0418\u041C\u042F|||", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProcessingEventSuffix(String newOnProcessingEventSuffix) {
		eSet(CmPackage.Literals.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX, newOnProcessingEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEvent() {
		return (String)eGet(CmPackage.Literals.CM_DATA_RULE__DATA_SELECTION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSelectionEvent(String newDataSelectionEvent) {
		eSet(CmPackage.Literals.CM_DATA_RULE__DATA_SELECTION_EVENT, newDataSelectionEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventPrefix() {
		return "\u0424\u0443\u043D\u043A\u0446\u0438\u044F \u041F\u041E\u0414_|||\u0418\u041C\u042F|||_\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445(\u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("|||\u0418\u041C\u042F|||", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventSuffix() {
		return (String)eGet(CmPackage.Literals.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSelectionEventSuffix(String newDataSelectionEventSuffix) {
		eSet(CmPackage.Literals.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX, newDataSelectionEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDataCleaning() {
		return (Boolean)eGet(CmPackage.Literals.CM_DATA_RULE__IS_DATA_CLEANING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataCleaning(Boolean newIsDataCleaning) {
		eSet(CmPackage.Literals.CM_DATA_RULE__IS_DATA_CLEANING, newIsDataCleaning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmObjectRule> getObjectRules() {
		return (EList<CmObjectRule>)eGet(CmPackage.Literals.CM_DATA_RULE__OBJECT_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventText() {
		String _onProcessingEventPrefix = this.getOnProcessingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onProcessingEventPrefix + _lineSeparator);
		String _onProcessingEvent = this.getOnProcessingEvent();
		String _plus_1 = (_plus + _onProcessingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onProcessingEventSuffix = this.getOnProcessingEventSuffix();
		String result = (_plus_2 + _onProcessingEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventDeclaration() {
		int _length = this.getOnProcessingEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041E\u0414_|||\u0418\u041C\u042F|||_\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435".replace("|||\u0418\u041C\u042F|||", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventText() {
		String _dataSelectionEventPrefix = this.getDataSelectionEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_dataSelectionEventPrefix + _lineSeparator);
		String _dataSelectionEvent = this.getDataSelectionEvent();
		String _plus_1 = (_plus + _dataSelectionEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _dataSelectionEventSuffix = this.getDataSelectionEventSuffix();
		String result = (_plus_2 + _dataSelectionEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventDeclaration() {
		int _length = this.getDataSelectionEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041E\u0414_|||\u0418\u041C\u042F|||_\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445".replace("|||\u0418\u041C\u042F|||", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataCleaningDeclaration() {
		Boolean _isDataCleaning = this.getIsDataCleaning();
		if ((_isDataCleaning).booleanValue()) {
			return "\u0418\u0441\u0442\u0438\u043D\u0430";
		}
		else {
			return "\u041B\u043E\u0436\u044C";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CmPackage.CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT:
				return getOnProcessingEventText();
			case CmPackage.CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION:
				return getOnProcessingEventDeclaration();
			case CmPackage.CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT:
				return getDataSelectionEventText();
			case CmPackage.CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION:
				return getDataSelectionEventDeclaration();
			case CmPackage.CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION:
				return getDataCleaningDeclaration();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmDataRuleImpl
