/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;
import java.util.Scanner;

public class EjercicioA0314ConFunciones {

    public static boolean esPrimo(int num)
    {
        boolean primo = true;
        for (int i = 2; i < num && primo; i++)
        {
            if (num%i==0)
            {
                primo = false;
            }
        }
        return primo;
            
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        int n = sc.nextInt();
       
        while (n!=-1)
        {
            if (esPrimo(n))
            {
                System.out.println("El número es primo");
            }
            else
            {
                System.out.println("El número no es primo");
            }
            n = sc.nextInt();
        }
    }
    
}
