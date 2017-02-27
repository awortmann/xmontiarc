package montiarc.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.ConnectorInstance;
import montiarc.ConnectorType;
import montiarc.IncomingConnectorType;
import montiarc.IntermediateConnectorType;
import montiarc.MontiarcFactory;
import montiarc.OutgoingConnectorType;
import montiarc.PortInstance;
import montiarc.PortType;

public class ComponentInstanceHelper {

	public List<ConnectorInstance> createConnectorInstancesFrom(ComponentInstance instance, ComponentType ct) {
		List<ConnectorInstance> instances = new ArrayList<ConnectorInstance>();
		if (ct != null) {
			for (ConnectorType pt : ct.getConnectors()) {
				PortInstance sourcePortInstance = null;
				PortInstance targetPortInstance = null;
				if (pt instanceof IncomingConnectorType) {
					sourcePortInstance = findPortInstance(instance, ((IncomingConnectorType) pt).getSourcePortType());
					targetPortInstance = findPortInstance(instance, ((IncomingConnectorType) pt).getTargetPortInstance());
				}
				else if (pt instanceof OutgoingConnectorType) {
					sourcePortInstance = findPortInstance(instance, ((OutgoingConnectorType) pt).getSourcePortInstance());
					targetPortInstance = findPortInstance(instance, ((OutgoingConnectorType) pt).getTargetPortType());
				}
				else if (pt instanceof IntermediateConnectorType) {
					sourcePortInstance = findPortInstance(instance, ((IntermediateConnectorType) pt).getSourcePortInstance());
					targetPortInstance = findPortInstance(instance, ((IntermediateConnectorType) pt).getTargetPortInstance());
				}
				
				if (sourcePortInstance != null && targetPortInstance != null) {
					ConnectorInstance ci = MontiarcFactory.eINSTANCE.createConnectorInstance();
					ci.setSourcePortInstance(sourcePortInstance);
					ci.setSourcePortInstance(targetPortInstance);
					// pi.setParent(this);
					instances.add(ci);
				} else {
					throw new Error(instance.getInstanceName() + ": ConnectorType referenced inexisting ports!");
				}
			}
		}
		sortByConnector(instances);
		return instances;
	}
	
	private void setConnectorInstancesDerivedFromComponentType(ComponentInstance instance) {
		instance.getConnectorInstances().clear();
		instance.getConnectorInstances().addAll(this.createConnectorInstancesFrom(instance, instance.getComponentType()));
	}

	private PortInstance findPortInstance(ComponentInstance instance, PortInstance targetPort) {
		if (targetPort.getType() != null) {
			String portName = targetPort.getType().getName();
			for (PortInstance pi : instance.getPortInstances()) {
				if (pi.getType().getName().equals(portName)) {
					return pi;
				}
			}
		}
		return null;
	}

	private PortInstance findPortInstance(ComponentInstance instance, PortType sourcePortType) {
		String portName = sourcePortType.getName();
		for (PortInstance pi : instance.getPortInstances()) {
			if (pi.getType().getName().equals(portName)) {
				return pi;
			}
		}
		return null;
	}

	private void sortByConnector(List<ConnectorInstance> list) {
		Collections.sort(list, new Comparator<ConnectorInstance>() {
			@Override
			public int compare(ConnectorInstance lhs, ConnectorInstance rhs) {
				String lhsString = lhs.toString();
				String rhsString = rhs.toString();
				return lhsString.compareTo(rhsString);
			}
		});
	}
	
	private void setPortInstancesDerivedFromComponentType(ComponentInstance instance) {
		instance.getPortInstances().clear();
		instance.getPortInstances().addAll(this.createPortInstancesFrom(instance.getComponentType()));
	}

	private List<PortInstance> createPortInstancesFrom(ComponentType ct) {
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

	private void sortByPort(List<PortInstance> list) {
		Collections.sort(list, new Comparator<PortInstance>() {
			@Override
			public int compare(PortInstance lhs, PortInstance rhs) {
				String lhsString = lhs.getType().toString();
				String rhsString = rhs.getType().toString();
				return lhsString.compareTo(rhsString);
			}
		});
	}
	
	private void printResourceState(ComponentInstance instance) {
		System.out.println("*** Printing resource state of " + instance.getInstanceName() + " (#" + this.hashCode() + ") ***");
		for (EObject item : instance.eContainer().eResource().getContents()) {
			ComponentType ct = (ComponentType) item;
			System.out.println(ct.toString());
			for (ComponentInstance sc : ct.getComponentInstances()) {
				System.out.println("  " + sc.toString());
				for (PortInstance pi : sc.getPortInstances()) {
					System.out.println("    " + pi.toString());
				}
			}
		}
		System.out.println("***\n");
	}
}
