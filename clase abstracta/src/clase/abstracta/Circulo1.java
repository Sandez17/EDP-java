
package clase.abstracta;

public class Circulo1 implements Figura, Rotable, Dibujo{
    private double radio;

    public Circulo1() {
    }

    public Circulo1(double radio) {
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

    @Override
    public void rotar() {
        System.out.println("Estoy rotando el ciruculo");  
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }
    
}
