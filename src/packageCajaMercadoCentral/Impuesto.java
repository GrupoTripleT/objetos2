package packageCajaMercadoCentral;

public class Impuesto extends Factura implements IRegistrable {

	private Double tasaServicio;
	
	// SETTERS AND GETTERS
	public Double getTasaServicio() {
		return tasaServicio;
	}

	public void setTasaServicio(Double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}

	//CONSTRUCTOR
	public Impuesto(Double tasaServicio) {
		super();
		this.tasaServicio = tasaServicio;
	}

	@Override
	public Double getPrecioAPagar() {
		return  this.getTasaServicio();
	}

	

	
}
