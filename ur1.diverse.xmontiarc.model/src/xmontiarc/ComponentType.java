/**
 */
package xmontiarc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link xmontiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xmontiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link xmontiarc.ComponentType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link xmontiarc.ComponentType#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link xmontiarc.ComponentType#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 * </ul>
 *
 * @see xmontiarc.XmontiarcPackage#getComponentType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtomicOrComposed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtomicOrComposed='Tuple {\n\tmessage : String = \'Component type \\\'\' + name + \'\\\' cannot have connectors and behavior\',\n\tstatus : Boolean = \n            behavior.equalsIgnoreCase(\'\') or self.connectors->isEmpty()\n}.status'"
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedComponentType"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xmontiarc.XmontiarcPackage#getComponentType_Name()
	 * @model default="UnnamedComponentType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xmontiarc.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link xmontiarc.Connector}.
	 * It is bidirectional and its opposite is '{@link xmontiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see xmontiarc.XmontiarcPackage#getComponentType_Connectors()
	 * @see xmontiarc.Connector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link xmontiarc.Subcomponent}.
	 * It is bidirectional and its opposite is '{@link xmontiarc.Subcomponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see xmontiarc.XmontiarcPackage#getComponentType_Subcomponents()
	 * @see xmontiarc.Subcomponent#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Subcomponent> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see xmontiarc.XmontiarcPackage#getComponentType_Behavior()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link xmontiarc.ComponentType#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Ports</b></em>' containment reference list.
	 * The list contents are of type {@link xmontiarc.IncomingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Ports</em>' containment reference list.
	 * @see xmontiarc.XmontiarcPackage#getComponentType_IncomingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncomingPort> getIncomingPorts();

	/**
	 * Returns the value of the '<em><b>Outgoing Ports</b></em>' containment reference list.
	 * The list contents are of type {@link xmontiarc.OutgoingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Ports</em>' containment reference list.
	 * @see xmontiarc.XmontiarcPackage#getComponentType_OutgoingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutgoingPort> getOutgoingPorts();

} // ComponentType
