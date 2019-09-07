package packageSupermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esCuidado) {
		super(nombre, precio, esCuidado);
	}

	@Override
	public Double getPrecio() {
		return this.precio * 0.9d;
	}
	
	

}
