package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspect;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self, inputString);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "step");
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
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString) {
    try {
      if (((!Objects.equal(inputString, null)) && (!inputString.equals("")))) {
        EList<Transition> _outgoingTransitions = _self.getOutgoingTransitions();
        final Function1<Transition, Boolean> _function = (Transition t) -> {
          String _input = t.getInput();
          return Boolean.valueOf(inputString.startsWith(_input));
        };
        final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_outgoingTransitions, _function);
        boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
        if (_isEmpty) {
          throw new Exception("No Transition");
        }
        int _size = IterableExtensions.size(validTransitions);
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          throw new Exception("Non Determinism");
        }
        boolean executed = false;
        while ((!executed)) {
          if (((!executed) && GuardAspect.holds(((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0].getGuard()))) {
            Transition _get = ((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0];
            TransitionAspect.fire(_get);
            executed = true;
          }
        }
      } else {
        EList<Transition> _outgoingTransitions_1 = _self.getOutgoingTransitions();
        final Function1<Transition, Boolean> _function_1 = (Transition t) -> {
          return Boolean.valueOf((Objects.equal(t.getInput(), null) || "".equals("")));
        };
        final Iterable<Transition> validTransitions_1 = IterableExtensions.<Transition>filter(_outgoingTransitions_1, _function_1);
        boolean executed_1 = false;
        while ((!executed_1)) {
          for (final Transition t : validTransitions_1) {
            if (((!executed_1) && GuardAspect.holds(t.getGuard()))) {
              TransitionAspect.fire(t);
              executed_1 = true;
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
