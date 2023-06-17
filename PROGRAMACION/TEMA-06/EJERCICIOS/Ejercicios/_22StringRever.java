package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Implementa un programa en Java que pida un String por teclado e implementa
 * los siguientes métodos: a) Imprimir la primera mitad de los caracteres de la
 * cadena. b) Imprimir el último caracter. c) Imprimirlo en forma inversa. d)
 * Imprimir cada caracter del String separado con un guión. e) Imprimir la
 * cantidad de vocales almacenadas. f) Implementar un método que verifique si la
 * cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda
 * (ej. neuquen se lee igual en las dos direcciones)
 *
 * @author Anuska
 */
public class _22StringRever {

    public static void mitad(String s) {
        System.out.println(s.substring(0, s.length() / 2));
    }

    public static void ultimo(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }

    public static void inversa(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void inversaR(String s) {
        if (!s.equals("")) {
            System.out.print(s.charAt(s.length() - 1));
            inversaR(s.substring(0, s.length() - 1));
        } else {
            System.out.println();
        }

    }

    public static void guion(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.print(s.charAt(i) + "-");
        }
        System.out.println(s.charAt(s.length() - 1));
    }

    public static boolean vocal(char c) {
        String vocales = "AEIOUaeiou";
        return vocales.indexOf(c) != -1;
    }

    public static void vocales(String s) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vocal(s.charAt(i))) {
                cont++;
            }
        }
        System.out.println(cont);
    }

    public static boolean reversible(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();

        System.out.println("La primera mitad");
        mitad(texto);

        System.out.println("El último caracter");
        ultimo(texto);

        System.out.println("Inversa no recursiva");
        inversa(texto);

        System.out.println("Inversa recursiva");
        inversaR(texto);

        System.out.println("Separados por guión");
        guion(texto);

        System.out.println("Cantidad de vocales");
        vocales(texto);

        if (reversible(texto)) {
            System.out.println("El texto es reversible");
        } else {
            System.out.println("El texto no es reversible");
        }
    }

}
