package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EDataType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;

@Aspect(className = Port.class)
@SuppressWarnings("all")
public class PortAspect {
  public static String toString(final Port _self) {
    final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port){
    					result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspect._privk3_toString(_self_, (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static EDataType value(final Port _self) {
    final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_value(_self_, _self);;
    return (org.eclipse.emf.ecore.EDataType)result;
  }
  
  public static void value(final Port _self, final EDataType value) {
    final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);;
  }
  
  protected static String _privk3_toString(final PortAspectPortAspectProperties _self_, final Port _self) {
    EDataType _value = PortAspect.value(_self);
    return _value.getName();
  }
  
  protected static EDataType _privk3_value(final PortAspectPortAspectProperties _self_, final Port _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.ecore.EDataType) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final PortAspectPortAspectProperties _self_, final Port _self, final EDataType value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
