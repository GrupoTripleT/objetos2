package packageEquipoYTareas;

public class Funcional extends Tarea {

	private Integer impacto;
	
	
	
	public Funcional(String nombre, Double cantHoras, Integer impacto) {
		super(nombre, cantHoras);
		this.impacto = impacto;
	}



	public Integer getImpacto() {
		return impacto;
	}



	public void setImpacto(Integer impacto) {
		this.impacto = impacto;
	}



	public Double getCantHoras() {
		return this.getCantHoras() + 4;
	}

}
