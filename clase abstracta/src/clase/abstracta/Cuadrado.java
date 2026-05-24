
package clase.abstracta;

public class Cuadrado implements Figura{
    private double radio;

    public Cuadrado() {
    }

    public Cuadrado(double radio) {
        this.radio = radio;
    }

  
      public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
      double pi = 3.14;
      double resultado = pi*radio*radio;
      return resultado;
    }
    
}
