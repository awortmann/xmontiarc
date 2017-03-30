/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getType <em>Type</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getLocalBehavior <em>Local Behavior</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLowerCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLowerCase='Tuple {\n\tmessage : String = \'\\\'\' + name + \'\\\' must be lowercase\',\n\tstatus : Boolean = \n            let firstLetter : String = (name).substring(0,1) \n                in firstLetter.toLowerCase() = firstLetter\n}.status'"
 * @generated
 */
public interface Subcomponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedSubcomponent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_Name()
	 * @model default="UnnamedSubcomponent" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_Type()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Incoming Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.IncomingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Ports</em>' containment reference list.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_IncomingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncomingPort> getIncomingPorts();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_Parent()
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.ComponentType#getSubcomponents
	 * @model opposite="subcomponents" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Outgoing Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.OutgoingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Ports</em>' containment reference list.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_OutgoingPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutgoingPort> getOutgoingPorts();

	/**
	 * Returns the value of the '<em><b>Local Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Behavior</em>' containment reference.
	 * @see #setLocalBehavior(ComponentBehavior)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getSubcomponent_LocalBehavior()
	 * @model containment="true"
	 * @generated
	 */
	ComponentBehavior getLocalBehavior();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Subcomponent#getLocalBehavior <em>Local Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Behavior</em>' containment reference.
	 * @see #getLocalBehavior()
	 * @generated
	 */
	void setLocalBehavior(ComponentBehavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createDefaultBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

} // Subcomponent
