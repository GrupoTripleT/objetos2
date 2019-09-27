package packageEmpresas;

import java.util.ArrayList;



public class Empresa {

	// Variables
    private String nombre;
    private Integer cuit;
    private ArrayList <Empleado> empleados = new ArrayList <Empleado>();

   
    //Constructor
    public Empresa(String nombre, Integer cuit, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    }
   
    // Getters & Setters
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}



	//Method
	
	// Monto total que debera desenbolar en concepto de pagos de sueldos a sus empleados =  total de sueldos netos
    public Double getSueldosNeto(Empleado empleados){
        return (double) this.empleados.stream().mapToDouble (empleado -> empleado.getSueldoNeto()).sum();
    }

    // to Doo - otra version. Sin lambda
    
    public Double getSueldosBruto(Empleado empleados) {
    	return (double) this.getEmpleados().stream().mapToDouble(empleado -> empleado.getSueldoBruto()).sum();
    }
    
    public Double getRetencionesTotales() {
    	return (double) this.empleados.stream().mapToDouble ( empleado -> empleado.getRetenciones()).sum();
    }
    
    //Liquidacion de Sueldo
    
    
}
