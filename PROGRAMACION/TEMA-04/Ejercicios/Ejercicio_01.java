package Tema04;

import java.util.Scanner;

public class Ejercicio_01 {
// Realizar un programa en Java que lea un número entero por teclado y 
// nos diga si es par o impar haciendo uso de sentencias alternativas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        sc.close();
    }

}
