package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl;


/**
 * The services class used by VSM.
 */
public class Services {
    
	public Collection<EObject> getComponentIncomingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ComponentTypeImpl c = (ComponentTypeImpl) self;
		
		for (Port p : c.getIncomingPorts()) {
			ports.add(p);
		}
		
		return ports;
	}
	
	public Collection<EObject> getComponentOutgoingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ComponentTypeImpl c = (ComponentTypeImpl) self;
		ports.addAll(c.getOutgoingPorts());
		return ports;
	}
	
	public Collection<EObject> getSubcomponentIncomingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		SubcomponentImpl c = (SubcomponentImpl) self;
		ports.addAll(c.getIncomingPorts());
//		System.out.println("Services.getSubcomponentIncomingPorts(" + c.toString() + "): subcomponent has incoming ports '" + ports.toString() + "'.");
		return ports;
	}
	
	public Collection<EObject> getSubcomponentOutgoingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		SubcomponentImpl c = (SubcomponentImpl) self;
		ports.addAll(c.getOutgoingPorts());
//		System.out.println("Services.getSubcomponentOutgoingPorts(" + c.toString() + "): subcomponent has outgoing ports '" + ports.toString() + "'.");
		return ports;
	}
	
	public String getPortLabel(EObject self) {
		Port p = (Port)self;
//		System.out.println("Services.getPortLabel(" + p.toString() + ")");
		return p.getType() + " " + p.getName();
	}
	
	public String getSubcomponentLabel(EObject self) {
		Subcomponent p = (Subcomponent)self;
//		System.out.println("Services.getSubcomponentLabel(" + p.toString() + ")");
		return p.getType().getName() + " " + p.getName();
	}
	
	public EObject getConnectorSourcePort(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing source port for connector '" + c.toString() + "'.");
		return c.getSource();
	}
	
	public EObject getConnectorTargetPort(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing target port for connector '" + c.toString() + "'.");
		return c.getTarget();
	}
	
	public EObject getIncomingConnectorSourcePortCandidates(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing source port for connector '" + c.toString() + "'.");
		return c.getSource();
	}
	
	public EObject getIncomingConnectorTargetPortCandidates(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing target port for connector '" + c.toString() + "'.");
		return c.getTarget();
	}
	
	public EObject getOutgoingConnectorSourcePortCandidates(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing source port for connector '" + c.toString() + "'.");
		return c.getSource();
	}
	
	public EObject getOutgoingConnectorTargetPortCandidates(EObject self) {
		Connector c = (Connector)self;
//		System.out.println("Drawing target port for connector '" + c.toString() + "'.");
		return c.getTarget();
	}
}
