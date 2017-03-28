package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspect;

@Aspect(className = BooleanAction.class)
@SuppressWarnings("all")
public class BooleanActionAspect extends ActionAspect {
  @Step
  public static void execute(final BooleanAction _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanActionAspectBooleanActionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "BooleanAction", "execute");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_execute(final BooleanActionAspectBooleanActionAspectProperties _self_, final BooleanAction _self) {
    final BooleanVariable target = _self.getTarget();
    boolean _isValue = _self.isValue();
    BooleanVariableAspect.value(target, Boolean.valueOf(_isValue));
  }
}
