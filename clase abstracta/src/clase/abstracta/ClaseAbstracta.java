package clase.abstracta;

public class ClaseAbstracta {

    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();

        cua.setRadio(12.1);
        cir.setLado(11.1);

        double resCua = cua.calcularArea();
        double resCir = cir.calcularArea();

        System.out.println("EL calculo del area de un circulo es: " + resCir);
        System.out.println("El calculo del area de un cuadrado es: " + resCua);
    }

}
