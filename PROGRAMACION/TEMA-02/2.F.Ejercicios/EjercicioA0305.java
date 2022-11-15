/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0305;
import java.util.Scanner;
/**
 *
 * @author Anuska
 */
public class EjercicioA0305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número correspondiente al mes");
        int mes = sc.nextInt();
        String nombre="";
        int dias=0;
        switch (mes)
        {
            case 1: nombre = "Enero";
                    dias = 31;
                    break;
            case 2: nombre = "Febrero";
                    dias = 28;
                    break;
            case 3: nombre = "Marzo";
                    dias = 31;
                    break;
            case 4: nombre = "Abril";
                    dias = 30;
                    break;
            case 5: nombre = "Mayo";
                    dias = 31;
                    break;
            case 6: nombre = "Junio";
                    dias = 30;
                    break;
            case 7: nombre = "Julio";
                    dias = 31;
                    break;
            case 8: nombre = "Agosto";
                    dias = 31;
                    break;
            case 9: nombre = "Septiembre";
                    dias = 30;
                    break;

            case 10: nombre = "Octubre";
                    dias = 31;
                    break;

            case 11: nombre = "Noviembre";
                    dias = 30;
                    break;

            case 12: nombre = "Diciembre";
                    dias = 31;
                    break;

        }
        if (mes >= 1 && mes<= 12)
        {
            System.out.println("El mes es "+nombre+" y tiene "+dias+" días");
        }
        else
        {
            System.out.println("Mes no válido");
        }
    }
    
}
