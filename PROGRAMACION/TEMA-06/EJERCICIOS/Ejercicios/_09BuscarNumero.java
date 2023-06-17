package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Escriba un procedimiento que reciba un array de enteros y busque si un número
 * obtenido por la entrada estándar se encuentra en el array e imprima la
 * primera posición en la que se encuentra el número. Si no se encuentra
 * mostrará un mensaje indicándolo.
 *
 * @author Anuska
 */
public class _09BuscarNumero {

    public static void buscar(int[] lista) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número a buscar");
        int n = sc.nextInt();
        boolean encontrado = false;
        
        for (int i = 0; i < lista.length && !encontrado; i++) {
            if (lista[i] == n) {
                System.out.println("El número " + n + " se encuentra en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El número " + n + " no está en la lista");
        }

    }

    public static void main(String[] args) {

        int[] l = {3, 6, 5, 3, 5, 6, 5, 7, 3, 3, 5, 6, 6};
        buscar(l);
    }

}
