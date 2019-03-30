/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getIsFolder <em>Is Folder</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getValid <em>Valid</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getMdClass <em>Md Class</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getAttributeSendMode <em>Attribute Send Mode</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getObjectSelectionRules <em>Object Selection Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl#getExchangePlanSelectionRules <em>Exchange Plan Selection Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationRuleImpl extends BmObject implements RegistrationRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmPackage.Literals.REGISTRATION_RULE;
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
	public Boolean getIsFolder() {
		return (Boolean)eGet(RmPackage.Literals.REGISTRATION_RULE__IS_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFolder(Boolean newIsFolder) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__IS_FOLDER, newIsFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDisabled() {
		return (Boolean)eGet(RmPackage.Literals.REGISTRATION_RULE__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(Boolean newDisabled) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getValid() {
		return (Boolean)eGet(RmPackage.Literals.REGISTRATION_RULE__VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(Boolean newValid) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__VALID, newValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdObject() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__MD_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdObject(String newMdObject) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__MD_OBJECT, newMdObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__OBJECT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__OBJECT_NAME, newObjectName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdClass() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__MD_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdClass(String newMdClass) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__MD_CLASS, newMdClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeSendMode() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSendMode(String newAttributeSendMode) {
		eSet(RmPackage.Literals.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE, newAttributeSendMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectSelectionRule> getObjectSelectionRules() {
		return (EList<ObjectSelectionRule>)eGet(RmPackage.Literals.REGISTRATION_RULE__OBJECT_SELECTION_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExchangePlanSelectionRule> getExchangePlanSelectionRules() {
		return (EList<ExchangePlanSelectionRule>)eGet(RmPackage.Literals.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES, true);
	}

} //RegistrationRuleImpl
