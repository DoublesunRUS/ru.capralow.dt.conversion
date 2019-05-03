/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Data Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getOnProcessingEventPrefix <em>On Processing Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getDataSelectionEventPrefix <em>Data Selection Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmDataRuleImpl extends CmObjectImpl implements CmDataRule {
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
	 * The default value of the '{@link #getSelectionVariant() <em>Selection Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionVariant()
	 * @generated
	 * @ordered
	 */
	protected static final CmSelectionVariant SELECTION_VARIANT_EDEFAULT = CmSelectionVariant.STANDART;

	/**
	 * The cached value of the '{@link #getSelectionVariant() <em>Selection Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionVariant()
	 * @generated
	 * @ordered
	 */
	protected CmSelectionVariant selectionVariant = SELECTION_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnProcessingEvent() <em>On Processing Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProcessingEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PROCESSING_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnProcessingEvent() <em>On Processing Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProcessingEvent()
	 * @generated
	 * @ordered
	 */
	protected String onProcessingEvent = ON_PROCESSING_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnProcessingEventPrefix() <em>On Processing Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProcessingEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PROCESSING_EVENT_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnProcessingEventSuffix() <em>On Processing Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProcessingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PROCESSING_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOnProcessingEventSuffix() <em>On Processing Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProcessingEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String onProcessingEventSuffix = ON_PROCESSING_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSelectionEvent() <em>Data Selection Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSelectionEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SELECTION_EVENT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDataSelectionEvent() <em>Data Selection Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSelectionEvent()
	 * @generated
	 * @ordered
	 */
	protected String dataSelectionEvent = DATA_SELECTION_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSelectionEventPrefix() <em>Data Selection Event Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSelectionEventPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SELECTION_EVENT_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDataSelectionEventSuffix() <em>Data Selection Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSelectionEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SELECTION_EVENT_SUFFIX_EDEFAULT = "\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDataSelectionEventSuffix() <em>Data Selection Event Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSelectionEventSuffix()
	 * @generated
	 * @ordered
	 */
	protected String dataSelectionEventSuffix = DATA_SELECTION_EVENT_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDataCleaning() <em>Is Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DATA_CLEANING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDataCleaning() <em>Is Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataCleaning()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDataCleaning = IS_DATA_CLEANING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectRules() <em>Object Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CmObjectRule> objectRules;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected CmGroup group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmDataRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_DATA_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__IS_DISABLED, oldIsDisabled, isDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSelectionVariant getSelectionVariant() {
		return selectionVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionVariant(CmSelectionVariant newSelectionVariant) {
		CmSelectionVariant oldSelectionVariant = selectionVariant;
		selectionVariant = newSelectionVariant == null ? SELECTION_VARIANT_EDEFAULT : newSelectionVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__SELECTION_VARIANT, oldSelectionVariant, selectionVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEvent() {
		return onProcessingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProcessingEvent(String newOnProcessingEvent) {
		String oldOnProcessingEvent = onProcessingEvent;
		onProcessingEvent = newOnProcessingEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT, oldOnProcessingEvent, onProcessingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventPrefix() {
		Boolean _forSending = this.getForSending();
		if ((_forSending).booleanValue()) {
			return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414_\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435(\u0414\u0430\u043D\u043D\u044B\u0435\u0418\u0411, \u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435\u041F\u041A\u041E, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041E\u0414", this.getName());
		}
		else {
			return "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430 \u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414_\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435(\u0414\u0430\u043D\u043D\u044B\u0435XDTO, \u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u043D\u0438\u0435\u041F\u041A\u041E, \u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041E\u0414", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventSuffix() {
		return onProcessingEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProcessingEventSuffix(String newOnProcessingEventSuffix) {
		String oldOnProcessingEventSuffix = onProcessingEventSuffix;
		onProcessingEventSuffix = newOnProcessingEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX, oldOnProcessingEventSuffix, onProcessingEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEvent() {
		return dataSelectionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSelectionEvent(String newDataSelectionEvent) {
		String oldDataSelectionEvent = dataSelectionEvent;
		dataSelectionEvent = newDataSelectionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT, oldDataSelectionEvent, dataSelectionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventPrefix() {
		return "\u0424\u0443\u043D\u043A\u0446\u0438\u044F \u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414_\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445(\u041A\u043E\u043C\u043F\u043E\u043D\u0435\u043D\u0442\u044B\u041E\u0431\u043C\u0435\u043D\u0430)".replace("&\u0418\u043C\u044F\u041F\u041E\u0414", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventSuffix() {
		return dataSelectionEventSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSelectionEventSuffix(String newDataSelectionEventSuffix) {
		String oldDataSelectionEventSuffix = dataSelectionEventSuffix;
		dataSelectionEventSuffix = newDataSelectionEventSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX, oldDataSelectionEventSuffix, dataSelectionEventSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDataCleaning() {
		return isDataCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataCleaning(Boolean newIsDataCleaning) {
		Boolean oldIsDataCleaning = isDataCleaning;
		isDataCleaning = newIsDataCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__IS_DATA_CLEANING, oldIsDataCleaning, isDataCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmObjectRule> getObjectRules() {
		if (objectRules == null) {
			objectRules = new EObjectResolvingEList<CmObjectRule>(CmObjectRule.class, this, cmPackage.CM_DATA_RULE__OBJECT_RULES);
		}
		return objectRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmSubsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectResolvingEList<CmSubsystem>(CmSubsystem.class, this, cmPackage.CM_DATA_RULE__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (CmGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_DATA_RULE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(CmGroup newGroup) {
		CmGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_DATA_RULE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventText() {
		String _onProcessingEventPrefix = this.getOnProcessingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_onProcessingEventPrefix + _lineSeparator);
		String _onProcessingEvent = this.getOnProcessingEvent();
		String _plus_1 = (_plus + _onProcessingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _onProcessingEventSuffix = this.getOnProcessingEventSuffix();
		String _plus_3 = (_plus_2 + _onProcessingEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEventDeclaration() {
		int _length = this.getOnProcessingEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414_\u041F\u0440\u0438\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u043A\u0435".replace("&\u0418\u043C\u044F\u041F\u041E\u0414", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventText() {
		String _dataSelectionEventPrefix = this.getDataSelectionEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_dataSelectionEventPrefix + _lineSeparator);
		String _dataSelectionEvent = this.getDataSelectionEvent();
		String _plus_1 = (_plus + _dataSelectionEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _dataSelectionEventSuffix = this.getDataSelectionEventSuffix();
		String _plus_3 = (_plus_2 + _dataSelectionEventSuffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEventDeclaration() {
		int _length = this.getDataSelectionEvent().length();
		boolean _equals = (_length == 0);
		if (_equals) {
			return "";
		}
		else {
			return "\u041F\u041E\u0414_&\u0418\u043C\u044F\u041F\u041E\u0414_\u0412\u044B\u0431\u043E\u0440\u043A\u0430\u0414\u0430\u043D\u043D\u044B\u0445".replace("&\u0418\u043C\u044F\u041F\u041E\u0414", this.getName());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataCleaningDeclaration() {
		Boolean _isDataCleaning = this.getIsDataCleaning();
		if ((_isDataCleaning).booleanValue()) {
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
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			Boolean _includedInSubsystem = objectRule.includedInSubsystem(cmSubsystem);
			if ((_includedInSubsystem).booleanValue()) {
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
		EList<CmObjectRule> _objectRules_1 = this.getObjectRules();
		for (final CmObjectRule objectRule_1 : _objectRules_1) {
			int _size_1 = objectRule_1.getSubsystems().size();
			boolean _notEquals_2 = (_size_1 != 0);
			if (_notEquals_2) {
				return Boolean.valueOf(false);
			}
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_DATA_RULE__IS_DISABLED:
				return getIsDisabled();
			case cmPackage.CM_DATA_RULE__SELECTION_VARIANT:
				return getSelectionVariant();
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT:
				return getOnProcessingEvent();
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX:
				return getOnProcessingEventPrefix();
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX:
				return getOnProcessingEventSuffix();
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT:
				return getDataSelectionEvent();
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX:
				return getDataSelectionEventPrefix();
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX:
				return getDataSelectionEventSuffix();
			case cmPackage.CM_DATA_RULE__IS_DATA_CLEANING:
				return getIsDataCleaning();
			case cmPackage.CM_DATA_RULE__OBJECT_RULES:
				return getObjectRules();
			case cmPackage.CM_DATA_RULE__SUBSYSTEMS:
				return getSubsystems();
			case cmPackage.CM_DATA_RULE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case cmPackage.CM_DATA_RULE__IS_DISABLED:
				setIsDisabled((Boolean)newValue);
				return;
			case cmPackage.CM_DATA_RULE__SELECTION_VARIANT:
				setSelectionVariant((CmSelectionVariant)newValue);
				return;
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT:
				setOnProcessingEvent((String)newValue);
				return;
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX:
				setOnProcessingEventSuffix((String)newValue);
				return;
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT:
				setDataSelectionEvent((String)newValue);
				return;
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX:
				setDataSelectionEventSuffix((String)newValue);
				return;
			case cmPackage.CM_DATA_RULE__IS_DATA_CLEANING:
				setIsDataCleaning((Boolean)newValue);
				return;
			case cmPackage.CM_DATA_RULE__OBJECT_RULES:
				getObjectRules().clear();
				getObjectRules().addAll((Collection<? extends CmObjectRule>)newValue);
				return;
			case cmPackage.CM_DATA_RULE__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends CmSubsystem>)newValue);
				return;
			case cmPackage.CM_DATA_RULE__GROUP:
				setGroup((CmGroup)newValue);
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
			case cmPackage.CM_DATA_RULE__IS_DISABLED:
				setIsDisabled(IS_DISABLED_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__SELECTION_VARIANT:
				setSelectionVariant(SELECTION_VARIANT_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT:
				setOnProcessingEvent(ON_PROCESSING_EVENT_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX:
				setOnProcessingEventSuffix(ON_PROCESSING_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT:
				setDataSelectionEvent(DATA_SELECTION_EVENT_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX:
				setDataSelectionEventSuffix(DATA_SELECTION_EVENT_SUFFIX_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__IS_DATA_CLEANING:
				setIsDataCleaning(IS_DATA_CLEANING_EDEFAULT);
				return;
			case cmPackage.CM_DATA_RULE__OBJECT_RULES:
				getObjectRules().clear();
				return;
			case cmPackage.CM_DATA_RULE__SUBSYSTEMS:
				getSubsystems().clear();
				return;
			case cmPackage.CM_DATA_RULE__GROUP:
				setGroup((CmGroup)null);
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
			case cmPackage.CM_DATA_RULE__IS_DISABLED:
				return IS_DISABLED_EDEFAULT == null ? isDisabled != null : !IS_DISABLED_EDEFAULT.equals(isDisabled);
			case cmPackage.CM_DATA_RULE__SELECTION_VARIANT:
				return selectionVariant != SELECTION_VARIANT_EDEFAULT;
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT:
				return ON_PROCESSING_EVENT_EDEFAULT == null ? onProcessingEvent != null : !ON_PROCESSING_EVENT_EDEFAULT.equals(onProcessingEvent);
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX:
				return ON_PROCESSING_EVENT_PREFIX_EDEFAULT == null ? getOnProcessingEventPrefix() != null : !ON_PROCESSING_EVENT_PREFIX_EDEFAULT.equals(getOnProcessingEventPrefix());
			case cmPackage.CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX:
				return ON_PROCESSING_EVENT_SUFFIX_EDEFAULT == null ? onProcessingEventSuffix != null : !ON_PROCESSING_EVENT_SUFFIX_EDEFAULT.equals(onProcessingEventSuffix);
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT:
				return DATA_SELECTION_EVENT_EDEFAULT == null ? dataSelectionEvent != null : !DATA_SELECTION_EVENT_EDEFAULT.equals(dataSelectionEvent);
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX:
				return DATA_SELECTION_EVENT_PREFIX_EDEFAULT == null ? getDataSelectionEventPrefix() != null : !DATA_SELECTION_EVENT_PREFIX_EDEFAULT.equals(getDataSelectionEventPrefix());
			case cmPackage.CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX:
				return DATA_SELECTION_EVENT_SUFFIX_EDEFAULT == null ? dataSelectionEventSuffix != null : !DATA_SELECTION_EVENT_SUFFIX_EDEFAULT.equals(dataSelectionEventSuffix);
			case cmPackage.CM_DATA_RULE__IS_DATA_CLEANING:
				return IS_DATA_CLEANING_EDEFAULT == null ? isDataCleaning != null : !IS_DATA_CLEANING_EDEFAULT.equals(isDataCleaning);
			case cmPackage.CM_DATA_RULE__OBJECT_RULES:
				return objectRules != null && !objectRules.isEmpty();
			case cmPackage.CM_DATA_RULE__SUBSYSTEMS:
				return subsystems != null && !subsystems.isEmpty();
			case cmPackage.CM_DATA_RULE__GROUP:
				return group != null;
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
			case cmPackage.CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT:
				return getOnProcessingEventText();
			case cmPackage.CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION:
				return getOnProcessingEventDeclaration();
			case cmPackage.CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT:
				return getDataSelectionEventText();
			case cmPackage.CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION:
				return getDataSelectionEventDeclaration();
			case cmPackage.CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION:
				return getDataCleaningDeclaration();
			case cmPackage.CM_DATA_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM:
				return includedInSubsystem((CmSubsystem)arguments.get(0));
			case cmPackage.CM_DATA_RULE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmDataRuleImpl
