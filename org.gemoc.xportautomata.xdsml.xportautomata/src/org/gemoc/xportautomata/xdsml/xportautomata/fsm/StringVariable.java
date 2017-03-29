/**
 */
package org.gemoc.xportautomata.xdsml.xportautomata.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmPackage#getStringVariable()
 * @model
 * @generated
 */
public interface StringVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmPackage#getStringVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmPackage#getStringVariable_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringVariable
