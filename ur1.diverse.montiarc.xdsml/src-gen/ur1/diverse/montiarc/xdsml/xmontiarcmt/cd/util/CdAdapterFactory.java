/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CdPackage
 * @generated
 */
public class CdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CdPackage.eINSTANCE;
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
	protected CdSwitch<Adapter> modelSwitch =
		new CdSwitch<Adapter>() {
			@Override
			public Adapter caseCDClass(CDClass object) {
				return createCDClassAdapter();
			}
			@Override
			public Adapter caseCDAttribute(CDAttribute object) {
				return createCDAttributeAdapter();
			}
			@Override
			public Adapter caseClassDiagram(ClassDiagram object) {
				return createClassDiagramAdapter();
			}
			@Override
			public Adapter caseCDEnumeration(CDEnumeration object) {
				return createCDEnumerationAdapter();
			}
			@Override
			public Adapter caseCDConstant(CDConstant object) {
				return createCDConstantAdapter();
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
	 * Creates a new adapter for an object of class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDClass <em>CD Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDClass
	 * @generated
	 */
	public Adapter createCDClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDAttribute <em>CD Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDAttribute
	 * @generated
	 */
	public Adapter createCDAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.ClassDiagram
	 * @generated
	 */
	public Adapter createClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDEnumeration <em>CD Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDEnumeration
	 * @generated
	 */
	public Adapter createCDEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDConstant <em>CD Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDConstant
	 * @generated
	 */
	public Adapter createCDConstantAdapter() {
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

} //CdAdapterFactory
