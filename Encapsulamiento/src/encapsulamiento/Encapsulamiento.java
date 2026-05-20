
package encapsulamiento;


public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Male", "Diaz");
    
        System.out.println("id: "+alu2.getId());
        System.out.println("Nombre: "+alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    }
    
}
