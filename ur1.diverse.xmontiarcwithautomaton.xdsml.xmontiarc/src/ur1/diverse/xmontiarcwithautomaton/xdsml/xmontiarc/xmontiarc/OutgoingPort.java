/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.OutgoingPort#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.XmontiarcPackage#getOutgoingPort()
 * @model
 * @generated
 */
public interface OutgoingPort extends Port {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"DefaultValue"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.XmontiarcPackage#getOutgoingPort_InitialValue()
	 * @model default="DefaultValue" required="true"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.OutgoingPort#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

} // OutgoingPort
