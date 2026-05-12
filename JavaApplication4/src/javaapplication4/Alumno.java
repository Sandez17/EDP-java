
package javaapplication4;


public class Alumno {
    int id;
    String nombre;
    String apellido; 
    
    public void mostrarAlumno(){
        System.out.println("Hola, soy un alumno y mi nombre es: ");
    }
    
    public void saberAprobado(double calificacion){
        if(calificacion >=6){
            System.out.println("Aprobe");
        }else{
            System.out.println("No aprobo");
        }
    }
    
}
