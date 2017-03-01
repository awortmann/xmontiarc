package ur1.diverse.xmontiarc.design;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

public class SetTypeAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> args) {
		System.out.println("can args = "  + args.toString());
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		System.out.println("da args = "  + args.toString());
	}
	
	private void foo(Subcomponent self) {
		ComponentType ct = null;
		for (EObject item  : self.eContainer().eContents()) {
			if (item instanceof ComponentType) {
				ct = (ComponentType)item;
			}
		}
		System.out.println("Found compponent type '" + ct.toString() + "'.");
		self.setType(ct);
		List<Port> scPorts = self.getPorts();
		for (Port p : ct.getPorts()) {
			Port copy = null; // EOjbect clone oder so
			scPorts.add(copy);
		}
		self.getPorts().clear();
		self.getPorts().addAll(scPorts);
	}

}
