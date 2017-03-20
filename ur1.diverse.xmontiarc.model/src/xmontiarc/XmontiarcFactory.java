/**
 */
package xmontiarc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xmontiarc.XmontiarcPackage
 * @generated
 */
public interface XmontiarcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmontiarcFactory eINSTANCE = xmontiarc.impl.XmontiarcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmontiarcPackage getXmontiarcPackage();

} //XmontiarcFactory
