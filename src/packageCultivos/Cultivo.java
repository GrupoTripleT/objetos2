package packageCultivos;

public class Cultivo {
	
	private String tipo;
	private Double precioAnual;
	public Cultivo(String tipo, Double precioAnual) {
		super();
		this.tipo = tipo;
		this.precioAnual = precioAnual;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPrecioAnual() {
		return precioAnual;
	}
	public void setPrecioAnual(Double precioAnual) {
		this.precioAnual = precioAnual;
	}
	

}
