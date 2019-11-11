package packageReproductorMP3;

public class Reproductor {
	
	public Estado estado;
	public Cancion cancionSeleccionada;
	
	
	public Reproductor() {
		this.estado = new SeleccionDeCanciones();
		this.cancionSeleccionada = null;
	}
	
	public Estado estado() {
		return this.estado;
	}
	
	public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void setCancionSeleccionada(Cancion nuevaCancion) {
		this.cancionSeleccionada = nuevaCancion;
	}
	public Cancion cancionSeleccionada() {
		return this.cancionSeleccionada;
	}
	public void seleccionarCancion(Cancion cancion) {
		this.estado().aplicarSeleccion(this, cancion);
	}
	
	public void play() {
		this.estado().aplicarPlay(this);
	}

	public void stop() {
		this.estado().aplicarStop(this);
	}
	
	public void pause() {
		this.estado().aplicarPause(this);
	}
}
