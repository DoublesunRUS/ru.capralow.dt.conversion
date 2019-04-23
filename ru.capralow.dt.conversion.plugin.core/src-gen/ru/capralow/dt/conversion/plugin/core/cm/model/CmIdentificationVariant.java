/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cm Identification Variant</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmIdentificationVariant()
 * @model
 * @generated
 */
public enum CmIdentificationVariant implements Enumerator {
	/**
	 * The '<em><b>UUID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(0, "UUID", "\u041f\u043e \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u043c\u0443 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0443"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Search Fields</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_FIELDS_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_FIELDS(1, "SearchFields", "\u041f\u043e \u043f\u043e\u043b\u044f\u043c \u043f\u043e\u0438\u0441\u043a\u0430"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UUID Then Search Fields</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_THEN_SEARCH_FIELDS_VALUE
	 * @generated
	 * @ordered
	 */
	UUID_THEN_SEARCH_FIELDS(2, "UUIDThenSearchFields", "\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u043f\u043e \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u043c\u0443 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0443 \u043f\u043e\u0442\u043e\u043c \u043f\u043e \u043f\u043e\u043b\u044f\u043c \u043f\u043e\u0438\u0441\u043a\u0430"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UUID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UUID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UUID
	 * @model literal="\u041f\u043e \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u043c\u0443 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0443"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 0;

	/**
	 * The '<em><b>Search Fields</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search Fields</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_FIELDS
	 * @model name="SearchFields" literal="\u041f\u043e \u043f\u043e\u043b\u044f\u043c \u043f\u043e\u0438\u0441\u043a\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_FIELDS_VALUE = 1;

	/**
	 * The '<em><b>UUID Then Search Fields</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UUID Then Search Fields</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UUID_THEN_SEARCH_FIELDS
	 * @model name="UUIDThenSearchFields" literal="\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u043f\u043e \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u043c\u0443 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0443 \u043f\u043e\u0442\u043e\u043c \u043f\u043e \u043f\u043e\u043b\u044f\u043c \u043f\u043e\u0438\u0441\u043a\u0430"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_THEN_SEARCH_FIELDS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cm Identification Variant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CmIdentificationVariant[] VALUES_ARRAY =
		new CmIdentificationVariant[] {
			UUID,
			SEARCH_FIELDS,
			UUID_THEN_SEARCH_FIELDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Cm Identification Variant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CmIdentificationVariant> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cm Identification Variant</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmIdentificationVariant get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmIdentificationVariant result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cm Identification Variant</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmIdentificationVariant getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmIdentificationVariant result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cm Identification Variant</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmIdentificationVariant get(int value) {
		switch (value) {
			case UUID_VALUE: return UUID;
			case SEARCH_FIELDS_VALUE: return SEARCH_FIELDS;
			case UUID_THEN_SEARCH_FIELDS_VALUE: return UUID_THEN_SEARCH_FIELDS;
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
	private CmIdentificationVariant(int value, String name, String literal) {
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
	
} //CmIdentificationVariant
