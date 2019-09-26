package packageEquipoYTareas;

public class Bugs extends Tarea {
	
	private String personaReport;
	private Integer serveridad;
	
	

	public Bugs(String nombre, Double cantHoras, String personaReport, Integer serveridad) {
		super(nombre, cantHoras);
		this.personaReport = personaReport;
		this.serveridad = serveridad;
	}



	public String getPersonaReport() {
		return personaReport;
	}



	public void setPersonaReport(String personaReport) {
		this.personaReport = personaReport;
	}



	public Integer getServeridad() {
		return serveridad;
	}



	public void setServeridad(Integer serveridad) {
		this.serveridad = serveridad;
	}



	@Override
	public Double getCantHoras() {
		return this.getCantHoras() + 8;
	}


	

}
