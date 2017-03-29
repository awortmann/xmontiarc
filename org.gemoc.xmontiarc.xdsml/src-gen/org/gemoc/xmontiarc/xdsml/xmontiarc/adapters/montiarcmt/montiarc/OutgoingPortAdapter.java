package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.DataType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort;

@SuppressWarnings("all")
public class OutgoingPortAdapter extends EObjectAdapter<OutgoingPort> implements org.gemoc.montiarc.montiarc.OutgoingPort {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public OutgoingPortAdapter() {
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
  
  @Override
  public String getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final String o) {
    adaptee.setInitialValue(o);
  }
  
  protected final static DataType TYPE_EDEFAULT = org.gemoc.montiarc.montiarc.DataType.NUMBER;
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  protected final static String INITIAL_VALUE_EDEFAULT = "DefaultValue";
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getOutgoingPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__TYPE:
    		return getType();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__NAME:
    		return getName();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		return getInitialValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__TYPE:
    		setType(
    		(org.gemoc.montiarc.montiarc.DataType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		setInitialValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
