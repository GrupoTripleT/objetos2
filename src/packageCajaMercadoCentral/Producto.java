package packageCajaMercadoCentral;

public abstract class Producto implements IRegistrable  {
	
	private String nombre;
	private Integer stock;
	private Double precio;
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	//CONSTRUCTOR
	public Producto(String nombre, Integer stock, Double precio) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	@Override
	public Double getPrecioAPagar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fueRegistrado() {
		this.setStock(this.getStock() - 1 );
		
	}
	
	

}
