package packageSupermercado;

import java.util.ArrayList;

public class Supermecado {
	
	//Variables
	private String nombre;
	private String direccion;
	private ArrayList <Producto> productos;
	
	//Constructor
	
	public Supermecado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>(0);
	}
	
	public Supermecado(String nombre, String direccion, ArrayList<Producto> productos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList <Producto>(productos);
	}

	//Getters and  Setters	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	//Metodos
	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public Double getPrecioTotal() {
		return (double) this.getProductos().stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}
}
