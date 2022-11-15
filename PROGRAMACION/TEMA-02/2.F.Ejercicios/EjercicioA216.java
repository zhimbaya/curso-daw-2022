/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa216;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Voy a buscar un número entre 1 y ");
        int max = sc.nextInt();
        int aleat = (int)(Math.random()*max+1);
        
        System.out.println("El número es "+aleat);
    }
    
}
