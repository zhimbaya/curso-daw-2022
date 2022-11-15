/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa00304;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA00304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la hora (0-23)");
        int hora = sc.nextInt();
        System.out.println("Escribe los minutos (0-59)");
        int min = sc.nextInt();
        System.out.println("Escribe los segundos (0-59)");
        int seg = sc.nextInt();
        if (hora >= 0 && hora < 24 &&
            min >= 0 && min < 60 &&
            seg >= 0 && seg < 60)
        {
            System.out.println("La hora es correcta");
        }
        else
        {
            System.out.println("La hora es incorrecta");
        }
    }
    
}
