/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursodaw1d;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class TareaUT04_0 {

    /*
    Por definición, el mínimo común múltiplo (mcm) de un grupo de números, 
    es el número  más pequeño que es múltiplo de cualquiera de ellos.
    a) Crea una aplicación Java que determine el mcm de 2 números.
    b) Crea una segunda aplicación que determine el mcm de 3 números.
    Entregar los dos ficheros .java SIN COMPRIMIR 
    4, 7, 9 = 252
     */
    public static void main(String[] args) {
        System.out.println("****Cálculo del MCM de tres números**** ");
        System.out.printf("Introducier el 1º número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        while (n1 == 0) {
            System.out.printf("Se necesita un nº positivo. ");
            n1 = sc.nextInt();
        }
        System.out.printf("Introducier el 2º número: ");
        int n2 = sc.nextInt();
        while (n2 == 0) {
            System.out.printf("Se necesita un nº positivo. ");
            n2 = sc.nextInt();
        }
        System.out.printf("Introducier el 3º número: ");
        int n3 = sc.nextInt();
        while (n3 == 0) {
            System.out.printf("Se necesita un nº positivo. ");
            n3 = sc.nextInt();
        }
        int result = mcm(n1, n2, n3);
        System.out.println("El MCM es : " + result);

    }

    public static int mcm(int a, int b, int c) {
        int result = a;
        result = mcm(a, b);
        result = mcm(result, c);
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
