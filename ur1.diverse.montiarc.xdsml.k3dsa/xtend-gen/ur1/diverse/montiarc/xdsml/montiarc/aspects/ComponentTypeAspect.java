package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import montiarc.ComponentType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;

@Aspect(className = ComponentType.class)
@SuppressWarnings("all")
public class ComponentTypeAspect {
  public static void init(final ComponentType _self, final EList<String> args) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    _privk3_init(_self_, _self,args);;
  }
  
  @Main
  @Step
  public static void compute(final ComponentType _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_compute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"ComponentType","compute");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void update(final ComponentType _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_update(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"ComponentType","update");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_init(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final EList<String> args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Initializing \'");
    String _name = _self.getName();
    _builder.append(_name, "");
    InputOutput.<String>println(_builder.toString());
  }
  
  protected static void _privk3_compute(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field subcomponents is undefined for the type ComponentType"
      + "\nThe method compute() is undefined for the type ComponentInstance");
  }
  
  protected static void _privk3_update(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field subcomponents is undefined for the type ComponentType"
      + "\nThe method or field connectors is undefined for the type ComponentType"
      + "\nThe method update() is undefined for the type ConnectorType"
      + "\nisEmpty cannot be resolved"
      + "\n! cannot be resolved");
  }
}
