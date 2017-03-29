package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.DataType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;

@SuppressWarnings("all")
public class IncomingPortAdapter extends EObjectAdapter<IncomingPort> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingPortAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public DataType getType() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.DataType.get(adaptee.getType().getValue());
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
  
  @Override
  public String toString() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspect.toString(adaptee);
  }
  
  @Override
  public EDataType getValue() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final EDataType value) {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspect.value(adaptee, value
    );
  }
  
  protected final static DataType TYPE_EDEFAULT = org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.DataType.NUMBER;
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  protected final static EDataType VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getIncomingPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		return getType();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		return getName();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__TYPE:
    		setType(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.DataType)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_PORT__VALUE:
    		setValue(
    		(org.eclipse.emf.ecore.EDataType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
