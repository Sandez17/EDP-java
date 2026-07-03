package expeption;

public class Expeption {

    public static void main(String[] args) {
        // exceptiones y errores en java.
        try {
            int resultado = 9 / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0. ");
        }
        try {
            int edades[] = {15, 12, 23, 30};
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("No existe, intestas a acceder a un indice que no existe. ");
        }
    }

}
