package xmontiarc.helpers;

import java.util.ArrayList;
import java.util.List;

import xmontiarc.Port;
import xmontiarc.Subcomponent;

public class SubcomponentHelper {

	public static List<Port> getIncomingPorts(Subcomponent sc) {
		return getDirectedPorts(sc, true);
	}

	public static List<Port> getOutgoingPorts(Subcomponent sc) {
		return getDirectedPorts(sc, false);
	}

	public static List<Port> getDirectedPorts(Subcomponent sc, boolean collectIncomingPorts) {
		List<Port> ports = new ArrayList<Port>();
		for (Port p : sc.getPorts()) {
			if (p.isIncoming() == collectIncomingPorts) {
				ports.add(p);
			}
		}
		return ports;
	}
}
