package Tema03;

public class Circulo {

    // Atributos
    private double radio;

    // Constructores
    public Circulo() {
        radio = 1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

}
