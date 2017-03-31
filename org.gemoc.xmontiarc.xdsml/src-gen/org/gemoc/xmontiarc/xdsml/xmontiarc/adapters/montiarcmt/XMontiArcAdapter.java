package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.montiarc.MontiArcMT;
import org.gemoc.montiarc.montiarc.MontiarcFactory;

@SuppressWarnings("all")
public class XMontiArcAdapter extends ResourceAdapter implements MontiArcMT {
  public XMontiArcAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
  }
  
  @Override
  public MontiarcFactory getMontiarcFactory() {
    return new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc.MontiarcFactoryAdapter();
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