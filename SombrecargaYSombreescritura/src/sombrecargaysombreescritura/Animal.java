
package sombrecargaysombreescritura;

public class Animal {
    private int id_animal;
    private String descripcion;

    public Animal() {
    }

    public Animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }

    public int getId_animal() {
        return id_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void hacerSonido(){
        System.out.println("El animal hace un sonido.");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal "+nombreAnimal +" hace un sonido.");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal "+nombreAnimal + " hace un sonido de tipo "+ tipoSonido);
    }
}
