package Tema07.Ejercicios;

abstract public class _05Vehiculo {

    private int numRuedas;
    private int autonomia;

    //Constructor
    public _05Vehiculo(int numRuedas, int autonomia) {
        this.numRuedas = numRuedas;
        this.autonomia = autonomia;
    }

    public _05Vehiculo() {
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void verDatos() {
        System.out.println("Ruedas: " + numRuedas);
        System.out.println("Autonomia: " + autonomia);
    }

}
