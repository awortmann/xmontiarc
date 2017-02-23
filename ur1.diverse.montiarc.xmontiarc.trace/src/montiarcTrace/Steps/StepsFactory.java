/**
 */
package montiarcTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see montiarcTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = montiarcTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Montiarc Component Type Compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Montiarc Component Type Compute</em>'.
	 * @generated
	 */
	Montiarc_ComponentType_Compute createMontiarc_ComponentType_Compute();

	/**
	 * Returns a new object of class '<em>Montiarc Component Type Compute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Montiarc Component Type Compute Implicit Step</em>'.
	 * @generated
	 */
	Montiarc_ComponentType_Compute_ImplicitStep createMontiarc_ComponentType_Compute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Montiarc Component Type Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Montiarc Component Type Update</em>'.
	 * @generated
	 */
	Montiarc_ComponentType_Update createMontiarc_ComponentType_Update();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
