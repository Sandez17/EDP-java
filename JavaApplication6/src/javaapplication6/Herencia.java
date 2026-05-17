package javaapplication6;

import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Consultor consul = new Consultor();

        // ingreso
        System.out.println(" ");
        System.out.println("Ingrese los datos del empleado: ");
        System.out.println("El legajo del empleado es: ");
        empleado.setLegajoEm(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese el cargo: ");
        empleado.setCargo(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Ingrese el sueldo: ");
        empleado.setSueldo(teclado.nextDouble());
        System.out.println("Ingrese el id del empleado: ");
        empleado.setId(teclado.nextInt());
        System.out.println("Ingrese nombre: ");
        empleado.setApellido(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Apellido: ");
        empleado.setNombre(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Domicion: ");
        empleado.setDomicilio(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Telefono: ");
        empleado.setTelefono(teclado.nextLine());
        teclado.nextLine();

        // Consultor
        System.out.println("");
        System.out.println("El consultor");
        System.out.println("Nombre: ");
        consul.setNombre_Consultor(teclado.nextLine());
        teclado.nextLine();
        System.out.println("El numero del consultor: ");
        consul.setNum_consultor(teclado.nextInt());

        // impresion
        System.out.println("----------------------");
        System.out.println("El empleado: ");
        System.out.println("El legado es: " + empleado.getLegajoEm());

        System.out.println("El nombre es : " + empleado.getNombre());

        System.out.println("El apellido es: " + empleado.getApellido());

        System.out.println(" "
                + "");
        System.out.println("-------------------------");
        System.out.println("Consultor");
        System.out.println("El nombre del consultor es: " + consul.getNombre_Consultor());
        System.out.println("El numero es : " + consul.getNum_consultor());

    }

}
