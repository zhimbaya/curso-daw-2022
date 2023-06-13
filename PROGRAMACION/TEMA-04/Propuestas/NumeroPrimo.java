package Tema04;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declarar variables
        int num;
        boolean primo = true;

        System.out.println("introduce numero:");
        num = teclado.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) //si se ha mantenido indivisible por los números intermedios (desde el 2 hasta el número inmediata/ inferior, es que es primo
        {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número NO es primo.");
        }

    }

}
