package packageCajaMercadoCentral;

public class Servicio extends Factura implements IRegistrable {

	private Double costoXUnidadConsumida;
	private Integer cantUnidConsuPerFac;
	
	
	//CONSTRUCTOR
	public Servicio(Double costoXUnidadConsumida, Integer cantUnidConsuPerFac) {
		super();
		this.costoXUnidadConsumida = costoXUnidadConsumida;
		this.cantUnidConsuPerFac = cantUnidConsuPerFac;
	}
	
	//GETTERS AND SETTERS
	public Double getCostoXUnidadConsumida() {
		return costoXUnidadConsumida;
	}



	public void setCostoXUnidadConsumida(Double costoXUnidadConsumida) {
		this.costoXUnidadConsumida = costoXUnidadConsumida;
	}



	public Integer getCantUnidConsuPerFac() {
		return cantUnidConsuPerFac;
	}



	public void setCantUnidConsuPerFac(Integer cantUnidConsuPerFac) {
		this.cantUnidConsuPerFac = cantUnidConsuPerFac;
	}



	@Override
	public Double getPrecioAPagar() {
		return (double) (this.getCantUnidConsuPerFac() * this.getCostoXUnidadConsumida());
	}

	
}
