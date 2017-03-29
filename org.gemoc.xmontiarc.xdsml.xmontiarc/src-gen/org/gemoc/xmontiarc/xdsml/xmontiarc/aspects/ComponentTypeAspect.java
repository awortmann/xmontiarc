package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspect;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Connector;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent;

@Aspect(className = ComponentType.class)
@SuppressWarnings("all")
public class ComponentTypeAspect {
  @InitializeModel
  @Step
  public static void initializeModel(final ComponentType _self, final EList<String> args) {
    final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeModel(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"ComponentType","initializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Main
  public static void main(final ComponentType _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  public static void compute(final ComponentType _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
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
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
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
  
  public static Subcomponent findOwnerOf(final ComponentType _self, final Port p) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findOwnerOf(_self_, _self, p);
	;
	return (org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent) result;
}
  
  public static EList<Port> getOutgoingPortsOfSubcomponents(final ComponentType _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getOutgoingPortsOfSubcomponents(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static EList<Port> getIncomingPortsOfSubcomponents(final ComponentType _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIncomingPortsOfSubcomponents(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static EList<Port> getDirectedPortsOfSubcomponents(final ComponentType _self, final boolean collectIncoming) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getDirectedPortsOfSubcomponents(_self_, _self, collectIncoming);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  protected static void _privk3_initializeModel(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final EList<String> args) {
    String _name = _self.getName();
    String _plus = ("Initializing component type " + _name);
    InputOutput.<String>println(_plus);
  }
  
  protected static void _privk3_main(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    InputOutput.<String>println("main()");
    try {
      if ((_self.getIncomingPorts().isEmpty() && _self.getOutgoingPorts().isEmpty())) {
        while (true) {
          {
            String _name = _self.getName();
            String _plus = ("=== Starting " + _name);
            String _plus_1 = (_plus + " Main Loop ===");
            InputOutput.<String>println(_plus_1);
            ComponentTypeAspect.compute(_self);
            ComponentTypeAspect.update(_self);
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static void _privk3_compute(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    String _name = _self.getName();
    String _plus = ("=== Computing behavior for component type \'" + _name);
    String _plus_1 = (_plus + "\' ===");
    InputOutput.<String>println(_plus_1);
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
          String _representation = ConnectorAspect.getRepresentation(con);
          String _plus = ("-> Propagating message over connector \'" + _representation);
          String _plus_1 = (_plus + "\'.");
          InputOutput.<String>println(_plus_1);
          ConnectorAspect.update(con);
        }
      }
    }
  }
  
  protected static Subcomponent _privk3_findOwnerOf(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final Port p) {
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    for (final Subcomponent sc : _subcomponents) {
      {
        EList<IncomingPort> _incomingPorts = sc.getIncomingPorts();
        for (final Port scp : _incomingPorts) {
          boolean _equals = scp.equals(p);
          if (_equals) {
            return sc;
          }
        }
        EList<OutgoingPort> _outgoingPorts = sc.getOutgoingPorts();
        for (final Port scp_1 : _outgoingPorts) {
          boolean _equals_1 = scp_1.equals(p);
          if (_equals_1) {
            return sc;
          }
        }
      }
    }
    return null;
  }
  
  protected static EList<Port> _privk3_getOutgoingPortsOfSubcomponents(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeAspect.getDirectedPortsOfSubcomponents(_self, false);
  }
  
  protected static EList<Port> _privk3_getIncomingPortsOfSubcomponents(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeAspect.getDirectedPortsOfSubcomponents(_self, true);
  }
  
  protected static EList<Port> _privk3_getDirectedPortsOfSubcomponents(final ComponentTypeAspectComponentTypeAspectProperties _self_, final ComponentType _self, final boolean collectIncoming) {
    EList<Port> ports = new BasicEList<Port>();
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    for (final Subcomponent sc : _subcomponents) {
      if (collectIncoming) {
        EList<IncomingPort> _incomingPorts = sc.getIncomingPorts();
        ports.addAll(_incomingPorts);
      } else {
        EList<OutgoingPort> _outgoingPorts = sc.getOutgoingPorts();
        ports.addAll(_outgoingPorts);
      }
    }
    return ports;
  }
}
