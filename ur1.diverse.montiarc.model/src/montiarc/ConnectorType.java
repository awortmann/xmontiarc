/**
 */
package montiarc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.ConnectorType#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getConnectorType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectsDifferentComponents ConnectsDifferentComponents PortTypeMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConnectsDifferentComponents='Tuple {\n\tmessage : String = \'The connector must connect two different subcomponents.\',\n\tstatus : Boolean = \n\t\t\tself.sourceSubcomponent <> self.targetSubcomponent\n}.status' PortTypeMatch='Tuple {\n\tmessage : String = \'Both ports of a connector must have the same type\',\n\tstatus : Boolean = \n\t\t\tself.sourcePort.type = self.targetPort.type\n}.status'"
 * @generated
 */
public interface ConnectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link montiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see montiarc.MontiarcPackage#getConnectorType_Parent()
	 * @see montiarc.ComponentType#getConnectors
	 * @model opposite="connectors" required="true" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link montiarc.ConnectorType#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

} // ConnectorType
