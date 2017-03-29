package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.portautomata.fsm.Guard;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectProperties;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public abstract class GuardAspect {
  @Step
  @Abstract
  public static boolean holds(final Guard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.LessThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.LessThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.EqualNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspect.holds((org.gemoc.portautomata.fsm.EqualNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.BooleanGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspect.holds((org.gemoc.portautomata.fsm.BooleanGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.StringGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.StringGuardAspect.holds((org.gemoc.portautomata.fsm.StringGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GreaterOrEqualThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.GreaterThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.GreaterThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect.holds((org.gemoc.portautomata.fsm.NumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(org.gemoc.portautomata.fsm.k3dsa.GuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.Guard)_self));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Guard","holds");
    					} else {
    						fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    						if (eventManager != null) {
    							eventManager.manageEvents();
    						}
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final GuardAspectGuardAspectProperties _self_, final Guard _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
