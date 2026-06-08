package Logica;

public class Chanmander extends Pokemon implements iFuego {

    public Chanmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje!!. Chanmander!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo!!. Chanmander!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordisco!!. Chanmander!!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Ataque Punio Fuego!!. Chanmander!!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Ataque Ascuas!!. Chanmander!!");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Ataque Lanza Llamas!!. Chanmander!!");
    }

}
