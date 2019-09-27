package packageImpuestoAlTrabajadorTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageImpuestoAlTrabajador.Ingreso;
import packageImpuestoAlTrabajador.IngresoXHoraExtra;
import packageImpuestoAlTrabajador.Trabajador;

class TrabajadorTest {
	
	public Trabajador nicolas;
	public Ingreso ingreso1;
	public Ingreso ingreso2;
	public IngresoXHoraExtra ingreso3;
	

	@BeforeEach
	void setUp() throws Exception {
		nicolas = new Trabajador();
		ingreso1 = new Ingreso("Enero","Relacion de dependencia QServices",70000.00);
		ingreso2 = new Ingreso("Febrero","Relacion de dependencia QServices",70000.00);
		ingreso3 = new IngresoXHoraExtra("Enero","Relacion de dependencia QServices",5000.00,10);
		
		nicolas.addIngreso(ingreso1);
		nicolas.addIngreso(ingreso2);
		nicolas.addIngreso(ingreso3);
		
	}

	@Test
	void testImpuestoAlTrabajadorNicolas() {
		assertEquals(145000.00, nicolas.getTotalPercibido());
		assertEquals(137200.00, nicolas.getImpuestoAPagar());
		assertEquals(140000.00, nicolas.getMontoImponible());
		
	}

}
