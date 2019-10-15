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

	public ObjetoSSCompuesto(IShapeShifter objeto) {
		super();
		this.objetos = new ArrayList<IShapeShifter>();
		this.objetos.add(objeto);
		
	}
	

	@Override
	public IShapeShifter compose(IShapeShifter iShapeShifter) {
		
		return null;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
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
