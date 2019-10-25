package packageShapeShifter;


import java.util.ArrayList;
import java.util.List;

public class ObjetoSSCompuesto implements IShapeShifter {
	
	private List<IShapeShifter> objetos;
	
	

	public List<IShapeShifter> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<IShapeShifter> objetos) {
		this.objetos = objetos;
	}
	
	public void agregarObjeto(IShapeShifter i) {
		this.getObjetos().add(i);
	}

	public ObjetoSSCompuesto(IShapeShifter objeto1, IShapeShifter objeto2) {
		super();
		this.objetos = new ArrayList<IShapeShifter>();
		this.objetos.add(objeto1);
		this.objetos.add(objeto2);
		
	}
	
	

	@Override
	public IShapeShifter compose(IShapeShifter iShapeShifter) {
	
		return new ObjetoSSCompuesto(this, iShapeShifter) ;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
			int acumuladorDeProfundidad = 1;
			
			
//			for (IShapeShifter objeto : this.getObjetos()) {
//				//max += objeto.deepest();
//				max = objeto.deepest() > max ? objeto.deepest() : max; 
//			}
			
		return  acumuladorDeProfundidad +=
				Integer.max(this.getObjetos().get(0).deepest(), this.getObjetos().get(1).deepest());
	}

	 
	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
