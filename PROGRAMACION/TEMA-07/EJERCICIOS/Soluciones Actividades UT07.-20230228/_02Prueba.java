package Tema07.Ejercicios;

import java.io.*;
import java.util.Scanner;

public class _02Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        _02Circulo unCirculo = new _02Circulo();
        System.out.println(unCirculo);
        
        System.out.println("Area del circulo = " + unCirculo.calcularArea());
        System.out.println("Longitud de la circunferencia = " + unCirculo.calcularPerimetro());
        
        System.out.println("Introduzca el nombre: ");
        String cadena = sc.nextLine();
        System.out.println("Introduzca el radio: ");
        String numero = sc.nextLine();
        double real = Double.valueOf(numero);
        
        _02Circulo otroCirculo = new _02Circulo(real, cadena);
        System.out.println(otroCirculo);
        System.out.println("Area del circulo = " + otroCirculo.calcularArea());
        System.out.println("Longitud de la circunferencia = " + otroCirculo.calcularPerimetro());

    }
}
