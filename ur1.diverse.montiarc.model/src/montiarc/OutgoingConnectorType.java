/**
 */
package montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.OutgoingConnectorType#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link montiarc.OutgoingConnectorType#getTargetPortType <em>Target Port Type</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getOutgoingConnectorType()
 * @model
 * @generated
 */
public interface OutgoingConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(PortInstance)
	 * @see montiarc.MontiarcPackage#getOutgoingConnectorType_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getSourcePort();

	/**
	 * Sets the value of the '{@link montiarc.OutgoingConnectorType#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Target Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port Type</em>' reference.
	 * @see #setTargetPortType(PortType)
	 * @see montiarc.MontiarcPackage#getOutgoingConnectorType_TargetPortType()
	 * @model required="true"
	 * @generated
	 */
	PortType getTargetPortType();

	/**
	 * Sets the value of the '{@link montiarc.OutgoingConnectorType#getTargetPortType <em>Target Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port Type</em>' reference.
	 * @see #getTargetPortType()
	 * @generated
	 */
	void setTargetPortType(PortType value);

} // OutgoingConnectorType
