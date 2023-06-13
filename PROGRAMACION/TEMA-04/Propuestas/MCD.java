package Tema04;

import java.io.*;
import java.util.Scanner;

public class MCD {

    public static void main(String args[]) throws IOException {

        //Declarar variables
        int num1;
        int num2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce numero 1:");
        num1 = teclado.nextInt();
        System.out.println("introduce numero 2:");
        num2 = teclado.nextInt();;

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }//fin mientras
        System.out.println("El MCD es: " + num1);
    }//fin main
}//fin class
