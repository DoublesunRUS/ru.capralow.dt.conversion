/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getConfigurationTabularSectionName <em>Configuration Tabular Section Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getConfigurationAttributeName <em>Configuration Attribute Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getFormatTabularSectionName <em>Format Tabular Section Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getFormatAttributeName <em>Format Attribute Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getObjectRule <em>Object Rule</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl#getIsCustomRule <em>Is Custom Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAttributeRuleImpl extends MinimalEObjectImpl.Container implements CmAttributeRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAttributeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_ATTRIBUTE_RULE;
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
	public String getConfigurationTabularSectionName() {
		return (String)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationTabularSectionName(String newConfigurationTabularSectionName) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION_NAME, newConfigurationTabularSectionName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationAttributeName() {
		return (String)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationAttributeName(String newConfigurationAttributeName) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE_NAME, newConfigurationAttributeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatTabularSectionName() {
		return (String)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatTabularSectionName(String newFormatTabularSectionName) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION_NAME, newFormatTabularSectionName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatAttributeName() {
		return (String)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatAttributeName(String newFormatAttributeName) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE_NAME, newFormatAttributeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule getObjectRule() {
		return (CmObjectRule)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__OBJECT_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRule(CmObjectRule newObjectRule) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__OBJECT_RULE, newObjectRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCustomRule() {
		return (Boolean)eGet(CmPackage.Literals.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCustomRule(Boolean newIsCustomRule) {
		eSet(CmPackage.Literals.CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE, newIsCustomRule);
	}

} //CmAttributeRuleImpl
