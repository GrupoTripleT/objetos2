package packageEncriptacionTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageEncriptacion.*;

class EncriptacionNaiveTest {

	public EncriptacionNaive zip;
	public TipoDeEncriptador numerico;
	public TipoDeEncriptador vocal;
	
	@BeforeEach
	void setUp() throws Exception {
		zip = new EncriptacionNaive();
		zip.setEncriptador(numerico);
		
	}

	@Test
	void testEncriptadorNumericoDeDiego() {
		assertEquals("4,9,5,7,15",zip.encriptar("Diego"));
	}
	
	@Test
	void testEncriptadorVocal() {
		zip.setEncriptador(vocal);
		assertEquals("Doigu",zip.encriptar("Diego"));
	}

}
