package packageCultivos;

import java.util.ArrayList;
import java.util.List;

public class PorcionDividida extends Porcion {
	
	private List<Porcion> porciones;
	
	public List<Porcion> getPorciones() {
		return porciones;
	}

	public void setPorciones(List<Porcion> porciones) {
		this.porciones = porciones;
	}
	
	
	public PorcionDividida() {
		super();
		this.porciones = new ArrayList<Porcion>();
		}

	
	public void agregarPorcion(Porcion nuevaPorcion) {
		this.getPorciones().add(nuevaPorcion);
	}
	
	
	@Override
	public Double gananciaAnual() {
		// TODO Auto-generated method stub
		return (double) this.getPorciones().stream().mapToDouble(porcion -> porcion.gananciaAnual() / 4).sum();
	}

}
