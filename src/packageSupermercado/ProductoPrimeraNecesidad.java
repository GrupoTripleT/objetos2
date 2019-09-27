package packageSupermercado;


public class ProductoPrimeraNecesidad extends Producto {
   private Integer porcentajeDescuento;
   @Override
   public Double getPrecio () 
   {
      return (double) this.precio - (this.precio * porcentajeDescuento / 100);
      	}
   public ProductoPrimeraNecesidad (String nombre, Double precio, Boolean esCuidado) {
      super(nombre, precio, esCuidado);
      		this.porcentajeDescuento = 10;
      	}
   
   public ProductoPrimeraNecesidad (String nombre, Double precio, Boolean esCuidado, Integer porcentajeDescuento) {
      super(nombre, precio, esCuidado);
      		this.porcentajeDescuento = porcentajeDescuento;
      	}
   
   }
