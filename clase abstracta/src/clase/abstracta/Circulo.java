package clase.abstracta;

public class Circulo extends Figura {

    private double lado;

    public Circulo() {
    }

    public Circulo(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

}
