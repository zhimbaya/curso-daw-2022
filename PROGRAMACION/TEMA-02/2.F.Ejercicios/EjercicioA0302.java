/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0302;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA0302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos números reales, dividendo y divisor");
        double dividendo = sc.nextDouble();
        double divisor = sc.nextDouble();
        if (divisor == 0)
        {
            System.out.println("El divisor no puede ser 0");
        }
        else
        {
            System.out.println(dividendo+"/"+divisor+"="+dividendo/divisor);
        }
    }
    
}
