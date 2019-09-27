package packageCajaMercadoCentral;

public class ProductoCooperativo extends Producto {


	public ProductoCooperativo(String nombre, Integer stock, Double precio) {
		super(nombre, stock, precio);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Double getPrecioAPagar() {
		return this.getPrecio() * 0.90d;
	}
}
