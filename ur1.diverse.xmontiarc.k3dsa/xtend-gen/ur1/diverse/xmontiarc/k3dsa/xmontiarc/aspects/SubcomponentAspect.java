package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties;
import ur1.diverse.xmontiarc.runtime.GroovyInterpreter;
import xmontiarc.ComponentType;
import xmontiarc.OutgoingPort;
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
      EList<OutgoingPort> _outgoingPorts = _self.getOutgoingPorts();
      for (final Port p : _outgoingPorts) {
        {
          ComponentType _type_1 = _self.getType();
          String behavior = _type_1.getBehavior();
          String result = GroovyInterpreter.interpret(behavior);
          p.setValue(result);
          String _value = p.getValue();
          String _plus_2 = ("Assigning value \'" + _value);
          String _plus_3 = (_plus_2 + "\' to outgoing port ");
          String _name_1 = _self.getName();
          String _plus_4 = (_plus_3 + _name_1);
          String _plus_5 = (_plus_4 + ".");
          String _name_2 = p.getName();
          String _plus_6 = (_plus_5 + _name_2);
          String _plus_7 = (_plus_6 + ".");
          InputOutput.<String>println(_plus_7);
        }
      }
    } else {
      ComponentType _type_1 = _self.getType();
      EList<Subcomponent> _subcomponents_1 = _type_1.getSubcomponents();
      for (final Subcomponent ci : _subcomponents_1) {
        {
          String _name_1 = _self.getName();
          String _plus_2 = ("Subcomponent \'" + _name_1);
          String _plus_3 = (_plus_2 + "\' is composed.");
          InputOutput.<String>println(_plus_3);
          SubcomponentAspect.compute(ci);
        }
      }
    }
  }
}
