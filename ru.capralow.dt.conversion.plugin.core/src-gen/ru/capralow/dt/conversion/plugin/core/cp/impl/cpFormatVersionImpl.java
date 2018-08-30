/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;
import ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cp Format Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cpFormatVersionImpl extends BmObject implements cpFormatVersion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpFormatVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpPackage.Literals.CP_FORMAT_VERSION;
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
	public String getVersion() {
		return (String)eGet(CpPackage.Literals.CP_FORMAT_VERSION__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(CpPackage.Literals.CP_FORMAT_VERSION__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return (String)eGet(CpPackage.Literals.CP_FORMAT_VERSION__CONFIGURATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		eSet(CpPackage.Literals.CP_FORMAT_VERSION__CONFIGURATION_NAME, newConfigurationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com._1c.g5.v8.dt.bsl.model.Module getModule() {
		return (com._1c.g5.v8.dt.bsl.model.Module)eGet(CpPackage.Literals.CP_FORMAT_VERSION__MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(com._1c.g5.v8.dt.bsl.model.Module newModule) {
		eSet(CpPackage.Literals.CP_FORMAT_VERSION__MODULE, newModule);
	}

} //cpFormatVersionImpl
