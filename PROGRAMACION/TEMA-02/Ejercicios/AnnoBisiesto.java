package Tema02;

import java.util.Scanner;

public class AnnoBisiesto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anno;
        System.out.println("Indique el año:");
        anno = teclado.nextInt();

        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            System.out.println("El anno " + anno + " es bisiesto.");
        } else {
            System.out.println("El anno " + anno + " no es bisiesto.");
        }

    }

}
