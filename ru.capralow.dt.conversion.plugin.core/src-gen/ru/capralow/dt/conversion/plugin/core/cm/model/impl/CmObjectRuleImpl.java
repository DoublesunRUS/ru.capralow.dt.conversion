/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Object Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getForGroup <em>For Group</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getAttributeRules <em>Attribute Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnSendingEvent <em>On Sending Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnSendingEventPrefix <em>On Sending Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getBeforeReceivingEvent <em>Before Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getBeforeReceivingEventPrefix <em>Before Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnReceivingEvent <em>On Receiving Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnReceivingEventPrefix <em>On Receiving Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getIdentificationVariant <em>Identification Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getIdentificationFields <em>Identification Fields</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmObjectRuleImpl extends CmObjectImpl implements CmObjectRule {
	/**
	 * The default value of the '{@link #getIsDisabled() <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DISABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDisabled() <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDisabled = IS_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getForGroup() <em>For Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FOR_GROUP_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getForGroup() <em>For Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean forGroup = FOR_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeRules() <em>Attribute Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CmAttributeRule> attributeRules;

	/**
	 * The default value of the '{@link #getOnSendingEvent() <em>On Sending Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSendingEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SENDING_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnSendingEvent() <em>On Sending Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSendingEvent()
	 * @generated
	 * @ordered
	 */
	protected String onSendingEvent = ON_SENDING_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnSendingEventPrefix() <em>On Sending Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSendingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SENDING_EVENT_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnSendingEventSuffix() <em>On Sending Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSendingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SENDING_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnSendingEventSuffix() <em>On Sending Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSendingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String onSendingEventSuffix = ON_SENDING_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeReceivingEvent() <em>Before Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeReceivingEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_RECEIVING_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeReceivingEvent() <em>Before Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeReceivingEvent()
	 * @generated
	 * @ordered
	 */
	protected String beforeReceivingEvent = BEFORE_RECEIVING_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeReceivingEventPrefix() <em>Before Receiving Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeReceivingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_RECEIVING_EVENT_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBeforeReceivingEventSuffix() <em>Before Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeReceivingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_RECEIVING_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBeforeReceivingEventSuffix() <em>Before Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeReceivingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String beforeReceivingEventSuffix = BEFORE_RECEIVING_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnReceivingEvent() <em>On Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReceivingEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_RECEIVING_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnReceivingEvent() <em>On Receiving Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReceivingEvent()
	 * @generated
	 * @ordered
	 */
	protected String onReceivingEvent = ON_RECEIVING_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnReceivingEventPrefix() <em>On Receiving Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReceivingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_RECEIVING_EVENT_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnReceivingEventSuffix() <em>On Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReceivingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_RECEIVING_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnReceivingEventSuffix() <em>On Receiving Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReceivingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String onReceivingEventSuffix = ON_RECEIVING_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAfterReceivingAlgorithm() <em>After Receiving Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterReceivingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CmAlgorithm afterReceivingAlgorithm;

	/**
	 * The default value of the '{@link #getIdentificationVariant() <em>Identification Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationVariant()
	 * @generated
	 * @ordered
	 */
	protected static final CmIdentificationVariant IDENTIFICATION_VARIANT_EDEFAULT = CmIdentificationVariant.UUID;

	/**
	 * The cached value of the '{@link #getIdentificationVariant() <em>Identification Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationVariant()
	 * @generated
	 * @ordered
	 */
	protected CmIdentificationVariant identificationVariant = IDENTIFICATION_VARIANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentificationFields() <em>Identification Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identificationFields;

	/**
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CmSubsystem> subsystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmObjectRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_OBJECT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDisabled() {
		return isDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisabled(Boolean newIsDisabled) {
		Boolean oldIsDisabled = isDisabled;
		isDisabled = newIsDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__IS_DISABLED, oldIsDisabled, isDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForGroup() {
		return forGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForGroup(Boolean newForGroup) {
		Boolean oldForGroup = forGroup;
		forGroup = newForGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__FOR_GROUP, oldForGroup, forGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmAttributeRule> getAttributeRules() {
		if (attributeRules == null) {
			attributeRules = new EObjectContainmentWithInverseEList<CmAttributeRule>(CmAttributeRule.class, this, cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES, cmPackage.CM_ATTRIBUTE_RULE__OWNER);
		}
		return attributeRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEvent() {
		return onSendingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSendingEvent(String newOnSendingEvent) {
		String oldOnSendingEvent = onSendingEvent;
		onSendingEvent = newOnSendingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT, oldOnSendingEvent, onSendingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0435\u0414\u0430\u043D\u043D\u044B\u0445(\u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u0414\u0430\u043D\u043D\u044B\u0435XDTO, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430, \u0421\u0442\u0435\u043A\u0412\u044B\u0433\u0440\u0443\u0437\u043A\u0438)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventSuffix() {
		return onSendingEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSendingEventSuffix(String newOnSendingEventSuffix) {
		String oldOnSendingEventSuffix = onSendingEventSuffix;
		onSendingEventSuffix = newOnSendingEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX, oldOnSendingEventSuffix, onSendingEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEvent() {
		return beforeReceivingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeReceivingEvent(String newBeforeReceivingEvent) {
		String oldBeforeReceivingEvent = beforeReceivingEvent;
		beforeReceivingEvent = newBeforeReceivingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT, oldBeforeReceivingEvent, beforeReceivingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438\u0414\u0430\u043D\u043D\u044B\u0445XDTO(\u0414\u0430\u043D\u043D\u044B\u0435XDTO, \u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0435\u0414\u0430\u043D\u043D\u044B\u0435, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventSuffix() {
		return beforeReceivingEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeReceivingEventSuffix(String newBeforeReceivingEventSuffix) {
		String oldBeforeReceivingEventSuffix = beforeReceivingEventSuffix;
		beforeReceivingEventSuffix = newBeforeReceivingEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX, oldBeforeReceivingEventSuffix, beforeReceivingEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEvent() {
		return onReceivingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReceivingEvent(String newOnReceivingEvent) {
		String oldOnReceivingEvent = onReceivingEvent;
		onReceivingEvent = newOnReceivingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT, oldOnReceivingEvent, onReceivingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventPrefix() {
		return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0435\u0440\u0435\u0434\u0417\u0430\u043F\u0438\u0441\u044C\u044E\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0445\u0414\u0430\u043D\u043D\u044B\u0445(\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0435\u0414\u0430\u043D\u043D\u044B\u0435, \u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u044F\u0421\u0432\u043E\u0439\u0441\u0442\u0432, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventSuffix() {
		return onReceivingEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReceivingEventSuffix(String newOnReceivingEventSuffix) {
		String oldOnReceivingEventSuffix = onReceivingEventSuffix;
		onReceivingEventSuffix = newOnReceivingEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX, oldOnReceivingEventSuffix, onReceivingEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm getAfterReceivingAlgorithm() {
		if (afterReceivingAlgorithm != null && afterReceivingAlgorithm.eIsProxy()) {
			InternalEObject oldAfterReceivingAlgorithm = (InternalEObject)afterReceivingAlgorithm;
			afterReceivingAlgorithm = (CmAlgorithm)eResolveProxy(oldAfterReceivingAlgorithm);
			if (afterReceivingAlgorithm != oldAfterReceivingAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM, oldAfterReceivingAlgorithm, afterReceivingAlgorithm));
			}
		}
		return afterReceivingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm basicGetAfterReceivingAlgorithm() {
		return afterReceivingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterReceivingAlgorithm(CmAlgorithm newAfterReceivingAlgorithm) {
		CmAlgorithm oldAfterReceivingAlgorithm = afterReceivingAlgorithm;
		afterReceivingAlgorithm = newAfterReceivingAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM, oldAfterReceivingAlgorithm, afterReceivingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmIdentificationVariant getIdentificationVariant() {
		return identificationVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationVariant(CmIdentificationVariant newIdentificationVariant) {
		CmIdentificationVariant oldIdentificationVariant = identificationVariant;
		identificationVariant = newIdentificationVariant == null ? IDENTIFICATION_VARIANT_EDEFAULT : newIdentificationVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_OBJECT_RULE__IDENTIFICATION_VARIANT, oldIdentificationVariant, identificationVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentificationFields() {
		if (identificationFields == null) {
			identificationFields = new EDataTypeEList<String>(String.class, this, cmPackage.CM_OBJECT_RULE__IDENTIFICATION_FIELDS);
		}
		return identificationFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmSubsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectResolvingEList<CmSubsystem>(CmSubsystem.class, this, cmPackage.CM_OBJECT_RULE__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForGroupDeclaration() {
		Boolean _forGroup = this.getForGroup();
		if ((_forGroup).booleanValue()) {
			return "\u0418\u0441\u0442\u0438\u043D\u0430";
		}
		else {
			return "\u041B\u043E\u0436\u044C";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventText() {
		String _onSendingEventPrefix = this.getOnSendingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onSendingEventPrefix + _lineSeparator);
		String _onSendingEvent = this.getOnSendingEvent();
		String _plus_1 = (_plus + _onSendingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onSendingEventSuffix = this.getOnSendingEventSuffix();
		String _plus_3 = (_plus_2 + _onSendingEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSendingEventDeclaration() {
		int _length = this.getOnSendingEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0435\u0414\u0430\u043D\u043D\u044B\u0445".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventText() {
		String _beforeReceivingEventPrefix = this.getBeforeReceivingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeReceivingEventPrefix + _lineSeparator);
		String _beforeReceivingEvent = this.getBeforeReceivingEvent();
		String _plus_1 = (_plus + _beforeReceivingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeReceivingEventSuffix = this.getBeforeReceivingEventSuffix();
		String _plus_3 = (_plus_2 + _beforeReceivingEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeReceivingEventDeclaration() {
		int _length = this.getBeforeReceivingEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0440\u0438\u041A\u043E\u043D\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438\u0414\u0430\u043D\u043D\u044B\u0445XDTO".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventText() {
		String _onReceivingEventPrefix = this.getOnReceivingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onReceivingEventPrefix + _lineSeparator);
		String _onReceivingEvent = this.getOnReceivingEvent();
		String _plus_1 = (_plus + _onReceivingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onReceivingEventSuffix = this.getOnReceivingEventSuffix();
		String _plus_3 = (_plus_2 + _onReceivingEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReceivingEventDeclaration() {
		int _length = this.getOnReceivingEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041A\u041E_&\u0418\u043C\u044F\u041F\u041A\u041E_\u041F\u0435\u0440\u0435\u0434\u0417\u0430\u043F\u0438\u0441\u044C\u044E\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u043D\u044B\u0445\u0414\u0430\u043D\u043D\u044B\u0445".replace("&\u0418\u043C\u044F\u041F\u041A\u041E", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterReceivingAlgorithmDeclaration() {
		if (((this.getAfterReceivingAlgorithm() == null) || (this.getAfterReceivingAlgorithm().getAlgorithmText().length() == 0))) {
			return "";
		}
		else {
			return this.getAfterReceivingAlgorithm().getName();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean includedInSubsystem(final CmSubsystem cmSubsystem) {
		if (((cmSubsystem == null) || Objects.equal(cmSubsystem.getSpecialSubsystemType(), CmSpecialSubsystemType.ALL))) {
			return Boolean.valueOf(true);
		}
		EList<CmSubsystem> _subsystems = this.getSubsystems();
		for (final CmSubsystem subsystem : _subsystems) {
			boolean _equals = subsystem.equals(cmSubsystem);
			if (_equals) {
				return Boolean.valueOf(true);
			}
		}
		CmSpecialSubsystemType _specialSubsystemType = cmSubsystem.getSpecialSubsystemType();
		boolean _notEquals = (!Objects.equal(_specialSubsystemType, CmSpecialSubsystemType.EMPTY));
		if (_notEquals) {
			return Boolean.valueOf(false);
		}
		int _size = this.getSubsystems().size();
		boolean _notEquals_1 = (_size != 0);
		if (_notEquals_1) {
			return Boolean.valueOf(false);
		}
		return Boolean.valueOf(true);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeRules()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				return ((InternalEList<?>)getAttributeRules()).basicRemove(otherEnd, msgs);
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
			case cmPackage.CM_OBJECT_RULE__IS_DISABLED:
				return getIsDisabled();
			case cmPackage.CM_OBJECT_RULE__FOR_GROUP:
				return getForGroup();
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				return getAttributeRules();
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT:
				return getOnSendingEvent();
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_PREFIX:
				return getOnSendingEventPrefix();
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX:
				return getOnSendingEventSuffix();
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT:
				return getBeforeReceivingEvent();
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_PREFIX:
				return getBeforeReceivingEventPrefix();
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX:
				return getBeforeReceivingEventSuffix();
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT:
				return getOnReceivingEvent();
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_PREFIX:
				return getOnReceivingEventPrefix();
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX:
				return getOnReceivingEventSuffix();
			case cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM:
				if (resolve) return getAfterReceivingAlgorithm();
				return basicGetAfterReceivingAlgorithm();
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_VARIANT:
				return getIdentificationVariant();
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_FIELDS:
				return getIdentificationFields();
			case cmPackage.CM_OBJECT_RULE__SUBSYSTEMS:
				return getSubsystems();
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
			case cmPackage.CM_OBJECT_RULE__IS_DISABLED:
				setIsDisabled((Boolean)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__FOR_GROUP:
				setForGroup((Boolean)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				getAttributeRules().clear();
				getAttributeRules().addAll((Collection<? extends CmAttributeRule>)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT:
				setOnSendingEvent((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX:
				setOnSendingEventSuffix((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT:
				setBeforeReceivingEvent((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX:
				setBeforeReceivingEventSuffix((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT:
				setOnReceivingEvent((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX:
				setOnReceivingEventSuffix((String)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM:
				setAfterReceivingAlgorithm((CmAlgorithm)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_VARIANT:
				setIdentificationVariant((CmIdentificationVariant)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_FIELDS:
				getIdentificationFields().clear();
				getIdentificationFields().addAll((Collection<? extends String>)newValue);
				return;
			case cmPackage.CM_OBJECT_RULE__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends CmSubsystem>)newValue);
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
			case cmPackage.CM_OBJECT_RULE__IS_DISABLED:
				setIsDisabled(IS_DISABLED_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__FOR_GROUP:
				setForGroup(FOR_GROUP_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				getAttributeRules().clear();
				return;
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT:
				setOnSendingEvent(ON_SENDING_EVENT_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX:
				setOnSendingEventSuffix(ON_SENDING_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT:
				setBeforeReceivingEvent(BEFORE_RECEIVING_EVENT_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX:
				setBeforeReceivingEventSuffix(BEFORE_RECEIVING_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT:
				setOnReceivingEvent(ON_RECEIVING_EVENT_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX:
				setOnReceivingEventSuffix(ON_RECEIVING_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM:
				setAfterReceivingAlgorithm((CmAlgorithm)null);
				return;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_VARIANT:
				setIdentificationVariant(IDENTIFICATION_VARIANT_EDEFAULT);
				return;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_FIELDS:
				getIdentificationFields().clear();
				return;
			case cmPackage.CM_OBJECT_RULE__SUBSYSTEMS:
				getSubsystems().clear();
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
			case cmPackage.CM_OBJECT_RULE__IS_DISABLED:
				return IS_DISABLED_EDEFAULT == null ? isDisabled != null : !IS_DISABLED_EDEFAULT.equals(isDisabled);
			case cmPackage.CM_OBJECT_RULE__FOR_GROUP:
				return FOR_GROUP_EDEFAULT == null ? forGroup != null : !FOR_GROUP_EDEFAULT.equals(forGroup);
			case cmPackage.CM_OBJECT_RULE__ATTRIBUTE_RULES:
				return attributeRules != null && !attributeRules.isEmpty();
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT:
				return ON_SENDING_EVENT_EDEFAULT == null ? onSendingEvent != null : !ON_SENDING_EVENT_EDEFAULT.equals(onSendingEvent);
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_PREFIX:
				return ON_SENDING_EVENT_PREFIX_EDEFAULT == null ? getOnSendingEventPrefix() != null : !ON_SENDING_EVENT_PREFIX_EDEFAULT.equals(getOnSendingEventPrefix());
			case cmPackage.CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX:
				return ON_SENDING_EVENT_SUFFIX_EDEFAULT == null ? onSendingEventSuffix != null : !ON_SENDING_EVENT_SUFFIX_EDEFAULT.equals(onSendingEventSuffix);
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT:
				return BEFORE_RECEIVING_EVENT_EDEFAULT == null ? beforeReceivingEvent != null : !BEFORE_RECEIVING_EVENT_EDEFAULT.equals(beforeReceivingEvent);
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_PREFIX:
				return BEFORE_RECEIVING_EVENT_PREFIX_EDEFAULT == null ? getBeforeReceivingEventPrefix() != null : !BEFORE_RECEIVING_EVENT_PREFIX_EDEFAULT.equals(getBeforeReceivingEventPrefix());
			case cmPackage.CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX:
				return BEFORE_RECEIVING_EVENT_SUFFIX_EDEFAULT == null ? beforeReceivingEventSuffix != null : !BEFORE_RECEIVING_EVENT_SUFFIX_EDEFAULT.equals(beforeReceivingEventSuffix);
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT:
				return ON_RECEIVING_EVENT_EDEFAULT == null ? onReceivingEvent != null : !ON_RECEIVING_EVENT_EDEFAULT.equals(onReceivingEvent);
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_PREFIX:
				return ON_RECEIVING_EVENT_PREFIX_EDEFAULT == null ? getOnReceivingEventPrefix() != null : !ON_RECEIVING_EVENT_PREFIX_EDEFAULT.equals(getOnReceivingEventPrefix());
			case cmPackage.CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX:
				return ON_RECEIVING_EVENT_SUFFIX_EDEFAULT == null ? onReceivingEventSuffix != null : !ON_RECEIVING_EVENT_SUFFIX_EDEFAULT.equals(onReceivingEventSuffix);
			case cmPackage.CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM:
				return afterReceivingAlgorithm != null;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_VARIANT:
				return identificationVariant != IDENTIFICATION_VARIANT_EDEFAULT;
			case cmPackage.CM_OBJECT_RULE__IDENTIFICATION_FIELDS:
				return identificationFields != null && !identificationFields.isEmpty();
			case cmPackage.CM_OBJECT_RULE__SUBSYSTEMS:
				return subsystems != null && !subsystems.isEmpty();
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
			case cmPackage.CM_OBJECT_RULE___GET_FOR_GROUP_DECLARATION:
				return getForGroupDeclaration();
			case cmPackage.CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT:
				return getOnSendingEventText();
			case cmPackage.CM_OBJECT_RULE___GET_ON_SENDING_EVENT_DECLARATION:
				return getOnSendingEventDeclaration();
			case cmPackage.CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT:
				return getBeforeReceivingEventText();
			case cmPackage.CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_DECLARATION:
				return getBeforeReceivingEventDeclaration();
			case cmPackage.CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT:
				return getOnReceivingEventText();
			case cmPackage.CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_DECLARATION:
				return getOnReceivingEventDeclaration();
			case cmPackage.CM_OBJECT_RULE___GET_AFTER_RECEIVING_ALGORITHM_DECLARATION:
				return getAfterReceivingAlgorithmDeclaration();
			case cmPackage.CM_OBJECT_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM:
				return includedInSubsystem((CmSubsystem)arguments.get(0));
			case cmPackage.CM_OBJECT_RULE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmObjectRuleImpl
