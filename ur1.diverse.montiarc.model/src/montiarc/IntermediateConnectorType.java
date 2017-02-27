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
 *   <li>{@link montiarc.IntermediateConnectorType#getSourcePortInstance <em>Source Port Instance</em>}</li>
 *   <li>{@link montiarc.IntermediateConnectorType#getTargetPortInstance <em>Target Port Instance</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getIntermediateConnectorType()
 * @model
 * @generated
 */
public interface IntermediateConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Source Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port Instance</em>' reference.
	 * @see #setSourcePortInstance(PortInstance)
	 * @see montiarc.MontiarcPackage#getIntermediateConnectorType_SourcePortInstance()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getSourcePortInstance();

	/**
	 * Sets the value of the '{@link montiarc.IntermediateConnectorType#getSourcePortInstance <em>Source Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port Instance</em>' reference.
	 * @see #getSourcePortInstance()
	 * @generated
	 */
	void setSourcePortInstance(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Target Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port Instance</em>' reference.
	 * @see #setTargetPortInstance(PortInstance)
	 * @see montiarc.MontiarcPackage#getIntermediateConnectorType_TargetPortInstance()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getTargetPortInstance();

	/**
	 * Sets the value of the '{@link montiarc.IntermediateConnectorType#getTargetPortInstance <em>Target Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port Instance</em>' reference.
	 * @see #getTargetPortInstance()
	 * @generated
	 */
	void setTargetPortInstance(PortInstance value);

} // IntermediateConnectorType
