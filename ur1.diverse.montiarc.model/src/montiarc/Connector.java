/**
 */
package montiarc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.Connector#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link montiarc.Connector#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectsDifferentComponents ConnectsDifferentComponents PortTypeMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConnectsDifferentComponents='Tuple {\n\tmessage : String = \'The connector must connect two different subcomponents.\',\n\tstatus : Boolean = \n\t\t\tself.sourceSubcomponent <> self.targetSubcomponent\n}.status' PortTypeMatch='Tuple {\n\tmessage : String = \'Both ports of a connector must have the same type\',\n\tstatus : Boolean = \n\t\t\tself.sourcePort.type = self.targetPort.type\n}.status'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(Port)
	 * @see montiarc.MontiarcPackage#getConnector_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	Port getSourcePort();

	/**
	 * Sets the value of the '{@link montiarc.Connector#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Port value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(Port)
	 * @see montiarc.MontiarcPackage#getConnector_TargetPort()
	 * @model required="true"
	 * @generated
	 */
	Port getTargetPort();

	/**
	 * Sets the value of the '{@link montiarc.Connector#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(Port value);

} // Connector
