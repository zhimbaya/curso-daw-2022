package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Implementar un programa para administrar los días que han faltado los
 * empleados de una empresa un determinado mes.
 *
 * En primer lugar se le pedirá al usuario el número de empleados (n). Definir
 * un vector de n elementos de tipo String para cargar los nombres y una matriz
 * irregular para cargar los días que han faltado cada empleado. El número de
 * filas de la matriz será n y el número de columnas de cada fila se corresponde
 * con el número de días que falto el empleado. En la matriz se almacenarán los
 * días del mes que ha faltado cada empleado
 *
 * El usuario deberá introducir por teclado los nombres de los empleados así
 * como el número de días que ha faltado cada uno de ellos y los días que ha
 * faltado.
 *
 * Mostrar la matriz con los días que ha faltado cada empleado. Mostrar los
 * empleados con la cantidad de inasistencias e indicar qué empleado faltó menos
 * días.
 *
 * @author Anuska
 */
public class _20DiasFaltados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos empleados hay?");
        int n = sc.nextInt();
        sc.nextLine();

        int[][] faltas = new int[n][];
        String[] nombres = new String[n];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre del empleado " + i);
            nombres[i] = sc.nextLine();
            System.out.println("¿Cuántas veces a faltado " + nombres[i] + "?");
            faltas[i] = new int[sc.nextInt()];
            System.out.println("¿Qué días ha faltado " + nombres[i] + "?");
            for (int j = 0; j < faltas[i].length; j++) {
                faltas[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < faltas[i].length; j++) {
                System.out.print(faltas[i][j] + " ");
            }
            System.out.println();
        }
        int indice = 0;
        int menor = faltas[0].length;
        for (int i = 0; i < faltas.length; i++) {
            System.out.println(nombres[i] + " ha faltado " + faltas[i].length + " veces");
            if (faltas[i].length < menor) {
                menor = faltas[i].length;
                indice = i;
            }
        }
        System.out.println("El empleado que menos ha faltado es " + nombres[indice]);

    }

}
