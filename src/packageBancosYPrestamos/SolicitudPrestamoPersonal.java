package packageBancosYPrestamos;

public class SolicitudPrestamoPersonal extends SolicitudPrestamo {

	public SolicitudPrestamoPersonal(Cliente cliente, Double montoSolicitado, Integer plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esAceptada() {
		return (this.getCliente().sueldoNetoAnual() >= 15000.00 ) && this.laCuotaNoSuperaDeSusIngresos(70);
	}
	
	public Boolean laCuotaNoSuperaDeSusIngresos(Integer porcentaje) {
		return this.getCliente().getSueldoNeto() < (this.getCliente().getSueldoNeto()* porcentaje / 100);
	}

}
