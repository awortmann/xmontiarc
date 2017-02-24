/**
 */
package montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.IncomingConnectorType#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link montiarc.IncomingConnectorType#getSourcePortType <em>Source Port Type</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getIncomingConnectorType()
 * @model
 * @generated
 */
public interface IncomingConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(PortInstance)
	 * @see montiarc.MontiarcPackage#getIncomingConnectorType_TargetPort()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getTargetPort();

	/**
	 * Sets the value of the '{@link montiarc.IncomingConnectorType#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Source Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port Type</em>' reference.
	 * @see #setSourcePortType(PortType)
	 * @see montiarc.MontiarcPackage#getIncomingConnectorType_SourcePortType()
	 * @model required="true"
	 * @generated
	 */
	PortType getSourcePortType();

	/**
	 * Sets the value of the '{@link montiarc.IncomingConnectorType#getSourcePortType <em>Source Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port Type</em>' reference.
	 * @see #getSourcePortType()
	 * @generated
	 */
	void setSourcePortType(PortType value);

} // IncomingConnectorType
