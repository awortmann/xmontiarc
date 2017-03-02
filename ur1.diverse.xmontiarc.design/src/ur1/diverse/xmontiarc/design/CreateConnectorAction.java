package ur1.diverse.xmontiarc.design;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.XmontiarcFactory;

public class CreateConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> args) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		System.out.println("CreateConnectorAction.execute()");
		for (Map.Entry<String, Object> option : options.entrySet()) {
			System.out.println(option.getKey() + " = " + option.getValue());
		}
		Port source = (Port) options.get("source");
		Port target = (Port) options.get("target");
		Optional<ComponentType> typeOpt = DesignerHelper.getComponentTypeFromArgs(args);
		System.out.println("CreateConnectorAction.execute(): Working in component type" + typeOpt.get());
		if (typeOpt.isPresent()) {
			ComponentType ct = typeOpt.get();
			Connector con = XmontiarcFactory.eINSTANCE.createConnector();
			con.setSource(source);
			con.setTarget(target);
			ct.getConnectors().add(con);
			System.out.println("CreateConnectorAction.execute(): Connectors now is '" + ct.getConnectors() + "'.");
		}
		else {
			throw new Error("CreateConnectorAction.execute(): Misformed model without component type");
		}
	}
}