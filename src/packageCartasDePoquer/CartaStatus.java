package packageCartasDePoquer;

public class CartaStatus {

	public  Boolean esDelMismoPalo ( Carta unaCarta, Carta otraCarta) {
		return unaCarta.getPalo() == otraCarta.getPalo();
		}
	
	public Boolean esUnaCartaMayorAOtraCarta(Carta unaCarta, Carta otraCarta) {
		return unaCarta.dameValor() > otraCarta.dameValor();
		}

}
