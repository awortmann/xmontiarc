package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.DataType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingPort;

@SuppressWarnings("all")
public class IncomingPortAdapter extends EObjectAdapter<IncomingPort> implements org.gemoc.montiarc.montiarc.IncomingPort {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingPortAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public DataType getType() {
    return org.gemoc.montiarc.montiarc.DataType.get(adaptee.getType().getValue());
  }
  
  @Override
  public void setType(final DataType o) {
    adaptee.setType(org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.DataType.get(o.getValue()));
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
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getIncomingPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		return getType();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		setType(
    		(org.gemoc.montiarc.montiarc.DataType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
