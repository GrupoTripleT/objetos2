package packageBancosYPrestamos;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Banco {

	private Set<Cliente> clientes;
	private List<SolicitudPrestamo> solicitudes;

	public List<SolicitudPrestamo> getSolicitudes(){
		return solicitudes;
	}
	
	public void registrarSolicutud(SolicitudPrestamo solicitud) {
		this.getSolicitudes().add(solicitud);
	}
	
	public List<SolicitudPrestamo> getSolicitudesAprobadas(){
		return  this.getSolicitudes().stream().filter(solicitud -> solicitud.esAceptada()).collect(Collectors.toList());
	}
	
	public SolicitudPrestamo getSolicutudAprobadaDe(Cliente cliente) {
		return this.getSolicitudesAprobadas().stream().filter(solicitud -> solicitud.getCliente() == cliente).findFirst().get();
				//null; // TODO: retorna la solicitud aprobada del cliente pasado como parametro
	}
	
	public Double getPrestamoDe(Cliente cliente) {
		return this.getSolicutudAprobadaDe(cliente).getMontoSolicitado();
	}
	
	//SETTERS AND GETTERS
	public Set<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void addCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	
	//COSNTRUCTOR
	public Banco(Set<Cliente> clientes, List<SolicitudPrestamo> solicitudes) {
		super();
		this.clientes = clientes;
		this.solicitudes = solicitudes;
	}
	
	public Double getMontoTotalDeTodasLasSolicitudes() {
		return this.getSolicitudesAprobadas().stream().mapToDouble(solicitud -> solicitud.getMontoSolicitado()).sum();
	}

	
}

