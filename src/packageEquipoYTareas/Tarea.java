package packageEquipoYTareas;

public abstract class Tarea {

	protected String nombre;
	protected Double cantHoras;
		
		
		
	public Tarea(String nombre, Double cantHoras) {
		super();
		this.nombre = nombre;
		this.setCantHoras(cantHoras);
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setCantHoras(Double cantHoras) {
		this.cantHoras = cantHoras;
	}



	public abstract Double getCantHoras();
	
	public Boolean esCritico() {
		return this.getCantHoras() > 32;
	
	}

}
