/**
 */
package montiarcTrace.States;

import montiarcTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link montiarcTrace.States.State#getPort_portValue_Values <em>Port port Value Values</em>}</li>
 *   <li>{@link montiarcTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @see montiarcTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see montiarcTrace.States.StatesPackage#getState_EndedSteps()
	 * @see montiarcTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Port port Value Values</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.States.Port_portValue_Value}.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.States.Port_portValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port port Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port port Value Values</em>' reference list.
	 * @see montiarcTrace.States.StatesPackage#getState_Port_portValue_Values()
	 * @see montiarcTrace.States.Port_portValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Port_portValue_Value> getPort_portValue_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link montiarcTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see montiarcTrace.States.StatesPackage#getState_StartedSteps()
	 * @see montiarcTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

} // State
