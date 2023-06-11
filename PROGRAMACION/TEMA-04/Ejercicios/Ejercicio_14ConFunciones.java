package Tema04;

import java.util.Scanner;

public class Ejercicio_14ConFunciones {

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num && primo; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;

    }

    public static void main(String[] args) {

        System.out.println("Escribe un número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != -1) {
            if (esPrimo(n)) {
                System.out.println("El número es primo.");
            } else {
                System.out.println("El número no es primo.");
            }
            n = sc.nextInt();
        }
        System.out.println("Has introducido un -1.");
        
        sc.close();
    }

}
