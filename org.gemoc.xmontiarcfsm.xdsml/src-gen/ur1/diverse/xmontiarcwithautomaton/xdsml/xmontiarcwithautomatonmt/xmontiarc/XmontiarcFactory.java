/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage
 * @generated
 */
public interface XmontiarcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmontiarcFactory eINSTANCE = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.impl.XmontiarcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Incoming Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Port</em>'.
	 * @generated
	 */
	IncomingPort createIncomingPort();

	/**
	 * Returns a new object of class '<em>Outgoing Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Port</em>'.
	 * @generated
	 */
	OutgoingPort createOutgoingPort();

	/**
	 * Returns a new object of class '<em>Intermediate Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Connector</em>'.
	 * @generated
	 */
	IntermediateConnector createIntermediateConnector();

	/**
	 * Returns a new object of class '<em>Incoming Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Connector</em>'.
	 * @generated
	 */
	IncomingConnector createIncomingConnector();

	/**
	 * Returns a new object of class '<em>Outgoing Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Connector</em>'.
	 * @generated
	 */
	OutgoingConnector createOutgoingConnector();

	/**
	 * Returns a new object of class '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subcomponent</em>'.
	 * @generated
	 */
	Subcomponent createSubcomponent();

	/**
	 * Returns a new object of class '<em>Groovy Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Groovy Component Behavior</em>'.
	 * @generated
	 */
	GroovyComponentBehavior createGroovyComponentBehavior();

	/**
	 * Returns a new object of class '<em>Automaton Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automaton Component Behavior</em>'.
	 * @generated
	 */
	AutomatonComponentBehavior createAutomatonComponentBehavior();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Variable</em>'.
	 * @generated
	 */
	StringVariable createStringVariable();

	/**
	 * Returns a new object of class '<em>Number Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Variable</em>'.
	 * @generated
	 */
	NumberVariable createNumberVariable();

	/**
	 * Returns a new object of class '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariable createBooleanVariable();

	/**
	 * Returns a new object of class '<em>Boolean Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Guard</em>'.
	 * @generated
	 */
	BooleanGuard createBooleanGuard();

	/**
	 * Returns a new object of class '<em>String Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Guard</em>'.
	 * @generated
	 */
	StringGuard createStringGuard();

	/**
	 * Returns a new object of class '<em>Equal Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Number Guard</em>'.
	 * @generated
	 */
	EqualNumberGuard createEqualNumberGuard();

	/**
	 * Returns a new object of class '<em>String Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Action</em>'.
	 * @generated
	 */
	StringAction createStringAction();

	/**
	 * Returns a new object of class '<em>Number Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Action</em>'.
	 * @generated
	 */
	NumberAction createNumberAction();

	/**
	 * Returns a new object of class '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Action</em>'.
	 * @generated
	 */
	BooleanAction createBooleanAction();

	/**
	 * Returns a new object of class '<em>Less Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Number Guard</em>'.
	 * @generated
	 */
	LessThanNumberGuard createLessThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Greater Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Number Guard</em>'.
	 * @generated
	 */
	GreaterThanNumberGuard createGreaterThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Greater Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Or Equal Than Number Guard</em>'.
	 * @generated
	 */
	GreaterOrEqualThanNumberGuard createGreaterOrEqualThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Less Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Or Equal Than Number Guard</em>'.
	 * @generated
	 */
	LessOrEqualThanNumberGuard createLessOrEqualThanNumberGuard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmontiarcPackage getXmontiarcPackage();

} //XmontiarcFactory
