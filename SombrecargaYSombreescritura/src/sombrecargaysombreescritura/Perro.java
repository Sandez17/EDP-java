
package sombrecargaysombreescritura;

public class Perro extends Mamifero{
    
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    public Perro() {
    }

    public Perro(String nombrePerro, double peso, double raza, double sexo) {
        this.nombrePerro = nombrePerro;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public double getPeso() {
        return peso;
    }

    public double getRaza() {
        return raza;
    }

    public double getSexo() {
        return sexo;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public void setSexo(double sexo) {
        this.sexo = sexo;
    }
    
    
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace GUAO GUAO");    
    }
    
}
