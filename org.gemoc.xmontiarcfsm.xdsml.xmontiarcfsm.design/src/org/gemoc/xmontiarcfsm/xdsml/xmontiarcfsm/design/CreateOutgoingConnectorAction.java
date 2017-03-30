package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

public class CreateOutgoingConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		OutgoingPort subcomponentOut = (OutgoingPort) options.get("source");
		OutgoingPort componentTypeOut = (OutgoingPort) options.get("target");
		
		Subcomponent sourceSubcomponent = (Subcomponent) options.get("sourceSubcomponent");
		ComponentType type = sourceSubcomponent.getParent();
		System.out.println("CreateOutgoingConnectorAction.execute(): Containing component type is '" + type.toString() + "'.");
		OutgoingConnector con = MontiarcFactory.eINSTANCE.createOutgoingConnector();
		con.setSource(subcomponentOut);
		con.setTarget(componentTypeOut);
		con.setParent(type);
		System.out.println("CreateOutgoingConnectorAction.execute(): Created connector '" + con.toString() + "'.");
		type.getConnectors().add(con);
		try {
			type.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("CreateOutgoingConnectorAction.execute(): Connectors now is '" + type.getConnectors() + "'.");
	}
		
}
