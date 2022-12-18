/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0410;
import java.util.Scanner;
 
public class EjercicioA0410 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número en decimal");
        int dec = sc.nextInt();
        Binario bin = new Binario(dec);
        System.out.println(dec+" en binario es "+bin.getValor());
        
        long nBin;
        do
        {
            System.out.println("Escribe un número en binario");
            nBin = sc.nextLong();
            
        }while (!Binario.esValido(nBin));
        Binario bin2 = new Binario(nBin);
        System.out.println(nBin +" en decimal es "+bin2.toDecimal());
               
    }
    
}
