package packageReproductorMP3;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorTest {

	public  Reproductor reproductorSut;
	public Cancion cancionDoc;
	
	@BeforeEach
	void setUp() throws Exception {
		reproductorSut = new Reproductor();
		cancionDoc = mock(Cancion.class);
		
	}

	@Test
	void testPlayAlReproductorYSaberSiPusoPlayALaCancion() {
		reproductorSut.seleccionarCancion(cancionDoc);
		reproductorSut.play();
		verify(cancionDoc, times(1)).play();
	}

	@Test
	void testStopAlReproductorYSaberSiStopLaCancion() {
		reproductorSut.seleccionarCancion(cancionDoc);
		reproductorSut.play();
		reproductorSut.stop();
		verify(cancionDoc, times(1)).stop();
	}
	
	@Test
	void testPauseReproductorPauseCancion() {
		reproductorSut.seleccionarCancion(cancionDoc);
		reproductorSut.play();
		reproductorSut.pause();
		verify(cancionDoc, times(1)).pause();
	}
	
	@Test
	void testErrorSinCancionPlayReproductor() {
		reproductorSut.play();
		
	}
}
