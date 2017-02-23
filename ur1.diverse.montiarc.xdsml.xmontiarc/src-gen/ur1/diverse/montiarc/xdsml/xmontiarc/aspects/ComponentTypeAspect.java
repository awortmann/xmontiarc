package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Random;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.ComponentType;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Connector;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.SubcomponentDeclaration;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.MontiarcruntimeFactory;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.PortValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspect;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspect;

@Aspect(className = ComponentType.class)
@SuppressWarnings("all")
public class ComponentTypeAspect {
  public static void init(final ComponentType _self, final EList<String> args) {
    final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    _privk3_init(_self_, _self,args);;
  }
  
  @Main
  @Step
  public static void compute(final ComponentType _self) {
	final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
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
		manager.executeStep(_self, command, "ComponentType", "compute");
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
  
  @Step
  public static void update(final ComponentType _self) {
	final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_update(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ComponentType", "update");
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
  
  private static Random r(final ComponentType _self) {
    final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_r(_self_, _self);;
    return (java.util.Random)result;
  }
  
  private static void r(final ComponentType _self, final Random r) {
    final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    _privk3_r(_self_, _self,r);;
  }
  
  protected static void _privk3_init(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final EList<String> args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Initializing \'");
    String _name = _self.getName();
    _builder.append(_name, "");
    InputOutput.<String>println(_builder.toString());
  }
  
  protected static void _privk3_compute(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Currently computing \'");
    String _name = _self.getName();
    _builder.append(_name, "");
    InputOutput.<String>println(_builder.toString());
    EList<SubcomponentDeclaration> _subcomponents = _self.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    if (_isEmpty) {
      EList<Port> _ports = _self.getPorts();
      for (final Port p : _ports) {
        {
          PortValue _createPortValue = MontiarcruntimeFactory.eINSTANCE.createPortValue();
          PortAspect.portValue(p, _createPortValue);
          PortValue _portValue = PortAspect.portValue(p);
          Random _r = ComponentTypeAspect.r(_self);
          int _nextInt = _r.nextInt();
          _portValue.setValue(Integer.valueOf(_nextInt));
          PortValue _portValue_1 = PortAspect.portValue(p);
          CDClass _type = p.getType();
          _portValue_1.setType(_type);
        }
      }
    } else {
      EList<SubcomponentDeclaration> _subcomponents_1 = _self.getSubcomponents();
      for (final SubcomponentDeclaration scd : _subcomponents_1) {
        ComponentType _componentType = scd.getComponentType();
        ComponentTypeAspect.compute(_componentType);
      }
    }
  }
  
  protected static void _privk3_update(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    EList<SubcomponentDeclaration> _subcomponents = _self.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Connector> _connectors = _self.getConnectors();
      for (final Connector con : _connectors) {
        {
          ConnectorAspect.update(con);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Propagating message over connector \'");
          String _string = con.toString();
          _builder.append(_string, "");
          _builder.append("\'.");
          InputOutput.<String>println(_builder.toString());
        }
      }
    }
  }
  
  protected static Random _privk3_r(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
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
  
  protected static void _privk3_r(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final Random r) {
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
