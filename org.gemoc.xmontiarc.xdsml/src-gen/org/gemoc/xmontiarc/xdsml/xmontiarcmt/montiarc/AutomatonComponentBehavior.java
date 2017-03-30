/**
 */
package org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getAutomatonComponentBehavior()
 * @model
 * @generated
 */
public interface AutomatonComponentBehavior extends ComponentBehavior {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendPortValuesToAutomaton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPortValuesFromAutomaton();
} // AutomatonComponentBehavior
