package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior;

@SuppressWarnings("all")
public class GroovyComponentBehaviorAdapter extends EObjectAdapter<GroovyComponentBehavior> implements org.gemoc.montiarc.montiarc.GroovyComponentBehavior {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public GroovyComponentBehaviorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getScriptBody() {
    return adaptee.getScriptBody();
  }
  
  @Override
  public void setScriptBody(final String o) {
    adaptee.setScriptBody(o);
  }
  
  protected final static String SCRIPT_BODY_EDEFAULT = "\"\"";
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getGroovyComponentBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
    		return getScriptBody();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
    		return getScriptBody() != SCRIPT_BODY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
    		setScriptBody(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
