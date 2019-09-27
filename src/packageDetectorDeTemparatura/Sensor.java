package packageDetectorDeTemparatura;

public class Sensor {

	private Integer humedad;
	private Integer temperatura;
	
	//Constructor
	public Sensor(Integer humedad, Integer temperatura) {
		super();
		this.humedad = humedad;
		this.temperatura = temperatura;
	}
	// CONSTRUCTORES
	public Integer getHumedad() {
		return humedad;
	}

	public void setHumedad(Integer humedad) {
		this.humedad = humedad;
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	
}
