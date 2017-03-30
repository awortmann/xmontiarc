/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.FsmPackage#getNumberVariable()
 * @model
 * @generated
 */
public interface NumberVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(long)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.FsmPackage#getNumberVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	long getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(long value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Long)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.FsmPackage#getNumberVariable_Value()
	 * @model unique="false"
	 * @generated
	 */
	Long getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Long value);

} // NumberVariable
