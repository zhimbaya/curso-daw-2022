package Tema03;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {

        System.out.println("Especifique el tipo de figura:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo \n");

        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        if (tipo == 1 || tipo == 2) {
            System.out.println("Escribe la base");
            double base = sc.nextDouble();
            System.out.println("Escribe la altura");
            double altura = sc.nextDouble();
            if (tipo == 1) {
                TrianguloRectangulo t = new TrianguloRectangulo(base, altura);
                System.out.println("El perímetro es " + t.perimetro());
                System.out.println("El área es " + t.area());
            } else {
                Rectangulo r = new Rectangulo(base, altura);
                System.out.println("El perímetro es " + r.perimetro());
                System.out.println("El área es " + r.area());
            }
        } else if (tipo == 3) {
            System.out.println("Escribe el radio");
            double radio = sc.nextDouble();
            Circulo c = new Circulo(radio);

            System.out.println("El perímetro es " + c.perimetro());
            System.out.println("El área es " + c.area());
        } else {
            System.out.println("La elección no es correcta");
        }
    }

}
