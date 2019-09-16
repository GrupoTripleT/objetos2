
public class Producto {
   private String nombre;
   
   private void setNombre(String value) {
      this.nombre = value;
   }
   
   private String getNombre() {
      return this.nombre;
   }
   
   private Integer stock;
   
   private void setStock(Integer value) {
      this.stock = value;
   }
   
   private Integer getStock() {
      return this.stock;
   }
   
   private double precio;
   
   private void setPrecio(double value) {
      this.precio = value;
   }
   
   private double getPrecio() {
      return this.precio;
   }
   
   protected double getPrecioAPagar() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public double getStock() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void fueRegistrado() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void descontarStock() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
