/**
 */
package org.gemoc.montiarc;

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
 *   <li>{@link org.gemoc.montiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.montiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.gemoc.montiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link org.gemoc.montiarc.ComponentType#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link org.gemoc.montiarc.ComponentType#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 *   <li>{@link org.gemoc.montiarc.ComponentType#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType()
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
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_Name()
	 * @model default="UnnamedComponentType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.montiarc.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.montiarc.Connector}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.montiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_Connectors()
	 * @see org.gemoc.montiarc.Connector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.montiarc.Subcomponent}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.montiarc.Subcomponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_Subcomponents()
	 * @see org.gemoc.montiarc.Subcomponent#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Subcomponent> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Incoming Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.montiarc.IncomingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Ports</em>' containment reference list.
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_IncomingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncomingPort> getIncomingPorts();

	/**
	 * Returns the value of the '<em><b>Outgoing Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.montiarc.OutgoingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Ports</em>' containment reference list.
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_OutgoingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutgoingPort> getOutgoingPorts();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(ComponentBehavior)
	 * @see org.gemoc.montiarc.MontiarcPackage#getComponentType_Behavior()
	 * @model
	 * @generated
	 */
	ComponentBehavior getBehavior();

	/**
	 * Sets the value of the '{@link org.gemoc.montiarc.ComponentType#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(ComponentBehavior value);

} // ComponentType
