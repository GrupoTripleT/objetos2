package packagePoquer;

public class Carta {
	
	/*Para simplificar el problema cada carta cuenta de una representaci�n formada por un String con dos o tres letras.Una
	de las letras representa el palo o figura de la carta (P = picas, C = corazones, D = diamantes, T = tr�boles).*/
	
	private String tipoCarta; 
	
	public Carta(String tipoCarta) {
		this.tipoCarta = tipoCarta;
	}
	
	public String getTipoCarta(){
		return this.tipoCarta;
	}

}
