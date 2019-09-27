package packageImpuestoAlTrabajador;

import java.sql.Date;

public class Ingreso {
	
	private String mesDePersepcion;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(String mesDePersepcion, String concepto, Double montoPercibido) {
		super();
		this.mesDePersepcion = mesDePersepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}


	public String getMesDePersepcion() {
		return mesDePersepcion;
	}


	public void setMesDePersepcion(String mesDePersepcion) {
		this.mesDePersepcion = mesDePersepcion;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public Double getMontoPercibido() {
		return montoPercibido;
	}


	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	
	public Double getMontoImponible() {
		return  this.getMontoPercibido();
	}
}
