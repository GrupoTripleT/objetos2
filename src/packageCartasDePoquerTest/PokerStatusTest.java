package packageCartasDePoquerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageCartasDePoquer.Carta;
import packageCartasDePoquer.*;

class PokerStatusTest {

	public PokerStatus pokerStatus;
	public Carta ochoCorazones;
	public Carta ochoPicas;
	public Carta ochoTrebol;
	public Carta ochoDiamantes;
	
	public Carta tresTrebol;
	public Carta dosTrebol;
	public Carta jTrebol;
	public Carta qTrebol;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pokerStatus = new PokerStatus();
		ochoCorazones = new Carta ("8","C");
		ochoPicas = new Carta ("8","P");
		ochoTrebol = new Carta ("8", "T");
		ochoDiamantes = new Carta ("8","D");
		qTrebol = new Carta ("Q","T");
		
		tresTrebol = new Carta ("3","T");
		dosTrebol = new Carta ("2","T");
		jTrebol = new Carta ("J","T");

	}

	@Test
	void testPokerStatus_VerificarCasoPoker() {
		//exercise and verify
		assertEquals( "Poker",pokerStatus.verificar(ochoCorazones, ochoPicas, ochoTrebol,ochoDiamantes,
				qTrebol));
	}

	@Test 
	void testPokerStatus_VerificarColorNegro(){
	assertEquals("Color", pokerStatus.verificar(ochoTrebol, tresTrebol, dosTrebol,qTrebol,jTrebol));

	}

	/*
	@Test 
	void testPokerStatus_VerificarCasoNegrativo(){
		assertEquals("Nada", pokerStatus.verificar("3P", "2C", "7T", "4D","QT"));

	}
	
	@Test 
	void testPokerStatus_VerificarCasoPokerConUltimasCartasDe2(){
		assertEquals("Poker", pokerStatus.verificar("3P", "2C", "2T", "2D","2P"));

	}
	

	@Test 
	void testPokerStatus_VerificarCasoPositivoConNumerosDe2Cifras(){
	assertEquals("Poker", pokerStatus.verificar("10P", "10C", "10T", "10D","2P"));

	}

	@Test 
	void testPokerStatus_VerificarCasoPositivoPokerConQYUltimos(){
	assertEquals("Poker", pokerStatus.verificar("3P", "QC", "QT", "QD","QP"));

	}
	
	@Test 
	void testPokerStatus_VerificarCasoNegativo4ConNumerosQ(){
	assertEquals("Nada", pokerStatus.verificar("3P", "QC", "2T", "4D","7P"));

	}
	
	
	
	@Test 
	void testPokerStatus_VerificarColorRojo(){
	assertEquals("Color", pokerStatus.verificar("3C", "2C", "QC", "4C","7C"));

	}
	
	@Test 
	void testPokerStatus_VerificarColorTrio(){
	assertEquals("Trio", pokerStatus.verificar("3P", "3C", "3T", "4D","7P"));

	}
	
	@Test 
	void testPokerStatus_VerificarColorTrio2(){
	assertEquals("Trio", pokerStatus.verificar("3P", "QC", "3T", "4D","3P"));

	}
	
	*/
	
}
