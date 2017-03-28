package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.DataType;

@SuppressWarnings("all")
public class IncomingPortAdapter extends EObjectAdapter<IncomingPort> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.IncomingPort {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingPortAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public DataType getType() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.DataType.get(adaptee.getType().getValue());
  }
  
  @Override
  public void setType(final DataType o) {
    adaptee.setType(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.DataType.get(o.getValue()));
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
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.PortAspect.toString(adaptee);
  }
  
  @Override
  public EDataType getValue() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.PortAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final EDataType value) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.PortAspect.value(adaptee, value
    );
  }
  
  protected final static DataType TYPE_EDEFAULT = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.DataType.NUMBER;
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  protected final static EDataType VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getIncomingPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__TYPE:
    		return getType();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__NAME:
    		return getName();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__TYPE:
    		setType(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.DataType)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_PORT__VALUE:
    		setValue(
    		(org.eclipse.emf.ecore.EDataType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
