import java.util.Set;
import java.util.HashSet;

public class Supermercado {
   /**
    * <pre>
    *           0..*     0..*
    * Supermercado ------------------------- Caja
    *           &gt;       cajas
    * </pre>
    */
   private Set<Caja> cajas;
   
   public Set<Caja> getCajas() {
      if (this.cajas == null) {
         this.cajas = new HashSet<Caja>();
      }
      return this.cajas;
   }
   
   }
