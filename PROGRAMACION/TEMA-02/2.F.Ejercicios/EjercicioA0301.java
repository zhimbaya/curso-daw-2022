/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0301;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = sc.nextInt();
        
        if (numero%2 == 0)
        {
            System.out.println("El número es par");
        }
        else
        {
            System.out.println("El número es impar");
        }
    }
    
}
