/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MontiarcruntimeFactoryImpl extends EFactoryImpl implements MontiarcruntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MontiarcruntimeFactory init() {
		try {
			MontiarcruntimeFactory theMontiarcruntimeFactory = (MontiarcruntimeFactory)EPackage.Registry.INSTANCE.getEFactory(MontiarcruntimePackage.eNS_URI);
			if (theMontiarcruntimeFactory != null) {
				return theMontiarcruntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MontiarcruntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcruntimeFactoryImpl() {
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
			case MontiarcruntimePackage.PORT_VALUE: return createPortValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortValue createPortValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcruntimePackage getMontiarcruntimePackage() {
		return (MontiarcruntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MontiarcruntimePackage getPackage() {
		return MontiarcruntimePackage.eINSTANCE;
	}

} //MontiarcruntimeFactoryImpl
