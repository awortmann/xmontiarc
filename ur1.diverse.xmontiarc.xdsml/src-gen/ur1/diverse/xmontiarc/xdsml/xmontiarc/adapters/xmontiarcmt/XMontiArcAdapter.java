package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import ur1.diverse.xmontiarc.xdsml.XMontiArcMT;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimeFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcFactory;

@SuppressWarnings("all")
public class XMontiArcAdapter extends ResourceAdapter implements XMontiArcMT {
  public XMontiArcAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
  }
  
  @Override
  public RuntimeFactory getRuntimeFactory() {
    return new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.RuntimeFactoryAdapter();
  }
  
  @Override
  public XmontiarcFactory getXmontiarcFactory() {
    return new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.XmontiarcFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getRuntimeFactory());
    res.add(getXmontiarcFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
