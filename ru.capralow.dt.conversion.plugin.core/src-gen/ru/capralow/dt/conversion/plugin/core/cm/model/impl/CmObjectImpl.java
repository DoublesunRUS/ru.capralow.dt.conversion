/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmObject;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getConfigurationObjectName <em>Configuration Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl#getForReceiving <em>For Receiving</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmObjectImpl extends MinimalEObjectImpl.Container implements CmObject {
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
	 * The cached value of the '{@link #getConfigurationObject() <em>Configuration Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationObject()
	 * @generated
	 * @ordered
	 */
	protected MdObject configurationObject;

	/**
	 * The default value of the '{@link #getConfigurationObjectName() <em>Configuration Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_OBJECT_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationObjectName() <em>Configuration Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationObjectName()
	 * @generated
	 * @ordered
	 */
	protected String configurationObjectName = CONFIGURATION_OBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationObjectFormattedName() <em>Configuration Object Formatted Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationObjectFormattedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_OBJECT_FORMATTED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormatObject() <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatObject()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_OBJECT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFormatObject() <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatObject()
	 * @generated
	 * @ordered
	 */
	protected String formatObject = FORMAT_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForSending() <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForSending()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FOR_SENDING_EDEFAULT = java.lang.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getForSending() <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForSending()
	 * @generated
	 * @ordered
	 */
	protected Boolean forSending = FOR_SENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getForReceiving() <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForReceiving()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FOR_RECEIVING_EDEFAULT = java.lang.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getForReceiving() <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForReceiving()
	 * @generated
	 * @ordered
	 */
	protected Boolean forReceiving = FOR_RECEIVING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MdObject getConfigurationObject() {
		if (configurationObject != null && configurationObject.eIsProxy()) {
			InternalEObject oldConfigurationObject = (InternalEObject)configurationObject;
			configurationObject = (MdObject)eResolveProxy(oldConfigurationObject);
			if (configurationObject != oldConfigurationObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_OBJECT__CONFIGURATION_OBJECT, oldConfigurationObject, configurationObject));
			}
		}
		return configurationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdObject basicGetConfigurationObject() {
		return configurationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationObject(MdObject newConfigurationObject) {
		MdObject oldConfigurationObject = configurationObject;
		configurationObject = newConfigurationObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__CONFIGURATION_OBJECT, oldConfigurationObject, configurationObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationObjectName() {
		return configurationObjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationObjectName(String newConfigurationObjectName) {
		String oldConfigurationObjectName = configurationObjectName;
		configurationObjectName = newConfigurationObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_NAME, oldConfigurationObjectName, configurationObjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationObjectFormattedName() {
		String result = "";
		boolean _startsWith = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A\u0438");
		if (_startsWith) {
			String _get = this.getConfigurationObjectName().split("[.]")[2];
			String _plus = ("\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A." + _get);
			result = _plus;
		}
		else {
			boolean _startsWith_1 = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u0414\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u044B");
			if (_startsWith_1) {
				String _get_1 = this.getConfigurationObjectName().split("[.]")[2];
				String _plus_1 = ("\u0414\u043E\u043A\u0443\u043C\u0435\u043D\u0442." + _get_1);
				result = _plus_1;
			}
			else {
				boolean _startsWith_2 = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u041F\u0435\u0440\u0435\u0447\u0438\u0441\u043B\u0435\u043D\u0438\u044F");
				if (_startsWith_2) {
					String _get_2 = this.getConfigurationObjectName().split("[.]")[2];
					String _plus_2 = ("\u041F\u0435\u0440\u0435\u0447\u0438\u0441\u043B\u0435\u043D\u0438\u0435." + _get_2);
					result = _plus_2;
				}
				else {
					boolean _startsWith_3 = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u041F\u043B\u0430\u043D\u044B\u0412\u0438\u0434\u043E\u0432\u0425\u0430\u0440\u0430\u043A\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043A");
					if (_startsWith_3) {
						String _get_3 = this.getConfigurationObjectName().split("[.]")[2];
						String _plus_3 = ("\u041F\u043B\u0430\u043D\u0412\u0438\u0434\u043E\u0432\u0425\u0430\u0440\u0430\u043A\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043A." + _get_3);
						result = _plus_3;
					}
					else {
						boolean _startsWith_4 = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u041F\u043B\u0430\u043D\u044B\u0412\u0438\u0434\u043E\u0432\u0420\u0430\u0441\u0447\u0435\u0442\u0430");
						if (_startsWith_4) {
							String _get_4 = this.getConfigurationObjectName().split("[.]")[2];
							String _plus_4 = ("\u041F\u043B\u0430\u043D\u0412\u0438\u0434\u043E\u0432\u0420\u0430\u0441\u0447\u0435\u0442\u0430." + _get_4);
							result = _plus_4;
						}
						else {
							boolean _startsWith_5 = this.getConfigurationObjectName().startsWith("\u041C\u0435\u0442\u0430\u0434\u0430\u043D\u043D\u044B\u0435.\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u044B\u0421\u0432\u0435\u0434\u0435\u043D\u0438\u0439");
							if (_startsWith_5) {
								String _get_5 = this.getConfigurationObjectName().split("[.]")[2];
								String _plus_5 = ("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0421\u0432\u0435\u0434\u0435\u043D\u0438\u0439." + _get_5);
								result = _plus_5;
							}
						}
					}
				}
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
	public String getFormatObject() {
		return formatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatObject(String newFormatObject) {
		String oldFormatObject = formatObject;
		formatObject = newFormatObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__FORMAT_OBJECT, oldFormatObject, formatObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForSending() {
		return forSending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForSending(Boolean newForSending) {
		Boolean oldForSending = forSending;
		forSending = newForSending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__FOR_SENDING, oldForSending, forSending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForReceiving() {
		return forReceiving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForReceiving(Boolean newForReceiving) {
		Boolean oldForReceiving = forReceiving;
		forReceiving = newForReceiving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT__FOR_RECEIVING, oldForReceiving, forReceiving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_OBJECT__NAME:
				return getName();
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT:
				if (resolve) return getConfigurationObject();
				return basicGetConfigurationObject();
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_NAME:
				return getConfigurationObjectName();
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME:
				return getConfigurationObjectFormattedName();
			case cmPackage.CM_OBJECT__FORMAT_OBJECT:
				return getFormatObject();
			case cmPackage.CM_OBJECT__FOR_SENDING:
				return getForSending();
			case cmPackage.CM_OBJECT__FOR_RECEIVING:
				return getForReceiving();
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
			case cmPackage.CM_OBJECT__NAME:
				setName((String)newValue);
				return;
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT:
				setConfigurationObject((MdObject)newValue);
				return;
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_NAME:
				setConfigurationObjectName((String)newValue);
				return;
			case cmPackage.CM_OBJECT__FORMAT_OBJECT:
				setFormatObject((String)newValue);
				return;
			case cmPackage.CM_OBJECT__FOR_SENDING:
				setForSending((Boolean)newValue);
				return;
			case cmPackage.CM_OBJECT__FOR_RECEIVING:
				setForReceiving((Boolean)newValue);
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
			case cmPackage.CM_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT:
				setConfigurationObject((MdObject)null);
				return;
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_NAME:
				setConfigurationObjectName(CONFIGURATION_OBJECT_NAME_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT__FORMAT_OBJECT:
				setFormatObject(FORMAT_OBJECT_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT__FOR_SENDING:
				setForSending(FOR_SENDING_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT__FOR_RECEIVING:
				setForReceiving(FOR_RECEIVING_EDEFAULT);
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
			case cmPackage.CM_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT:
				return configurationObject != null;
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_NAME:
				return CONFIGURATION_OBJECT_NAME_EDEFAULT == null ? configurationObjectName != null : !CONFIGURATION_OBJECT_NAME_EDEFAULT.equals(configurationObjectName);
			case cmPackage.CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME:
				return CONFIGURATION_OBJECT_FORMATTED_NAME_EDEFAULT == null ? getConfigurationObjectFormattedName() != null : !CONFIGURATION_OBJECT_FORMATTED_NAME_EDEFAULT.equals(getConfigurationObjectFormattedName());
			case cmPackage.CM_OBJECT__FORMAT_OBJECT:
				return FORMAT_OBJECT_EDEFAULT == null ? formatObject != null : !FORMAT_OBJECT_EDEFAULT.equals(formatObject);
			case cmPackage.CM_OBJECT__FOR_SENDING:
				return FOR_SENDING_EDEFAULT == null ? forSending != null : !FOR_SENDING_EDEFAULT.equals(forSending);
			case cmPackage.CM_OBJECT__FOR_RECEIVING:
				return FOR_RECEIVING_EDEFAULT == null ? forReceiving != null : !FOR_RECEIVING_EDEFAULT.equals(forReceiving);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", configurationObjectName: "); //$NON-NLS-1$
		result.append(configurationObjectName);
		result.append(", formatObject: "); //$NON-NLS-1$
		result.append(formatObject);
		result.append(", forSending: "); //$NON-NLS-1$
		result.append(forSending);
		result.append(", forReceiving: "); //$NON-NLS-1$
		result.append(forReceiving);
		result.append(')');
		return result.toString();
	}

} //CmObjectImpl
