/**
 */
package montiarc.util;

import java.util.Map;

import montiarc.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see montiarc.MontiarcPackage
 * @generated
 */
public class MontiarcValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MontiarcValidator INSTANCE = new MontiarcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "montiarc";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MontiarcPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MontiarcPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case MontiarcPackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			case MontiarcPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case MontiarcPackage.PORT_INSTANCE:
				return validatePortInstance((PortInstance)value, diagnostics, context);
			case MontiarcPackage.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE:
				return validateIntermediateConnectorType((IntermediateConnectorType)value, diagnostics, context);
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE:
				return validateIncomingConnectorType((IncomingConnectorType)value, diagnostics, context);
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE:
				return validateOutgoingConnectorType((OutgoingConnectorType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentType_NameIsLeadingUpperCase(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentType_ConnectorsDoNotCrossCutComponents(componentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of component type \"' + name + '\" must begin uppercase.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlet firstLetter: String = (name).substring(1, 1) \n" +
		"\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType_NameIsLeadingUpperCase(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_TYPE,
				 componentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 COMPONENT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConnectorsDoNotCrossCutComponents constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_TYPE__CONNECTORS_DO_NOT_CROSS_CUT_COMPONENTS__EEXPRESSION = "\n" +
		"\t\t\ttrue";

	/**
	 * Validates the ConnectorsDoNotCrossCutComponents constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType_ConnectorsDoNotCrossCutComponents(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_TYPE,
				 componentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectorsDoNotCrossCutComponents",
				 COMPONENT_TYPE__CONNECTORS_DO_NOT_CROSS_CUT_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortType_NameIsLeadingUpperCase(portType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of port \"' + name + '\" must begin lowercase.',\n" +
		"\tstatus : Boolean = let firstLetter : String =\n" +
		"\t\t\t(name).substring(1, 1)\n" +
		"\t\tin firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType_NameIsLeadingUpperCase(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.PORT_TYPE,
				 portType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 PORT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_NameIsLeadingUpperCase(componentInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_INSTANCE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of instance name of subcomponent \"' + instanceName +\n" +
		"\t\t\t'\" must begin lowercase.',\n" +
		"\tstatus : Boolean = let firstLetter : String = (instanceName).substring(1, 1)\n" +
		"\t\tin firstLetter.toUpperCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance_NameIsLeadingUpperCase(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_INSTANCE,
				 componentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 COMPONENT_INSTANCE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_ConnectsDifferentComponents(connectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_PortTypeMatch(connectorType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectsDifferentComponents constraint of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_TYPE__CONNECTS_DIFFERENT_COMPONENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The connector must connect two different subcomponents.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.sourceSubcomponent <> self.targetSubcomponent\n" +
		"}.status";

	/**
	 * Validates the ConnectsDifferentComponents constraint of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType_ConnectsDifferentComponents(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR_TYPE,
				 connectorType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectsDifferentComponents",
				 CONNECTOR_TYPE__CONNECTS_DIFFERENT_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PortTypeMatch constraint of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_TYPE__PORT_TYPE_MATCH__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Both ports of a connector must have the same type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.sourcePort.type = self.targetPort.type\n" +
		"}.status";

	/**
	 * Validates the PortTypeMatch constraint of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType_PortTypeMatch(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR_TYPE,
				 connectorType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PortTypeMatch",
				 CONNECTOR_TYPE__PORT_TYPE_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateConnectorType(IntermediateConnectorType intermediateConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermediateConnectorType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_ConnectsDifferentComponents(intermediateConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_PortTypeMatch(intermediateConnectorType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingConnectorType(IncomingConnectorType incomingConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(incomingConnectorType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_ConnectsDifferentComponents(incomingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_PortTypeMatch(incomingConnectorType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingConnectorType(OutgoingConnectorType outgoingConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outgoingConnectorType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_ConnectsDifferentComponents(outgoingConnectorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorType_PortTypeMatch(outgoingConnectorType, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MontiarcValidator
