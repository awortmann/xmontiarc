/**
 */
package xmontiarc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xmontiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xmontiarc.XmontiarcPackage
 * @generated
 */
public class XmontiarcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmontiarcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmontiarcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmontiarcSwitch<Adapter> modelSwitch =
		new XmontiarcSwitch<Adapter>() {
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseIncomingPort(IncomingPort object) {
				return createIncomingPortAdapter();
			}
			@Override
			public Adapter caseOutgoingPort(OutgoingPort object) {
				return createOutgoingPortAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseIntermediateConnector(IntermediateConnector object) {
				return createIntermediateConnectorAdapter();
			}
			@Override
			public Adapter caseIncomingConnector(IncomingConnector object) {
				return createIncomingConnectorAdapter();
			}
			@Override
			public Adapter caseOutgoingConnector(OutgoingConnector object) {
				return createOutgoingConnectorAdapter();
			}
			@Override
			public Adapter caseSubcomponent(Subcomponent object) {
				return createSubcomponentAdapter();
			}
			@Override
			public Adapter caseComponentBehavior(ComponentBehavior object) {
				return createComponentBehaviorAdapter();
			}
			@Override
			public Adapter caseGroovyComponentBehavior(GroovyComponentBehavior object) {
				return createGroovyComponentBehaviorAdapter();
			}
			@Override
			public Adapter caseAutomatonComponentBehavior(AutomatonComponentBehavior object) {
				return createAutomatonComponentBehaviorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.IncomingPort <em>Incoming Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.IncomingPort
	 * @generated
	 */
	public Adapter createIncomingPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.OutgoingPort <em>Outgoing Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.OutgoingPort
	 * @generated
	 */
	public Adapter createOutgoingPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.IntermediateConnector <em>Intermediate Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.IntermediateConnector
	 * @generated
	 */
	public Adapter createIntermediateConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.IncomingConnector <em>Incoming Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.IncomingConnector
	 * @generated
	 */
	public Adapter createIncomingConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.OutgoingConnector <em>Outgoing Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.OutgoingConnector
	 * @generated
	 */
	public Adapter createOutgoingConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.Subcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.Subcomponent
	 * @generated
	 */
	public Adapter createSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.ComponentBehavior <em>Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.ComponentBehavior
	 * @generated
	 */
	public Adapter createComponentBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.GroovyComponentBehavior <em>Groovy Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.GroovyComponentBehavior
	 * @generated
	 */
	public Adapter createGroovyComponentBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmontiarc.AutomatonComponentBehavior <em>Automaton Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmontiarc.AutomatonComponentBehavior
	 * @generated
	 */
	public Adapter createAutomatonComponentBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmontiarcAdapterFactory
