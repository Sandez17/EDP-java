

package sombrecargaysombreescritura;

public class Gato extends Mamifero {
    
    private String nombreGato;
    private int edadGato;
    private String raza;
    private String descripcionGato;

    public Gato() {
    }

    public Gato(String nombreGato, int edadGato, String raza, String descripcionGato) {
        this.nombreGato = nombreGato;
        this.edadGato = edadGato;
        this.raza = raza;
        this.descripcionGato = descripcionGato;
    }

    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public void setEdadGato(int edadGato) {
        this.edadGato = edadGato;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setDescripcionGato(String descripcionGato) {
        this.descripcionGato = descripcionGato;
    }

    public String getNombreGato() {
        return nombreGato;
    }

    public int getEdadGato() {
        return edadGato;
    }

    public String getRaza() {
        return raza;
    }

    public String getDescripcionGato() {
        return descripcionGato;
    }
    
    
    
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace MIOU MIOU");
    }
    
}
