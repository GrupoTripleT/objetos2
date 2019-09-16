package packageCajaMercadoCentral;

import java.util.List;

public class Caja {
	
	private Integer numeroDeCaja;	
	
	//CONSTRUCTORES
	public Caja() {
		// TODO Auto-generated constructor stub
	}
	
	public Caja(Integer numeroDeCaja) {
		super();
		this.numeroDeCaja = numeroDeCaja;
	}

	//GETTERS AND SETTERS
	public Integer getNumeroDeCaja() {
		return this.numeroDeCaja;
	}
	public void setNumeroDeCaja(Integer num) {
		this.numeroDeCaja = num;
	}

	
	/*
	//En ves de hacer por una lista Lo puedo hacer por uno  y despues reutilizar el metodo en un map
	public void Registrar(IRegistrable registrable) {
		this.setAcumuladorDeCobranzas(0d); //Reseteo la variable acumuladora en cada Registro de Lista de Registrables
		
		this.setAcumuladorDeCobranzas(registrable.getPrecioAPagar()); //Acumulo en la variable la suma de todos los precios a pagar
	
		registrable.fueRegistrado();
	}
	
	public void RegistrarListaDe(List <IRegistrable> registrables) {
		// recorrer con un for toda la lista de registrables y a cada uno le hago un registrar
		
	}*/

	public Double getMontoTotalAPagar(IRegistrable registrable) {
		registrable.fueRegistrado();
		return registrable.getPrecioAPagar();
	}
	public Double getMontoTotalAPagar(List <IRegistrable> registrables) {
		registrables.forEach(registrable -> registrable.fueRegistrado());		
		return registrables.stream().mapToDouble(registrable -> registrable.getPrecioAPagar()).sum();
	}
	
}
