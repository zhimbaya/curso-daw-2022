package Tema06.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Anuska
 */
public class _06VectIntTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        _06VectInt v1;
        _06VectInt v2;

        System.out.print("Número de elementos de los vectores: ");
        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();
        System.out.print("Valor mínimo del vector aleatorio: ");
        int min = sc.nextInt();
        System.out.print("Valor máximo del vector aleatorio: ");
        int max = sc.nextInt();

        v1 = new _06VectInt(elem);
        v2 = new _06VectInt(elem);
        v1.cargar();
        v2.cargar(min, max);

        System.out.println("Vector 1: \n" + v1);
        System.out.println("Suma: " + v1.suma());
        System.out.println("Promedio: " + v1.promedio());
        System.out.println("Moda: " + v1.moda());

        System.out.println("Vector 2: \n" + v2);
        System.out.println("Suma: " + v2.suma());
        System.out.println("Promedio: " + v2.promedio());
        System.out.println("Moda: " + v2.moda());

    }

}
