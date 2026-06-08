package Logica;

public class Squirtle extends Pokemon implements iAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje!!. Squirtle!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo!!. Squirtle!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordisco!!. Squirtle!!");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Ataque Hridobomba!!. Squirtle!!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Ataque Pistola Agua!!. Squirtle!!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Ataque Burbuja!!. Squirtle!!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Ataque Hidropulso!!. Squirtle!!");
    }

}
