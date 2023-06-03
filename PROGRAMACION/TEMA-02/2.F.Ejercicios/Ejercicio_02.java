package Tema02;

import java.util.Scanner;

/**
 * Realiza un programa en Java que pida al usuario de tipo entero. A
 * continuación muestra un mensaje indicando si el valor de dicha variable es
 * positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo
 * de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 *
 * @author Anuska
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int numero = sc.nextInt();

        System.out.println((numero >= 0) ? "Positivo" : "Negativo");
        System.out.println((numero % 2 == 0) ? "Es par" : "Es impar");
        System.out.println((numero % 5 == 0) ? "Es múltiplo de 5" : "No es múltiplo de 5");
        System.out.println((numero % 10 == 0) ? "Es múltiplo de 10" : "No es múltiplo de 10");
        System.out.println((numero >= 100) ? "Es mayor o igual a 100" : "Es menor que 100");
    }

}
