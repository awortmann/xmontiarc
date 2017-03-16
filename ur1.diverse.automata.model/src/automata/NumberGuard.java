/**
 */
package automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.NumberGuard#getValue <em>Value</em>}</li>
 *   <li>{@link automata.NumberGuard#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getNumberGuard()
 * @model
 * @generated
 */
public interface NumberGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see automata.AutomataPackage#getNumberGuard_Value()
	 * @model default="-1" required="true"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link automata.NumberGuard#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link automata.NumberOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see automata.NumberOperator
	 * @see #setOperator(NumberOperator)
	 * @see automata.AutomataPackage#getNumberGuard_Operator()
	 * @model
	 * @generated
	 */
	NumberOperator getOperator();

	/**
	 * Sets the value of the '{@link automata.NumberGuard#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see automata.NumberOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(NumberOperator value);

} // NumberGuard
