/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAlgorithmImpl extends BmObject implements CmAlgorithm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_ALGORITHM;
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
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CM_ALGORITHM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMethod() {
		return (Object)eGet(CmPackage.Literals.CM_ALGORITHM__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Object newMethod) {
		eSet(CmPackage.Literals.CM_ALGORITHM__METHOD, newMethod);
	}

} //CmAlgorithmImpl
