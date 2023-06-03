/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ecuacion2Grado2 {

    /*
    Crear un programa Java que pida los coeficientes de una ecuación de 
    segundo grado, mostrando  sus soluciones reales. Si no existen, se 
    indicará mediante un texto alusivo a tal circunstancia.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        double dsc = 0;
        double x1 = 0, x2 = 0;

        System.out.println("Ecuacion de Segundo Grado\n");
        System.out.print("Ingrese el valor de a: \r");
        a = entrada.nextInt();

        System.out.print("Ingrese el valor de b: \r");
        b = entrada.nextInt();

        System.out.print("Ingrese el valor de c: \r");
        c = entrada.nextInt();

        dsc = (Math.pow(b, 2) - (4 * a * c)); //ax^2 + bx + c = 0
        System.out.println("El discriminante es: " + dsc);
        
        if (dsc >= 0) {
            x1 = (-b + Math.sqrt(dsc) * 1) / (2 * a);
            x2 = (-b + Math.sqrt(dsc) * -1) / (2 * a);
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
            System.out.println("Dos soluciones reales");
        
        } else {
            System.out.println("No tiene una solucion");
        }

    }
}
