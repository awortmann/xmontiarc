/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.tests;

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
		suite.addTestSuite(PortTest.class);
		suite.addTestSuite(IncomingPortTest.class);
		suite.addTestSuite(OutgoingPortTest.class);
		suite.addTestSuite(IntermediateConnectorTest.class);
		suite.addTestSuite(IncomingConnectorTest.class);
		suite.addTestSuite(OutgoingConnectorTest.class);
		suite.addTestSuite(SubcomponentTest.class);
		suite.addTestSuite(AutomatonComponentBehaviorTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(BooleanGuardTest.class);
		suite.addTestSuite(StringGuardTest.class);
		suite.addTestSuite(EqualNumberGuardTest.class);
		suite.addTestSuite(StringActionTest.class);
		suite.addTestSuite(NumberActionTest.class);
		suite.addTestSuite(BooleanActionTest.class);
		suite.addTestSuite(LessThanNumberGuardTest.class);
		suite.addTestSuite(GreaterThanNumberGuardTest.class);
		suite.addTestSuite(GreaterOrEqualThanNumberGuardTest.class);
		suite.addTestSuite(LessOrEqualThanNumberGuardTest.class);
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
