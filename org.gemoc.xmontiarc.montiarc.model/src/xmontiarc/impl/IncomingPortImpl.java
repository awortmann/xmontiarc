/**
 */
package xmontiarc.impl;

import org.eclipse.emf.ecore.EClass;

import xmontiarc.IncomingPort;
import xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IncomingPortImpl extends PortImpl implements IncomingPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.INCOMING_PORT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		return "in " + super.toString();
	}

} //IncomingPortImpl
