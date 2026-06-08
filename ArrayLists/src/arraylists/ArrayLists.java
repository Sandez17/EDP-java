package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        // List<Persona> lista;// declarando sin inicializar
        List<Persona> lista = new ArrayList<Persona>();
        Persona perso = new Persona(2, "Marcelo", 39);
        //cargar elementos
        lista.add(new Persona(1, "Marta", 30));
        lista.add(perso);
        lista.add(new Persona(3, "Mili", 30));
        lista.add(new Persona(4, "Tia pipi", 47));
        lista.add(new Persona(5, "Pelado", 56));

        System.out.println("------For CLASSIC ------------");
        // recorrer persona de lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba : " + lista.get(i).getNombre());
        }
        System.out.println("------FOREACH--------");
        // recorrido foreach
        for (Persona perso1 : lista) {
            System.out.println("prueba 2: " + perso.getNombre());
        }
    }

}
