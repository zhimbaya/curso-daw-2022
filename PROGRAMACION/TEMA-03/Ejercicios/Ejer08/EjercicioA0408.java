/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0408;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA0408 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia=0,mes=0,anio=0;
        while (!Fecha.fechaCorrecta(dia, mes, anio))
        {
            System.out.println("Escribe el dia");
            dia = sc.nextInt();
            System.out.println("Escribe el mes");
            mes = sc.nextInt();
            System.out.println("Escribe el año");
            anio = sc.nextInt();
        }
        Fecha miFecha = new Fecha(dia,mes,anio);
        
        System.out.println("Dia actual: "+miFecha);
        
        System.out.println("Cuantos días quieres que muestre");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++)
        {
            miFecha.diaSiguiente();
            System.out.println("Dia actual+"+i+": "+miFecha);
        }
        
        
        
    }
    
}
