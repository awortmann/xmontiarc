package ur1.diverse.montiarc.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import montiarc.ComponentType;
import montiarc.Port;
import montiarc.SubcomponentDeclaration;

/**
 * The services class used by VSM.
 */
public class Services {

	public Collection<EObject> getIncomingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, true));
		return ports;
	}
	
	public Collection<EObject> getOutgoingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, false));
		return ports;
	}
	
	public String getPortLabel(EObject self) {
		Port p = (Port)self;
		return p.getType().getName() + " " + p.getName();
	}
	
	public String getSubComponentDeclarationLabel(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return s.getComponentType().getName() + " "  + s.getInstanceName();
	}
	
	public Collection<EObject> getSubcomponentTypesIncomingPorts(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return getIncomingPorts(s.getComponentType());
	}
	
	public Collection<EObject> getSubcomponentTypesOutgoingPorts(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return getOutgoingPorts(s.getComponentType());
	}
	
	/**
	 * Collects either the incoming or outgoing ports of the passed component type.
	 * @param comp ComponentType to process
	 * @param collectIncomingPorts True, iff the incoming ports should be collected
	 * @return A collection containing only incoming or outgoing ports
	 */
	public Collection<Port> getDirectedPorts(ComponentType comp, boolean collectIncomingPorts) {
		Set<Port> ports = new HashSet<>();
		for (Port p : comp.getPorts()) {
			if (collectIncomingPorts && p.isIsIncoming()) {
				ports.add(p);
			} else if (!collectIncomingPorts && !p.isIsIncoming()) {
				ports.add(p);
			}
				
		}
		return ports;
	}
}
