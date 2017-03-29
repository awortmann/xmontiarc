/**
 */
package org.gemoc.montiarc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.montiarc.*;

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
			case MontiarcPackage.INCOMING_PORT: return createIncomingPort();
			case MontiarcPackage.OUTGOING_PORT: return createOutgoingPort();
			case MontiarcPackage.INTERMEDIATE_CONNECTOR: return createIntermediateConnector();
			case MontiarcPackage.INCOMING_CONNECTOR: return createIncomingConnector();
			case MontiarcPackage.OUTGOING_CONNECTOR: return createOutgoingConnector();
			case MontiarcPackage.SUBCOMPONENT: return createSubcomponent();
			case MontiarcPackage.GROOVY_COMPONENT_BEHAVIOR: return createGroovyComponentBehavior();
			case MontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR: return createAutomatonComponentBehavior();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MontiarcPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MontiarcPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public IncomingPort createIncomingPort() {
		IncomingPortImpl incomingPort = new IncomingPortImpl();
		return incomingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingPort createOutgoingPort() {
		OutgoingPortImpl outgoingPort = new OutgoingPortImpl();
		return outgoingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateConnector createIntermediateConnector() {
		IntermediateConnectorImpl intermediateConnector = new IntermediateConnectorImpl();
		return intermediateConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingConnector createIncomingConnector() {
		IncomingConnectorImpl incomingConnector = new IncomingConnectorImpl();
		return incomingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingConnector createOutgoingConnector() {
		OutgoingConnectorImpl outgoingConnector = new OutgoingConnectorImpl();
		return outgoingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent createSubcomponent() {
		SubcomponentImpl subcomponent = new SubcomponentImpl();
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroovyComponentBehavior createGroovyComponentBehavior() {
		GroovyComponentBehaviorImpl groovyComponentBehavior = new GroovyComponentBehaviorImpl();
		return groovyComponentBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatonComponentBehavior createAutomatonComponentBehavior() {
		AutomatonComponentBehaviorImpl automatonComponentBehavior = new AutomatonComponentBehaviorImpl();
		return automatonComponentBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
