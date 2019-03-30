/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.ep.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class epFactoryImpl extends EFactoryImpl implements epFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static epFactory init() {
		try {
			epFactory theepFactory = (epFactory)EPackage.Registry.INSTANCE.getEFactory(epPackage.eNS_URI);
			if (theepFactory != null) {
				return theepFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new epFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public epFactoryImpl() {
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
			case epPackage.EXCHANGE_PROJECT: return createExchangeProject();
			case epPackage.EXCHANGE_PROJECTS: return createExchangeProjects();
			case epPackage.EP_EXTENSION: return createEpExtension();
			case epPackage.EP_FORMAT_VERSION: return createEpFormatVersion();
			case epPackage.EXCHANGE_DATA: return createExchangeData();
			case epPackage.EP_EXCHANGE_PAIR: return createEpExchangePair();
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
			case epPackage.EP_PROJECT_STATUS:
				return createEpProjectStatusFromString(eDataType, initialValue);
			case epPackage.EP_EXCHANGE_PAIR_STATUS:
				return createEpExchangePairStatusFromString(eDataType, initialValue);
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
			case epPackage.EP_PROJECT_STATUS:
				return convertEpProjectStatusToString(eDataType, instanceValue);
			case epPackage.EP_EXCHANGE_PAIR_STATUS:
				return convertEpExchangePairStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeProject createExchangeProject() {
		ExchangeProjectImpl exchangeProject = new ExchangeProjectImpl();
		return exchangeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeProjects createExchangeProjects() {
		ExchangeProjectsImpl exchangeProjects = new ExchangeProjectsImpl();
		return exchangeProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpExtension createEpExtension() {
		EpExtensionImpl epExtension = new EpExtensionImpl();
		return epExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpFormatVersion createEpFormatVersion() {
		EpFormatVersionImpl epFormatVersion = new EpFormatVersionImpl();
		return epFormatVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeData createExchangeData() {
		ExchangeDataImpl exchangeData = new ExchangeDataImpl();
		return exchangeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpExchangePair createEpExchangePair() {
		EpExchangePairImpl epExchangePair = new EpExchangePairImpl();
		return epExchangePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpProjectStatus createEpProjectStatusFromString(EDataType eDataType, String initialValue) {
		EpProjectStatus result = EpProjectStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpProjectStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpExchangePairStatus createEpExchangePairStatusFromString(EDataType eDataType, String initialValue) {
		EpExchangePairStatus result = EpExchangePairStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpExchangePairStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public epPackage getepPackage() {
		return (epPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static epPackage getPackage() {
		return epPackage.eINSTANCE;
	}

} //epFactoryImpl
