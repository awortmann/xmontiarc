/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getStates <em>States</em>}</li>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getAutomaton()
 * @model
 * @generated
 */
public interface Automaton extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getAutomaton_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getAutomaton_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getAutomaton_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void assignInitialValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void determineInitialState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // Automaton
