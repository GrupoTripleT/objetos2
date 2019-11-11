package packageTransportadoraDeMercancias;

import java.util.List;

public class Contenedor  implements ITransportable{

	public List<ITransportable> transportables;
	public  Integer pesoPropio;
	
	public Double costo() {
		return null;
	}
	
	public Integer peso() {
		return null;
	}
	
	public Boolean contieneAlimento() {
		return null;
	}
}
