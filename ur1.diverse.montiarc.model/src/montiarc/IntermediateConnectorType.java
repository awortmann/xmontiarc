/**
 */
package montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.IntermediateConnectorType#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link montiarc.IntermediateConnectorType#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getIntermediateConnectorType()
 * @model
 * @generated
 */
public interface IntermediateConnectorType extends ConnectorType {
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
	 * @see montiarc.MontiarcPackage#getIntermediateConnectorType_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getSourcePort();

	/**
	 * Sets the value of the '{@link montiarc.IntermediateConnectorType#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(PortInstance value);

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
	 * @see montiarc.MontiarcPackage#getIntermediateConnectorType_TargetPort()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getTargetPort();

	/**
	 * Sets the value of the '{@link montiarc.IntermediateConnectorType#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(PortInstance value);

} // IntermediateConnectorType
