package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties;
import ur1.diverse.xmontiarc.runtime.GroovyInterpreter;
import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@Aspect(className = Subcomponent.class)
@SuppressWarnings("all")
public class SubcomponentAspect {
  @Step
  public static void compute(final Subcomponent _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_compute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Subcomponent","compute");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_compute(final SubcomponentAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    String _name = _self.getName();
    String _plus = ("Computing behavior for subcomponent \'" + _name);
    String _plus_1 = (_plus + "\'.");
    InputOutput.<String>println(_plus_1);
    ComponentType _type = _self.getType();
    EList<Subcomponent> _subcomponents = _type.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    if (_isEmpty) {
      EList<Port> _ports = _self.getPorts();
      for (final Port p : _ports) {
        boolean _isIncoming = p.isIncoming();
        boolean _not = (!_isIncoming);
        if (_not) {
          ComponentType _type_1 = _self.getType();
          String _behavior = _type_1.getBehavior();
          String _interpret = GroovyInterpreter.interpret(_behavior);
          PortAspect.value(p, _interpret);
        }
      }
    } else {
      ComponentType _type_2 = _self.getType();
      EList<Subcomponent> _subcomponents_1 = _type_2.getSubcomponents();
      for (final Subcomponent ci : _subcomponents_1) {
        SubcomponentAspect.compute(ci);
      }
    }
  }
}
