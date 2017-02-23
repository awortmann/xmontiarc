/**
 */
package montiarcTrace.States.montiarc.impl;

import montiarcTrace.States.montiarc.*;

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
			case MontiarcPackage.TRACED_PORT: return createTracedPort();
			case MontiarcPackage.TRACED_PORT_VALUE: return createTracedPortValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPort createTracedPort() {
		TracedPortImpl tracedPort = new TracedPortImpl();
		return tracedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPortValue createTracedPortValue() {
		TracedPortValueImpl tracedPortValue = new TracedPortValueImpl();
		return tracedPortValue;
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
