package Tema03;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Escribe el nombre");
        String nombre = sc.nextLine();

        while (!nombre.equalsIgnoreCase("exit")) {
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
            Persona p = new Persona(nombre, edad, sexo, peso, altura);

            int peso_ideal = p.calcularIMC();
            switch (peso_ideal) {
                case -1:
                    System.out.println("Estás por debajo del peso ideal");
                    break;
                case 0:
                    System.out.println("Estás en el peso ideal");
                    break;
                case 1:
                    System.out.println("Estás por encima del peso ideal");
                    break;
            }
            System.out.println(p);
            System.out.println("Nº de Personas " + Persona.getNumPersonas());
            System.out.println("Escribe otro nombre o EXIT, para salir");
            nombre = sc.nextLine();

        }

    }

}
