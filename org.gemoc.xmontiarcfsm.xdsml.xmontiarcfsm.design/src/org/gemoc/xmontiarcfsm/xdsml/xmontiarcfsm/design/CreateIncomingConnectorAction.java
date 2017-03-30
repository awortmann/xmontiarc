package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcFactory;

public class CreateIncomingConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		IncomingPort componentTypeIn = (IncomingPort) options.get("source");
		IncomingPort subcomponentIn = (IncomingPort) options.get("target");
		ComponentType sourceComponentType = (ComponentType) options.get("sourceComponentType");
		System.out.println("CreateIntermediateConnectorAction.execute(): Containing component type is '" + sourceComponentType.getName() + "'.");
		IncomingConnector con = MontiarcFactory.eINSTANCE.createIncomingConnector();
		con.setSource(componentTypeIn);
		con.setTarget(subcomponentIn);
		con.setParent(sourceComponentType);
		System.out.println("CreateIntermediateConnectorAction.execute(): Created connector '" + ConnectorAspect.getRepresentation(con) + "'.");
		sourceComponentType.getConnectors().add(con);
		try {
			sourceComponentType.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("CreateIncomingConnectorAction.execute(): Connectors now is '" + sourceComponentType.getConnectors() + "'.");
	}
		
}
