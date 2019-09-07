package packageSupermercadoTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageSupermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,11);
		arroz = new ProductoPrimeraNecesidad("Arroz", 18d, true,8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.12 , leche.getPrecio());
		assertEquals(16.56d, arroz.getPrecio());
	}
}
