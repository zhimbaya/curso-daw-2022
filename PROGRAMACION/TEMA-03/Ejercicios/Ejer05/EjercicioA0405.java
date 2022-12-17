/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0405;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA0405 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre");
        String nombre = sc.nextLine();
        
        while (!nombre.equalsIgnoreCase("salir"))
        {
            System.out.println("Escribe la edad");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Escribe el sexo");
            char sexo = sc.nextLine().charAt(0);
            System.out.println("Escribe el peso en kg");
            double peso = sc.nextDouble();
            System.out.println("Escribe la altura en metros");
            double altura = sc.nextDouble();
            sc.nextLine();
            Persona p = new Persona(nombre,edad,sexo,peso,altura);
            
            int peso_ideal = p.calcularIMC();
            switch (peso_ideal)
            {
                case -1: System.out.println("Estás por debajo del peso ideal");
                         break;
                case 0: System.out.println("Estás en el peso ideal");
                         break;
                case 1: System.out.println("Estás por encima del peso ideal");
                         break;
            }
            System.out.println(p);
            System.out.println("Escribe otro nombre");
            nombre = sc.nextLine();
            
        }
        
        
        
        
        

    }
    
}
