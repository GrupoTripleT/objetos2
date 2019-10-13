package packageCultivosTest;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageCultivos.*;

class PorcionDivididaTest {
	
	public Cultivo cultivoSoja;
	public Cultivo cultivoTrigo;
	
	public PorcionCompleta porcionSoloTrigo;
	public PorcionCompleta porcionSoloSoja;
	public PorcionDividida porcionSojaTrigo;
	
	public PorcionDividida porcionSojaTrigo2;
	
	public PorcionDividida porcionDivididaRara;
	
	@BeforeEach
	void setUp() throws Exception {
	cultivoSoja  = new Cultivo("Soja", 500.00);
	cultivoTrigo = new Cultivo("Trigo",300.00);
	
	porcionSoloSoja = new PorcionCompleta(cultivoSoja);
	porcionSoloTrigo = new PorcionCompleta(cultivoTrigo);
	
	porcionSojaTrigo = new PorcionDividida();
	porcionSojaTrigo2 = new PorcionDividida();
	}
	
	

	@Test
	void testPorcionCompleta() {
		assertEquals(500.00,porcionSoloSoja.gananciaAnual());
	}
	
	@Test
	void testPorcionDivididaConDosPorcionesCompletas() {
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo.agregarPorcion(porcionSoloTrigo);
		assertEquals(200.00,porcionSojaTrigo.gananciaAnual());
	}
	
	@Test
	void testPorcionDivididaCon4PorcionesCompletas() {
		
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo.agregarPorcion(porcionSoloTrigo);
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		
		assertEquals(450.00,porcionSojaTrigo.gananciaAnual());
	}
	
	@Test
	void testPorcionDivididaCon3PorcionesCompletasY1Dividida() {
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo.agregarPorcion(porcionSoloTrigo);
		porcionSojaTrigo.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo2.agregarPorcion(porcionSoloSoja);
		porcionSojaTrigo.agregarPorcion(porcionSojaTrigo2);
		
		assertEquals(356.25,porcionSojaTrigo.gananciaAnual());
	}
	
	@Test
	void testPorcionDivididaConMock() {
		porcionDivididaRara = mock (PorcionDividida.class);
			when(porcionDivididaRara.gananciaAnual()).thenReturn (400.00);
		
		porcionSojaTrigo.agregarPorcion(porcionDivididaRara);
		assertEquals(100.00,porcionSojaTrigo.gananciaAnual());
	}
	
	
	
}
