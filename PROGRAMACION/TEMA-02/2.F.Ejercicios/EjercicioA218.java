/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa218;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número");
        int a = sc.nextInt();
        System.out.println("Segundo número");
        int b = sc.nextInt();
        /*
        No es necesario ordenarlos ya que la fórmula es válida
        sea cual sea el orden de los dos números
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        */
        int aleat = (int)(Math.random()*(b-a+1)+a);
        System.out.println("El número es "+aleat);
    }
    
}
