package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_compute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Subcomponent", "compute");
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
  
  protected static void _privk3_compute(final SubcomponentAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    String _name = _self.getName();
    String _plus = ("Computing behavior for subcomponent \'" + _name);
    String _plus_1 = (_plus + "\'.");
    InputOutput.<String>println(_plus_1);
    ComponentType _type = _self.getType();
    EList<Subcomponent> _subcomponents = _type.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    if (_isEmpty) {
      String _name_1 = _self.getName();
      String _plus_2 = ("Subcomponent \'" + _name_1);
      String _plus_3 = (_plus_2 + "\' is atomic.");
      InputOutput.<String>println(_plus_3);
      EList<Port> _ports = _self.getPorts();
      for (final Port p : _ports) {
        {
          String _name_2 = _self.getName();
          String _plus_4 = ("Subcomponent \'" + _name_2);
          String _plus_5 = (_plus_4 + "\' has port \'");
          String _name_3 = p.getName();
          String _plus_6 = (_plus_5 + _name_3);
          String _plus_7 = (_plus_6 + "\'.");
          InputOutput.<String>println(_plus_7);
          ComponentType _type_1 = _self.getType();
          String behavior = _type_1.getBehavior();
          String _name_4 = _self.getName();
          String _plus_8 = ("Behavior of \'" + _name_4);
          String _plus_9 = (_plus_8 + "\' is \'");
          String _plus_10 = (_plus_9 + behavior);
          String _plus_11 = (_plus_10 + "\'.");
          InputOutput.<String>println(_plus_11);
          boolean _isIncoming = p.isIncoming();
          boolean _not = (!_isIncoming);
          if (_not) {
            String _name_5 = _self.getName();
            String _plus_12 = ("Computing next value of outgoing port " + _name_5);
            String _plus_13 = (_plus_12 + ".");
            String _name_6 = p.getName();
            String _plus_14 = (_plus_13 + _name_6);
            String _plus_15 = (_plus_14 + ".");
            InputOutput.<String>println(_plus_15);
            String result = GroovyInterpreter.interpret(behavior);
            p.setValue(result);
            String _value = p.getValue();
            String _plus_16 = ("Assigning value \'" + _value);
            String _plus_17 = (_plus_16 + "\' to outgoing port ");
            String _name_7 = _self.getName();
            String _plus_18 = (_plus_17 + _name_7);
            String _plus_19 = (_plus_18 + ".");
            String _name_8 = p.getName();
            String _plus_20 = (_plus_19 + _name_8);
            String _plus_21 = (_plus_20 + ".");
            InputOutput.<String>println(_plus_21);
          }
        }
      }
    } else {
      ComponentType _type_1 = _self.getType();
      EList<Subcomponent> _subcomponents_1 = _type_1.getSubcomponents();
      for (final Subcomponent ci : _subcomponents_1) {
        {
          String _name_2 = _self.getName();
          String _plus_4 = ("Subcomponent \'" + _name_2);
          String _plus_5 = (_plus_4 + "\' is composed.");
          InputOutput.<String>println(_plus_5);
          SubcomponentAspect.compute(ci);
        }
      }
    }
  }
}
