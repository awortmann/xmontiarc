/**
 */
package montiarcTrace.States.montiarc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see montiarcTrace.States.montiarc.MontiarcFactory
 * @model kind="package"
 * @generated
 */
public interface MontiarcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "montiarc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "montiarcTrace_montiarc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcPackage eINSTANCE = montiarcTrace.States.montiarc.impl.MontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link montiarcTrace.States.montiarc.impl.TracedPortImpl <em>Traced Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.States.montiarc.impl.TracedPortImpl
	 * @see montiarcTrace.States.montiarc.impl.MontiarcPackageImpl#getTracedPort()
	 * @generated
	 */
	int TRACED_PORT = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Port Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT__PORT_VALUE_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link montiarcTrace.States.montiarc.impl.TracedPortValueImpl <em>Traced Port Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.States.montiarc.impl.TracedPortValueImpl
	 * @see montiarcTrace.States.montiarc.impl.MontiarcPackageImpl#getTracedPortValue()
	 * @generated
	 */
	int TRACED_PORT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Traced Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PORT_VALUE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link montiarcTrace.States.montiarc.TracedPort <em>Traced Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Port</em>'.
	 * @see montiarcTrace.States.montiarc.TracedPort
	 * @generated
	 */
	EClass getTracedPort();

	/**
	 * Returns the meta object for the reference '{@link montiarcTrace.States.montiarc.TracedPort#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see montiarcTrace.States.montiarc.TracedPort#getOriginalObject()
	 * @see #getTracedPort()
	 * @generated
	 */
	EReference getTracedPort_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link montiarcTrace.States.montiarc.TracedPort#getPortValueSequence <em>Port Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Value Sequence</em>'.
	 * @see montiarcTrace.States.montiarc.TracedPort#getPortValueSequence()
	 * @see #getTracedPort()
	 * @generated
	 */
	EReference getTracedPort_PortValueSequence();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.States.montiarc.TracedPortValue <em>Traced Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Port Value</em>'.
	 * @see montiarcTrace.States.montiarc.TracedPortValue
	 * @generated
	 */
	EClass getTracedPortValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MontiarcFactory getMontiarcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link montiarcTrace.States.montiarc.impl.TracedPortImpl <em>Traced Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.States.montiarc.impl.TracedPortImpl
		 * @see montiarcTrace.States.montiarc.impl.MontiarcPackageImpl#getTracedPort()
		 * @generated
		 */
		EClass TRACED_PORT = eINSTANCE.getTracedPort();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PORT__ORIGINAL_OBJECT = eINSTANCE.getTracedPort_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Port Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PORT__PORT_VALUE_SEQUENCE = eINSTANCE.getTracedPort_PortValueSequence();

		/**
		 * The meta object literal for the '{@link montiarcTrace.States.montiarc.impl.TracedPortValueImpl <em>Traced Port Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.States.montiarc.impl.TracedPortValueImpl
		 * @see montiarcTrace.States.montiarc.impl.MontiarcPackageImpl#getTracedPortValue()
		 * @generated
		 */
		EClass TRACED_PORT_VALUE = eINSTANCE.getTracedPortValue();

	}

} //MontiarcPackage
