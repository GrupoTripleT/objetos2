import java.util.Set;

public interface Agencia {
   /**
    * <pre>
    *           0..*     0..*
    * Agencia ------------------------- Factura
    *           agencia        &lt;       
    * </pre>
    */
   public Set<Factura> get();
   
   public void registrarPago();
   
   }
