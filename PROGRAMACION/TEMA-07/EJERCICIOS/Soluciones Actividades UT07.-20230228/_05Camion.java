package Tema07.Ejercicios;

public class _05Camion extends _05Vehiculo {

    private int limiteCarga;

    public _05Camion(int numRuedas, int autonomia, int limiteCarga) {
        super(numRuedas, autonomia);
        this.limiteCarga = limiteCarga;
    }

    @Override
    public void verDatos() {
        System.out.println("\nLos Datos del Camion son:");
        super.verDatos();
        System.out.println("El Limite Maximo de la Carga es: " + limiteCarga);
    }
}
