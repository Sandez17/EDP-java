package Logica;

public class Bulbasaur extends Pokemon implements iPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Este es mi ataque placaje. Bulbasaur. ");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo!!. Bulbasaur!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordizco!!. Bulbasaur!!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Ataque Paralizar!!. Bulbasaur!!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Ataque Drenaje!!. Bulbasaur!!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Ataque Hoja Afilada!!. Bulbasaur!!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Ataque Latigo Cepa!!. Bulbasaur!!");
    }

}
