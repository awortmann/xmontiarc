package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Action;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
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
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    State _target = _self.getTarget();
    String _name_1 = _target.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    State _source = _self.getSource();
    final StateMachine fsm = _source.getOwningFSM();
    State _target_1 = _self.getTarget();
    StateMachineAspect.currentState(fsm, _target_1);
    String _output = _self.getOutput();
    boolean _notEquals = (!Objects.equal(_output, null));
    if (_notEquals) {
      String _producedString = StateMachineAspect.producedString(fsm);
      String _output_1 = _self.getOutput();
      String _plus_3 = (_producedString + _output_1);
      StateMachineAspect.producedString(fsm, _plus_3);
    }
    String _input = _self.getInput();
    boolean _notEquals_1 = (!Objects.equal(_input, null));
    if (_notEquals_1) {
      String _consummedString = StateMachineAspect.consummedString(fsm);
      String _input_1 = _self.getInput();
      String _plus_4 = (_consummedString + _input_1);
      StateMachineAspect.consummedString(fsm, _plus_4);
      String _unprocessedString = StateMachineAspect.unprocessedString(fsm);
      String _input_2 = _self.getInput();
      int _length = _input_2.length();
      String _substring = _unprocessedString.substring(_length);
      StateMachineAspect.unprocessedString(fsm, _substring);
    }
    Action _action = _self.getAction();
    ActionAspect.execute(_action);
  }
}
