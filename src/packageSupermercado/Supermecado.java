package packageSupermercado;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Supermecado  {
   private String nombre;
   private String direccion;
   private ArrayList<Producto> productos;
   
   public void setNombre(String value) {
      this.nombre = value;
   }
   
   public String getNombre() {
      return this.nombre;
   }
   
   
   
   public void setDireccion(String value) {
      this.direccion = value;
   }
   
   public String getDireccion() {
      return this.direccion;
   }
   
  
   
   public Supermecado (String nombre, String direccion) {
      super();
      		this.nombre = nombre;
      		this.direccion = direccion;
      		this.productos = new ArrayList<Producto>(0);
      	}
   
   public Integer getCantidadDeProductos() {
      return this.getProductos().size();
      	}
   
   public Double getPrecioTotal() {
      return (double) this.getProductos().stream().mapToDouble(producto -> producto.getPrecio()).sum();
      	}
   
   public void agregarProducto(Producto producto) {
      this.getProductos().add(producto);
      	}

public ArrayList<Producto> getProductos() {
	return productos;
}

public void setProductos(ArrayList<Producto> productos) {
	this.productos = productos;
}
   
   }
