/**
 */
package automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.BooleanVariable#isInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariable extends Variable {

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(boolean)
	 * @see automata.AutomataPackage#getBooleanVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitialValue();

	/**
	 * Sets the value of the '{@link automata.BooleanVariable#isInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isInitialValue()
	 * @generated
	 */
	void setInitialValue(boolean value);
} // BooleanVariable
