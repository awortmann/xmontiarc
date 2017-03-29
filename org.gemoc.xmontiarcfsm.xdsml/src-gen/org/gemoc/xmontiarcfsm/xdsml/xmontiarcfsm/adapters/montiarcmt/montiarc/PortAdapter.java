package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.DataType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;

@SuppressWarnings("all")
public class PortAdapter extends EObjectAdapter<Port> implements org.gemoc.montiarc.montiarc.Port {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public PortAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public DataType getType() {
    return org.gemoc.montiarc.montiarc.DataType.get(adaptee.getType().getValue());
  }
  
  @Override
  public void setType(final DataType o) {
    adaptee.setType(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.DataType.get(o.getValue()));
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static DataType TYPE_EDEFAULT = org.gemoc.montiarc.montiarc.DataType.NUMBER;
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__TYPE:
    		return getType();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__TYPE:
    		setType(
    		(org.gemoc.montiarc.montiarc.DataType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
