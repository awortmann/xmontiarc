package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.portautomata.fsm.BooleanAction;
import org.gemoc.portautomata.fsm.BooleanVariable;
import org.gemoc.portautomata.fsm.k3dsa.ActionAspect;
import org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect;

@Aspect(className = BooleanAction.class)
@SuppressWarnings("all")
public class BooleanActionAspect extends ActionAspect {
  @Step
  public static void execute(final BooleanAction _self) {
    final org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.portautomata.fsm.BooleanAction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspect._privk3_execute(_self_, (org.gemoc.portautomata.fsm.BooleanAction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"BooleanAction","execute");
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
  
  protected static void _privk3_execute(final BooleanActionAspectBooleanActionAspectProperties _self_, final BooleanAction _self) {
    final BooleanVariable target = _self.getTarget();
    boolean _isValue = _self.isValue();
    BooleanVariableAspect.value(target, Boolean.valueOf(_isValue));
  }
}
