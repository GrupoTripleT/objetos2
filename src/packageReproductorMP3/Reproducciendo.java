package packageReproductorMP3;

public class Reproducciendo extends Estado {
	
	public  void aplicarPause(Reproductor reproductor) {
		reproductor.cancionSeleccionada().pause();
	}
	public  void aplicarStop(Reproductor reproductor) {
		reproductor.cancionSeleccionada().stop();
		reproductor.setEstado(new SeleccionDeCanciones());
	} 

}
