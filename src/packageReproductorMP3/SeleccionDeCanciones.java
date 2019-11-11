package packageReproductorMP3;

public class SeleccionDeCanciones extends Estado {

	public  void aplicarSeleccion(Reproductor reproductor, Cancion cancion) {
		reproductor.setCancionSeleccionada(cancion);
	}
	public  void aplicarPlay(Reproductor reproductor) {
		if(reproductor.cancionSeleccionada() != null) {
			reproductor.cancionSeleccionada().play();
			reproductor.setEstado(new Reproducciendo());
		}else {
			System.out.print("No selecciono cancion");
		}
	}
}
