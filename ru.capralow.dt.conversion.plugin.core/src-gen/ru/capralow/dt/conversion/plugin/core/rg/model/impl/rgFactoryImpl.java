/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.rg.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rgFactoryImpl extends EFactoryImpl implements rgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rgFactory init() {
		try {
			rgFactory thergFactory = (rgFactory)EPackage.Registry.INSTANCE.getEFactory(rgPackage.eNS_URI);
			if (thergFactory != null) {
				return thergFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case rgPackage.REPORT_GROUPS: return createReportGroups();
			case rgPackage.RG_VARIANT: return createRgVariant();
			case rgPackage.RG_GROUP: return createRgGroup();
			case rgPackage.RG_RULE: return createRgRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportGroups createReportGroups() {
		ReportGroupsImpl reportGroups = new ReportGroupsImpl();
		return reportGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgVariant createRgVariant() {
		RgVariantImpl rgVariant = new RgVariantImpl();
		return rgVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgGroup createRgGroup() {
		RgGroupImpl rgGroup = new RgGroupImpl();
		return rgGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgRule createRgRule() {
		RgRuleImpl rgRule = new RgRuleImpl();
		return rgRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rgPackage getrgPackage() {
		return (rgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rgPackage getPackage() {
		return rgPackage.eINSTANCE;
	}

} //rgFactoryImpl
