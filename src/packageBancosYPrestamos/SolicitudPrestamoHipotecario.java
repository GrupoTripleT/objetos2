package packageBancosYPrestamos;

public class SolicitudPrestamoHipotecario extends SolicitudPrestamo {

	public SolicitudPrestamoHipotecario(Cliente cliente, Double montoSolicitado, Integer plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esAceptada() {
		return this.laCuotaNoSuperaDeSusIngresos(50) && this.montoSolicitadoNoSuperaValorFiscal(70)
				&& this.laPersonaNoSuperaLaEdadAlTermino(this.getCliente(),65);
	}
	
	public Boolean laCuotaNoSuperaDeSusIngresos(int porcentaje) {
		return this.getCliente().getSueldoNeto() < (this.getCliente().getSueldoNeto()* porcentaje / 100);
	}
	
	public Boolean montoSolicitadoNoSuperaValorFiscal(Integer porcentaje) {
		return  this.getCliente().getValorFiscarDePropiedad() < 
				(this.getCliente().getValorFiscarDePropiedad()* porcentaje / 100);
		
		//this.getCliente().getPropiedadInmobiliaria().getValorFiscal()
	}
	
	public Boolean laPersonaNoSuperaLaEdadAlTermino(Cliente cliente, Integer edadMaximaPrestamo) {
		return this.getCliente().getEdad() 
				//(+ la edad que va a tener despues  de terminar de pagar el prestamo) 
				< edadMaximaPrestamo;
	
	}
	

}
