/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration;
import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Plan Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl#getAutoRecord <em>Auto Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangePlanContentImpl extends BmObject implements ExchangePlanContent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePlanContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmPackage.Literals.EXCHANGE_PLAN_CONTENT;
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
	public String getMdObject() {
		return (String)eGet(RmPackage.Literals.EXCHANGE_PLAN_CONTENT__MD_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdObject(String newMdObject) {
		eSet(RmPackage.Literals.EXCHANGE_PLAN_CONTENT__MD_OBJECT, newMdObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoRegistration getAutoRecord() {
		return (AutoRegistration)eGet(RmPackage.Literals.EXCHANGE_PLAN_CONTENT__AUTO_RECORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRecord(AutoRegistration newAutoRecord) {
		eSet(RmPackage.Literals.EXCHANGE_PLAN_CONTENT__AUTO_RECORD, newAutoRecord);
	}

} //ExchangePlanContentImpl
