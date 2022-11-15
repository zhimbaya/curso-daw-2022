/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa217;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Número menor");
        int min = sc.nextInt();
        System.out.println("Número menor");
        int max = sc.nextInt();
        
        int aleat = (int)(Math.random()*(max-min+1)+min);
        System.out.println("El número es "+aleat);
        

    }
    
}
