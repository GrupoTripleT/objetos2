package packageEmpresas;

import java.awt.List;



public class Empresa {
    private String nombre;
    private Integer cuit;
    private List empleados = new List();

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    //Constructor
    public Empresa(String nombre, Integer cuit, List empleados) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    }
    //Method
    // Monto total que debera desenbolar en concepto de pagos de sueldos a sus empleados =  total de sueldos netos
    //public Double totalSueldosNetos(Empleado empleados){
        //return (Double) this.empleados.stream().mapToDouble (empleado -> empleado.getSueldoNeto()).sum();
    //}

    //

    public Double getSueldosNetos(Empleado empleados) {
    	return 1d;
    }

    
    public Double getRetencionesTotales() {
    	return 1d;
    }
}
