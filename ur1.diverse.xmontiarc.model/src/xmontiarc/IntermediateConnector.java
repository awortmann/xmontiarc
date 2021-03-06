/**
 */
package xmontiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.IntermediateConnector#getSource <em>Source</em>}</li>
 *   <li>{@link xmontiarc.IntermediateConnector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see xmontiarc.XmontiarcPackage#getIntermediateConnector()
 * @model
 * @generated
 */
public interface IntermediateConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutgoingPort)
	 * @see xmontiarc.XmontiarcPackage#getIntermediateConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	OutgoingPort getSource();

	/**
	 * Sets the value of the '{@link xmontiarc.IntermediateConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutgoingPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IncomingPort)
	 * @see xmontiarc.XmontiarcPackage#getIntermediateConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	IncomingPort getTarget();

	/**
	 * Sets the value of the '{@link xmontiarc.IntermediateConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IncomingPort value);

} // IntermediateConnector
