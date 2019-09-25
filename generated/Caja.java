import java.util.Set;
import java.util.HashSet;

public class Caja {
   /**
    * <pre>
    *           0..*     0..*
    * Caja ------------------------- Supermercado
    *           cajas        &lt;       
    * </pre>
    */
   private Set<Supermercado> ;
   
   public Set<Supermercado> get() {
      if (this. == null) {
         this. = new HashSet<Supermercado>();
      }
      return this.;
   }
   
   public double getMontoTotalAPagar() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void registar(IRegistrable registrable) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
