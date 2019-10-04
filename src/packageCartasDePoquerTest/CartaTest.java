package packageCartasDePoquerTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageCartasDePoquer.*;

class CartaTest {

	public CartaStatus cartaStatus;
	
	public Carta ochoTrebol;
	public Carta cuatroDiamantes;
	public Carta cuatroTrebol;
	
	public Carta queenTrebol;
	public Carta kingDiamantes;
	public Carta assCorazones;
	
	public Carta cartaFalsa;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		cartaStatus = new CartaStatus();
		
		ochoTrebol = new Carta("8","T");
		cuatroTrebol = new Carta ("4","T");
		cuatroDiamantes = new Carta ("4","D");
		queenTrebol = new Carta ("Q","T");
		kingDiamantes = new Carta ("K","D");
		assCorazones = new Carta ("A","C");
		
		cartaFalsa = new Carta("T", "C");
	}

	@Test
	void testDosCartasMismoPalo() {
		assertTrue(cartaStatus.esDelMismoPalo(cuatroTrebol, ochoTrebol));
	}
	
	@Test
	void testDosCartasDistintoPalo() {
		assertFalse(cartaStatus.esDelMismoPalo(ochoTrebol, cuatroDiamantes));;
	}
	
	@Test
	void testPrimeraCartaMayorQueSegunda() {
		assertTrue(cartaStatus.esUnaCartaMayorAOtraCarta(ochoTrebol,cuatroTrebol));
	}
	
	@Test
	void testPrimeraCartaEsIgualDeValorQueSegundaCarta() {
		assertFalse(cartaStatus.esUnaCartaMayorAOtraCarta(cuatroDiamantes, cuatroTrebol));
	}
	
	@Test
	void testAssEsMayorQueReina() {
		assertTrue(cartaStatus.esUnaCartaMayorAOtraCarta(assCorazones,queenTrebol));
	}
	
	@Test
	void testKingEsMayorQueReina() {
		assertTrue(cartaStatus.esUnaCartaMayorAOtraCarta(kingDiamantes,queenTrebol));	
		}

	@Test
	void testDeCartaFalsa() {
		assertFalse(cartaStatus.esUnaCartaMayorAOtraCarta(cartaFalsa,queenTrebol));	
		}

}
