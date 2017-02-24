package ur1.diverse.montiarc.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import montiarc.ComponentType;
import montiarc.Connector;
import montiarc.Port;
import montiarc.PortType;

/**
 * Services for component type aspects of montiarc diagrams.
 * @author Andreas Wortmann <wortmann@se-rwth.de>
 */
public class ComponentTypeServices {
	
	/**
	 * A nice label for {@link PortType}s
	 * @param self A {@link PortType}
	 * @return 
	 */
	public String getPortTypeLabel(EObject self) {
		PortType pt = ((Port)self).getType();
		return pt.getType().getName() + " " + pt.getName();
	}

	/**
	 * Returns the incoming {@link PortType}s of passed component type
	 * @param self A {@link ComponentType}
	 * @return A set of its incoming {@link PortType}s
	 */
	public Collection<EObject> getComponentTypeIncomingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, true));
		return ports;
	}
	
	
	/**
	 * Returns the outgoing {@link PortType}s of passed component type
	 * @param self A {@link ComponentType}
	 * @return A set of its outgoing {@link PortType}s
	 */
	public Collection<EObject> getComponentTypeOutgoingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, false));
		return ports;
	}
	
	/**
	 * Collects either the incoming or outgoing {@link PortType}s of the passed component type.
	 * @param comp {@link ComponentType} to process
	 * @param collectIncomingPorts True, iff the incoming ports should be collected
	 * @return A collection containing only incoming or outgoing {@link PortType}s
	 */
	public Collection<PortType> getDirectedPorts(ComponentType comp, boolean collectIncomingPorts) {
		Set<PortType> ports = new HashSet<>();
		for (PortType pt : comp.getPorts()) {
			if (collectIncomingPorts && pt.isIsIncoming()) {
				ports.add(pt);
			} else if (!collectIncomingPorts && !pt.isIsIncoming()) {
				ports.add(pt);
			}
				
		}
		return ports;
	}
	
	public String getConnectorLabel(Connector c) {
		String sourceName = c.getSourcePort().getParent().getInstanceName() + "." + c.getSourcePort().getType().getName();
		String targetName = c.getTargetPort().getParent().getInstanceName() + "." + c.getTargetPort().getType().getName();
		return sourceName + " -> " + targetName; 
	}
	
	public EObject getConnectorSourcePort(EObject self) {
		Connector c = (Connector)self;
		System.out.println("Drawing source port for connector '" + getConnectorLabel(c) + "'.");
		return c.getSourcePort();
	}
	
	public EObject getConnectorTargetPort(EObject self) {
		Connector c = (Connector)self;
		System.out.println("Drawing target port for connector '" + getConnectorLabel(c) + "'.");
		return c.getTargetPort();
	}
	
}
