/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa214;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número de 3 cifras");
        int n = sc.nextInt();
        
        int unidades = n%10;
        int decenas = (n/10)%10;
        int centenas = n/100;
        
        System.out.println("Centenas: "+centenas);
        System.out.println("Decenas: "+decenas);
        System.out.println("Unidades: "+unidades);
    }
    
}
