package xmontiarc.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

public class ComponentTypeHelper {
	

    public static Optional<Subcomponent> findOwnerOf(ComponentType ct, Port p) {
        for (Subcomponent sc: ct.getSubcomponents()) {
            for (Port scp : sc.getPorts()) {
                if (scp.equals(p)) {
                    return Optional.of(sc);
                }
            }
        }
        return Optional.empty();
    }
	
	public static List<Port> getOutgoingPortsOfSubcomponents(ComponentType ct) {
		return getDirectedPortsOfSubcomponents(ct, false);
	}
	
	public static List<Port> getIncomingPortsOfSubcomponents(ComponentType ct) {
		return getDirectedPortsOfSubcomponents(ct, true);
	}
	
	public static List<Port> getDirectedPortsOfSubcomponents(ComponentType ct, boolean collectIncoming) {
		List<Port> incomingPorts = new ArrayList<>();
		for (Subcomponent sc: ct.getSubcomponents()) {
			for (Port p : sc.getPorts()) {
				if (p.isIncoming()==collectIncoming) {
					incomingPorts.add(p);
				}
			}
		}
		return incomingPorts;
	}
	
	public static List<Port> getIncomingPorts(ComponentType ct) {
		return getDirectedPorts(ct, true);
	}

	public static List<Port> getOutgoingPorts(ComponentType ct) {
		return getDirectedPorts(ct, false);
	}
	
	public static List<Port> getDirectedPorts(ComponentType ct, boolean collectIncomingPorts) {
		List<Port> ports = new ArrayList<Port>();
		for (Port p : ct.getPorts()) {
			if (p.isIncoming()==collectIncomingPorts) {
				ports.add(p);
			}
		}
		return ports;
	}

}
