/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Plan Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanSelectionRuleImpl#getIsFolder <em>Is Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangePlanSelectionRuleImpl extends BmObject implements ExchangePlanSelectionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePlanSelectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmPackage.Literals.EXCHANGE_PLAN_SELECTION_RULE;
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
		return (Boolean)eGet(RmPackage.Literals.EXCHANGE_PLAN_SELECTION_RULE__IS_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFolder(Boolean newIsFolder) {
		eSet(RmPackage.Literals.EXCHANGE_PLAN_SELECTION_RULE__IS_FOLDER, newIsFolder);
	}

} //ExchangePlanSelectionRuleImpl
