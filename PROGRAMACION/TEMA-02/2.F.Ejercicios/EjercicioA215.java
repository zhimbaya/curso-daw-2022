/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa215;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el día de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Escribe el mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Escribe el año de nacimiento");
        int anio = sc.nextInt();
        int suma = dia+mes+anio;
        int suerte = suma%10 + (suma/10)%10 + (suma/100)%10 + (suma/1000);
        System.out.println("Tu número de la suerte es: "+suerte);
    }
    
}
