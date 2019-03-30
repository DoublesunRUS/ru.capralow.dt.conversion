/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.capralow.dt.conversion.plugin.core.cm.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage
 * @generated
 */
public class cmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmSwitch() {
		if (modelPackage == null) {
			modelPackage = cmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case cmPackage.CONVERSION_MODULE: {
				ConversionModule conversionModule = (ConversionModule)theEObject;
				T result = caseConversionModule(conversionModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_DATA_RULE: {
				CmDataRule cmDataRule = (CmDataRule)theEObject;
				T result = caseCmDataRule(cmDataRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_OBJECT_RULE: {
				CmObjectRule cmObjectRule = (CmObjectRule)theEObject;
				T result = caseCmObjectRule(cmObjectRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_ATTRIBUTE_RULE: {
				CmAttributeRule cmAttributeRule = (CmAttributeRule)theEObject;
				T result = caseCmAttributeRule(cmAttributeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_PREDEFINED: {
				CmPredefined cmPredefined = (CmPredefined)theEObject;
				T result = caseCmPredefined(cmPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_PREDEFINED_MAP: {
				CmPredefinedMap cmPredefinedMap = (CmPredefinedMap)theEObject;
				T result = caseCmPredefinedMap(cmPredefinedMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_ALGORITHM: {
				CmAlgorithm cmAlgorithm = (CmAlgorithm)theEObject;
				T result = caseCmAlgorithm(cmAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_SUBSYSTEM: {
				CmSubsystem cmSubsystem = (CmSubsystem)theEObject;
				T result = caseCmSubsystem(cmSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cmPackage.CM_GROUP: {
				CmGroup cmGroup = (CmGroup)theEObject;
				T result = caseCmGroup(cmGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionModule(ConversionModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Data Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Data Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmDataRule(CmDataRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Object Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Object Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmObjectRule(CmObjectRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Attribute Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Attribute Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmAttributeRule(CmAttributeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmPredefined(CmPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Predefined Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Predefined Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmPredefinedMap(CmPredefinedMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmAlgorithm(CmAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmSubsystem(CmSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmGroup(CmGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //cmSwitch
