package packageSupermercado.Test;

import packageSupermercado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	public ProductoPrimeraNecesidad leche;
	
	/*
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	*/

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 20);
	}
	
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(6.4), leche.getPrecio());
	}
}