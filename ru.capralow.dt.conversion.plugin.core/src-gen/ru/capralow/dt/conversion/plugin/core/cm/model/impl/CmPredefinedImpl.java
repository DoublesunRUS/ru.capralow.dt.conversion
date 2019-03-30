/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getConfigurationObjectName <em>Configuration Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getPredefinedMaps <em>Predefined Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedImpl extends MinimalEObjectImpl.Container implements CmPredefined {
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
	protected static final Boolean FOR_SENDING_EDEFAULT = Boolean.FALSE;

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
	protected static final Boolean FOR_RECEIVING_EDEFAULT = Boolean.FALSE;

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
	 * The cached value of the '{@link #getPredefinedMaps() <em>Predefined Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<CmPredefinedMap> predefinedMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmPredefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdObject getConfigurationObject() {
		if (configurationObject != null && configurationObject.eIsProxy()) {
			InternalEObject oldConfigurationObject = (InternalEObject)configurationObject;
			configurationObject = (MdObject)eResolveProxy(oldConfigurationObject);
			if (configurationObject != oldConfigurationObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT, oldConfigurationObject, configurationObject));
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
	public void setConfigurationObject(MdObject newConfigurationObject) {
		MdObject oldConfigurationObject = configurationObject;
		configurationObject = newConfigurationObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT, oldConfigurationObject, configurationObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationObjectName() {
		return configurationObjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObjectName(String newConfigurationObjectName) {
		String oldConfigurationObjectName = configurationObjectName;
		configurationObjectName = newConfigurationObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_NAME, oldConfigurationObjectName, configurationObjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public String getFormatObject() {
		return formatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatObject(String newFormatObject) {
		String oldFormatObject = formatObject;
		formatObject = newFormatObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__FORMAT_OBJECT, oldFormatObject, formatObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForSending() {
		return forSending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForSending(Boolean newForSending) {
		Boolean oldForSending = forSending;
		forSending = newForSending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__FOR_SENDING, oldForSending, forSending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForReceiving() {
		return forReceiving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReceiving(Boolean newForReceiving) {
		Boolean oldForReceiving = forReceiving;
		forReceiving = newForReceiving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED__FOR_RECEIVING, oldForReceiving, forReceiving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmPredefinedMap> getPredefinedMaps() {
		if (predefinedMaps == null) {
			predefinedMaps = new EObjectContainmentEList<CmPredefinedMap>(CmPredefinedMap.class, this, cmPackage.CM_PREDEFINED__PREDEFINED_MAPS);
		}
		return predefinedMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean predefinedMapExists(final String configurationValue, final String formatValue) {
		EList<CmPredefinedMap> _predefinedMaps = this.getPredefinedMaps();
		for (final CmPredefinedMap predefinedMap : _predefinedMaps) {
			if ((configurationValue.equals(predefinedMap.getConfigurationValue()) && formatValue.equals(predefinedMap.getFormatValue()))) {
				return Boolean.valueOf(true);
			}
		}
		return Boolean.valueOf(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String nameString = this.getName();
		boolean _isEmpty = this.getName().isEmpty();
		if (_isEmpty) {
			nameString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String configurationString = this.getConfigurationObjectName();
		boolean _isEmpty_1 = this.getConfigurationObjectName().isEmpty();
		if (_isEmpty_1) {
			configurationString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String formatString = this.getFormatObject();
		boolean _isEmpty_2 = this.getFormatObject().isEmpty();
		if (_isEmpty_2) {
			formatString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String routeString = "<\u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041D\u0435\u0417\u0430\u0434\u0430\u043D\u043E>";
		Boolean _forSending = this.getForSending();
		if ((_forSending).booleanValue()) {
			routeString = "\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430";
		}
		Boolean _forReceiving = this.getForReceiving();
		if ((_forReceiving).booleanValue()) {
			routeString = "\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435";
		}
		if (((this.getForSending()).booleanValue() && (this.getForReceiving()).booleanValue())) {
			routeString = "\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430\u0418\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435";
		}
		return ((((((("name:" + nameString) + " md:") + configurationString) + " xdto:") + formatString) + " ") + routeString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return ((InternalEList<?>)getPredefinedMaps()).basicRemove(otherEnd, msgs);
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
			case cmPackage.CM_PREDEFINED__NAME:
				return getName();
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT:
				if (resolve) return getConfigurationObject();
				return basicGetConfigurationObject();
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_NAME:
				return getConfigurationObjectName();
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_FORMATTED_NAME:
				return getConfigurationObjectFormattedName();
			case cmPackage.CM_PREDEFINED__FORMAT_OBJECT:
				return getFormatObject();
			case cmPackage.CM_PREDEFINED__FOR_SENDING:
				return getForSending();
			case cmPackage.CM_PREDEFINED__FOR_RECEIVING:
				return getForReceiving();
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return getPredefinedMaps();
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
			case cmPackage.CM_PREDEFINED__NAME:
				setName((String)newValue);
				return;
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT:
				setConfigurationObject((MdObject)newValue);
				return;
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_NAME:
				setConfigurationObjectName((String)newValue);
				return;
			case cmPackage.CM_PREDEFINED__FORMAT_OBJECT:
				setFormatObject((String)newValue);
				return;
			case cmPackage.CM_PREDEFINED__FOR_SENDING:
				setForSending((Boolean)newValue);
				return;
			case cmPackage.CM_PREDEFINED__FOR_RECEIVING:
				setForReceiving((Boolean)newValue);
				return;
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				getPredefinedMaps().clear();
				getPredefinedMaps().addAll((Collection<? extends CmPredefinedMap>)newValue);
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
			case cmPackage.CM_PREDEFINED__NAME:
				setName(NAME_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT:
				setConfigurationObject((MdObject)null);
				return;
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_NAME:
				setConfigurationObjectName(CONFIGURATION_OBJECT_NAME_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED__FORMAT_OBJECT:
				setFormatObject(FORMAT_OBJECT_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED__FOR_SENDING:
				setForSending(FOR_SENDING_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED__FOR_RECEIVING:
				setForReceiving(FOR_RECEIVING_EDEFAULT);
				return;
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				getPredefinedMaps().clear();
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
			case cmPackage.CM_PREDEFINED__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT:
				return configurationObject != null;
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_NAME:
				return CONFIGURATION_OBJECT_NAME_EDEFAULT == null ? configurationObjectName != null : !CONFIGURATION_OBJECT_NAME_EDEFAULT.equals(configurationObjectName);
			case cmPackage.CM_PREDEFINED__CONFIGURATION_OBJECT_FORMATTED_NAME:
				return CONFIGURATION_OBJECT_FORMATTED_NAME_EDEFAULT == null ? getConfigurationObjectFormattedName() != null : !CONFIGURATION_OBJECT_FORMATTED_NAME_EDEFAULT.equals(getConfigurationObjectFormattedName());
			case cmPackage.CM_PREDEFINED__FORMAT_OBJECT:
				return FORMAT_OBJECT_EDEFAULT == null ? formatObject != null : !FORMAT_OBJECT_EDEFAULT.equals(formatObject);
			case cmPackage.CM_PREDEFINED__FOR_SENDING:
				return FOR_SENDING_EDEFAULT == null ? forSending != null : !FOR_SENDING_EDEFAULT.equals(forSending);
			case cmPackage.CM_PREDEFINED__FOR_RECEIVING:
				return FOR_RECEIVING_EDEFAULT == null ? forReceiving != null : !FOR_RECEIVING_EDEFAULT.equals(forReceiving);
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return predefinedMaps != null && !predefinedMaps.isEmpty();
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
			case cmPackage.CM_PREDEFINED___PREDEFINED_MAP_EXISTS__STRING_STRING:
				return predefinedMapExists((String)arguments.get(0), (String)arguments.get(1));
			case cmPackage.CM_PREDEFINED___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmPredefinedImpl
