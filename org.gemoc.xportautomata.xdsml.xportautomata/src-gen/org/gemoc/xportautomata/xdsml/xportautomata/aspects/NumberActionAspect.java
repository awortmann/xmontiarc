package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectProperties;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect;

@Aspect(className = NumberAction.class)
@SuppressWarnings("all")
public class NumberActionAspect extends ActionAspect {
  @Step
  public static void execute(final NumberAction _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectContext
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
		manager.executeStep(_self, command, "NumberAction", "execute");
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
  
  protected static void _privk3_execute(final NumberActionAspectNumberActionAspectProperties _self_, final NumberAction _self) {
    InputOutput.<String>println("execute numerical value");
    final NumberVariable target = _self.getTarget();
    long _value = _self.getValue();
    NumberVariableAspect.value(target, Long.valueOf(_value));
  }
}
