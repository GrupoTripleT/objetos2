package packageEmpresas;

import java.util.Date;

public class EmpleadoPermanente extends Empleado {
	
	public EmpleadoPermanente(String nombre, String direccion, Boolean estaCasado, Date fechaNacimiento,
			Double sueldoBasico) {
		super(nombre, direccion, estaCasado, fechaNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	private Integer cantHijos;
	private Integer antiguedad;
	
	
	public Integer getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(Integer cantHijos) {
		this.cantHijos = cantHijos;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public Double getSueldoBruto() {
		return this.getSueldoBruto() + this.getSalarioFamiliar() + this.getSaldoAntiguedad();
	}


	private Double getSalarioFamiliar() {
		return  (double) (this.getCantHijos() * 150 ) + this.getAsignacionConyuge();
	}
	
	public Double getAsignacionConyuge() {
		if (this.getEstaCasado()) {
			return 100d;
		} else {
			return 0d;
		}
	}

	private Double getSaldoAntiguedad() {
		return (double) (this.getAntiguedad() * 50);
	}

	@Override
	public Double getRetenciones() {
		//this.getSueldoBurto() + 1;
		return null;
	}

	@Override
	public Double getSueldoNeto() {
		// TODO Auto-generated method stub
		return null;
	}

}
