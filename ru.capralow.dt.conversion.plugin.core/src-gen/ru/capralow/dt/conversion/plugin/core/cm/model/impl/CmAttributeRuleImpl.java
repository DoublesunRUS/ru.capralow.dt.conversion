/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getConfigurationTabularSection <em>Configuration Tabular Section</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getConfigurationAttribute <em>Configuration Attribute</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getFormatTabularSection <em>Format Tabular Section</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getFormatAttribute <em>Format Attribute</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getObjectRule <em>Object Rule</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl#getIsCustomRule <em>Is Custom Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAttributeRuleImpl extends MinimalEObjectImpl.Container implements CmAttributeRule {
	/**
	 * The default value of the '{@link #getConfigurationTabularSection() <em>Configuration Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationTabularSection()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_TABULAR_SECTION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationTabularSection() <em>Configuration Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationTabularSection()
	 * @generated
	 * @ordered
	 */
	protected String configurationTabularSection = CONFIGURATION_TABULAR_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationAttribute() <em>Configuration Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_ATTRIBUTE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationAttribute() <em>Configuration Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationAttribute()
	 * @generated
	 * @ordered
	 */
	protected String configurationAttribute = CONFIGURATION_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatTabularSection() <em>Format Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatTabularSection()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_TABULAR_SECTION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFormatTabularSection() <em>Format Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatTabularSection()
	 * @generated
	 * @ordered
	 */
	protected String formatTabularSection = FORMAT_TABULAR_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatAttribute() <em>Format Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_ATTRIBUTE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFormatAttribute() <em>Format Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatAttribute()
	 * @generated
	 * @ordered
	 */
	protected String formatAttribute = FORMAT_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectRule() <em>Object Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRule()
	 * @generated
	 * @ordered
	 */
	protected CmObjectRule objectRule;

	/**
	 * The default value of the '{@link #getIsCustomRule() <em>Is Custom Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCustomRule()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CUSTOM_RULE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCustomRule() <em>Is Custom Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCustomRule()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCustomRule = IS_CUSTOM_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmAttributeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_ATTRIBUTE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationTabularSection() {
		return configurationTabularSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationTabularSection(String newConfigurationTabularSection) {
		String oldConfigurationTabularSection = configurationTabularSection;
		configurationTabularSection = newConfigurationTabularSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION, oldConfigurationTabularSection, configurationTabularSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationAttribute() {
		return configurationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationAttribute(String newConfigurationAttribute) {
		String oldConfigurationAttribute = configurationAttribute;
		configurationAttribute = newConfigurationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE, oldConfigurationAttribute, configurationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatTabularSection() {
		return formatTabularSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatTabularSection(String newFormatTabularSection) {
		String oldFormatTabularSection = formatTabularSection;
		formatTabularSection = newFormatTabularSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION, oldFormatTabularSection, formatTabularSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatAttribute() {
		return formatAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatAttribute(String newFormatAttribute) {
		String oldFormatAttribute = formatAttribute;
		formatAttribute = newFormatAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE, oldFormatAttribute, formatAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule getObjectRule() {
		if (objectRule != null && objectRule.eIsProxy()) {
			InternalEObject oldObjectRule = (InternalEObject)objectRule;
			objectRule = (CmObjectRule)eResolveProxy(oldObjectRule);
			if (objectRule != oldObjectRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE, oldObjectRule, objectRule));
			}
		}
		return objectRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule basicGetObjectRule() {
		return objectRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRule(CmObjectRule newObjectRule) {
		CmObjectRule oldObjectRule = objectRule;
		objectRule = newObjectRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE, oldObjectRule, objectRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCustomRule() {
		return isCustomRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCustomRule(Boolean newIsCustomRule) {
		Boolean oldIsCustomRule = isCustomRule;
		isCustomRule = newIsCustomRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE, oldIsCustomRule, isCustomRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationAttributeFullName() {
		String result = this.getConfigurationAttribute();
		int _length = this.getConfigurationTabularSection().length();
		boolean _notEquals = (_length != 0);
		if (_notEquals) {
			String _configurationTabularSection = this.getConfigurationTabularSection();
			String _plus = (_configurationTabularSection + ".");
			String _plus_1 = (_plus + result);
			result = _plus_1;
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatAttributeFullName() {
		String result = this.getFormatAttribute();
		int _length = this.getFormatTabularSection().length();
		boolean _notEquals = (_length != 0);
		if (_notEquals) {
			String _formatTabularSection = this.getFormatTabularSection();
			String _plus = (_formatTabularSection + ".");
			String _plus_1 = (_plus + result);
			result = _plus_1;
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION:
				return getConfigurationTabularSection();
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE:
				return getConfigurationAttribute();
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION:
				return getFormatTabularSection();
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE:
				return getFormatAttribute();
			case cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE:
				if (resolve) return getObjectRule();
				return basicGetObjectRule();
			case cmPackage.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE:
				return getIsCustomRule();
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
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION:
				setConfigurationTabularSection((String)newValue);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE:
				setConfigurationAttribute((String)newValue);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION:
				setFormatTabularSection((String)newValue);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE:
				setFormatAttribute((String)newValue);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE:
				setObjectRule((CmObjectRule)newValue);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE:
				setIsCustomRule((Boolean)newValue);
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
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION:
				setConfigurationTabularSection(CONFIGURATION_TABULAR_SECTION_EDEFAULT);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE:
				setConfigurationAttribute(CONFIGURATION_ATTRIBUTE_EDEFAULT);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION:
				setFormatTabularSection(FORMAT_TABULAR_SECTION_EDEFAULT);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE:
				setFormatAttribute(FORMAT_ATTRIBUTE_EDEFAULT);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE:
				setObjectRule((CmObjectRule)null);
				return;
			case cmPackage.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE:
				setIsCustomRule(IS_CUSTOM_RULE_EDEFAULT);
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
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION:
				return CONFIGURATION_TABULAR_SECTION_EDEFAULT == null ? configurationTabularSection != null : !CONFIGURATION_TABULAR_SECTION_EDEFAULT.equals(configurationTabularSection);
			case cmPackage.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE:
				return CONFIGURATION_ATTRIBUTE_EDEFAULT == null ? configurationAttribute != null : !CONFIGURATION_ATTRIBUTE_EDEFAULT.equals(configurationAttribute);
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION:
				return FORMAT_TABULAR_SECTION_EDEFAULT == null ? formatTabularSection != null : !FORMAT_TABULAR_SECTION_EDEFAULT.equals(formatTabularSection);
			case cmPackage.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE:
				return FORMAT_ATTRIBUTE_EDEFAULT == null ? formatAttribute != null : !FORMAT_ATTRIBUTE_EDEFAULT.equals(formatAttribute);
			case cmPackage.CM_ATTRIBUTE_RULE__OBJECT_RULE:
				return objectRule != null;
			case cmPackage.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE:
				return IS_CUSTOM_RULE_EDEFAULT == null ? isCustomRule != null : !IS_CUSTOM_RULE_EDEFAULT.equals(isCustomRule);
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
			case cmPackage.CM_ATTRIBUTE_RULE___GET_CONFIGURATION_ATTRIBUTE_FULL_NAME:
				return getConfigurationAttributeFullName();
			case cmPackage.CM_ATTRIBUTE_RULE___GET_FORMAT_ATTRIBUTE_FULL_NAME:
				return getFormatAttributeFullName();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (configurationTabularSection: "); //$NON-NLS-1$
		result.append(configurationTabularSection);
		result.append(", configurationAttribute: "); //$NON-NLS-1$
		result.append(configurationAttribute);
		result.append(", formatTabularSection: "); //$NON-NLS-1$
		result.append(formatTabularSection);
		result.append(", formatAttribute: "); //$NON-NLS-1$
		result.append(formatAttribute);
		result.append(", isCustomRule: "); //$NON-NLS-1$
		result.append(isCustomRule);
		result.append(')');
		return result.toString();
	}

} //CmAttributeRuleImpl
