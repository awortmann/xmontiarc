package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.portautomata.fsm.NumberAction;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.ActionAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = NumberAction.class)
@SuppressWarnings("all")
public class NumberActionAspect extends ActionAspect {
  @Step
  public static void execute(final NumberAction _self) {
    final org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.portautomata.fsm.NumberAction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.portautomata.fsm.k3dsa.NumberActionAspect._privk3_execute(_self_, (org.gemoc.portautomata.fsm.NumberAction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"NumberAction","execute");
    					} else {
    						fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    						if (eventManager != null) {
    							eventManager.manageEvents();
    						}
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Action){
    					org.gemoc.portautomata.fsm.k3dsa.ActionAspect.execute((org.gemoc.portautomata.fsm.Action)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final NumberActionAspectNumberActionAspectProperties _self_, final NumberAction _self) {
    InputOutput.<String>println("execute numerical value");
    final NumberVariable target = _self.getTarget();
    long _value = _self.getValue();
    NumberVariableAspect.value(target, Long.valueOf(_value));
  }
}
