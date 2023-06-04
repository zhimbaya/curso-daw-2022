package Tema03;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0;
        
        while (!Fecha.fechaCorrecta(dia, mes, anio)) {
            System.out.println("Escribe el dia");
            dia = sc.nextInt();
            System.out.println("Escribe el mes");
            mes = sc.nextInt();
            System.out.println("Escribe el año");
            anio = sc.nextInt();
        }
        Fecha miFecha = new Fecha(dia, mes, anio);

        System.out.println("Dia actual: " + miFecha);

        System.out.println("Cuantos días quieres que muestre: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            miFecha.diaSiguiente();
            System.out.println("Dia actual+" + i + ": " + miFecha);
        }

    }

}
