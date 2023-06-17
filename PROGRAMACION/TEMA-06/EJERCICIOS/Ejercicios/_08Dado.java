package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Escriba un programa simule varios lanzamientos de un dado y muestre la
 * frecuencia de cada una de las caras así como la proporción del número de
 * veces que haya salido cada cara con respecto al total. Para ello simule 6000
 * lanzamientos de un dado utilizando la función Math.random()*6 para simular
 * cada lanzamiento.
 *
 * NOTA: Almacenar los lanzamientos del dado en un array
 *
 * @author Anuska
 */
public class _08Dado {

    public static int tirarDado() {
        //System.out.println(Math.random() * 6);
        return (int) (Math.random() * 6);
    }

    public static void main(String[] args) {

        System.out.println("Indica el número de tiradas: ");
        Scanner sc = new Scanner(System.in);
        int veces = sc.nextInt();
        int[] dado = new int[6];
        
        for (int i = 0; i < veces; i++) {
            dado[tirarDado()]++;
        }
        for (int i = 0; i < dado.length; i++) {
            System.out.println("El número " + (i + 1) + " ha salido " + dado[i] + " veces ("
                    + dado[i] * 100 / veces + "%)");
        }
    }

}
