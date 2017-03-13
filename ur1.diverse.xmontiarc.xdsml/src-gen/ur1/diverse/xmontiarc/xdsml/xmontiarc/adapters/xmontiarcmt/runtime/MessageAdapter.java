package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message;

@SuppressWarnings("all")
public class MessageAdapter extends EObjectAdapter<Message> implements ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.Message {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public MessageAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Object getPayload() {
    return adaptee.getPayload();
  }
  
  @Override
  public void setPayload(final Object o) {
    adaptee.setPayload(o);
  }
  
  @Override
  public long getTimestamp() {
    return adaptee.getTimestamp();
  }
  
  @Override
  public void setTimestamp(final long o) {
    adaptee.setTimestamp(o);
  }
  
  protected final static Object PAYLOAD_EDEFAULT = null;
  
  protected final static long TIMESTAMP_EDEFAULT = -1L;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.eINSTANCE.getMessage();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__PAYLOAD:
    		return getPayload();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__TIMESTAMP:
    		return new java.lang.Long(getTimestamp());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__PAYLOAD:
    		return getPayload() != PAYLOAD_EDEFAULT;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__TIMESTAMP:
    		return getTimestamp() != TIMESTAMP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__PAYLOAD:
    		setPayload( newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.MESSAGE__TIMESTAMP:
    		setTimestamp(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
