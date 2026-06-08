package arraylistslinkendlistsdiferencias;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListsLinkendListsDiferencias {

    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Luis", 30));
        listaArray.add(new Persona(1, "Marco", 24));
        listaArray.add(new Persona(1, "Martin", 12));
        listaArray.add(new Persona(1, "Idra", 35));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Luisa", 44));
        listaLinked.add(new Persona(1, "Marco", 24));
        listaLinked.add(new Persona(1, "Miriam", 40));
        listaLinked.add(new Persona(1, "Marisa", 59));

        // Remove en ArrayList
        listaArray.remove(1);

        //Remove en LinkedList
        String nombreBorrar = "Marisa";
        for (Persona persona2 : listaLinked) {
            if (persona2.getName().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break;
                //corto que deja de recorrer;
            }
        }

        // Muestra o impresion de los arrayList y el LinkendLists
        System.out.println("-----------Luego de Eliminar------------");
        //recorro por foreach
        System.out.println("----------ARRAYLIST----------");
        for (Persona persona : listaArray) {
            System.out.println("persona: " + persona.getName().toString());
        }

        System.out.println("----------LINKENDLIST----------");
        for (Persona persona : listaLinked) {
            System.out.println("persona: " + persona.getName().toString());
        }

        // Tamaño de lista
        System.out.println("------QUE TAMAÑO TIENE LA LISTA?--------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        // Obtener primer objeto
        System.out.println("-----Primer y último objeto (Solo para Linked List)------");
        System.out.println("Primer elemento de Linked List: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo elemento de Linked List: " + listaLinked.getLast().toString());

        //Borrar toda la lista
        System.out.println("--------BORRAR LISTA---------");
        listaArray.clear();
        listaLinked.clear();

        // Comprobar si está vacía
        System.out.println("----- ESTA VACIA ALGUNA LISTA? ------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());

    }

}
