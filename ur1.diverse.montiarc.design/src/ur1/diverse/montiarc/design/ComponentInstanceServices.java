package ur1.diverse.montiarc.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import montiarc.ComponentInstance;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * Services for component aspects of montiarc diagrams.
 * @author Andreas Wortmann <wortmann@se-rwth.de>
 */
public class ComponentInstanceServices {
	
	public String getComponentInstanceLabel(EObject self) {
		ComponentInstance c = (ComponentInstance)self;
		return c.toString();
	}
	
	public Collection<EObject> getComponentInstanceIncomingPorts(EObject self) {
		return getDirectedPortInstances((ComponentInstance)self, true);
	}
	
	public Collection<EObject> getComponentInstanceOutgoingPorts(EObject self) {
		return getDirectedPortInstances((ComponentInstance)self, false);
	}
	
	public Collection<EObject> getDirectedPortInstances(ComponentInstance comp, boolean collectIncomingPorts) {
		Set<EObject> ports = new HashSet<>();
		for (PortInstance pi : comp.getPorts()) {
			if (collectIncomingPorts && pi.getType().isIsIncoming()) {
				ports.add(pi);
			} else if (!collectIncomingPorts && !pi.getType().isIsIncoming()) {
				ports.add(pi);
			}
		}
		return ports;
	}
	
	/**
	 * A nice label for {@link PortType}s
	 * @param self A {@link PortType}
	 * @return 
	 */
	public String getPortInstanceLabel(EObject self) {
		PortType pt = ((PortInstance)self).getType();
		return pt.getType().getName() + " " + pt.getName();
	}
	
	public String getComponentInstanceTypeName(EObject self) {
		ComponentInstance ci = (ComponentInstance)self;
		return ci.getType().getName();
	}
	
}
