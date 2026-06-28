package javaapplication39;

import java.util.HashMap;
import java.util.Map;

public class JavaApplication39 {

    public static void main(String[] args) {
        //declarar un hashmap
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        // optima y eficiente para busqueda de datos
        mapaEmpleados.put(1523, "Billoton");
        mapaEmpleados.put(1524, "Lilo");
        mapaEmpleados.put(1525, "Tia Pipi");
        mapaEmpleados.put(1526, "Leo");
        mapaEmpleados.put(1527, "Tia ");

        boolean estaEmpleado = mapaEmpleados.containsValue("Lilo");

        if (estaEmpleado == true) {
            System.out.println("Esta el valor buscado");
        } else {
            System.out.println("No existe ");
        }

        estaEmpleado = mapaEmpleados.containsKey(1522);
        if (estaEmpleado == true) {
            System.out.println("Esta el valor buscado");
        } else {
            System.out.println("No existe ");
        }

        System.out.println("" + mapaEmpleados.values());
        System.out.println("" + mapaEmpleados.keySet());

        String nombre = mapaEmpleados.get(1524);
        System.out.println("El empleado buscado es: " + nombre);

        mapaEmpleados.remove(1527);
        System.out.println("" + mapaEmpleados.values());
        System.out.println("" + mapaEmpleados.keySet());
    }

}
