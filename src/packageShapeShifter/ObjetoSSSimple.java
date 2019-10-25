package packageShapeShifter;

import java.util.List;

public class ObjetoSSSimple implements IShapeShifter {

	@Override
	public IShapeShifter compose(IShapeShifter iShapeShifter) {
		// TODO Auto-generated method stub
		
	 		return new ObjetoSSCompuesto(this, iShapeShifter) ;
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
