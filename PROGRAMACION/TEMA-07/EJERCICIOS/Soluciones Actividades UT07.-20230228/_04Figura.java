package Tema07.Ejercicios;

public abstract class _04Figura {

    private double base;
    private double altura;

    //Constructor
    public _04Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public _04Figura() {
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public abstract double area();

}
