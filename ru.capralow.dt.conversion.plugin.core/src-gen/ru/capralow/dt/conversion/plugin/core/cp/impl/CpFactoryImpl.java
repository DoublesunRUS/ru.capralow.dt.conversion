/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.cp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpFactoryImpl extends EFactoryImpl implements CpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpFactory init() {
		try {
			CpFactory theCpFactory = (CpFactory)EPackage.Registry.INSTANCE.getEFactory(CpPackage.eNS_URI);
			if (theCpFactory != null) {
				return theCpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpFactoryImpl() {
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
			case CpPackage.CONVERSION_PANEL: return createConversionPanel();
			case CpPackage.CP_CONFIGURATION: return createcpConfiguration();
			case CpPackage.CP_EXTENSION: return createcpExtension();
			case CpPackage.CP_FORMAT_VERSION: return createcpFormatVersion();
			case CpPackage.CP_EXCHANGE_PAIR: return createcpExchangePair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CpPackage.EXCHANGE_PAIR_STATUS:
				return createExchangePairStatusFromString(eDataType, initialValue);
			case CpPackage.CONFIGURATION_STATUS:
				return createConfigurationStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CpPackage.EXCHANGE_PAIR_STATUS:
				return convertExchangePairStatusToString(eDataType, instanceValue);
			case CpPackage.CONFIGURATION_STATUS:
				return convertConfigurationStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionPanel createConversionPanel() {
		ConversionPanelImpl conversionPanel = new ConversionPanelImpl();
		return conversionPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpConfiguration createcpConfiguration() {
		cpConfigurationImpl cpConfiguration = new cpConfigurationImpl();
		return cpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpExtension createcpExtension() {
		cpExtensionImpl cpExtension = new cpExtensionImpl();
		return cpExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpFormatVersion createcpFormatVersion() {
		cpFormatVersionImpl cpFormatVersion = new cpFormatVersionImpl();
		return cpFormatVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpExchangePair createcpExchangePair() {
		cpExchangePairImpl cpExchangePair = new cpExchangePairImpl();
		return cpExchangePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePairStatus createExchangePairStatusFromString(EDataType eDataType, String initialValue) {
		ExchangePairStatus result = ExchangePairStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePairStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationStatus createConfigurationStatusFromString(EDataType eDataType, String initialValue) {
		ConfigurationStatus result = ConfigurationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpPackage getCpPackage() {
		return (CpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpPackage getPackage() {
		return CpPackage.eINSTANCE;
	}

} //CpFactoryImpl
