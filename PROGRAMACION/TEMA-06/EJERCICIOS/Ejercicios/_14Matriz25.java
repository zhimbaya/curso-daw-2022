package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
 * por columna (es decir primero ingresar toda la primer columna, luego la
 * segunda columna y así sucesivamente) Imprimir luego la matriz.
 *
 * @author Anuska
 */
public class _14Matriz25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][5];
        System.out.println(m.length);
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                System.out.println("Escribe el valor de [" + i + "," + j + "]");
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
