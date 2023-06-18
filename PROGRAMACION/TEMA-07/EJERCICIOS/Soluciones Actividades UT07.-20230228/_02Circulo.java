package Tema07.Ejercicios;

public class _02Circulo extends _02ObjetoGeometrico {

    private double radio;

    public _02Circulo(double r, String nom) {
        super(nom);
        radio = r;
    }

    public _02Circulo() {
        this(1.0, "Círculo estándar");
    }

    public double devolverRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Nombre = " + super.toString() + "  radio = " + radio;
    }
}
