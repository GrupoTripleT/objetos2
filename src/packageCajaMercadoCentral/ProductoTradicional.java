package packageCajaMercadoCentral;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(String nombre, Integer stock, Double precio) {
		super(nombre, stock, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getPrecioAPagar() {
		return this.getPrecio();
	}

}
