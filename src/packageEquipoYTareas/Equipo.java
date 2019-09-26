package packageEquipoYTareas;

import java.util.*;

public class Equipo {

	private Set <Tarea> tareas;

	public Equipo(Set<Tarea> tareas) {
		super();
		this.tareas = tareas;
	}

	public Set<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(Set<Tarea> tareas) {
		this.tareas = tareas;
	}
	 
	
	//Method
	
	public void  addTarea(Tarea tarea) {
		this.getTareas().add(tarea);
	}
	public Double getCantHoras(Tarea tareas){
		return (double) this.getTareas().stream().mapToDouble(tarea -> tarea.getCantHoras()).sum();
	}
	
	
	
	
	

}
