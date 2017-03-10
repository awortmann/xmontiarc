package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Random;
import montiarc.ComponentInstance;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties;

@Aspect(className = ComponentInstance.class)
@SuppressWarnings("all")
public class ComponentInstanceAspect {
  @Step
  public static void compute(final ComponentInstance _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_compute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"ComponentInstance","compute");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  private static Random r(final ComponentInstance _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_r(_self_, _self);;
    return (java.util.Random)result;
  }
  
  private static void r(final ComponentInstance _self, final Random r) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectContext.getSelf(_self);
    _privk3_r(_self_, _self,r);;
  }
  
  protected static void _privk3_compute(final ComponentInstanceAspectComponentInstanceAspectProperties _self_, final ComponentInstance _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type ComponentInstance"
      + "\nThe method type(PortType) is undefined for the type PortValue"
      + "\nThe method or field type is undefined for the type ComponentInstance"
      + "\nsubcomponents cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\nsubcomponents cannot be resolved");
  }
  
  protected static Random _privk3_r(final ComponentInstanceAspectComponentInstanceAspectProperties _self_, final ComponentInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getR") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Random) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.r;
  }
  
  protected static void _privk3_r(final ComponentInstanceAspectComponentInstanceAspectProperties _self_, final ComponentInstance _self, final Random r) {
    _self_.r = r; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setR")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, r);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
