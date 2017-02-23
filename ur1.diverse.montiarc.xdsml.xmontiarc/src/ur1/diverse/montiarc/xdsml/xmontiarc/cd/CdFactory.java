/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarc.cd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage
 * @generated
 */
public interface CdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdFactory eINSTANCE = ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CD Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD Class</em>'.
	 * @generated
	 */
	CDClass createCDClass();

	/**
	 * Returns a new object of class '<em>CD Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD Attribute</em>'.
	 * @generated
	 */
	CDAttribute createCDAttribute();

	/**
	 * Returns a new object of class '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Diagram</em>'.
	 * @generated
	 */
	ClassDiagram createClassDiagram();

	/**
	 * Returns a new object of class '<em>CD Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD Enumeration</em>'.
	 * @generated
	 */
	CDEnumeration createCDEnumeration();

	/**
	 * Returns a new object of class '<em>CD Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD Constant</em>'.
	 * @generated
	 */
	CDConstant createCDConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CdPackage getCdPackage();

} //CdFactory
