/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ep Format Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl#getModule <em>Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl#getXdtoPackage <em>Xdto Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpFormatVersionImpl extends MinimalEObjectImpl.Container implements EpFormatVersion {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String extensionName = EXTENSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected CommonModule module;

	/**
	 * The cached value of the '{@link #getXdtoPackage() <em>Xdto Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdtoPackage()
	 * @generated
	 * @ordered
	 */
	protected XDTOPackage xdtoPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpFormatVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return epPackage.Literals.EP_FORMAT_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_FORMAT_VERSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtensionName() {
		return extensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionName(String newExtensionName) {
		String oldExtensionName = extensionName;
		extensionName = newExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_FORMAT_VERSION__EXTENSION_NAME, oldExtensionName, extensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_FORMAT_VERSION__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonModule getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (CommonModule)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, epPackage.EP_FORMAT_VERSION__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModule basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(CommonModule newModule) {
		CommonModule oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_FORMAT_VERSION__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XDTOPackage getXdtoPackage() {
		if (xdtoPackage != null && xdtoPackage.eIsProxy()) {
			InternalEObject oldXdtoPackage = (InternalEObject)xdtoPackage;
			xdtoPackage = (XDTOPackage)eResolveProxy(oldXdtoPackage);
			if (xdtoPackage != oldXdtoPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE, oldXdtoPackage, xdtoPackage));
			}
		}
		return xdtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDTOPackage basicGetXdtoPackage() {
		return xdtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXdtoPackage(XDTOPackage newXdtoPackage) {
		XDTOPackage oldXdtoPackage = xdtoPackage;
		xdtoPackage = newXdtoPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE, oldXdtoPackage, xdtoPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case epPackage.EP_FORMAT_VERSION__VERSION:
				return getVersion();
			case epPackage.EP_FORMAT_VERSION__EXTENSION_NAME:
				return getExtensionName();
			case epPackage.EP_FORMAT_VERSION__MODULE_NAME:
				return getModuleName();
			case epPackage.EP_FORMAT_VERSION__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE:
				if (resolve) return getXdtoPackage();
				return basicGetXdtoPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case epPackage.EP_FORMAT_VERSION__VERSION:
				setVersion((String)newValue);
				return;
			case epPackage.EP_FORMAT_VERSION__EXTENSION_NAME:
				setExtensionName((String)newValue);
				return;
			case epPackage.EP_FORMAT_VERSION__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case epPackage.EP_FORMAT_VERSION__MODULE:
				setModule((CommonModule)newValue);
				return;
			case epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE:
				setXdtoPackage((XDTOPackage)newValue);
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
			case epPackage.EP_FORMAT_VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case epPackage.EP_FORMAT_VERSION__EXTENSION_NAME:
				setExtensionName(EXTENSION_NAME_EDEFAULT);
				return;
			case epPackage.EP_FORMAT_VERSION__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case epPackage.EP_FORMAT_VERSION__MODULE:
				setModule((CommonModule)null);
				return;
			case epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE:
				setXdtoPackage((XDTOPackage)null);
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
			case epPackage.EP_FORMAT_VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case epPackage.EP_FORMAT_VERSION__EXTENSION_NAME:
				return EXTENSION_NAME_EDEFAULT == null ? extensionName != null : !EXTENSION_NAME_EDEFAULT.equals(extensionName);
			case epPackage.EP_FORMAT_VERSION__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case epPackage.EP_FORMAT_VERSION__MODULE:
				return module != null;
			case epPackage.EP_FORMAT_VERSION__XDTO_PACKAGE:
				return xdtoPackage != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", extensionName: "); //$NON-NLS-1$
		result.append(extensionName);
		result.append(", moduleName: "); //$NON-NLS-1$
		result.append(moduleName);
		result.append(')');
		return result.toString();
	}

} //EpFormatVersionImpl
