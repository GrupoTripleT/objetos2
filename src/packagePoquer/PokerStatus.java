package packagePoquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerStatus {
	
	private int i;

	public PokerStatus() {
		
	}
	
	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		
		List <String> cartas = new ArrayList <String>();		
		cartas.add(carta5);
		cartas.add(carta4);
		cartas.add(carta3);
		cartas.add(carta2);
		cartas.add(carta1);
		
		Stream <String> cartasSinElpalo = 
				cartas.stream().map(carta -> carta.substring(0, carta.length() -1));
				
		return cartasSinElpalo.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.containsValue(4l);
		
		
		
	}

	

}
