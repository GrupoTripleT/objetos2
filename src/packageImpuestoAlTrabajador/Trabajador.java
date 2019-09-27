package packageImpuestoAlTrabajador;

import java.util.ArrayList;

public class Trabajador {
		
	private ArrayList <Ingreso> ingresos;
	
	
	
	public Trabajador() {
		super();
		this.ingresos = new ArrayList <Ingreso> ();
	}

	//Metodos
	
	public void addIngreso(Ingreso ingreso) {
		this.getIngresos().add(ingreso);
	}
	
	public Double getTotalPercibido() {
		return this.getIngresos().stream().mapToDouble(ingreso -> ingreso.getMontoPercibido()).sum();
	}
	
	public Double getMontoImponible() {
		return this.getIngresos().stream().mapToDouble(ingreso -> ingreso.getMontoImponible()).sum();
	}
	
	public Double getImpuestoAPagar() {
		return (this.getMontoImponible() * 0.98);
	}

	public ArrayList <Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(ArrayList <Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	
	
}
