/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage
 * @generated
 */
public class XmontiarcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmontiarcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcSwitch() {
		if (modelPackage == null) {
			modelPackage = XmontiarcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmontiarcPackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.INCOMING_PORT: {
				IncomingPort incomingPort = (IncomingPort)theEObject;
				T result = caseIncomingPort(incomingPort);
				if (result == null) result = casePort(incomingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.OUTGOING_PORT: {
				OutgoingPort outgoingPort = (OutgoingPort)theEObject;
				T result = caseOutgoingPort(outgoingPort);
				if (result == null) result = casePort(outgoingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR: {
				IntermediateConnector intermediateConnector = (IntermediateConnector)theEObject;
				T result = caseIntermediateConnector(intermediateConnector);
				if (result == null) result = caseConnector(intermediateConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.INCOMING_CONNECTOR: {
				IncomingConnector incomingConnector = (IncomingConnector)theEObject;
				T result = caseIncomingConnector(incomingConnector);
				if (result == null) result = caseConnector(incomingConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.OUTGOING_CONNECTOR: {
				OutgoingConnector outgoingConnector = (OutgoingConnector)theEObject;
				T result = caseOutgoingConnector(outgoingConnector);
				if (result == null) result = caseConnector(outgoingConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.SUBCOMPONENT: {
				Subcomponent subcomponent = (Subcomponent)theEObject;
				T result = caseSubcomponent(subcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.COMPONENT_BEHAVIOR: {
				ComponentBehavior componentBehavior = (ComponentBehavior)theEObject;
				T result = caseComponentBehavior(componentBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR: {
				GroovyComponentBehavior groovyComponentBehavior = (GroovyComponentBehavior)theEObject;
				T result = caseGroovyComponentBehavior(groovyComponentBehavior);
				if (result == null) result = caseComponentBehavior(groovyComponentBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR: {
				AutomatonComponentBehavior automatonComponentBehavior = (AutomatonComponentBehavior)theEObject;
				T result = caseAutomatonComponentBehavior(automatonComponentBehavior);
				if (result == null) result = caseComponentBehavior(automatonComponentBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingPort(IncomingPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingPort(OutgoingPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateConnector(IntermediateConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingConnector(IncomingConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingConnector(OutgoingConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcomponent(Subcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentBehavior(ComponentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groovy Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groovy Component Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroovyComponentBehavior(GroovyComponentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automaton Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automaton Component Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatonComponentBehavior(AutomatonComponentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmontiarcSwitch
