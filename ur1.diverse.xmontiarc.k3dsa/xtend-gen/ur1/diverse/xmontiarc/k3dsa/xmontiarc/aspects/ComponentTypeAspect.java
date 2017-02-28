package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspect;
import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Subcomponent;

@Aspect(className = ComponentType.class)
@SuppressWarnings("all")
public class ComponentTypeAspect {
  public static void init(final ComponentType _self, final EList<String> args) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    _privk3_init(_self_, _self,args);;
  }
  
  @Main
  @Step
  public static void compute(final ComponentType _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
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
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
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
    String _name = _self.getName();
    String _plus = ("Initializing component type " + _name);
    InputOutput.<String>println(_plus);
  }
  
  protected static void _privk3_compute(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    for (final Subcomponent sc : _subcomponents) {
      SubcomponentAspect.compute(sc);
    }
  }
  
  protected static void _privk3_update(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Connector> _connectors = _self.getConnectors();
      for (final Connector con : _connectors) {
        {
          String _string = con.toString();
          String _plus = ("Propagating message over connector \'" + _string);
          String _plus_1 = (_plus + "\'.");
          InputOutput.<String>println(_plus_1);
          ConnectorAspect.update(con);
        }
      }
    }
  }
}
