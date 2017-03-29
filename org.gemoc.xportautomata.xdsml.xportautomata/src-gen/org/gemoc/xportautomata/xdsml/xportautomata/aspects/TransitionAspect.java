package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Transition;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void execute(final Transition _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.TransitionAspectTransitionAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.TransitionAspectTransitionAspectContext
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
		manager.executeStep(_self, command, "Transition", "execute");
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
  
  protected static void _privk3_execute(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    Action _action = _self.getAction();
    ActionAspect.execute(_action);
  }
}
