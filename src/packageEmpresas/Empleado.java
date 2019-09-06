package packageEmpresas;

import java.util.Date;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
    protected Boolean estaCasado;
    protected Date fechaNacimiento;
    protected  Double sueldoBasico;

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(Boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    //Constructor
    public Empleado(String nombre, String direccion, Boolean estaCasado, Date fechaNacimiento, Double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estaCasado = estaCasado;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    // Protocolos  y Procedimientos
    public Date getEdad() {
        return fechaNacimiento; //todo:calcular edad
    }
    public abstract Double getSueldoBruto();
    public abstract Double getRetenciones();
    public abstract Double getSueldoNeto();

}
