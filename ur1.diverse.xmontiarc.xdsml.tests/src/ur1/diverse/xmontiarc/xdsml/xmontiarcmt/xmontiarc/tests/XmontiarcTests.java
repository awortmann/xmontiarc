/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>xmontiarc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmontiarcTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new XmontiarcTests("xmontiarc Tests");
		suite.addTestSuite(ComponentTypeTest.class);
		suite.addTestSuite(ConnectorTest.class);
		suite.addTestSuite(SubcomponentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcTests(String name) {
		super(name);
	}

} //XmontiarcTests
