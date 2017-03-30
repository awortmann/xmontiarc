package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspect;

@Aspect(className = StringAction.class)
@SuppressWarnings("all")
public class StringActionAspect extends ActionAspect {
  @Step
  public static void execute(final StringAction _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectContext
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
		manager.executeStep(_self, command, "StringAction", "execute");
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
  
  protected static void _privk3_execute(final StringActionAspectStringActionAspectProperties _self_, final StringAction _self) {
    final StringVariable target = _self.getTarget();
    String _value = _self.getValue();
    StringVariableAspect.value(target, _value);
  }
}
