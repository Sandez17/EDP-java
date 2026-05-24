package clase.abstracta;

public class ClaseAbstracta {

    public static void main(String[] args) {
        Cuadrado cir = new Cuadrado();
        Circulo1 cua = new Circulo1();

        cua.setRadio(12.1);
        cir.setLado(11.1);

        double resCua = cua.calcularArea();
        double resCir = cir.calcularArea();

        System.out.println("EL calculo del area de un circulo es: " + resCir);
        System.out.println("El calculo del area de un cuadrado es: " + resCua);
        cir.dibujar();
        cua.rotar();
        cua.dibujar();
    }

}
