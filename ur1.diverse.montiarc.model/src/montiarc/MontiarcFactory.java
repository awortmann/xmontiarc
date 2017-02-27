/**
 */
package montiarc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see montiarc.MontiarcPackage
 * @generated
 */
public interface MontiarcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcFactory eINSTANCE = montiarc.impl.MontiarcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Instance</em>'.
	 * @generated
	 */
	ConnectorInstance createConnectorInstance();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type</em>'.
	 * @generated
	 */
	PortType createPortType();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance</em>'.
	 * @generated
	 */
	PortInstance createPortInstance();

	/**
	 * Returns a new object of class '<em>Intermediate Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Connector Type</em>'.
	 * @generated
	 */
	IntermediateConnectorType createIntermediateConnectorType();

	/**
	 * Returns a new object of class '<em>Incoming Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Connector Type</em>'.
	 * @generated
	 */
	IncomingConnectorType createIncomingConnectorType();

	/**
	 * Returns a new object of class '<em>Outgoing Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Connector Type</em>'.
	 * @generated
	 */
	OutgoingConnectorType createOutgoingConnectorType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MontiarcPackage getMontiarcPackage();

} //MontiarcFactory
