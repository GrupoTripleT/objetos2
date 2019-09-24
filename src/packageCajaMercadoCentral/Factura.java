package packageCajaMercadoCentral;

public abstract class Factura implements IRegistrable {

	public IAgencia agencia;
	
	@Override
	public Double getPrecioAPagar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fueRegistrado() {
		agencia.registrarPago(this);
	}

	
}
