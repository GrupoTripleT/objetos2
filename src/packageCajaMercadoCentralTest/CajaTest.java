package packageCajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageCajaMercadoCentral.*;

class CajaTest {
	
	public Caja caja1;
	public List <IRegistrable> lista1;
	public ProductoCooperativo leche;
	public ProductoTradicional aceite;
	public Impuesto arba;
	public Servicio agua;
	

	@BeforeEach
	void setUp() throws Exception {
		
		caja1 = new Caja(1);
		leche = new ProductoCooperativo("Leche", 10, 10.00);
		aceite = new ProductoTradicional("Aceite", 20, 30.01);
		arba = new Impuesto(455.00);
		agua = new Servicio(200.89, 2);
		
		
		lista1.add(leche);
		lista1.add(aceite);
		lista1.add(arba);
		lista1.add(agua);
	}

	@Test
	void testCaja1() {
		assertEquals(9.00, caja1.getMontoTotalAPagar(leche));
		//assertEquals(885,78, caja1.getMontoTotalAPagar(lista1));
		
	}

}
