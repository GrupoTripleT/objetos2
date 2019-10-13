package packageVideoJuego;

public class SinFicha extends EstadoDeMaquina {

	@Override
	public String ejecutarElEncendido(MaquinaJuego unaMaquina) {
		return "Sin Ficha, por favor ingrese una ficha";
		
	}

}
