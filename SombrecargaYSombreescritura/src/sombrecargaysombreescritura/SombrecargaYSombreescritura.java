
package sombrecargaysombreescritura;


public class SombrecargaYSombreescritura {

    
    public static void main(String[] args) {
        Animal ani = new Animal();
        Perro perr = new Perro();
        Gato gat = new Gato();
        
        gat.setNombreGato("Penitente");
        gat.hacerSonido();
        
        perr.setNombrePerro("Set");
        perr.hacerSonido();
        
        
        ani.hacerSonido();
        ani.hacerSonido("Camello");
        ani.hacerSonido("Loro", "pio pio");
        
        
    }
    
}
