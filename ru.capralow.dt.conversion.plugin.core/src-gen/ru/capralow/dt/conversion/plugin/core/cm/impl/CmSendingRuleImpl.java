/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sending Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl#getDataRule <em>Data Rule</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl#getObjectRules <em>Object Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmSendingRuleImpl extends BmObject implements CmSendingRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSendingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_SENDING_RULE;
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
	public Object getConfigurationObject() {
		return (Object)eGet(CmPackage.Literals.CM_SENDING_RULE__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CmPackage.Literals.CM_SENDING_RULE__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmDataRule getDataRule() {
		return (CmDataRule)eGet(CmPackage.Literals.CM_SENDING_RULE__DATA_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRule(CmDataRule newDataRule) {
		eSet(CmPackage.Literals.CM_SENDING_RULE__DATA_RULE, newDataRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmObjectRule> getObjectRules() {
		return (EList<CmObjectRule>)eGet(CmPackage.Literals.CM_SENDING_RULE__OBJECT_RULES, true);
	}

} //CmSendingRuleImpl
