package Tema04;

import java.util.Scanner;

public class Ejercicio_05 {

    /**
     * Realizar un programa que lea por teclado tres números enteros y calcula y
     * muestra el mayor de los tres.
     */
    public static void main(String[] args) {

        System.out.println("Escribe tres números enteros");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a);
        } else {
            if (b >= a && b >= c) {
                System.out.println("El mayor es " + b);
            } else {
                if (c >= a && c >= b) {
                    System.out.println("El mayor es " + c);
                }
            }
        }
        
        sc.close();
    }

}
