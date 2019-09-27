package packageEmpresas;

import java.util.Date;

public class EmpleadoTemporario extends Empleado {
	
	private Integer cantHorasExtras;
	private Integer fechaFin;


	public Integer getCantHorasExtras() {
		return cantHorasExtras;
	}


	public void setCantHorasExtras(Integer cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}


	public Integer getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Integer fechaFin) {
		this.fechaFin = fechaFin;
	}

	public EmpleadoTemporario(String nombre, String direccion, Boolean estaCasado, Date fechaNacimiento,
			Double sueldoBasico, Integer cantHorasExtras, Integer fechaFin) {
		super(nombre, direccion, estaCasado, fechaNacimiento, sueldoBasico);
		this.cantHorasExtras = cantHorasExtras;
		this.fechaFin = fechaFin;
	}


	@Override
	public Double getSueldoBruto() {
		return this.getSueldoBasico() +
				(this.getCantHorasExtras() * 40);
	}

	@Override
	public Double getRetenciones() {
		return this.getObraSocial() + this.getAportesJubilatorios() ;
	}
	

	private Double getObraSocial() {
		return (double) this.getSueldoBruto() * 0.10 + this.getSuperaEdad(50);
	}


	private Double getSuperaEdad(Integer edad) {
		return (double) ((this.getEdad() > edad) ?25:0);
	}


	private Double getAportesJubilatorios() {
		return (double) (this.getSueldoBruto() * 0.10) + (this.getCantHorasExtras() * 5);
	}

}
