import java.util.Set;
import java.util.HashSet;

public class Factura {
   /**
    * <pre>
    *           0..*     0..*
    * Factura ------------------------- Agencia
    *           &gt;       agencia
    * </pre>
    */
   private Set<Agencia> agencia;
   
   public Set<Agencia> getAgencia() {
      if (this.agencia == null) {
         this.agencia = new HashSet<Agencia>();
      }
      return this.agencia;
   }
   
   protected double getPrecioAPagar() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void fueRegistrado() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
