/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ur1.diverse.montiarc.xdsml.xmontiarc.cd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdFactoryImpl extends EFactoryImpl implements CdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdFactory init() {
		try {
			CdFactory theCdFactory = (CdFactory)EPackage.Registry.INSTANCE.getEFactory(CdPackage.eNS_URI);
			if (theCdFactory != null) {
				return theCdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdFactoryImpl() {
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
			case CdPackage.CD_CLASS: return createCDClass();
			case CdPackage.CD_ATTRIBUTE: return createCDAttribute();
			case CdPackage.CLASS_DIAGRAM: return createClassDiagram();
			case CdPackage.CD_ENUMERATION: return createCDEnumeration();
			case CdPackage.CD_CONSTANT: return createCDConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDClass createCDClass() {
		CDClassImpl cdClass = new CDClassImpl();
		return cdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAttribute createCDAttribute() {
		CDAttributeImpl cdAttribute = new CDAttributeImpl();
		return cdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram createClassDiagram() {
		ClassDiagramImpl classDiagram = new ClassDiagramImpl();
		return classDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEnumeration createCDEnumeration() {
		CDEnumerationImpl cdEnumeration = new CDEnumerationImpl();
		return cdEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDConstant createCDConstant() {
		CDConstantImpl cdConstant = new CDConstantImpl();
		return cdConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdPackage getCdPackage() {
		return (CdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdPackage getPackage() {
		return CdPackage.eINSTANCE;
	}

} //CdFactoryImpl
