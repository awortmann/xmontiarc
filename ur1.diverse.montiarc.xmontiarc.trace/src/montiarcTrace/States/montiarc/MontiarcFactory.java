/**
 */
package montiarcTrace.States.montiarc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see montiarcTrace.States.montiarc.MontiarcPackage
 * @generated
 */
public interface MontiarcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcFactory eINSTANCE = montiarcTrace.States.montiarc.impl.MontiarcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Port</em>'.
	 * @generated
	 */
	TracedPort createTracedPort();

	/**
	 * Returns a new object of class '<em>Traced Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Port Value</em>'.
	 * @generated
	 */
	TracedPortValue createTracedPortValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MontiarcPackage getMontiarcPackage();

} //MontiarcFactory
