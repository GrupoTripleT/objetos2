package packageDetectorDeTemperaturaTest;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import packageDetectorDeTemparatura.*;

class DetectorTest {

	public Detector detector;
	public Sensor sensorMenorA40;
	public Sensor sensorMayorA40;
	public AlarmSender alarmSender;
	public Ubicacion ubicacion;
	
	
	@BeforeEach
	void setUp() throws Exception {
		// Setup 
		sensorMayorA40 = mock(Sensor.class);	//DOC  Mock
			when (sensorMayorA40.getTemperatura()).thenReturn(60);
		sensorMenorA40 = mock(Sensor.class); //DOC Mock
			when (sensorMenorA40.getTemperatura()).thenReturn(20);
			
			
		alarmSender = mock (AlarmSender.class); // DOC Mock Spy			
		ubicacion = mock (Ubicacion.class); // DOC Mock Dommy
		
		detector = new Detector();  // SUT
	}

	@Test
	void testDetector_Evaluar() { // evaluo  el dectector con un sensor menor de 40 tem
		// Setear el dectort con DOC que activa la alarma
		detector.setSensor(sensorMayorA40);
		detector.setAlarmSender(alarmSender);
		detector.setUbicacion(ubicacion);
		//Exercise
		detector.evaluar();
		// Verify
		verify(alarmSender).sonar();
	
	}

}
