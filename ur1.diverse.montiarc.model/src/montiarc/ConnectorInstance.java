/**
 */
package montiarc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.ConnectorInstance#getSourcePortInstance <em>Source Port Instance</em>}</li>
 *   <li>{@link montiarc.ConnectorInstance#getTargetPortInstance <em>Target Port Instance</em>}</li>
 *   <li>{@link montiarc.ConnectorInstance#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getConnectorInstance()
 * @model
 * @generated
 */
public interface ConnectorInstance extends EObject {
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
	 * @see montiarc.MontiarcPackage#getConnectorInstance_SourcePortInstance()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getSourcePortInstance();

	/**
	 * Sets the value of the '{@link montiarc.ConnectorInstance#getSourcePortInstance <em>Source Port Instance</em>}' reference.
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
	 * @see montiarc.MontiarcPackage#getConnectorInstance_TargetPortInstance()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getTargetPortInstance();

	/**
	 * Sets the value of the '{@link montiarc.ConnectorInstance#getTargetPortInstance <em>Target Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port Instance</em>' reference.
	 * @see #getTargetPortInstance()
	 * @generated
	 */
	void setTargetPortInstance(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link montiarc.ComponentInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentInstance)
	 * @see montiarc.MontiarcPackage#getConnectorInstance_Parent()
	 * @see montiarc.ComponentInstance#getConnectorInstances
	 * @model opposite="connectorInstances" required="true"
	 * @generated
	 */
	ComponentInstance getParent();

	/**
	 * Sets the value of the '{@link montiarc.ConnectorInstance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentInstance value);

} // ConnectorInstance
