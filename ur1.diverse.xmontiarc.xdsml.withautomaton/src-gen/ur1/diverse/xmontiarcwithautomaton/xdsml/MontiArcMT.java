package ur1.diverse.xmontiarcwithautomaton.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import xmontiarc.XmontiarcFactory;

@SuppressWarnings("all")
public interface MontiArcMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract XmontiarcFactory getXmontiarcFactory();
  
  public abstract void save(final String uri) throws IOException;
}
