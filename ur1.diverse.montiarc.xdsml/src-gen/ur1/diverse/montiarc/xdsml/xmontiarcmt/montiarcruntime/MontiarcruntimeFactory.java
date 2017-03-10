/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.MontiarcruntimePackage
 * @generated
 */
public interface MontiarcruntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcruntimeFactory eINSTANCE = ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.impl.MontiarcruntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Value</em>'.
	 * @generated
	 */
	PortValue createPortValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MontiarcruntimePackage getMontiarcruntimePackage();

} //MontiarcruntimeFactory
