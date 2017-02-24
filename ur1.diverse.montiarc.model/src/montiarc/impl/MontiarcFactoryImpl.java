/**
 */
package montiarc.impl;

import montiarc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MontiarcFactoryImpl extends EFactoryImpl implements MontiarcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MontiarcFactory init() {
		try {
			MontiarcFactory theMontiarcFactory = (MontiarcFactory)EPackage.Registry.INSTANCE.getEFactory(MontiarcPackage.eNS_URI);
			if (theMontiarcFactory != null) {
				return theMontiarcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MontiarcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MontiarcPackage.COMPONENT_TYPE: return createComponentType();
			case MontiarcPackage.PORT_TYPE: return createPortType();
			case MontiarcPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case MontiarcPackage.PORT_INSTANCE: return createPortInstance();
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE: return createIntermediateConnectorType();
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE: return createIncomingConnectorType();
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE: return createOutgoingConnectorType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance createPortInstance() {
		PortInstanceImpl portInstance = new PortInstanceImpl();
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateConnectorType createIntermediateConnectorType() {
		IntermediateConnectorTypeImpl intermediateConnectorType = new IntermediateConnectorTypeImpl();
		return intermediateConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingConnectorType createIncomingConnectorType() {
		IncomingConnectorTypeImpl incomingConnectorType = new IncomingConnectorTypeImpl();
		return incomingConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingConnectorType createOutgoingConnectorType() {
		OutgoingConnectorTypeImpl outgoingConnectorType = new OutgoingConnectorTypeImpl();
		return outgoingConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcPackage getMontiarcPackage() {
		return (MontiarcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MontiarcPackage getPackage() {
		return MontiarcPackage.eINSTANCE;
	}

} //MontiarcFactoryImpl
