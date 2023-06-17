package Tema06.Ejercicios;

public class _04AlturasTest {

    public static void main(String[] args) {

        _04Alturas a = new _04Alturas();
        a.cargar();
        System.out.println("El valor promedio es " + a.calcularPromedio());
        System.out.println("Hay " + a.mayoresPromedio() + " más altos que el promedio");
        System.out.println("Hay " + a.menoresPromedio() + " más bajos que el promedio");

    }

}
