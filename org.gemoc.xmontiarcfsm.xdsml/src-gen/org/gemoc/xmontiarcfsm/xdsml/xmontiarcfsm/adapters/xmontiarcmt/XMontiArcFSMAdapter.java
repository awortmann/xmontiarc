package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.xmontiarc.xdsml.XMontiArcMT;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcFactory;

@SuppressWarnings("all")
public class XMontiArcFSMAdapter extends ResourceAdapter implements XMontiArcMT {
  public XMontiArcFSMAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
  }
  
  @Override
  public MontiarcFactory getMontiarcFactory() {
    return new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc.MontiarcFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getMontiarcFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
