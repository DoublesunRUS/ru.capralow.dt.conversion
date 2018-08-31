/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.cpPKO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cp PKO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPKOImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cpPKOImpl extends BmObject implements cpPKO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpPKOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CP_PKO;
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
		return (String)eGet(CmPackage.Literals.CP_PKO__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CP_PKO__NAME, newName);
	}

} //cpPKOImpl
