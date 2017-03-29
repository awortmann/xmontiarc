/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getStringVariable()
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
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getStringVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

} // StringVariable
