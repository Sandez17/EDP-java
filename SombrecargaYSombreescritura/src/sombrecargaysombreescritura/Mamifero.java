
package sombrecargaysombreescritura;

public abstract class Mamifero {
    private int id_animal;
    private String descripcion; 

    public Mamifero() {
    }

    public Mamifero(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }
    
    public abstract void hacerSonido();
}
