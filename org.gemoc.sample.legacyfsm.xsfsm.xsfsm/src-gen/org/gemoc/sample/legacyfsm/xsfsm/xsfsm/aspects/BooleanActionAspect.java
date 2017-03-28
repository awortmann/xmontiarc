package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanVariableAspect;

@Aspect(className = BooleanAction.class)
@SuppressWarnings("all")
public class BooleanActionAspect extends ActionAspect {
  @Step
  public static void execute(final BooleanAction _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectContext
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
