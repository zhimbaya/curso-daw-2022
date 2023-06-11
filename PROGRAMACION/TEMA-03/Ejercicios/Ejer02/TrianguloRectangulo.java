package Tema03;

public class TrianguloRectangulo {

    // Atributos
    private double base;
    private double altura;

    // Constructores
    public TrianguloRectangulo() {
        base = 1;
        altura = 1;
    }

    public TrianguloRectangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double b) {
        base = b;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public void setLados(double b, double a) {
        base = b;
        altura = a;
    }

    public double perimetro() {
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double area() {
        return base * altura / 2;
    }
}
