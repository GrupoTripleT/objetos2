package packagePoquerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packagePoquer.PokerStatus;

class PokerStatusTest {

	public PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pokerStatus = new PokerStatus();

	}

	@Test
	void testPokerStatus_VerificarCasoPoker() {
		//exercise and verify
		assertTrue( pokerStatus.verificar("8P", "8P", "8T", "8D","QT"));
	}

	@Test 
	void testPokerStatus_VerificarCasoNegrativo(){
		assertEquals(false, pokerStatus.verificar("3P", "2C", "7T", "4D","QT"));

	}
	
	@Test 
	void testPokerStatus_VerificarCasoPoker4CartasUltomasDe2(){
		assertEquals(true, pokerStatus.verificar("3P", "2C", "2T", "2D","2P"));

	}
	

	@Test 
	void testPokerStatus_VerificarCasoPositivoConNumerosDe2Cifras(){
	assertEquals(true, pokerStatus.verificar("10P", "10C", "10T", "10D","2P"));

	}

	@Test 
	void testPokerStatus_VerificarCasoPositivoPokerConQYUltimos(){
	assertEquals(true, pokerStatus.verificar("3P", "QC", "QT", "QD","QP"));

	}
	
	@Test 
	void testPokerStatus_VerificarCasoNegativo4ConNumerosQ(){
	assertEquals(false, pokerStatus.verificar("3P", "QC", "2T", "4D","7P"));

	}
	
}
