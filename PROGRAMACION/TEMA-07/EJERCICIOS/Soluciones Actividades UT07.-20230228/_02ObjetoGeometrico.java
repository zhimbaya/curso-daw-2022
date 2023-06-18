package Tema07.Ejercicios;

abstract class _02ObjetoGeometrico {

    private String nombre;

    public _02ObjetoGeometrico(String nom) {
        nombre = nom;
    }

    abstract public double calcularArea();

    abstract public double calcularPerimetro();

    @Override
    public String toString() {
        return nombre;
    }
}
