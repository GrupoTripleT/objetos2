package packagePoquerTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import packagePoquer.*;

class PokerStatusTest {

	public PokerStatus pokerStatus;

	
	@BeforeEach
	void setUp() throws Exception {
		
		pokerStatus = new PokerStatus();

	}

	@Test
	void testPokerStatus_VerificarCasoPoker() {
		//exercise and verify
		assertEquals(true, pokerStatus.verificar("4P", "4C", "4T", "4D","QT"));
	}

	@Test 
	void testPokerStatus_VerificarCasoNegrativo(){
		assertEquals(false, pokerStatus.verificar("3P", "2C", "7T", "4D","QT"));

	}
	
	@Test 
	void testPokerStatus_VerificarCasoNegrativo2(){
		assertEquals(false, pokerStatus.verificar("3P", "2C", "2T", "2D","2P"));

	}
}
