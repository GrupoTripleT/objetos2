package packageCultivos;

public class PorcionCompleta extends Porcion {
	
	public Cultivo cultivo;

	public PorcionCompleta(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public Cultivo getCultivo() {
		return this.cultivo;
	}
	@Override
	public Double gananciaAnual() {
		// TODO Auto-generated method stub
		return this.getCultivo().getPrecioAnual() ;
	}

}
