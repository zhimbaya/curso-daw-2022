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
public class TareaUT04_1 {

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
        int[] numeros = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Introducier el " + (i + 1) + "º número: ");
            int num = sc.nextInt();
            while (num == 0) {
                System.out.printf("Se necesita un nº positivo. ");
                num = sc.nextInt();
            }
            numeros[i] = num;
        }
        int result = mcm(numeros);
        System.out.println("El MCM es : " + result);

    }

    public static int mcm(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = mcm(resultado, numeros[i]);
        }
        return resultado;
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
