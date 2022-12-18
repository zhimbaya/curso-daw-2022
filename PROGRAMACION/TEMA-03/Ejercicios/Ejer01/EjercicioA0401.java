/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0401;
import java.util.Scanner;

public class EjercicioA0401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el valor del radio");
        double radio = sc.nextDouble();
        Circulo c1 = new Circulo(radio);
        
        System.out.println("Escribe el valor del radio para el segundo círculo");
        radio = sc.nextDouble();
        Circulo c2 = new Circulo();
        c2.setRadio(radio);
        
        System.out.println("El radio del primer círculo es "+c1.getRadio());
        System.out.println("El perímetro del primer círculo es "+c1.perimetro());
        System.out.println("El area del primer círculo es "+c1.area());
        System.out.println("El radio del segundo círculo es "+c2.getRadio());
        System.out.println("El perímetro del segundo círculo es "+c2.perimetro());
        System.out.println("El area del segundo círculo es "+c2.area());
        
    }
    
}
