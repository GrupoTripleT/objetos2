package packagePoquerContinuacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerStatus {

	public PokerStatus() {
	}
	
	public Stream <String> getCartasSinPalo(List <String> cartas){
		return cartas.stream().map(carta -> carta.substring(0, carta.length() -1));
	}
	
	public Stream <String> getCartasSoloLosPalos(List <String> cartas){
		return cartas.stream().map(carta -> carta.substring( carta.length() -1));
	}
	
	public Boolean hayXNumerosIguales(Stream <String> cartasSinPalo,  Long cantidad) {
		return cartasSinPalo.collect(Collectors.groupingBy(e->e, Collectors.counting())).containsValue(cantidad);
	}
	
	public Boolean hayXPalosIguales(Stream <String> cartasSoloLosPalos, Long cantidad) {
		return cartasSoloLosPalos.collect(Collectors.groupingBy(e->e,Collectors.counting())).containsValue(cantidad);
	}
	
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List <String> cartas = new ArrayList <String>();		
		cartas.add(carta5);
		cartas.add(carta4);
		cartas.add(carta3);
		cartas.add(carta2);
		cartas.add(carta1);
		
		String status = null;
		
		if(this.hayXNumerosIguales(this.getCartasSinPalo(cartas), 4l)) {
			 status = "Poker";
		}
		
		if(this.hayXNumerosIguales(this.getCartasSinPalo(cartas), 3l)) {
			status = "Trio";
		}
		
		if(this.hayXPalosIguales(this.getCartasSoloLosPalos(cartas), 5l)) {
			status = "Color";
		}
		
		if ( status == null) {
			status = "Nada";
		}

		return status;
		
	}
	
	
}
