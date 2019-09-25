
public class Servicio extends Factura {
   private double costoXUnidadConsumida;
   
   private void setCostoXUnidadConsumida(double value) {
      this.costoXUnidadConsumida = value;
   }
   
   private double getCostoXUnidadConsumida() {
      return this.costoXUnidadConsumida;
   }
   
   private Integer cantUnidConsuPerFac;
   
   private void setCantUnidConsuPerFac(Integer value) {
      this.cantUnidConsuPerFac = value;
   }
   
   private Integer getCantUnidConsuPerFac() {
      return this.cantUnidConsuPerFac;
   }
   
   public double getPrecioAPagar() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
