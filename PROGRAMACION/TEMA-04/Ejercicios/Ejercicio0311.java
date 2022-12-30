/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema04;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class Ejercicio0311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        final int CANTIDAD = 5;
        int suma = 0;
        for (int i=1; i<=CANTIDAD;i++)
        {
            System.out.print("Escribe el número "+i+": ");
            suma = suma + sc.nextInt(); // suma+= sc.nextInt();
        }
        System.out.println("La suma de los "+CANTIDAD+" números es "+suma);
        System.out.println("La media de los "+CANTIDAD+" números es "+(double)suma/CANTIDAD);
    }
    
}
