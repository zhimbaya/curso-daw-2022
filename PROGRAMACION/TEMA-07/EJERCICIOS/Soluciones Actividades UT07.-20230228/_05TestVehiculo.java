package Tema07.Ejercicios;

public class _05TestVehiculo {

    public static void main(String args[]) {
        _05Coche c1 = new _05Coche(5, 100, 5);
        _05Camion ca1 = new _05Camion(14, 150, 1200);

        c1.verDatos();
        ca1.verDatos();
    }
}
