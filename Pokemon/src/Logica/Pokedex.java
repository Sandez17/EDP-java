package Logica;

public class Pokedex {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Chanmander charmander = new Chanmander();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();

        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();
        squirtle.atacarHidroBomba();
        squirtle.atacarMordisco();
        squirtle.atacarPistolaAgua();
        squirtle.atacarPlacaje();

        charmander.atacarAraniazo();
        charmander.atacarAscuas();
        charmander.atacarLanzaLlamas();
        charmander.atacarMordisco();
        charmander.atacarPlacaje();
        charmander.atacarPunioFuego();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarPlacaje();

        pikachu.actacarPunioTrueno();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        pikachu.atacarMordisco();
        pikachu.atacarPlacaje();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();
    }

}
