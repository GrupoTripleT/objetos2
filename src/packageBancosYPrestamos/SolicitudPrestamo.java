package packageBancosYPrestamos;

public abstract class SolicitudPrestamo {
	
	private Cliente cliente;
	private Double montoSolicitado;
	private Integer plazoEnMeses;
		
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(Double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public SolicitudPrestamo(Cliente cliente, Double montoSolicitado, Integer plazoEnMeses) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Double getValorCuota() {
		return (double) this.getMontoSolicitado() / this.getPlazoEnMeses(); 
	}
	
	public abstract Boolean esAceptada();
}
