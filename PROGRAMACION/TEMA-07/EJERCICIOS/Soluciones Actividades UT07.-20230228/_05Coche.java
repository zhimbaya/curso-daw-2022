package Tema07.Ejercicios;

public class _05Coche extends _05Vehiculo {

    private int numPasajeros;

    public _05Coche(int numRuedas, int autonomia, int numPasajeros) {
        super(numRuedas, autonomia);
        this.numPasajeros = numPasajeros;
    }

    @Override
    public void verDatos() {
        System.out.println("Los Datos del Coche son:");
        super.verDatos();
        System.out.println("El Numero Maximo de Pasajeros es: " + numPasajeros);
    }
}
