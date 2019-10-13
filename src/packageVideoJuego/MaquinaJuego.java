package packageVideoJuego;

public class MaquinaJuego {
		
	private EstadoDeMaquina  estado;
	
	public EstadoDeMaquina getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeMaquina estado) {
		this.estado = estado;
	}


	public String encender() {
		return this.getEstado().ejecutarElEncendido(this);
	}
	
	

}
