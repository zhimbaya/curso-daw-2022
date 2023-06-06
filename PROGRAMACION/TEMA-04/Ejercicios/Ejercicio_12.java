package Tema04;

import java.util.Iterator;

public class Ejercicio_12 {

    /**
     * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla
     * 8 - 16 - 24, etc. 
     */
    public static void main(String[] args) {

        final int MAX = 120;
        final int N = 3;

        System.out.println("Multiplos de 3.");
        // USANDO WHILE
        int n = N;
        while (n <= MAX) {
            if (n > N) {
                System.out.print(" - ");
            }

            System.out.print(n);
            n += N;
        }
        System.out.println();

        // USANDO FOR
        for (int i = N; i <= MAX; i += N) {
            if (i > N) {
                System.out.print(" - ");
            }
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Multiplos de 8 (cuantas veces contiene el nº 8)");
        for (int i = 1; i <= 500; i++) {
            if (i % 8 == 0) {
                System.out.print(i + " - ");
            }
        }
    }

}
