package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje!!. Pika Pika!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo!!. Pika Pika!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordisco!!. Pika Pika!!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Ataque Impac trueno!!. Pika Pika!!");
    }

    @Override
    public void actacarPunioTrueno() {
        System.out.println("Ataque Punio Trueno!!. Pika Pika!!");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Ataque Rayo!!. Pika Pika!!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Ataque Rayo Carga!!. Pika Pika!!");
    }

}
