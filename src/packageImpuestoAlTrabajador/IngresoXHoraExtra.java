package packageImpuestoAlTrabajador;

import java.sql.Date;

public class IngresoXHoraExtra extends Ingreso {

	private Integer cantDeHorasExtras;

	public Integer getCantDeHorasExtras() {
		return cantDeHorasExtras;
	}

	public void setCantDeHorasExtras(Integer cantDeHorasExtras) {
		this.cantDeHorasExtras = cantDeHorasExtras;
	}

	public IngresoXHoraExtra(String mesDePersepcion, String concepto, Double montoPercibido, Integer cantDeHorasExtras) {
		super(mesDePersepcion, concepto, montoPercibido);
		this.cantDeHorasExtras = cantDeHorasExtras;
	}

	
	public Double getMontoImponible() {
		return  0d;
	}

}
