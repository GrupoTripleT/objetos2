package packageCartasDePoquer;

public class Carta {
	
	public String valor;
	public String palo;
	
	public Carta(String valor, String palo){
		this.valor = valor;
		this.palo = palo;
	}
	

	public String getPalo() {
		return this.palo;
	}
	
	public  String getValor() {
		return this.valor;
	}
	public Integer dameValor() {
		
		Integer valorNumerico = null;
		
		if(this.getValor() == "J") {
			valorNumerico = 11;
		} else if(this.getValor() == "Q") {
			valorNumerico = 12;
			} else if(this.getValor() == "K") {
				valorNumerico = 13;
			} else if(this.getValor() == "A") {
				valorNumerico = 14;
			}
			else {
				valorNumerico = Integer.parseInt(this.getValor());
			}

		return valorNumerico;
	}
	

	

}
