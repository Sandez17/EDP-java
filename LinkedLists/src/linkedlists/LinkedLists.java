package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        List<Perro> listaPerro = new ArrayList<Perro>();
        List<Persona> lista = new LinkedList<Persona>();
        Persona persona = new Persona();

        //cargar elementos al final
        lista.add(new Persona(1, "Marta", 30));
        lista.add(persona);
        lista.add(new Persona(3, "Mili", 30));
        lista.add(new Persona(4, "Tia pipi", 47));
        lista.add(new Persona(5, "Pelado", 56));

        // cargar elementos al principio
        lista.add(0, new Persona(6, "Bishus", 50));

        System.out.println("------FOREACH--------");
        // recorrido foreach
        for (Persona perso1 : lista) {
            System.out.println("prueba 2: " + perso1.getNombre());
        }

        listaPerro.add(new Perro(1, "Marco", "Cholo", 3));
        listaPerro.add(new Perro(3, "Mili", "Caniche", 6));
        listaPerro.add(new Perro(4, "Tia", "Salchicha", 5));
        listaPerro.add(new Perro(5, "Paco", "Coquer", 1));
        System.out.println("------For CLASSIC ------------");
        for (int i = 0; i < listaPerro.size(); i++) {
            System.out.println("prueba : " + lista.get(i).getNombre());
        }
    }

}
