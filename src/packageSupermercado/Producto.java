package packageSupermercado;


public abstract class Producto {
   protected String nombre;
   protected Double precio;
   protected Boolean esPrecioCuidado;
   public Double getPrecio() {
      return this.precio;
      	}
   
   public String getNombre() {
      return nombre;
      	}
   
   public void setNombre(String nombre) {
      this.nombre = nombre;
      	}
   
   public Boolean esPrecioCuidado() {
      return esPrecioCuidado;
      	}
   
   public void setesPrecioCuidado(Boolean esPrecioCuidado) {
      this.esPrecioCuidado = esPrecioCuidado;
      	}
   
   public Producto (String nombre, Double precio) {
      super();
      		this.nombre = nombre;
      		this.precio = precio;
      		this.esPrecioCuidado = false;
      	}
   
   public Producto (String nombre, Double precio, Boolean esPrecioCuidado) {
      super();
      		this.nombre = nombre;
      		this.precio = precio;
      		this.setesPrecioCuidado(esPrecioCuidado);
      	}
   
   public void setPrecio(Double precio) {
      this.precio = precio;
      	}
   
   public void aumentarPrecio(Double precio) {
      this.precio += precio;
      	}
   
   }
