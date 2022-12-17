/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0402;
import java.util.Scanner;

public class EjercicioA0402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Especifique el tipo de figura:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        int tipo = sc.nextInt();
        if (tipo == 1 || tipo == 2)
        {
            System.out.println("Escribe la base");
            double base = sc.nextDouble();
            System.out.println("Escribe la altura");
            double altura = sc.nextDouble();
            if (tipo == 1)
            {
                TrianguloRectangulo t = new TrianguloRectangulo(base,altura);
                System.out.println("El perímetro es "+t.perimetro());
                System.out.println("El área es "+t.area());
            }
            else
            {
                Rectangulo r = new Rectangulo(base,altura);
                System.out.println("El perímetro es "+r.perimetro());
                System.out.println("El área es "+r.area());
            }
        }
        else if (tipo==3)
        {
            System.out.println("Escribe el radio");
            double radio = sc.nextDouble();
            Circulo c = new Circulo(radio);
            
            System.out.println("El perímetro es "+c.perimetro());
            System.out.println("El área es "+c.area());
        }
        else
        {
            System.out.println("La elección no es correcta");
        }
    }
    
}
