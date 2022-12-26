/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0303;
import java.util.Scanner;

public class EjercicioA0303 {

    /**
     * Realizar un programa que lea por teclado tres números enteros y calcula y muestra el mayor de los tres.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tres números enteros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a >= b && a >= c)
        {
            System.out.println("El mayor es "+a);
        }
        else
        {
            if (b >= a && b >= c)
            {
                System.out.println("El mayor es "+b);
            }
            else
            {
                if (c >= a && c >= b)
                {
                    System.out.println("El mayor es "+c);
                }
            }
        }
    }
   
}
