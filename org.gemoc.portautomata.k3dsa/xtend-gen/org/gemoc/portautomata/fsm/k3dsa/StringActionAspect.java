package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.portautomata.fsm.StringAction;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.portautomata.fsm.k3dsa.ActionAspect;
import org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect;

@Aspect(className = StringAction.class)
@SuppressWarnings("all")
public class StringActionAspect extends ActionAspect {
  @Step
  public static void execute(final StringAction _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.portautomata.fsm.StringAction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.portautomata.fsm.k3dsa.StringActionAspect._privk3_execute(_self_, (org.gemoc.portautomata.fsm.StringAction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"StringAction","execute");
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
  
  protected static void _privk3_execute(final StringActionAspectStringActionAspectProperties _self_, final StringAction _self) {
    final StringVariable target = _self.getTarget();
    String _value = _self.getValue();
    StringVariableAspect.value(target, _value);
  }
}
