/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getFormatVersions <em>Format Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl#getSettingsModules <em>Settings Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeProjectImpl extends MinimalEObjectImpl.Container implements ExchangeProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreVersion() <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStoreVersion() <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreVersion()
	 * @generated
	 * @ordered
	 */
	protected String storeVersion = STORE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<EpExtension> extensions;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EpProjectStatus STATUS_EDEFAULT = EpProjectStatus.NO_CONFIGURATION;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EpProjectStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormatVersions() <em>Format Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<EpFormatVersion> formatVersions;

	/**
	 * The cached value of the '{@link #getSettingsModules() <em>Settings Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingsModules()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonModule> settingsModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return epPackage.Literals.EXCHANGE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EXCHANGE_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStoreVersion() {
		return storeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreVersion(String newStoreVersion) {
		String oldStoreVersion = storeVersion;
		storeVersion = newStoreVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EXCHANGE_PROJECT__STORE_VERSION, oldStoreVersion, storeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<EpExtension>(EpExtension.class, this, epPackage.EXCHANGE_PROJECT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpProjectStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(EpProjectStatus newStatus) {
		EpProjectStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EXCHANGE_PROJECT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpFormatVersion> getFormatVersions() {
		if (formatVersions == null) {
			formatVersions = new EObjectContainmentEList<EpFormatVersion>(EpFormatVersion.class, this, epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS);
		}
		return formatVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommonModule> getSettingsModules() {
		if (settingsModules == null) {
			settingsModules = new EObjectResolvingEList<CommonModule>(CommonModule.class, this, epPackage.EXCHANGE_PROJECT__SETTINGS_MODULES);
		}
		return settingsModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVersions() {
		final BasicEList<String> result = XcoreCollectionLiterals.<String>newBasicEList();
		EList<EpFormatVersion> _formatVersions = this.getFormatVersions();
		for (final EpFormatVersion formatVersion : _formatVersions) {
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
	public EList<EpFormatVersion> getModuleFormatVersions(final CommonModule module) {
		final BasicEList<EpFormatVersion> result = XcoreCollectionLiterals.<EpFormatVersion>newBasicEList();
		EList<EpFormatVersion> _formatVersions = this.getFormatVersions();
		for (final EpFormatVersion formatVersion : _formatVersions) {
			boolean _equals = formatVersion.getModule().equals(module);
			if (_equals) {
				result.add(formatVersion);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommonModule> getFormatModules() {
		final BasicEList<CommonModule> result = XcoreCollectionLiterals.<CommonModule>newBasicEList();
		EList<EpFormatVersion> _formatVersions = this.getFormatVersions();
		for (final EpFormatVersion formatVersion : _formatVersions) {
			boolean _contains = result.contains(formatVersion.getModule());
			boolean _not = (!_contains);
			if (_not) {
				result.add(formatVersion.getModule());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS:
				return ((InternalEList<?>)getFormatVersions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECT__NAME:
				return getName();
			case epPackage.EXCHANGE_PROJECT__STORE_VERSION:
				return getStoreVersion();
			case epPackage.EXCHANGE_PROJECT__EXTENSIONS:
				return getExtensions();
			case epPackage.EXCHANGE_PROJECT__STATUS:
				return getStatus();
			case epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS:
				return getFormatVersions();
			case epPackage.EXCHANGE_PROJECT__SETTINGS_MODULES:
				return getSettingsModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECT__NAME:
				setName((String)newValue);
				return;
			case epPackage.EXCHANGE_PROJECT__STORE_VERSION:
				setStoreVersion((String)newValue);
				return;
			case epPackage.EXCHANGE_PROJECT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends EpExtension>)newValue);
				return;
			case epPackage.EXCHANGE_PROJECT__STATUS:
				setStatus((EpProjectStatus)newValue);
				return;
			case epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS:
				getFormatVersions().clear();
				getFormatVersions().addAll((Collection<? extends EpFormatVersion>)newValue);
				return;
			case epPackage.EXCHANGE_PROJECT__SETTINGS_MODULES:
				getSettingsModules().clear();
				getSettingsModules().addAll((Collection<? extends CommonModule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case epPackage.EXCHANGE_PROJECT__STORE_VERSION:
				setStoreVersion(STORE_VERSION_EDEFAULT);
				return;
			case epPackage.EXCHANGE_PROJECT__EXTENSIONS:
				getExtensions().clear();
				return;
			case epPackage.EXCHANGE_PROJECT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS:
				getFormatVersions().clear();
				return;
			case epPackage.EXCHANGE_PROJECT__SETTINGS_MODULES:
				getSettingsModules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case epPackage.EXCHANGE_PROJECT__STORE_VERSION:
				return STORE_VERSION_EDEFAULT == null ? storeVersion != null : !STORE_VERSION_EDEFAULT.equals(storeVersion);
			case epPackage.EXCHANGE_PROJECT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case epPackage.EXCHANGE_PROJECT__STATUS:
				return status != STATUS_EDEFAULT;
			case epPackage.EXCHANGE_PROJECT__FORMAT_VERSIONS:
				return formatVersions != null && !formatVersions.isEmpty();
			case epPackage.EXCHANGE_PROJECT__SETTINGS_MODULES:
				return settingsModules != null && !settingsModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case epPackage.EXCHANGE_PROJECT___GET_VERSIONS:
				return getVersions();
			case epPackage.EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE:
				return getModuleFormatVersions((CommonModule)arguments.get(0));
			case epPackage.EXCHANGE_PROJECT___GET_FORMAT_MODULES:
				return getFormatModules();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", storeVersion: "); //$NON-NLS-1$
		result.append(storeVersion);
		result.append(", status: "); //$NON-NLS-1$
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ExchangeProjectImpl
