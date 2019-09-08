package packageSupermercado;


public class Producto {

	private String nombre;
	private Double precio;
	private Boolean esCuidado = false;

	// GETTER Y SETTER
	
	public String getNombre() {
	   return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public Double getPrecio() {
	   return this.precio;
	}
	
	public void setPrecio(Double unPrecio) {
		this.precio = unPrecio;
	}
	
	public Boolean esPrecioCuidado() {
	   return this.esCuidado;
	}
	
	public void setEsPrecioCuidado() {
		this.esCuidado = true;
	}
	
	public void setNoEsPrecioCuidado() {
		this.esCuidado = false;
	}
	
	// CONSTRUCTOR
	
	public Producto (String unNombre, Double unPrecio) {
		this.nombre = unNombre;
		this.precio = unPrecio;
	}
	
	public Producto (String unNombre, Double unPrecio, Boolean esCuidado) {
		this.nombre = unNombre;
		this.precio = unPrecio;
		this.esCuidado = esCuidado;
	}
	
	// IMPLEMENTACION
	
	public void aumentarPrecio(Double aumento) {
	   setPrecio(aumento + this.precio);
	}
	


}
