/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.cp.CpConfiguration;
import ru.capralow.dt.conversion.plugin.core.cp.CpConfigurationStatus;
import ru.capralow.dt.conversion.plugin.core.cp.CpExtension;
import ru.capralow.dt.conversion.plugin.core.cp.CpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getAvailableFormatVersions <em>Available Format Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl#getCoreObjects <em>Core Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpConfigurationImpl extends MinimalEObjectImpl.Container implements CpConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpPackage.Literals.CP_CONFIGURATION;
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
		return (Object)eGet(CpPackage.Literals.CP_CONFIGURATION__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CpPackage.Literals.CP_CONFIGURATION__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return (String)eGet(CpPackage.Literals.CP_CONFIGURATION__CONFIGURATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		eSet(CpPackage.Literals.CP_CONFIGURATION__CONFIGURATION_NAME, newConfigurationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreVersion() {
		return (String)eGet(CpPackage.Literals.CP_CONFIGURATION__STORE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreVersion(String newStoreVersion) {
		eSet(CpPackage.Literals.CP_CONFIGURATION__STORE_VERSION, newStoreVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CpExtension> getExtensions() {
		return (EList<CpExtension>)eGet(CpPackage.Literals.CP_CONFIGURATION__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpConfigurationStatus getStatus() {
		return (CpConfigurationStatus)eGet(CpPackage.Literals.CP_CONFIGURATION__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CpConfigurationStatus newStatus) {
		eSet(CpPackage.Literals.CP_CONFIGURATION__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CpFormatVersion> getAvailableFormatVersions() {
		return (EList<CpFormatVersion>)eGet(CpPackage.Literals.CP_CONFIGURATION__AVAILABLE_FORMAT_VERSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Object> getCoreObjects() {
		return (EList<Object>)eGet(CpPackage.Literals.CP_CONFIGURATION__CORE_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersions() {
		final BasicEList<String> result = XcoreCollectionLiterals.<String>newBasicEList();
		EList<CpFormatVersion> _availableFormatVersions = this.getAvailableFormatVersions();
		for (final CpFormatVersion formatVersion : _availableFormatVersions) {
			result.add(formatVersion.getVersion());
		}
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
			case CpPackage.CP_CONFIGURATION___GET_VERSIONS:
				return getVersions();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CpConfigurationImpl
