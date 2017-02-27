package montiarc.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.ConnectorInstance;
import montiarc.MontiarcFactory;
import montiarc.PortInstance;
import montiarc.PortType;

public class ComponentInstanceHelper {

//	private static List<ConnectorInstance> createConnectorInstancesFrom(ComponentInstance instance, ComponentType ct) {
//		List<ConnectorInstance> instances = new ArrayList<ConnectorInstance>();
//		if (ct != null) {
//			for (ConnectorType connectorType : ct.getConnectorTypes()) {
//				PortInstance sourcePortInstance = null;
//				PortInstance targetPortInstance = null;
//				if (connectorType instanceof IncomingConnectorType) {
//					IncomingConnectorType ict = (IncomingConnectorType) connectorType;
//					sourcePortInstance = findPortInstance(instance, ict.getSourcePortType());
//					ComponentInstance targetComponentInstance = ict.getTargetPortInstance().getParent();
//					targetPortInstance = findPortInstance(targetComponentInstance, ict.getTargetPortInstance());
//				}
//				else if (connectorType instanceof OutgoingConnectorType) {
//					OutgoingConnectorType oct = (OutgoingConnectorType) connectorType;
//					ComponentInstance sourceComponentInstance = oct.getSourcePortInstance().getParent();
//					sourcePortInstance = findPortInstance(sourceComponentInstance, oct.getSourcePortInstance());
//					targetPortInstance = findPortInstance(instance, oct.getTargetPortType());
//				}
//				else if (connectorType instanceof IntermediateConnectorType) {
//					IntermediateConnectorType ict = (IntermediateConnectorType) connectorType;
//					sourcePortInstance = findPortInstance(instance, ict.getSourcePortInstance());
//					targetPortInstance = findPortInstance(instance, ict.getTargetPortInstance());
//				}
//				
//				if (sourcePortInstance != null && targetPortInstance != null) {
//					ConnectorInstance ci = MontiarcFactory.eINSTANCE.createConnectorInstance();
//					ci.setSourcePortInstance(sourcePortInstance);
//					ci.setTargetPortInstance(targetPortInstance);
//					// pi.setParent(this);
//					instances.add(ci);
//					System.out.println("Added connector instance '" + ci.toString() + "' to component instance '" + instance.getInstanceName() + "'.");
//				} else {
//					throw new Error(instance.getInstanceName() + ": ConnectorType referenced inexisting ports!");
//				}
//			}
//		}
//		sortByConnector(instances);
//		return instances;
//	}
	
//	private static void setConnectorInstancesDerivedFromComponentType(ComponentInstance instance) {
//		instance.getConnectorInstances().clear();
//		instance.getConnectorInstances().addAll(createConnectorInstancesFrom(instance, instance.getComponentType()));
//		System.out.println(instance.getInstanceName() + " now has connector instances: '" + instance.getConnectorInstances().toString() + "'.");
//	}

//	private static PortInstance findPortInstance(ComponentInstance instance, PortInstance targetPort) {
//		if (targetPort.getType() != null) {
//			String portName = targetPort.getType().getName();
//			for (PortInstance pi : instance.getPortInstances()) {
//				if (pi.getType().getName().equals(portName)) {
//					return pi;
//				}
//			}
//		}
//		return null;
//	}

//	private static PortInstance findPortInstance(ComponentInstance instance, PortType sourcePortType) {
//		String portName = sourcePortType.getName();
//		for (PortInstance pi : instance.getPortInstances()) {
//			if (pi.getType().getName().equals(portName)) {
//				return pi;
//			}
//		}
//		return null;
//	}

//	private static void sortByConnector(List<ConnectorInstance> list) {
//		Collections.sort(list, new Comparator<ConnectorInstance>() {
//			@Override
//			public int compare(ConnectorInstance lhs, ConnectorInstance rhs) {
//				String lhsString = lhs.toString();
//				String rhsString = rhs.toString();
//				return lhsString.compareTo(rhsString);
//			}
//		});
//	}
	
	public static void setPropertiesDerivedFromComponentType(ComponentInstance instance) {
		ComponentInstanceHelper.printState(instance);
		setPortInstancesDerivedFromComponentType(instance);
		ComponentInstanceHelper.printState(instance);
	}
	
	private static void setPortInstancesDerivedFromComponentType(ComponentInstance instance) {
		instance.getPortInstances().clear();
		instance.getPortInstances().addAll(createPortInstancesFrom(instance.getComponentType()));
	}
	
//	private static void setComponentInstancesDerivedFromComponentType(ComponentInstance instance) {
//		instance.getComponentInstances().clear();
//		instance.getComponentInstances().addAll(createComponentInstancesFrom(instance.getComponentType()));
//	}

	private static List<PortInstance> createPortInstancesFrom(ComponentType ct) {
		List<PortInstance> instances = new ArrayList<PortInstance>();
		if (ct != null) {
			for (PortType pt : ct.getPortTypes()) {
				PortInstance pi = MontiarcFactory.eINSTANCE.createPortInstance();
				pi.setType(pt);
				// pi.setParent(this);
				instances.add(pi);
			}
		}
		sortByPort(instances);
		return instances;
	}
	
//	private static List<ComponentInstance> createComponentInstancesFrom(ComponentType ct) {
//		List<ComponentInstance> instances = new ArrayList<ComponentInstance>();
//		if (ct != null) {
//			for (ComponentInstance ci : ct.getComponentInstances()) {
//				instances.add(ci);
//			}
//		}
//		sortByInstanceName(instances);
//		return instances;
//	}
	
//	private static void sortByInstanceName(List<ComponentInstance> list) {
//		Collections.sort(list, new Comparator<ComponentInstance>() {
//			@Override
//			public int compare(ComponentInstance lhs, ComponentInstance rhs) {
//				String lhsString = lhs.getInstanceName();
//				String rhsString = rhs.getInstanceName();
//				return lhsString.compareTo(rhsString);
//			}
//		});
//	}

	private static void sortByPort(List<PortInstance> list) {
		Collections.sort(list, new Comparator<PortInstance>() {
			@Override
			public int compare(PortInstance lhs, PortInstance rhs) {
				String lhsString = lhs.getType().toString();
				String rhsString = rhs.getType().toString();
				return lhsString.compareTo(rhsString);
			}
		});
	}
	
	public static void printState(ComponentInstance instance) {
		System.out.println("*** Printing state of " + instance.getInstanceName() + " (#" + instance.hashCode() + ") ***");
		
		String compType = instance.getComponentType()!=null ? instance.getComponentType().toString() : "NULL ";
		System.out.println(compType);
		
		System.out.println("  port instances:");
		for (PortInstance pi : instance.getPortInstances()) {
			System.out.println("    " + pi.toString());
		}
		
		System.out.println("  connector instances:");
		for (ConnectorInstance ci : instance.getConnectorInstances()) {
			System.out.println("    " + ci.toString());
		}
		
		
		System.out.println("***\n");
	}
}
