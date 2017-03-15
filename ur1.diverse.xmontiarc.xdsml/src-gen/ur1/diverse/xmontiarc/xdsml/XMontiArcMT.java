package ur1.diverse.xmontiarc.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimeFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcFactory;

@SuppressWarnings("all")
public interface XMontiArcMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract XmontiarcFactory getXmontiarcFactory();
  
  public abstract RuntimeFactory getRuntimeFactory();
  
  public abstract void save(final String uri) throws IOException;
}
