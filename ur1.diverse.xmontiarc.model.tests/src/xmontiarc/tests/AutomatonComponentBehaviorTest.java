/**
 */
package xmontiarc.tests;

import junit.textui.TestRunner;

import xmontiarc.AutomatonComponentBehavior;
import xmontiarc.XmontiarcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Automaton Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomatonComponentBehaviorTest extends ComponentBehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AutomatonComponentBehaviorTest.class);
	}

	/**
	 * Constructs a new Automaton Component Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatonComponentBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Automaton Component Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AutomatonComponentBehavior getFixture() {
		return (AutomatonComponentBehavior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XmontiarcFactory.eINSTANCE.createAutomatonComponentBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AutomatonComponentBehaviorTest
