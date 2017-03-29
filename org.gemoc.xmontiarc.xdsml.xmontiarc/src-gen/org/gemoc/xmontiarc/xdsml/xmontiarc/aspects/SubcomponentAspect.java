package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.PortAspect;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.DataType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent;

@Aspect(className = Subcomponent.class)
@SuppressWarnings("all")
public class SubcomponentAspect {
  private static Random rand = new Random();
  
  public static void createDefaultBehavior(final Subcomponent _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectContext
			.getSelf(_self);
	_privk3_createDefaultBehavior(_self_, _self);
	;
}
  
  @Step
  public static void compute(final Subcomponent _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectContext
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
  
  protected static void _privk3_createDefaultBehavior(final SubcomponentAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    EList<OutgoingPort> _outgoingPorts = _self.getOutgoingPorts();
    for (final Port p : _outgoingPorts) {
      {
        EDataType data = null;
        DataType _type = p.getType();
        boolean _equals = _type.equals(DataType.BOOLEAN);
        if (_equals) {
          EDataType _eBoolean = EcorePackage.eINSTANCE.getEBoolean();
          data = _eBoolean;
          data.setName("true");
        } else {
          DataType _type_1 = p.getType();
          boolean _equals_1 = _type_1.equals(DataType.NUMBER);
          if (_equals_1) {
            EDataType _eLong = EcorePackage.eINSTANCE.getELong();
            data = _eLong;
            int _nextInt = SubcomponentAspect.rand.nextInt(100);
            int _plus = (_nextInt + 1);
            String _plus_1 = ("" + Integer.valueOf(_plus));
            data.setName(_plus_1);
          } else {
            DataType _type_2 = p.getType();
            boolean _equals_2 = _type_2.equals(DataType.STRING);
            if (_equals_2) {
              EDataType _eString = EcorePackage.eINSTANCE.getEString();
              data = _eString;
              int _nextInt_1 = SubcomponentAspect.rand.nextInt(100);
              int _plus_2 = (_nextInt_1 + 1);
              String _plus_3 = ("HalloWelt" + Integer.valueOf(_plus_2));
              data.setName(_plus_3);
            }
          }
        }
        PortAspect.value(p, data);
      }
    }
  }
  
  protected static void _privk3_compute(final SubcomponentAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    ComponentType _type = _self.getType();
    String _name = _type.getName();
    String _plus = ("### Computing behavior for subcomponent \'" + _name);
    String _plus_1 = (_plus + ".");
    String _name_1 = _self.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + "\'.");
    InputOutput.<String>println(_plus_3);
    ComponentType _type_1 = _self.getType();
    EList<Subcomponent> _subcomponents = _type_1.getSubcomponents();
    boolean _isEmpty = _subcomponents.isEmpty();
    if (_isEmpty) {
      EList<OutgoingPort> _outgoingPorts = _self.getOutgoingPorts();
      for (final Port p : _outgoingPorts) {
        {
          ComponentType _type_2 = _self.getType();
          final ComponentBehavior behavior = _type_2.getBehavior();
          if ((behavior instanceof GroovyComponentBehavior)) {
            SubcomponentAspect.createDefaultBehavior(_self);
          } else {
          }
          EDataType _value = PortAspect.value(p);
          String _plus_4 = ("### Assigning value \'" + _value);
          String _plus_5 = (_plus_4 + "\' to outgoing port ");
          String _name_2 = _self.getName();
          String _plus_6 = (_plus_5 + _name_2);
          String _plus_7 = (_plus_6 + ".");
          String _name_3 = p.getName();
          String _plus_8 = (_plus_7 + _name_3);
          String _plus_9 = (_plus_8 + ".");
          InputOutput.<String>println(_plus_9);
        }
      }
    } else {
      ComponentType _type_2 = _self.getType();
      String _name_2 = _type_2.getName();
      String _plus_4 = ("=> Computing behavior for composed subcomponent \'" + _name_2);
      String _plus_5 = (_plus_4 + ".");
      String _name_3 = _self.getName();
      String _plus_6 = (_plus_5 + _name_3);
      String _plus_7 = (_plus_6 + "\'.");
      InputOutput.<String>println(_plus_7);
      ComponentType _type_3 = _self.getType();
      EList<Subcomponent> _subcomponents_1 = _type_3.getSubcomponents();
      for (final Subcomponent ci : _subcomponents_1) {
        SubcomponentAspect.compute(ci);
      }
    }
  }
}
