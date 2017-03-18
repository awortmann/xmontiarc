/**
 */
package automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.StringGuard#getValue <em>Value</em>}</li>
 *   <li>{@link automata.StringGuard#getOperator <em>Operator</em>}</li>
 *   <li>{@link automata.StringGuard#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getStringGuard()
 * @model
 * @generated
 */
public interface StringGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"UnnamedVariable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see automata.AutomataPackage#getStringGuard_Value()
	 * @model default="UnnamedVariable" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link automata.StringGuard#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link automata.StringOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see automata.StringOperator
	 * @see #setOperator(StringOperator)
	 * @see automata.AutomataPackage#getStringGuard_Operator()
	 * @model
	 * @generated
	 */
	StringOperator getOperator();

	/**
	 * Sets the value of the '{@link automata.StringGuard#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see automata.StringOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(StringOperator value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StringVariable)
	 * @see automata.AutomataPackage#getStringGuard_Source()
	 * @model required="true"
	 * @generated
	 */
	StringVariable getSource();

	/**
	 * Sets the value of the '{@link automata.StringGuard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StringVariable value);

} // StringGuard
