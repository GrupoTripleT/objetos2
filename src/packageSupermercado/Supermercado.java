package packageSupermercado;

import java.util.Set;
import java.util.HashSet;

public class Supermercado {

	private String nombre;
	private String direccion;
	private Set<Producto> productos = new HashSet<Producto>();

	// GETTER Y SETTER
	
	private String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	private String getDireccion() {
		return this.direccion;
	}
	
	private void setDireccion (String unaDireccion) {
		this.direccion = unaDireccion;
	}
	
	// CONSTRUCTOR
	
	public Supermercado (String unNombre, String unaDireccion) {
	   this.nombre = unNombre;
	   this.direccion = unaDireccion;
	}

	// IMPLEMENTACION
	
	public void agregarProducto(Producto producto) {
	   this.productos.add(producto);
	}
	
	public Integer getCantidadDeProductos() {
	   return productos.size();
	}
	
	public Double getPrecioTotal() {
	   Double contador = 0d;
	   for (Producto producto : productos) {
		   contador += producto.getPrecio();
	   }
	   return contador;
	}

}
