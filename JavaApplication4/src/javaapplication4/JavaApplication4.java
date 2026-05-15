package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Mio", "Datos");
        
  
        // v1 recomendable
        System.out.println("----------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        // v2
        
        // ingresar datos
       alu1.setId(1);
       alu1.setNombre("Paty");
       alu1.setApellido("Pax");
       
        System.out.println("----------------");
        System.out.println("La id del alumno 2 es: " + alu1.getId());
        System.out.println("El apellido del alumno 2 es: " + alu1.getApellido());
        System.out.println("El nombre del alumno 2 es: " + alu1.getNombre());
        
        //--------Modificar datos
        // setear cambio y valor
        // sobre escribe el valor de un get. Esto es de la propiedad del encapsulamiento.
        alu2.setId(34);
        System.out.println("----------------");
         System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        // v2
        
    }

}
