package Tema04;

import java.util.Scanner;

public class ComplejoTest {

    public static void main(String[] args) {
        Complejo c = new Complejo();
        System.out.println(c);
        Complejo d = new Complejo(2, 4);
        System.out.println(d);
        d.cambia_Imag(34);
        d.cambia_Real(66);
        System.out.println(d);
        System.out.println(d.consulta_Imag());
        System.out.println(c.consulta_Real());

        c.sumar(d);

        Scanner scan = new Scanner(System.in);
        System.out.printf("Introduce el número Real: ");
        double numReal = scan.nextDouble();

        System.out.printf("Introduce el número Imaginario: ");
        double numImag = scan.nextDouble();

        Complejo e = new Complejo(numReal, numImag);
        System.out.println("La parte Real es: " + e.consulta_Real());
        System.out.println("La parte Imaginaria es: " + e.consulta_Imag());
        System.out.println("El número complejo es: " + e);

        System.out.println("\nLa suma de dos números complejos es:");
        c.sumar(e);

    }

}
