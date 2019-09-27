package packageEmpresas;

import java.util.Date;

public class EmpleadoContratado extends Empleado {
	
	//Variables
	private Integer numContratado;
	private String 	medioDePago;
	
	//Getters and Setters

	public Integer getNumContratado() {
		return numContratado;
	}

	public void setNumContratado(Integer numContratado) {
		this.numContratado = numContratado;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	//Constructor
	public EmpleadoContratado(String nombre, String direccion, Boolean estaCasado, Date fechaNacimiento,
			Double sueldoBasico, Integer numContratado, String medioDePago) {
		super(nombre, direccion, estaCasado, fechaNacimiento, sueldoBasico);
		this.numContratado = numContratado;
		this.medioDePago = medioDePago;
	}
	
	//Method
	
	@Override
	public Double getSueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public Double getSueldoNeto() {
		return this.getSueldoBruto() - 50;
	}
	
	@Override
	public Double getRetenciones() {
		// TODO Auto-generated method stub
		return null;
	}

}
