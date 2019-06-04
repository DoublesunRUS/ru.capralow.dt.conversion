/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import com.google.common.base.Objects;

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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionModuleImpl extends MinimalEObjectImpl.Container implements ConversionModule {
	/**
	 * The default value of the '{@link #getStoreVersion() <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_VERSION_EDEFAULT = "1"; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CmSubsystem> subsystems;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> params;

	/**
	 * The default value of the '{@link #getBeforeConvertationEvent() <em>Before Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_CONVERTATION_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeConvertationEvent() <em>Before Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEvent()
	 * @generated
	 * @ordered
	 */
	protected String beforeConvertationEvent = BEFORE_CONVERTATION_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeConvertationEventPrefix() <em>Before Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_CONVERTATION_EVENT_PREFIX_EDEFAULT = "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeConvertationEventPrefix() <em>Before Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected String beforeConvertationEventPrefix = BEFORE_CONVERTATION_EVENT_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeConvertationEventSuffix() <em>Before Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_CONVERTATION_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeConvertationEventSuffix() <em>Before Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeConvertationEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String beforeConvertationEventSuffix = BEFORE_CONVERTATION_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterConvertationEvent() <em>After Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_CONVERTATION_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAfterConvertationEvent() <em>After Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEvent()
	 * @generated
	 * @ordered
	 */
	protected String afterConvertationEvent = AFTER_CONVERTATION_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterConvertationEventPrefix() <em>After Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_CONVERTATION_EVENT_PREFIX_EDEFAULT = "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAfterConvertationEventPrefix() <em>After Convertation Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected String afterConvertationEventPrefix = AFTER_CONVERTATION_EVENT_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterConvertationEventSuffix() <em>After Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_CONVERTATION_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAfterConvertationEventSuffix() <em>After Convertation Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterConvertationEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String afterConvertationEventSuffix = AFTER_CONVERTATION_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeFillingEvent() <em>Before Filling Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_FILLING_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeFillingEvent() <em>Before Filling Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEvent()
	 * @generated
	 * @ordered
	 */
	protected String beforeFillingEvent = BEFORE_FILLING_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeFillingEventPrefix() <em>Before Filling Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_FILLING_EVENT_PREFIX_EDEFAULT = "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeFillingEventPrefix() <em>Before Filling Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected String beforeFillingEventPrefix = BEFORE_FILLING_EVENT_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeFillingEventSuffix() <em>Before Filling Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_FILLING_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeFillingEventSuffix() <em>Before Filling Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeFillingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String beforeFillingEventSuffix = BEFORE_FILLING_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataRules() <em>Data Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CmDataRule> dataRules;

	/**
	 * The cached value of the '{@link #getObjectRules() <em>Object Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CmObjectRule> objectRules;

	/**
	 * The cached value of the '{@link #getPredefineds() <em>Predefineds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefineds()
	 * @generated
	 * @ordered
	 */
	protected EList<CmPredefined> predefineds;

	/**
	 * The cached value of the '{@link #getAlgorithms() <em>Algorithms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<CmAlgorithm> algorithms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CONVERSION_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__STORE_VERSION, oldStoreVersion, storeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmSubsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectContainmentEList<CmSubsystem>(CmSubsystem.class, this, cmPackage.CONVERSION_MODULE__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParams() {
		if (params == null) {
			params = new EDataTypeEList<String>(String.class, this, cmPackage.CONVERSION_MODULE__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeConvertationEvent() {
		return beforeConvertationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeConvertationEvent(String newBeforeConvertationEvent) {
		String oldBeforeConvertationEvent = beforeConvertationEvent;
		beforeConvertationEvent = newBeforeConvertationEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT, oldBeforeConvertationEvent, beforeConvertationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeConvertationEventPrefix() {
		return beforeConvertationEventPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeConvertationEventPrefix(String newBeforeConvertationEventPrefix) {
		String oldBeforeConvertationEventPrefix = beforeConvertationEventPrefix;
		beforeConvertationEventPrefix = newBeforeConvertationEventPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX, oldBeforeConvertationEventPrefix, beforeConvertationEventPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeConvertationEventSuffix() {
		return beforeConvertationEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeConvertationEventSuffix(String newBeforeConvertationEventSuffix) {
		String oldBeforeConvertationEventSuffix = beforeConvertationEventSuffix;
		beforeConvertationEventSuffix = newBeforeConvertationEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX, oldBeforeConvertationEventSuffix, beforeConvertationEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAfterConvertationEvent() {
		return afterConvertationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfterConvertationEvent(String newAfterConvertationEvent) {
		String oldAfterConvertationEvent = afterConvertationEvent;
		afterConvertationEvent = newAfterConvertationEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT, oldAfterConvertationEvent, afterConvertationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAfterConvertationEventPrefix() {
		return afterConvertationEventPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfterConvertationEventPrefix(String newAfterConvertationEventPrefix) {
		String oldAfterConvertationEventPrefix = afterConvertationEventPrefix;
		afterConvertationEventPrefix = newAfterConvertationEventPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX, oldAfterConvertationEventPrefix, afterConvertationEventPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAfterConvertationEventSuffix() {
		return afterConvertationEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfterConvertationEventSuffix(String newAfterConvertationEventSuffix) {
		String oldAfterConvertationEventSuffix = afterConvertationEventSuffix;
		afterConvertationEventSuffix = newAfterConvertationEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX, oldAfterConvertationEventSuffix, afterConvertationEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeFillingEvent() {
		return beforeFillingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeFillingEvent(String newBeforeFillingEvent) {
		String oldBeforeFillingEvent = beforeFillingEvent;
		beforeFillingEvent = newBeforeFillingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT, oldBeforeFillingEvent, beforeFillingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeFillingEventPrefix() {
		return beforeFillingEventPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeFillingEventPrefix(String newBeforeFillingEventPrefix) {
		String oldBeforeFillingEventPrefix = beforeFillingEventPrefix;
		beforeFillingEventPrefix = newBeforeFillingEventPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX, oldBeforeFillingEventPrefix, beforeFillingEventPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeFillingEventSuffix() {
		return beforeFillingEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeFillingEventSuffix(String newBeforeFillingEventSuffix) {
		String oldBeforeFillingEventSuffix = beforeFillingEventSuffix;
		beforeFillingEventSuffix = newBeforeFillingEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX, oldBeforeFillingEventSuffix, beforeFillingEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmDataRule> getDataRules() {
		if (dataRules == null) {
			dataRules = new EObjectContainmentEList<CmDataRule>(CmDataRule.class, this, cmPackage.CONVERSION_MODULE__DATA_RULES);
		}
		return dataRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmObjectRule> getObjectRules() {
		if (objectRules == null) {
			objectRules = new EObjectContainmentEList<CmObjectRule>(CmObjectRule.class, this, cmPackage.CONVERSION_MODULE__OBJECT_RULES);
		}
		return objectRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmPredefined> getPredefineds() {
		if (predefineds == null) {
			predefineds = new EObjectContainmentEList<CmPredefined>(CmPredefined.class, this, cmPackage.CONVERSION_MODULE__PREDEFINEDS);
		}
		return predefineds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmAlgorithm> getAlgorithms() {
		if (algorithms == null) {
			algorithms = new EObjectContainmentEList<CmAlgorithm>(CmAlgorithm.class, this, cmPackage.CONVERSION_MODULE__ALGORITHMS);
		}
		return algorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmSubsystem getSubsystem(final Subsystem mdSubsystem) {
		EList<CmSubsystem> _subsystems = this.getSubsystems();
		for (final CmSubsystem cmSubsystem : _subsystems) {
			boolean _equals = mdSubsystem.equals(cmSubsystem.getSubsystem());
			if (_equals) {
				return cmSubsystem;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeConvertationEventText() {
		String beforeConvertationEventText = this.getBeforeConvertationEvent();
		boolean _isEmpty = this.getBeforeConvertationEvent().isEmpty();
		if (_isEmpty) {
			beforeConvertationEventText = "\t";
		}
		String _beforeConvertationEventPrefix = this.getBeforeConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeConvertationEventPrefix + _lineSeparator);
		String _plus_1 = (_plus + beforeConvertationEventText);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeConvertationEventSuffix = this.getBeforeConvertationEventSuffix();
		String _plus_3 = (_plus_2 + _beforeConvertationEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAfterConvertationEventText() {
		String afterConvertationEventText = this.getAfterConvertationEvent();
		boolean _isEmpty = this.getAfterConvertationEvent().isEmpty();
		if (_isEmpty) {
			afterConvertationEventText = "\t";
		}
		String _afterConvertationEventPrefix = this.getAfterConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_afterConvertationEventPrefix + _lineSeparator);
		String _plus_1 = (_plus + afterConvertationEventText);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _afterConvertationEventSuffix = this.getAfterConvertationEventSuffix();
		String _plus_3 = (_plus_2 + _afterConvertationEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeFillingEventText() {
		String beforeFillingEventText = this.getBeforeFillingEvent();
		boolean _isEmpty = this.getBeforeFillingEvent().isEmpty();
		if (_isEmpty) {
			beforeFillingEventText = "\t";
		}
		String _beforeFillingEventPrefix = this.getBeforeFillingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeFillingEventPrefix + _lineSeparator);
		String _plus_1 = (_plus + beforeFillingEventText);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeFillingEventSuffix = this.getBeforeFillingEventSuffix();
		String _plus_3 = (_plus_2 + _beforeFillingEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmDataRule getDataRule(final String ruleName) {
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			boolean _equals = ruleName.equals(dataRule.getName());
			if (_equals) {
				return dataRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmDataRule> getSendingDataRules() {
		final BasicEList<CmDataRule> result = XcoreCollectionLiterals.<CmDataRule>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forSending = dataRule.getForSending();
			if ((_forSending).booleanValue()) {
				result.add(dataRule);
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
	public EList<CmDataRule> getSendingDataRules(final CmSubsystem subsystem) {
		final BasicEList<CmDataRule> result = XcoreCollectionLiterals.<CmDataRule>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			if (((dataRule.getForSending()).booleanValue() && (dataRule.includedInSubsystem(subsystem)).booleanValue())) {
				result.add(dataRule);
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
	public EList<CmDataRule> getReceivingDataRules() {
		final BasicEList<CmDataRule> result = XcoreCollectionLiterals.<CmDataRule>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forReceiving = dataRule.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				result.add(dataRule);
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
	public EList<CmDataRule> getReceivingDataRules(final CmSubsystem subsystem) {
		final BasicEList<CmDataRule> result = XcoreCollectionLiterals.<CmDataRule>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			if (((dataRule.getForReceiving()).booleanValue() && (dataRule.includedInSubsystem(subsystem)).booleanValue())) {
				result.add(dataRule);
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
	public CmObjectRule getObjectRule(final String ruleName) {
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			boolean _equals = ruleName.equals(objectRule.getName());
			if (_equals) {
				return objectRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmObjectRule> getSendingObjectRules() {
		final BasicEList<CmObjectRule> result = XcoreCollectionLiterals.<CmObjectRule>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			Boolean _forSending = objectRule.getForSending();
			if ((_forSending).booleanValue()) {
				result.add(objectRule);
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
	public EList<CmObjectRule> getSendingObjectRules(final CmSubsystem cmSubsystem) {
		final BasicEList<CmObjectRule> result = XcoreCollectionLiterals.<CmObjectRule>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			if (((objectRule.getForSending()).booleanValue() && (objectRule.includedInSubsystem(cmSubsystem)).booleanValue())) {
				result.add(objectRule);
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
	public EList<CmObjectRule> getReceivingObjectRules() {
		final BasicEList<CmObjectRule> result = XcoreCollectionLiterals.<CmObjectRule>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			Boolean _forReceiving = objectRule.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				result.add(objectRule);
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
	public EList<CmObjectRule> getReceivingObjectRules(final CmSubsystem cmSubsystem) {
		final BasicEList<CmObjectRule> result = XcoreCollectionLiterals.<CmObjectRule>newBasicEList();
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			if (((objectRule.getForReceiving()).booleanValue() && (objectRule.includedInSubsystem(cmSubsystem)).booleanValue())) {
				result.add(objectRule);
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
	public CmAlgorithm getAlgorithm(final String algorithmName) {
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			boolean _equals = algorithmName.equals(algorithm.getName());
			if (_equals) {
				return algorithm;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllAlgorithmsText(final String algorithmName) {
		String result = "";
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			if (((!Objects.equal(algorithmName, algorithm.getName())) && (algorithm.getExists()).booleanValue())) {
				String _result = result;
				String _algorithmText = algorithm.getAlgorithmText();
				result = (_result + _algorithmText);
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
			case cmPackage.CONVERSION_MODULE__SUBSYSTEMS:
				return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
			case cmPackage.CONVERSION_MODULE__DATA_RULES:
				return ((InternalEList<?>)getDataRules()).basicRemove(otherEnd, msgs);
			case cmPackage.CONVERSION_MODULE__OBJECT_RULES:
				return ((InternalEList<?>)getObjectRules()).basicRemove(otherEnd, msgs);
			case cmPackage.CONVERSION_MODULE__PREDEFINEDS:
				return ((InternalEList<?>)getPredefineds()).basicRemove(otherEnd, msgs);
			case cmPackage.CONVERSION_MODULE__ALGORITHMS:
				return ((InternalEList<?>)getAlgorithms()).basicRemove(otherEnd, msgs);
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
			case cmPackage.CONVERSION_MODULE__STORE_VERSION:
				return getStoreVersion();
			case cmPackage.CONVERSION_MODULE__SUBSYSTEMS:
				return getSubsystems();
			case cmPackage.CONVERSION_MODULE__PARAMS:
				return getParams();
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT:
				return getBeforeConvertationEvent();
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX:
				return getBeforeConvertationEventPrefix();
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX:
				return getBeforeConvertationEventSuffix();
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT:
				return getAfterConvertationEvent();
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX:
				return getAfterConvertationEventPrefix();
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX:
				return getAfterConvertationEventSuffix();
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT:
				return getBeforeFillingEvent();
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX:
				return getBeforeFillingEventPrefix();
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX:
				return getBeforeFillingEventSuffix();
			case cmPackage.CONVERSION_MODULE__DATA_RULES:
				return getDataRules();
			case cmPackage.CONVERSION_MODULE__OBJECT_RULES:
				return getObjectRules();
			case cmPackage.CONVERSION_MODULE__PREDEFINEDS:
				return getPredefineds();
			case cmPackage.CONVERSION_MODULE__ALGORITHMS:
				return getAlgorithms();
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
			case cmPackage.CONVERSION_MODULE__STORE_VERSION:
				setStoreVersion((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends CmSubsystem>)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends String>)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT:
				setBeforeConvertationEvent((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX:
				setBeforeConvertationEventPrefix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX:
				setBeforeConvertationEventSuffix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT:
				setAfterConvertationEvent((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX:
				setAfterConvertationEventPrefix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX:
				setAfterConvertationEventSuffix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT:
				setBeforeFillingEvent((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX:
				setBeforeFillingEventPrefix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX:
				setBeforeFillingEventSuffix((String)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__DATA_RULES:
				getDataRules().clear();
				getDataRules().addAll((Collection<? extends CmDataRule>)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__OBJECT_RULES:
				getObjectRules().clear();
				getObjectRules().addAll((Collection<? extends CmObjectRule>)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__PREDEFINEDS:
				getPredefineds().clear();
				getPredefineds().addAll((Collection<? extends CmPredefined>)newValue);
				return;
			case cmPackage.CONVERSION_MODULE__ALGORITHMS:
				getAlgorithms().clear();
				getAlgorithms().addAll((Collection<? extends CmAlgorithm>)newValue);
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
			case cmPackage.CONVERSION_MODULE__STORE_VERSION:
				setStoreVersion(STORE_VERSION_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__SUBSYSTEMS:
				getSubsystems().clear();
				return;
			case cmPackage.CONVERSION_MODULE__PARAMS:
				getParams().clear();
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT:
				setBeforeConvertationEvent(BEFORE_CONVERTATION_EVENT_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX:
				setBeforeConvertationEventPrefix(BEFORE_CONVERTATION_EVENT_PREFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX:
				setBeforeConvertationEventSuffix(BEFORE_CONVERTATION_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT:
				setAfterConvertationEvent(AFTER_CONVERTATION_EVENT_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX:
				setAfterConvertationEventPrefix(AFTER_CONVERTATION_EVENT_PREFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX:
				setAfterConvertationEventSuffix(AFTER_CONVERTATION_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT:
				setBeforeFillingEvent(BEFORE_FILLING_EVENT_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX:
				setBeforeFillingEventPrefix(BEFORE_FILLING_EVENT_PREFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX:
				setBeforeFillingEventSuffix(BEFORE_FILLING_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CONVERSION_MODULE__DATA_RULES:
				getDataRules().clear();
				return;
			case cmPackage.CONVERSION_MODULE__OBJECT_RULES:
				getObjectRules().clear();
				return;
			case cmPackage.CONVERSION_MODULE__PREDEFINEDS:
				getPredefineds().clear();
				return;
			case cmPackage.CONVERSION_MODULE__ALGORITHMS:
				getAlgorithms().clear();
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
			case cmPackage.CONVERSION_MODULE__STORE_VERSION:
				return STORE_VERSION_EDEFAULT == null ? storeVersion != null : !STORE_VERSION_EDEFAULT.equals(storeVersion);
			case cmPackage.CONVERSION_MODULE__SUBSYSTEMS:
				return subsystems != null && !subsystems.isEmpty();
			case cmPackage.CONVERSION_MODULE__PARAMS:
				return params != null && !params.isEmpty();
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT:
				return BEFORE_CONVERTATION_EVENT_EDEFAULT == null ? beforeConvertationEvent != null : !BEFORE_CONVERTATION_EVENT_EDEFAULT.equals(beforeConvertationEvent);
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX:
				return BEFORE_CONVERTATION_EVENT_PREFIX_EDEFAULT == null ? beforeConvertationEventPrefix != null : !BEFORE_CONVERTATION_EVENT_PREFIX_EDEFAULT.equals(beforeConvertationEventPrefix);
			case cmPackage.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX:
				return BEFORE_CONVERTATION_EVENT_SUFFIX_EDEFAULT == null ? beforeConvertationEventSuffix != null : !BEFORE_CONVERTATION_EVENT_SUFFIX_EDEFAULT.equals(beforeConvertationEventSuffix);
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT:
				return AFTER_CONVERTATION_EVENT_EDEFAULT == null ? afterConvertationEvent != null : !AFTER_CONVERTATION_EVENT_EDEFAULT.equals(afterConvertationEvent);
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX:
				return AFTER_CONVERTATION_EVENT_PREFIX_EDEFAULT == null ? afterConvertationEventPrefix != null : !AFTER_CONVERTATION_EVENT_PREFIX_EDEFAULT.equals(afterConvertationEventPrefix);
			case cmPackage.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX:
				return AFTER_CONVERTATION_EVENT_SUFFIX_EDEFAULT == null ? afterConvertationEventSuffix != null : !AFTER_CONVERTATION_EVENT_SUFFIX_EDEFAULT.equals(afterConvertationEventSuffix);
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT:
				return BEFORE_FILLING_EVENT_EDEFAULT == null ? beforeFillingEvent != null : !BEFORE_FILLING_EVENT_EDEFAULT.equals(beforeFillingEvent);
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX:
				return BEFORE_FILLING_EVENT_PREFIX_EDEFAULT == null ? beforeFillingEventPrefix != null : !BEFORE_FILLING_EVENT_PREFIX_EDEFAULT.equals(beforeFillingEventPrefix);
			case cmPackage.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX:
				return BEFORE_FILLING_EVENT_SUFFIX_EDEFAULT == null ? beforeFillingEventSuffix != null : !BEFORE_FILLING_EVENT_SUFFIX_EDEFAULT.equals(beforeFillingEventSuffix);
			case cmPackage.CONVERSION_MODULE__DATA_RULES:
				return dataRules != null && !dataRules.isEmpty();
			case cmPackage.CONVERSION_MODULE__OBJECT_RULES:
				return objectRules != null && !objectRules.isEmpty();
			case cmPackage.CONVERSION_MODULE__PREDEFINEDS:
				return predefineds != null && !predefineds.isEmpty();
			case cmPackage.CONVERSION_MODULE__ALGORITHMS:
				return algorithms != null && !algorithms.isEmpty();
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
			case cmPackage.CONVERSION_MODULE___GET_SUBSYSTEM__SUBSYSTEM:
				return getSubsystem((Subsystem)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT:
				return getBeforeConvertationEventText();
			case cmPackage.CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT:
				return getAfterConvertationEventText();
			case cmPackage.CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT:
				return getBeforeFillingEventText();
			case cmPackage.CONVERSION_MODULE___GET_DATA_RULE__STRING:
				return getDataRule((String)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_SENDING_DATA_RULES:
				return getSendingDataRules();
			case cmPackage.CONVERSION_MODULE___GET_SENDING_DATA_RULES__CMSUBSYSTEM:
				return getSendingDataRules((CmSubsystem)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_RECEIVING_DATA_RULES:
				return getReceivingDataRules();
			case cmPackage.CONVERSION_MODULE___GET_RECEIVING_DATA_RULES__CMSUBSYSTEM:
				return getReceivingDataRules((CmSubsystem)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_OBJECT_RULE__STRING:
				return getObjectRule((String)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_SENDING_OBJECT_RULES:
				return getSendingObjectRules();
			case cmPackage.CONVERSION_MODULE___GET_SENDING_OBJECT_RULES__CMSUBSYSTEM:
				return getSendingObjectRules((CmSubsystem)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES:
				return getReceivingObjectRules();
			case cmPackage.CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES__CMSUBSYSTEM:
				return getReceivingObjectRules((CmSubsystem)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_ALGORITHM__STRING:
				return getAlgorithm((String)arguments.get(0));
			case cmPackage.CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING:
				return getAllAlgorithmsText((String)arguments.get(0));
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
		result.append(" (storeVersion: "); //$NON-NLS-1$
		result.append(storeVersion);
		result.append(", params: "); //$NON-NLS-1$
		result.append(params);
		result.append(", beforeConvertationEvent: "); //$NON-NLS-1$
		result.append(beforeConvertationEvent);
		result.append(", beforeConvertationEventPrefix: "); //$NON-NLS-1$
		result.append(beforeConvertationEventPrefix);
		result.append(", beforeConvertationEventSuffix: "); //$NON-NLS-1$
		result.append(beforeConvertationEventSuffix);
		result.append(", afterConvertationEvent: "); //$NON-NLS-1$
		result.append(afterConvertationEvent);
		result.append(", afterConvertationEventPrefix: "); //$NON-NLS-1$
		result.append(afterConvertationEventPrefix);
		result.append(", afterConvertationEventSuffix: "); //$NON-NLS-1$
		result.append(afterConvertationEventSuffix);
		result.append(", beforeFillingEvent: "); //$NON-NLS-1$
		result.append(beforeFillingEvent);
		result.append(", beforeFillingEventPrefix: "); //$NON-NLS-1$
		result.append(beforeFillingEventPrefix);
		result.append(", beforeFillingEventSuffix: "); //$NON-NLS-1$
		result.append(beforeFillingEventSuffix);
		result.append(')');
		return result.toString();
	}

} //ConversionModuleImpl
