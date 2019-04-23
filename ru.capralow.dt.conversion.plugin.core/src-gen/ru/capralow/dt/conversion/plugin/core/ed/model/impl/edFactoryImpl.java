/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.ed.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class edFactoryImpl extends EFactoryImpl implements edFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static edFactory init() {
		try {
			edFactory theedFactory = (edFactory)EPackage.Registry.INSTANCE.getEFactory(edPackage.eNS_URI);
			if (theedFactory != null) {
				return theedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new edFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edFactoryImpl() {
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
			case edPackage.ENTERPRISE_DATA: return createEnterpriseData();
			case edPackage.ED_DEFINED_TYPE: return createEdDefinedType();
			case edPackage.ED_TYPE: return createEdType();
			case edPackage.ED_OBJECT: return createEdObject();
			case edPackage.ED_PROPERTY: return createEdProperty();
			case edPackage.ED_ENUM: return createEdEnum();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseData createEnterpriseData() {
		EnterpriseDataImpl enterpriseData = new EnterpriseDataImpl();
		return enterpriseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdDefinedType createEdDefinedType() {
		EdDefinedTypeImpl edDefinedType = new EdDefinedTypeImpl();
		return edDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdType createEdType() {
		EdTypeImpl edType = new EdTypeImpl();
		return edType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdObject createEdObject() {
		EdObjectImpl edObject = new EdObjectImpl();
		return edObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdProperty createEdProperty() {
		EdPropertyImpl edProperty = new EdPropertyImpl();
		return edProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdEnum createEdEnum() {
		EdEnumImpl edEnum = new EdEnumImpl();
		return edEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edPackage getedPackage() {
		return (edPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static edPackage getPackage() {
		return edPackage.eINSTANCE;
	}

} //edFactoryImpl
