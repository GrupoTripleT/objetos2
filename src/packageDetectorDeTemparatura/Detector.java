package packageDetectorDeTemparatura;

public class Detector {
	
	private Sensor sensor;
	private  AlarmSender alarmSender;
	private Ubicacion ubicacion;
	
	// COnstructores
	public Detector(Sensor sensor, AlarmSender alarmSender, Ubicacion ubicacion) {
		super();
		this.sensor = sensor;
		this.alarmSender = alarmSender;
	}	
	
	public Detector() {
		super();
	}
	
	//SETTERS AND GETTERS
	public Sensor getSensor() {
		return sensor;
	}


	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}


	public AlarmSender getAlarmSender() {
		return alarmSender;
	}


	public void setAlarmSender(AlarmSender alarmSender) {
		this.alarmSender = alarmSender;
	}


	public Ubicacion getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// METODOS
	
	public void evaluar() { // si tiene el sensor con mayor a 40 dispara alarma 
		if(this.getSensor().getTemperatura() > 40) {
			this.getAlarmSender().sonar();
		}
	}
	

}
