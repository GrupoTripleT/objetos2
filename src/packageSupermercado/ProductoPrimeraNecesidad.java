package packageSupermercado;


public class ProductoPrimeraNecesidad extends Producto {
	
	// IMPLEMENTACION
	// DESCUENTO FIJO
	
	/*	
	public ProductoPrimeraNecesidad(String unNombre, Double unPrecio, Boolean esCuidado) {
		super(unNombre, unPrecio, esCuidado);
	}

	public ProductoPrimeraNecesidad(String unNombre, Double unPrecio) {
		super(unNombre, unPrecio);
	}
	
	public Double getPrecio() {
	   return (super.getPrecio() * 0.9);
	}
	*/
	
	// DESCUENTO VARIABLE
	
	private Double descuento;
	
	public ProductoPrimeraNecesidad(String unNombre, Double unPrecio, Boolean esCuidado, Double unDescuento) {
		super(unNombre, unPrecio, esCuidado);
		this.descuento = unDescuento;
	}

	public ProductoPrimeraNecesidad(String unNombre, Double unPrecio, Double unDescuento) {
		super(unNombre, unPrecio);
		this.descuento = unDescuento; // EN PORCENTAJE
	}

	public Double getPrecio() {
		   return (super.getPrecio() * getDescuento());
	}

	private Double getDescuento() {
		return 1 - (this.descuento/100);
	}
}
