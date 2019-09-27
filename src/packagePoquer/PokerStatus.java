package packagePoquer;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {
	
	public PokerStatus() {
		
	}
	
	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		List <String> cartas = new ArrayList <String>();		
		cartas.add(carta5);
		cartas.add(carta4);
		cartas.add(carta3);
		cartas.add(carta2);
		cartas.add(carta1);
		
		int cantMatches = 0;
		for (String unaCarta : cartas) {
			if (cantMatches =! 4) {
				cantMatches = cartas.stream().filter(carta -> carta == unaCarta).count();
			}
		}
		
		//return cartas.stream().filter(carta1.substring(1,1) == );
		return cantMatches == 4;
	}

	

}
