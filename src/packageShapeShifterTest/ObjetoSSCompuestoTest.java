package packageShapeShifterTest;

import static org.junit.jupiter.api.Assertions.*;

import packageShapeShifter.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObjetoSSCompuestoTest {

	public ObjetoSSCompuesto objetoCompuestoSUT;
	public ObjetoSSSimple a;
	public ObjetoSSSimple b;
	public ObjetoSSCompuesto c;
	public ObjetoSSCompuesto f;
	
	@BeforeEach

	void setUp() throws Exception {
		a = mock(ObjetoSSSimple.class);
			when(a.deepest()).thenReturn(0);
		b = mock(ObjetoSSSimple.class);
			when(b.deepest()).thenReturn(0);
			
		c = new ObjetoSSCompuesto(a,b);

		f = new ObjetoSSCompuesto(c, c);
		
		objetoCompuestoSUT = new ObjetoSSCompuesto(a,b);
		
		
	}

	@Test
	void testComposeAconBParaFormarElCompuestoSut() {
		// Verifico si (a y b) esta en el listado del compuesto
		assertTrue(objetoCompuestoSUT.getObjetos().contains(a));
		assertTrue(objetoCompuestoSUT.getObjetos().contains(b));
	}
	
	@Test
	void testDeepestObjetoCompuestoConDOSHOJAS() {
		assertEquals(1,objetoCompuestoSUT.deepest());
	}
	
	@Test
	void testDeepestObjetoCompuestoCon1HOJASYOtroCompuesto() {
		objetoCompuestoSUT = new ObjetoSSCompuesto(a,c);		
		assertEquals(2,objetoCompuestoSUT.deepest());
	}
	
	@Test
	void testDeepestObjetoCompuestoCon2Compuestos() {
		assertEquals(2, f.deepest());
		assertEquals(1, c.deepest());
		objetoCompuestoSUT = new ObjetoSSCompuesto(f,c);		
		assertEquals(3,objetoCompuestoSUT.deepest());
	}

}
