/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ep Exchange Pair Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpExchangePairStatus()
 * @model
 * @generated
 */
public enum EpExchangePairStatus implements Enumerator {
	/**
	 * The '<em><b>No Shared Format Versions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SHARED_FORMAT_VERSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SHARED_FORMAT_VERSIONS(0, "NoSharedFormatVersions", "\u041d\u0435\u0442 \u0441\u043e\u0432\u043f\u0430\u0434\u0435\u043d\u0438\u0439 \u043f\u043e \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u043c \u0432\u0435\u0440\u0441\u0438\u044f\u043c \u0444\u043e\u0440\u043c\u0430\u0442\u0430"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ready</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(1, "Ready", "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u0433\u043e\u0442\u043e\u0432\u044b \u043a \u043e\u0431\u043c\u0435\u043d\u0443"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Shared Format Versions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Shared Format Versions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SHARED_FORMAT_VERSIONS
	 * @model name="NoSharedFormatVersions" literal="\u041d\u0435\u0442 \u0441\u043e\u0432\u043f\u0430\u0434\u0435\u043d\u0438\u0439 \u043f\u043e \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u043c \u0432\u0435\u0440\u0441\u0438\u044f\u043c \u0444\u043e\u0440\u043c\u0430\u0442\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SHARED_FORMAT_VERSIONS_VALUE = 0;

	/**
	 * The '<em><b>Ready</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY
	 * @model name="Ready" literal="\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u0433\u043e\u0442\u043e\u0432\u044b \u043a \u043e\u0431\u043c\u0435\u043d\u0443"
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ep Exchange Pair Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EpExchangePairStatus[] VALUES_ARRAY =
		new EpExchangePairStatus[] {
			NO_SHARED_FORMAT_VERSIONS,
			READY,
		};

	/**
	 * A public read-only list of all the '<em><b>Ep Exchange Pair Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EpExchangePairStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ep Exchange Pair Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EpExchangePairStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EpExchangePairStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ep Exchange Pair Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EpExchangePairStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EpExchangePairStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ep Exchange Pair Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EpExchangePairStatus get(int value) {
		switch (value) {
			case NO_SHARED_FORMAT_VERSIONS_VALUE: return NO_SHARED_FORMAT_VERSIONS;
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
	private EpExchangePairStatus(int value, String name, String literal) {
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
	
} //EpExchangePairStatus
