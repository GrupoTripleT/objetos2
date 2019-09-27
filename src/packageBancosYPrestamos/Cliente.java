package packageBancosYPrestamos;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private Double sueldoNeto;
	private PropiedadInmobiliaria propiedad;
	
	
	
	public Double getSueldoNeto() {
		return sueldoNeto;
	}
	public Double sueldoNetoAnual() {
		return this.getSueldoNeto() * 12;
	}
	
	public PropiedadInmobiliaria getPropiedadInmobiliaria() {
		return this.propiedad;
	}
	
	public Double getValorFiscarDePropiedad() {
		return this.getPropiedadInmobiliaria().getValorFiscal();
	}

	public Integer getEdad() {
		return this.edad;
	}
}
