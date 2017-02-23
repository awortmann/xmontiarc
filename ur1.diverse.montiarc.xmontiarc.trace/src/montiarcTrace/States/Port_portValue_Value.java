/**
 */
package montiarcTrace.States;

import montiarcTrace.States.montiarc.TracedPort;
import montiarcTrace.States.montiarc.TracedPortValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port port Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.States.Port_portValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link montiarcTrace.States.Port_portValue_Value#getPortValue <em>Port Value</em>}</li>
 *   <li>{@link montiarcTrace.States.Port_portValue_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see montiarcTrace.States.StatesPackage#getPort_portValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Port_portValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.States.montiarc.TracedPort#getPortValueSequence <em>Port Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPort)
	 * @see montiarcTrace.States.StatesPackage#getPort_portValue_Value_Parent()
	 * @see montiarcTrace.States.montiarc.TracedPort#getPortValueSequence
	 * @model opposite="portValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPort getParent();

	/**
	 * Sets the value of the '{@link montiarcTrace.States.Port_portValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPort value);

	/**
	 * Returns the value of the '<em><b>Port Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Value</em>' reference.
	 * @see #setPortValue(TracedPortValue)
	 * @see montiarcTrace.States.StatesPackage#getPort_portValue_Value_PortValue()
	 * @model
	 * @generated
	 */
	TracedPortValue getPortValue();

	/**
	 * Sets the value of the '{@link montiarcTrace.States.Port_portValue_Value#getPortValue <em>Port Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Value</em>' reference.
	 * @see #getPortValue()
	 * @generated
	 */
	void setPortValue(TracedPortValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.States.State#getPort_portValue_Values <em>Port port Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see montiarcTrace.States.StatesPackage#getPort_portValue_Value_States()
	 * @see montiarcTrace.States.State#getPort_portValue_Values
	 * @model opposite="port_portValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Port_portValue_Value
