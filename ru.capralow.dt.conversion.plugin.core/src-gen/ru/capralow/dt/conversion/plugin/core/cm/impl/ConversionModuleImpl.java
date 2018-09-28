/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getModuleURI <em>Module URI</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionModuleImpl extends MinimalEObjectImpl.Container implements ConversionModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CONVERSION_MODULE;
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
	public String getStoreVersion() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__STORE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreVersion(String newStoreVersion) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__STORE_VERSION, newStoreVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModuleURI() {
		return (Object)eGet(CmPackage.Literals.CONVERSION_MODULE__MODULE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleURI(Object newModuleURI) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__MODULE_URI, newModuleURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParams() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(String newParams) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PARAMS, newParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEvent(String newBeforeConvertationEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT, newBeforeConvertationEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEventPrefix(String newBeforeConvertationEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX, newBeforeConvertationEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEventSuffix(String newBeforeConvertationEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX, newBeforeConvertationEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEvent(String newAfterConvertationEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT, newAfterConvertationEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEventPrefix(String newAfterConvertationEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX, newAfterConvertationEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEventSuffix(String newAfterConvertationEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX, newAfterConvertationEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEvent(String newBeforeFillingEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT, newBeforeFillingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEventPrefix(String newBeforeFillingEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX, newBeforeFillingEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEventSuffix(String newBeforeFillingEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX, newBeforeFillingEventSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmDataRule> getDataRules() {
		return (EList<CmDataRule>)eGet(CmPackage.Literals.CONVERSION_MODULE__DATA_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmObjectRule> getObjectRules() {
		return (EList<CmObjectRule>)eGet(CmPackage.Literals.CONVERSION_MODULE__OBJECT_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmPredefined> getPredefineds() {
		return (EList<CmPredefined>)eGet(CmPackage.Literals.CONVERSION_MODULE__PREDEFINEDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmAlgorithm> getAlgorithms() {
		return (EList<CmAlgorithm>)eGet(CmPackage.Literals.CONVERSION_MODULE__ALGORITHMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEventText() {
		String _beforeConvertationEventPrefix = this.getBeforeConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeConvertationEventPrefix + _lineSeparator);
		String _beforeConvertationEvent = this.getBeforeConvertationEvent();
		String _plus_1 = (_plus + _beforeConvertationEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeConvertationEventSuffix = this.getBeforeConvertationEventSuffix();
		String result = (_plus_2 + _beforeConvertationEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEventText() {
		String _afterConvertationEventPrefix = this.getAfterConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_afterConvertationEventPrefix + _lineSeparator);
		String _afterConvertationEvent = this.getAfterConvertationEvent();
		String _plus_1 = (_plus + _afterConvertationEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _afterConvertationEventSuffix = this.getAfterConvertationEventSuffix();
		String result = (_plus_2 + _afterConvertationEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEventText() {
		String _beforeFillingEventPrefix = this.getBeforeFillingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeFillingEventPrefix + _lineSeparator);
		String _beforeFillingEvent = this.getBeforeFillingEvent();
		String _plus_1 = (_plus + _beforeFillingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeFillingEventSuffix = this.getBeforeFillingEventSuffix();
		String result = (_plus_2 + _beforeFillingEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmDataRule getDataRule(final String ruleName) {
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			String _name = dataRule.getName();
			boolean _equals = Objects.equal(ruleName, _name);
			if (_equals) {
				return dataRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getSendingDataRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forSending = dataRule.getForSending();
			if ((_forSending).booleanValue()) {
				result.add(dataRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getReceivingDataRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forReceiving = dataRule.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				result.add(dataRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule getObjectRule(final String ruleName) {
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			String _name = objectRule.getName();
			boolean _equals = Objects.equal(ruleName, _name);
			if (_equals) {
				return objectRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getSendingObjectRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			Boolean _forSending = objectRule.getForSending();
			if ((_forSending).booleanValue()) {
				result.add(objectRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getReceivingObjectRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			Boolean _forReceiving = objectRule.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				result.add(objectRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm getAlgorithm(final String algorithmName) {
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			String _name = algorithm.getName();
			boolean _equals = Objects.equal(algorithmName, _name);
			if (_equals) {
				return algorithm;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllAlgorithmsText(final String algorithmName) {
		String result = "";
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			String _name = algorithm.getName();
			boolean _notEquals = (!Objects.equal(algorithmName, _name));
			if (_notEquals) {
				String _result = result;
				String _algorithmText = algorithm.getAlgorithmText();
				String _lineSeparator = System.lineSeparator();
				String _plus = (_algorithmText + _lineSeparator);
				result = (_result + _plus);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleTextV2() {
		String result = "";
		String _result = result;
		result = (_result + "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C \u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B\u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438");
		String _result_1 = result;
		String _lineSeparator = System.lineSeparator();
		String _lineSeparator_1 = System.lineSeparator();
		String _plus = (_lineSeparator + _lineSeparator_1);
		result = (_result_1 + _plus);
		String _result_2 = result;
		String _beforeConvertationEventText = this.getBeforeConvertationEventText();
		result = (_result_2 + _beforeConvertationEventText);
		String _result_3 = result;
		String _lineSeparator_2 = System.lineSeparator();
		String _lineSeparator_3 = System.lineSeparator();
		String _plus_1 = (_lineSeparator_2 + _lineSeparator_3);
		result = (_result_3 + _plus_1);
		String _result_4 = result;
		String _afterConvertationEventText = this.getAfterConvertationEventText();
		result = (_result_4 + _afterConvertationEventText);
		String _result_5 = result;
		String _lineSeparator_4 = System.lineSeparator();
		String _lineSeparator_5 = System.lineSeparator();
		String _plus_2 = (_lineSeparator_4 + _lineSeparator_5);
		result = (_result_5 + _plus_2);
		String _result_6 = result;
		String _beforeFillingEventText = this.getBeforeFillingEventText();
		result = (_result_6 + _beforeFillingEventText);
		String _result_7 = result;
		String _lineSeparator_6 = System.lineSeparator();
		String _lineSeparator_7 = System.lineSeparator();
		String _plus_3 = (_lineSeparator_6 + _lineSeparator_7);
		result = (_result_7 + _plus_3);
		String text = "// \u0412\u043E\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u0442 \u0432\u0435\u0440\u0441\u0438\u044E \u0444\u043E\u0440\u043C\u0430\u0442\u0430 \u043C\u0435\u043D\u0435\u0434\u0436\u0435\u0440\u0430 \u043E\u0431\u043C\u0435\u043D\u0430.\r\n// \u0412\u043E\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u043C\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435:\r\n//  \u0427\u0438\u0441\u043B\u043E - \u043D\u043E\u043C\u0435\u0440 \u0432\u0435\u0440\u0441\u0438\u0438.\r\n\u0424\u0443\u043D\u043A\u0446\u0438\u044F \u0412\u0435\u0440\u0441\u0438\u044F\u0424\u043E\u0440\u043C\u0430\u0442\u0430\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440\u0430\u041E\u0431\u043C\u0435\u043D\u0430() \u042D\u043A\u0441\u043F\u043E\u0440\u0442\r\n\t\u0412\u043E\u0437\u0432\u0440\u0430\u0442 &\u0412\u0435\u0440\u0441\u0438\u044F\u0424\u043E\u0440\u043C\u0430\u0442\u0430\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440\u0430\u041E\u0431\u043C\u0435\u043D\u0430;\r\n\u041A\u043E\u043D\u0435\u0446\u0424\u0443\u043D\u043A\u0446\u0438\u0438".replace("&\u0412\u0435\u0440\u0441\u0438\u044F\u0424\u043E\u0440\u043C\u0430\u0442\u0430\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440\u0430\u041E\u0431\u043C\u0435\u043D\u0430", this.getStoreVersion());
		String _result_8 = result;
		result = (_result_8 + text);
		String _result_9 = result;
		String _lineSeparator_8 = System.lineSeparator();
		String _lineSeparator_9 = System.lineSeparator();
		String _plus_4 = (_lineSeparator_8 + _lineSeparator_9);
		result = (_result_9 + _plus_4);
		String _result_10 = result;
		result = (_result_10 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
		String _result_11 = result;
		String _lineSeparator_10 = System.lineSeparator();
		String _lineSeparator_11 = System.lineSeparator();
		String _plus_5 = (_lineSeparator_10 + _lineSeparator_11);
		result = (_result_11 + _plus_5);
		String _result_12 = result;
		result = (_result_12 + "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C \u041F\u041E\u0414");
		String _result_13 = result;
		String _lineSeparator_12 = System.lineSeparator();
		String _lineSeparator_13 = System.lineSeparator();
		String _plus_6 = (_lineSeparator_12 + _lineSeparator_13);
		result = (_result_13 + _plus_6);
		String dataRulesDeclarationText = "";
		String _dataRulesDeclarationText = dataRulesDeclarationText;
		String _lineSeparator_14 = System.lineSeparator();
		String _plus_7 = ("\t\u0415\u0441\u043B\u0438 \u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041E\u0431\u043C\u0435\u043D\u0430 = \"\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430\" \u0422\u043E\u0433\u0434\u0430" + _lineSeparator_14);
		dataRulesDeclarationText = (_dataRulesDeclarationText + _plus_7);
		String _dataRulesDeclarationText_1 = dataRulesDeclarationText;
		String _lineSeparator_15 = System.lineSeparator();
		String _plus_8 = ("\t\t\u0415\u0441\u043B\u0438 \u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445.\u041A\u043E\u043B\u043E\u043D\u043A\u0438.\u041D\u0430\u0439\u0442\u0438(\"\u041E\u0447\u0438\u0441\u0442\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\") = \u041D\u0435\u043E\u043F\u0440\u0435\u0434\u0435\u043B\u0435\u043D\u043E \u0422\u043E\u0433\u0434\u0430" + _lineSeparator_15);
		dataRulesDeclarationText = (_dataRulesDeclarationText_1 + _plus_8);
		String _dataRulesDeclarationText_2 = dataRulesDeclarationText;
		String _lineSeparator_16 = System.lineSeparator();
		String _plus_9 = ("\t\t\t\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445.\u041A\u043E\u043B\u043E\u043D\u043A\u0438.\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C(\"\u041E\u0447\u0438\u0441\u0442\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\");" + _lineSeparator_16);
		dataRulesDeclarationText = (_dataRulesDeclarationText_2 + _plus_9);
		String _dataRulesDeclarationText_3 = dataRulesDeclarationText;
		String _lineSeparator_17 = System.lineSeparator();
		String _plus_10 = ("\t\t\u041A\u043E\u043D\u0435\u0446\u0415\u0441\u043B\u0438;" + _lineSeparator_17);
		dataRulesDeclarationText = (_dataRulesDeclarationText_3 + _plus_10);
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forSending = dataRule.getForSending();
			if ((_forSending).booleanValue()) {
				String _dataRulesDeclarationText_4 = dataRulesDeclarationText;
				String _name = dataRule.getName();
				String _plus_11 = ("\t\t\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C\u041F\u041E\u0414_" + _name);
				String _plus_12 = (_plus_11 + "(\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445);");
				String _lineSeparator_18 = System.lineSeparator();
				String _plus_13 = (_plus_12 + _lineSeparator_18);
				dataRulesDeclarationText = (_dataRulesDeclarationText_4 + _plus_13);
			}
		}
		String _dataRulesDeclarationText_5 = dataRulesDeclarationText;
		String _lineSeparator_19 = System.lineSeparator();
		String _plus_14 = ("\t\u0418\u043D\u0430\u0447\u0435\u0415\u0441\u043B\u0438 \u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041E\u0431\u043C\u0435\u043D\u0430 = \"\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435\" \u0422\u043E\u0433\u0434\u0430" + _lineSeparator_19);
		dataRulesDeclarationText = (_dataRulesDeclarationText_5 + _plus_14);
		EList<CmDataRule> _dataRules_1 = this.getDataRules();
		for (final CmDataRule dataRule_1 : _dataRules_1) {
			Boolean _forReceiving = dataRule_1.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				String _dataRulesDeclarationText_6 = dataRulesDeclarationText;
				String _name_1 = dataRule_1.getName();
				String _plus_15 = ("\t\t\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C\u041F\u041E\u0414_" + _name_1);
				String _plus_16 = (_plus_15 + "(\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445);");
				String _lineSeparator_20 = System.lineSeparator();
				String _plus_17 = (_plus_16 + _lineSeparator_20);
				dataRulesDeclarationText = (_dataRulesDeclarationText_6 + _plus_17);
			}
		}
		String _dataRulesDeclarationText_7 = dataRulesDeclarationText;
		dataRulesDeclarationText = (_dataRulesDeclarationText_7 + "\t\u041A\u043E\u043D\u0435\u0446\u0415\u0441\u043B\u0438;");
		text = "// \u0417\u0430\u043F\u043E\u043B\u043D\u044F\u0435\u0442 \u0442\u0430\u0431\u043B\u0438\u0446\u0443 \u043F\u0440\u0430\u0432\u0438\u043B \u043E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438 \u0434\u0430\u043D\u043D\u044B\u0445.\r\n//\r\n// \u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u044B:\r\n//  \u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041E\u0431\u043C\u0435\u043D\u0430 - \u0441\u0442\u0440\u043E\u043A\u0430 (\"\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430\" \u043B\u0438\u0431\u043E \"\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435\").\r\n//  \u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445 - \u0442\u0430\u0431\u043B\u0438\u0446\u0430 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0439, \u0432 \u043A\u043E\u0442\u043E\u0440\u0443\u044E \u0434\u043E\u0431\u0430\u0432\u043B\u044F\u044E\u0442\u0441\u044F \u043F\u0440\u0430\u0432\u0438\u043B\u0430. \r\n\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u0417\u0430\u043F\u043E\u043B\u043D\u0438\u0442\u044C\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445(\u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041E\u0431\u043C\u0435\u043D\u0430, \u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445) \u042D\u043A\u0441\u043F\u043E\u0440\u0442\r\n&\u0422\u0435\u043B\u043E\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B\r\n\u041A\u043E\u043D\u0435\u0446\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B".replace("&\u0422\u0435\u043B\u043E\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B", dataRulesDeclarationText);
		String _result_14 = result;
		result = (_result_14 + text);
		String _result_15 = result;
		String _lineSeparator_21 = System.lineSeparator();
		String _lineSeparator_22 = System.lineSeparator();
		String _plus_18 = (_lineSeparator_21 + _lineSeparator_22);
		result = (_result_15 + _plus_18);
		String _result_16 = result;
		result = (_result_16 + "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C \u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430");
		String _result_17 = result;
		String _lineSeparator_23 = System.lineSeparator();
		String _lineSeparator_24 = System.lineSeparator();
		String _plus_19 = (_lineSeparator_23 + _lineSeparator_24);
		result = (_result_17 + _plus_19);
		EList<CmDataRule> _dataRules_2 = this.getDataRules();
		for (final CmDataRule dataRule_2 : _dataRules_2) {
			Boolean _forSending_1 = dataRule_2.getForSending();
			if ((_forSending_1).booleanValue()) {
				String objectRulesText = "";
				EList<CmObjectRule> _objectRules = dataRule_2.getObjectRules();
				for (final CmObjectRule objectRule : _objectRules) {
					String _objectRulesText = objectRulesText;
					String _lineSeparator_25 = System.lineSeparator();
					String _plus_20 = (_lineSeparator_25 + "\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u0443\u0435\u043C\u044B\u0435\u041F\u041A\u041E.\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C(\"");
					String _name_2 = objectRule.getName();
					String _plus_21 = (_plus_20 + _name_2);
					String _plus_22 = (_plus_21 + "\");");
					objectRulesText = (_objectRulesText + _plus_22);
				}
				String dataRuleEventsText = "";
				int _length = dataRule_2.getOnProcessingEvent().length();
				boolean _notEquals = (_length != 0);
				if (_notEquals) {
					String _dataRuleEventsText = dataRuleEventsText;
					String _lineSeparator_26 = System.lineSeparator();
					String _lineSeparator_27 = System.lineSeparator();
					String _plus_23 = (_lineSeparator_26 + _lineSeparator_27);
					String _onProcessingEventText = dataRule_2.getOnProcessingEventText();
					String _plus_24 = (_plus_23 + _onProcessingEventText);
					dataRuleEventsText = (_dataRuleEventsText + _plus_24);
				}
				int _length_1 = dataRule_2.getDataSelectionEvent().length();
				boolean _notEquals_1 = (_length_1 != 0);
				if (_notEquals_1) {
					String _dataRuleEventsText_1 = dataRuleEventsText;
					String _lineSeparator_28 = System.lineSeparator();
					String _lineSeparator_29 = System.lineSeparator();
					String _plus_25 = (_lineSeparator_28 + _lineSeparator_29);
					String _dataSelectionEventText = dataRule_2.getDataSelectionEventText();
					String _plus_26 = (_plus_25 + _dataSelectionEventText);
					dataRuleEventsText = (_dataRuleEventsText_1 + _plus_26);
				}
				String _result_18 = result;
				String _replaceAll = "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C &\u0418\u043C\u044F\u041F\u041E\u0414".replaceAll("&\u0418\u043C\u044F\u041F\u041E\u0414", dataRule_2.getName());
				result = (_result_18 + _replaceAll);
				String _result_19 = result;
				String _lineSeparator_30 = System.lineSeparator();
				String _lineSeparator_31 = System.lineSeparator();
				String _plus_27 = (_lineSeparator_30 + _lineSeparator_31);
				result = (_result_19 + _plus_27);
				text = "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C\u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414(\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445)\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\t\t\t\t\t\t\t= \u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445.\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C();\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0418\u043C\u044F\t\t\t\t\t\t= \"&\u0418\u043C\u044F\u041F\u041E\u0414\";\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435\t= &\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435;\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\t\t\t\t= \"&\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\";\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\t\t\t\t= \"&\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\";\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041E\u0447\u0438\u0441\u0442\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\t\t\t\t= &\u041E\u0447\u0438\u0441\u0442\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445;\r\n&\u0417\u0430\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435\u041C\u0430\u0441\u0441\u0438\u0432\u0430\u041F\u0440\u0430\u0432\u0438\u043B\r\n\u041A\u043E\u043D\u0435\u0446\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B".replaceAll("&\u0418\u043C\u044F\u041F\u041E\u0414", dataRule_2.getName()).replace("&\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435", dataRule_2.getConfigurationObjectName()).replace("\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435\t= ;", "\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435\t= \u041D\u0435\u043E\u043F\u0440\u0435\u0434\u0435\u043B\u0435\u043D\u043E;").replace("&\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435", dataRule_2.getOnProcessingEventDeclaration()).replace("\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\t\t\t\t= \"\";", "---").replace("&\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445", dataRule_2.getDataSelectionEventDeclaration()).replace("\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445\t\t\t\t= \"\";", "---").replace("&\u041E\u0447\u0438\u0441\u0442\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445", dataRule_2.getDataCleaningDeclaration()).replace("&\u0417\u0430\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435\u041C\u0430\u0441\u0441\u0438\u0432\u0430\u041F\u0440\u0430\u0432\u0438\u043B", objectRulesText).replaceAll("---\\r\\n|---\\r|---\\n", "");
				String _result_20 = result;
				result = (_result_20 + text);
				String _result_21 = result;
				result = (_result_21 + dataRuleEventsText);
				String _result_22 = result;
				String _lineSeparator_32 = System.lineSeparator();
				String _lineSeparator_33 = System.lineSeparator();
				String _plus_28 = (_lineSeparator_32 + _lineSeparator_33);
				result = (_result_22 + _plus_28);
				String _result_23 = result;
				result = (_result_23 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
				String _result_24 = result;
				String _lineSeparator_34 = System.lineSeparator();
				String _lineSeparator_35 = System.lineSeparator();
				String _plus_29 = (_lineSeparator_34 + _lineSeparator_35);
				result = (_result_24 + _plus_29);
			}
		}
		String _result_25 = result;
		result = (_result_25 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
		String _result_26 = result;
		String _lineSeparator_36 = System.lineSeparator();
		String _lineSeparator_37 = System.lineSeparator();
		String _plus_30 = (_lineSeparator_36 + _lineSeparator_37);
		result = (_result_26 + _plus_30);
		String _result_27 = result;
		result = (_result_27 + "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C \u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435");
		String _result_28 = result;
		String _lineSeparator_38 = System.lineSeparator();
		String _lineSeparator_39 = System.lineSeparator();
		String _plus_31 = (_lineSeparator_38 + _lineSeparator_39);
		result = (_result_28 + _plus_31);
		EList<CmDataRule> _dataRules_3 = this.getDataRules();
		for (final CmDataRule dataRule_3 : _dataRules_3) {
			Boolean _forReceiving_1 = dataRule_3.getForReceiving();
			if ((_forReceiving_1).booleanValue()) {
				String objectRulesText_1 = "";
				EList<CmObjectRule> _objectRules_1 = dataRule_3.getObjectRules();
				for (final CmObjectRule objectRule_1 : _objectRules_1) {
					String _objectRulesText_1 = objectRulesText_1;
					String _lineSeparator_40 = System.lineSeparator();
					String _plus_32 = (_lineSeparator_40 + "\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u0443\u0435\u043C\u044B\u0435\u041F\u041A\u041E.\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C(\"");
					String _name_3 = objectRule_1.getName();
					String _plus_33 = (_plus_32 + _name_3);
					String _plus_34 = (_plus_33 + "\");");
					objectRulesText_1 = (_objectRulesText_1 + _plus_34);
				}
				String dataRuleEventsText_1 = "";
				int _length_2 = dataRule_3.getOnProcessingEvent().length();
				boolean _notEquals_2 = (_length_2 != 0);
				if (_notEquals_2) {
					String _dataRuleEventsText_2 = dataRuleEventsText_1;
					String _lineSeparator_41 = System.lineSeparator();
					String _lineSeparator_42 = System.lineSeparator();
					String _plus_35 = (_lineSeparator_41 + _lineSeparator_42);
					String _onProcessingEventText_1 = dataRule_3.getOnProcessingEventText();
					String _plus_36 = (_plus_35 + _onProcessingEventText_1);
					dataRuleEventsText_1 = (_dataRuleEventsText_2 + _plus_36);
				}
				String _result_29 = result;
				String _replaceAll_1 = "#\u041E\u0431\u043B\u0430\u0441\u0442\u044C &\u0418\u043C\u044F\u041F\u041E\u0414".replaceAll("&\u0418\u043C\u044F\u041F\u041E\u0414", dataRule_3.getName());
				result = (_result_29 + _replaceAll_1);
				String _result_30 = result;
				String _lineSeparator_43 = System.lineSeparator();
				String _lineSeparator_44 = System.lineSeparator();
				String _plus_37 = (_lineSeparator_43 + _lineSeparator_44);
				result = (_result_30 + _plus_37);
				text = "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C\u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414(\u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445)\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\t\t\t\t\t\t= \u041F\u0440\u0430\u0432\u0438\u043B\u0430\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438\u0414\u0430\u043D\u043D\u044B\u0445.\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C();\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u0418\u043C\u044F\t\t\t\t\t= \"&\u0418\u043C\u044F\u041F\u041E\u0414\";\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u0424\u043E\u0440\u043C\u0430\u0442\t= \"&\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u0424\u043E\u0440\u043C\u0430\u0442\";\r\n\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\t\t\t= \"&\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\";\r\n&\u0417\u0430\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435\u041C\u0430\u0441\u0441\u0438\u0432\u0430\u041F\u0440\u0430\u0432\u0438\u043B\r\n\u041A\u043E\u043D\u0435\u0446\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B".replaceAll("&\u0418\u043C\u044F\u041F\u041E\u0414", dataRule_3.getName()).replace("&\u041E\u0431\u044A\u0435\u043A\u0442\u0412\u044B\u0431\u043E\u0440\u043A\u0438\u0424\u043E\u0440\u043C\u0430\u0442", dataRule_3.getFormatObjectName()).replace("&\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435", dataRule_3.getOnProcessingEventDeclaration()).replace("\t\u041F\u0440\u0430\u0432\u0438\u043B\u043E\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0438.\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435\t\t\t= \"\";", "---").replace("&\u0417\u0430\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435\u041C\u0430\u0441\u0441\u0438\u0432\u0430\u041F\u0440\u0430\u0432\u0438\u043B", objectRulesText_1).replaceAll("---\\r\\n|---\\r|---\\n", "");
				String _result_31 = result;
				result = (_result_31 + text);
				String _result_32 = result;
				result = (_result_32 + dataRuleEventsText_1);
				String _result_33 = result;
				String _lineSeparator_45 = System.lineSeparator();
				String _lineSeparator_46 = System.lineSeparator();
				String _plus_38 = (_lineSeparator_45 + _lineSeparator_46);
				result = (_result_33 + _plus_38);
				String _result_34 = result;
				result = (_result_34 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
				String _result_35 = result;
				String _lineSeparator_47 = System.lineSeparator();
				String _lineSeparator_48 = System.lineSeparator();
				String _plus_39 = (_lineSeparator_47 + _lineSeparator_48);
				result = (_result_35 + _plus_39);
			}
		}
		String _result_36 = result;
		result = (_result_36 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
		String _result_37 = result;
		String _lineSeparator_49 = System.lineSeparator();
		String _lineSeparator_50 = System.lineSeparator();
		String _plus_40 = (_lineSeparator_49 + _lineSeparator_50);
		result = (_result_37 + _plus_40);
		String _result_38 = result;
		result = (_result_38 + "#\u041A\u043E\u043D\u0435\u0446\u041E\u0431\u043B\u0430\u0441\u0442\u0438");
		String _result_39 = result;
		String _lineSeparator_51 = System.lineSeparator();
		String _lineSeparator_52 = System.lineSeparator();
		String _plus_41 = (_lineSeparator_51 + _lineSeparator_52);
		result = (_result_39 + _plus_41);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleText() {
		String _storeVersion = this.getStoreVersion();
		boolean _equals = Objects.equal(_storeVersion, "1");
		if (_equals) {
			return this.getModuleTextV2();
		}
		else {
			return this.getModuleTextV2();
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
			case CmPackage.CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT:
				return getBeforeConvertationEventText();
			case CmPackage.CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT:
				return getAfterConvertationEventText();
			case CmPackage.CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT:
				return getBeforeFillingEventText();
			case CmPackage.CONVERSION_MODULE___GET_DATA_RULE__STRING:
				return getDataRule((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_SENDING_DATA_RULES:
				return getSendingDataRules();
			case CmPackage.CONVERSION_MODULE___GET_RECEIVING_DATA_RULES:
				return getReceivingDataRules();
			case CmPackage.CONVERSION_MODULE___GET_OBJECT_RULE__STRING:
				return getObjectRule((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_SENDING_OBJECT_RULES:
				return getSendingObjectRules();
			case CmPackage.CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES:
				return getReceivingObjectRules();
			case CmPackage.CONVERSION_MODULE___GET_ALGORITHM__STRING:
				return getAlgorithm((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING:
				return getAllAlgorithmsText((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_MODULE_TEXT_V2:
				return getModuleTextV2();
			case CmPackage.CONVERSION_MODULE___GET_MODULE_TEXT:
				return getModuleText();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConversionModuleImpl
