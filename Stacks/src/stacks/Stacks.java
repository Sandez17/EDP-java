package stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Pila vacia: " + pila);
        System.out.println("Esta vacia la pila?: " + pila.isEmpty());

        // agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // recorrido de una pila
        System.out.println("Foreach");
        for (Integer pilita : pila) {
            System.out.println("pila" + pilita);
        }

        // mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? :" + pila.isEmpty());

        // eliminar el ultimo registro que entro
        pila.pop();
        System.out.println("Esta el 3? " + pila.search(3));
        // muestra el ultimo elemento agregado de la pila.
        System.out.println("Ultimo agregado: " + pila.peek());
    }

}
