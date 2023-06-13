package Tema04;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class TareaUT04_2 {

    /*
    Por definición, el mínimo común múltiplo (mcm) de un grupo de números, 
    es el número  más pequeño que es múltiplo de cualquiera de ellos.
    a) Crea una aplicación Java que determine el mcm de 2 números.
    b) Crea una segunda aplicación que determine el mcm de 3 números.
    Entregar los dos ficheros .java SIN COMPRIMIR 
     */
    public static void main(String[] args) {
        System.out.println("****Cálculo del MCM de varios números**** ");
        int[] numbers = {5, 10, 15, 20};
        int result = mcm(numbers);
        System.out.println("El MCM es :" + result);

    }

    public static int mcm(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = mcm(result, numbers[i]);
        }
        return result;
    }

    public static int mcm(int a, int b) {
        return (a * b) / maximoComunDivisor(a, b);
    }

    public static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

}
