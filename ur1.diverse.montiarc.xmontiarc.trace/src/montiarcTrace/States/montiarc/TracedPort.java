/**
 */
package montiarcTrace.States.montiarc;

import montiarcTrace.States.Port_portValue_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.States.montiarc.TracedPort#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link montiarcTrace.States.montiarc.TracedPort#getPortValueSequence <em>Port Value Sequence</em>}</li>
 * </ul>
 *
 * @see montiarcTrace.States.montiarc.MontiarcPackage#getTracedPort()
 * @model
 * @generated
 */
public interface TracedPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Port)
	 * @see montiarcTrace.States.montiarc.MontiarcPackage#getTracedPort_OriginalObject()
	 * @model
	 * @generated
	 */
	Port getOriginalObject();

	/**
	 * Sets the value of the '{@link montiarcTrace.States.montiarc.TracedPort#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Port value);

	/**
	 * Returns the value of the '<em><b>Port Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link montiarcTrace.States.Port_portValue_Value}.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.States.Port_portValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Value Sequence</em>' containment reference list.
	 * @see montiarcTrace.States.montiarc.MontiarcPackage#getTracedPort_PortValueSequence()
	 * @see montiarcTrace.States.Port_portValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Port_portValue_Value> getPortValueSequence();

} // TracedPort
