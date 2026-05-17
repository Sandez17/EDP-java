
package javaapplication6;

public class Consultor extends Persona{
    String nombre_Consultor;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_Consultor, int num_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_Consultor = nombre_Consultor;
        this.num_consultor = num_consultor;
    }

    public void setNombre_Consultor(String nombre_Consultor) {
        this.nombre_Consultor = nombre_Consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    public String getNombre_Consultor() {
        return nombre_Consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }
    
}
