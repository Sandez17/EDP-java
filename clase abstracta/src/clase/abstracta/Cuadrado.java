
package clase.abstracta;

public class Cuadrado extends Figura{
    private double radio;

    public Cuadrado() {
    }

    public Cuadrado(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
      double pi = 3.14;
      double resultado = pi*radio*radio;
      return resultado;
    }
    
}
