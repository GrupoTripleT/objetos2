package packageEncriptacion;

public class EncriptacionNaive {
	
	private TipoDeEncriptador encriptador;

	public TipoDeEncriptador getEncriptador() {
		return encriptador;
	}

	public void setEncriptador(TipoDeEncriptador encriptador) {
		this.encriptador = encriptador;
	}

	
	public EncriptacionNaive() {
		super();
	}

	public EncriptacionNaive(TipoDeEncriptador encriptador) {
		super();
		this.encriptador = encriptador;
	}
	
	
	public String  encriptar(String  texto ) {
		return this.getEncriptador().encriptar(texto);
	}
	
	public String  desencriptar(String texto) {
		return this.getEncriptador().desencriptar(texto);
	}
}
