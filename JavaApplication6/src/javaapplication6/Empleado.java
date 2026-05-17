
package javaapplication6;


public class Empleado extends Persona{
    int legajoEm;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int legajoEm, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.legajoEm = legajoEm;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void setLegajoEm(int legajoEm) {
        this.legajoEm = legajoEm;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public int getLegajoEm() {
        return legajoEm;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }
    
    
}
