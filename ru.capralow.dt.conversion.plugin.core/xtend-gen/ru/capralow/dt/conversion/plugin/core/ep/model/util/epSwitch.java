/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.capralow.dt.conversion.plugin.core.ep.model.*;

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
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage
 * @generated
 */
public class epSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static epPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public epSwitch() {
		if (modelPackage == null) {
			modelPackage = epPackage.eINSTANCE;
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
			case epPackage.EXCHANGE_PROJECT: {
				ExchangeProject exchangeProject = (ExchangeProject)theEObject;
				T result = caseExchangeProject(exchangeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case epPackage.EXCHANGE_PROJECTS: {
				ExchangeProjects exchangeProjects = (ExchangeProjects)theEObject;
				T result = caseExchangeProjects(exchangeProjects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case epPackage.EP_EXTENSION: {
				EpExtension epExtension = (EpExtension)theEObject;
				T result = caseEpExtension(epExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case epPackage.EP_FORMAT_VERSION: {
				EpFormatVersion epFormatVersion = (EpFormatVersion)theEObject;
				T result = caseEpFormatVersion(epFormatVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case epPackage.EXCHANGE_DATA: {
				ExchangeData exchangeData = (ExchangeData)theEObject;
				T result = caseExchangeData(exchangeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case epPackage.EP_EXCHANGE_PAIR: {
				EpExchangePair epExchangePair = (EpExchangePair)theEObject;
				T result = caseEpExchangePair(epExchangePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeProject(ExchangeProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Projects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Projects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeProjects(ExchangeProjects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ep Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ep Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpExtension(EpExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ep Format Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ep Format Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpFormatVersion(EpFormatVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeData(ExchangeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ep Exchange Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ep Exchange Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpExchangePair(EpExchangePair object) {
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

} //epSwitch
