/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Configuration Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getConfigurationStatus()
 * @model
 * @generated
 */
public enum ConfigurationStatus implements Enumerator {
	/**
	 * The '<em><b>No Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONFIGURATION(0, "NoConfiguration", "\u041e\u0436\u0438\u0434\u0430\u043d\u0438\u0435 \u0430\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u0438 \u043f\u0440\u043e\u0435\u043a\u0442\u043d\u043e\u0433\u043e \u043a\u043e\u043d\u0442\u0435\u043a\u0441\u0442\u0430"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Subsystem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SUBSYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SUBSYSTEM(1, "NoSubsystem", "\u041d\u0435\u0442 \u043f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u044b \u041e\u0431\u043c\u0435\u043d\u0414\u0430\u043d\u043d\u044b\u043c\u0438"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No SSL Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SSL_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SSL_VERSION(2, "NoSSLVersion", "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0438\u0442\u044c \u0432\u0435\u0440\u0441\u0438\u044e \u0411\u0421\u041f"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Common Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COMMON_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_COMMON_MODULE(3, "NoCommonModule", "\u041d\u0435\u0442 \u043e\u0431\u0449\u0435\u0433\u043e \u043c\u043e\u0434\u0443\u043b\u044f \u041e\u0431\u043c\u0435\u043d\u0414\u0430\u043d\u043d\u044b\u043c\u0438\u041f\u0435\u0440\u0435\u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u043c\u044b\u0439"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	NO_METHOD(4, "NoMethod", "\u0412 \u043e\u0431\u0449\u0435\u043c \u043c\u043e\u0434\u0443\u043b\u0435 \u043d\u0435\u0442 \u043c\u0435\u0442\u043e\u0434\u0430 \u041f\u0440\u0438\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u0445\u0412\u0435\u0440\u0441\u0438\u0439\u0424\u043e\u0440\u043c\u0430\u0442\u0430"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Empty Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY_METHOD(5, "EmptyMethod", "\u0412 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0435 \u041f\u0440\u0438\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u0445\u0412\u0435\u0440\u0441\u0438\u0439\u0424\u043e\u0440\u043c\u0430\u0442\u0430 \u043d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u0432\u0435\u0440\u0441\u0438\u0438 \u0444\u043e\u0440\u043c\u0430\u0442\u0430"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ready</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(6, "Ready", "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0433\u043e\u0442\u043e\u0432\u0430 \u043a \u043e\u0431\u043c\u0435\u043d\u0443"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONFIGURATION
	 * @model name="NoConfiguration" literal="\u041e\u0436\u0438\u0434\u0430\u043d\u0438\u0435 \u0430\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u0438 \u043f\u0440\u043e\u0435\u043a\u0442\u043d\u043e\u0433\u043e \u043a\u043e\u043d\u0442\u0435\u043a\u0441\u0442\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>No Subsystem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Subsystem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SUBSYSTEM
	 * @model name="NoSubsystem" literal="\u041d\u0435\u0442 \u043f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u044b \u041e\u0431\u043c\u0435\u043d\u0414\u0430\u043d\u043d\u044b\u043c\u0438"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SUBSYSTEM_VALUE = 1;

	/**
	 * The '<em><b>No SSL Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No SSL Version</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SSL_VERSION
	 * @model name="NoSSLVersion" literal="\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0438\u0442\u044c \u0432\u0435\u0440\u0441\u0438\u044e \u0411\u0421\u041f"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SSL_VERSION_VALUE = 2;

	/**
	 * The '<em><b>No Common Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Common Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_COMMON_MODULE
	 * @model name="NoCommonModule" literal="\u041d\u0435\u0442 \u043e\u0431\u0449\u0435\u0433\u043e \u043c\u043e\u0434\u0443\u043b\u044f \u041e\u0431\u043c\u0435\u043d\u0414\u0430\u043d\u043d\u044b\u043c\u0438\u041f\u0435\u0440\u0435\u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u043c\u044b\u0439"
	 * @generated
	 * @ordered
	 */
	public static final int NO_COMMON_MODULE_VALUE = 3;

	/**
	 * The '<em><b>No Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_METHOD
	 * @model name="NoMethod" literal="\u0412 \u043e\u0431\u0449\u0435\u043c \u043c\u043e\u0434\u0443\u043b\u0435 \u043d\u0435\u0442 \u043c\u0435\u0442\u043e\u0434\u0430 \u041f\u0440\u0438\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u0445\u0412\u0435\u0440\u0441\u0438\u0439\u0424\u043e\u0440\u043c\u0430\u0442\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int NO_METHOD_VALUE = 4;

	/**
	 * The '<em><b>Empty Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY_METHOD
	 * @model name="EmptyMethod" literal="\u0412 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0435 \u041f\u0440\u0438\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u0445\u0412\u0435\u0440\u0441\u0438\u0439\u0424\u043e\u0440\u043c\u0430\u0442\u0430 \u043d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u044b \u0432\u0435\u0440\u0441\u0438\u0438 \u0444\u043e\u0440\u043c\u0430\u0442\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_METHOD_VALUE = 5;

	/**
	 * The '<em><b>Ready</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY
	 * @model name="Ready" literal="\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0433\u043e\u0442\u043e\u0432\u0430 \u043a \u043e\u0431\u043c\u0435\u043d\u0443"
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 6;

	/**
	 * An array of all the '<em><b>Configuration Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConfigurationStatus[] VALUES_ARRAY =
		new ConfigurationStatus[] {
			NO_CONFIGURATION,
			NO_SUBSYSTEM,
			NO_SSL_VERSION,
			NO_COMMON_MODULE,
			NO_METHOD,
			EMPTY_METHOD,
			READY,
		};

	/**
	 * A public read-only list of all the '<em><b>Configuration Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConfigurationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Configuration Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigurationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigurationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Configuration Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigurationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigurationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Configuration Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigurationStatus get(int value) {
		switch (value) {
			case NO_CONFIGURATION_VALUE: return NO_CONFIGURATION;
			case NO_SUBSYSTEM_VALUE: return NO_SUBSYSTEM;
			case NO_SSL_VERSION_VALUE: return NO_SSL_VERSION;
			case NO_COMMON_MODULE_VALUE: return NO_COMMON_MODULE;
			case NO_METHOD_VALUE: return NO_METHOD;
			case EMPTY_METHOD_VALUE: return EMPTY_METHOD;
			case READY_VALUE: return READY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConfigurationStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConfigurationStatus
