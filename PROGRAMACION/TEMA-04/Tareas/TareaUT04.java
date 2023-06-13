package Tema04;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class TareaUT04 {

    /*
    Por definición, el mínimo común múltiplo (mcm) de un grupo de números, 
    es el número  más pequeño que es múltiplo de cualquiera de ellos.
    a) Crea una aplicación Java que determine el mcm de 2 números.
    b) Crea una segunda aplicación que determine el mcm de 3 números.
    Entregar los dos ficheros .java SIN COMPRIMIR 
     */
    public static void main(String[] args) {
        System.out.println("Cálculo del MCM de dos números: ");
        System.out.println("Introducier el 1º número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Introducier el 2º número: ");
        int n2 = sc.nextInt();
        System.out.println("El resultado del MCD es: " + maximoComunDivisor(n1, n2));
        System.out.println("El resultado del MCM es: " + mcm(n1, n2));

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
