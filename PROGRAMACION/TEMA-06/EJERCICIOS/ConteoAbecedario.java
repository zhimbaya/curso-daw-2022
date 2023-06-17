package Tema06;

import java.util.Scanner;

public class ConteoAbecedario {

    /**
     * Crear una clase que permita Introducir una cadena por teclado y que
     * imprima en pantalla el número de veces que aparece cada letra del
     * abecedario en el texto. 
     * Pista: emplea un array de contadores donde se
     * asocie la posición con el contador correspondiente. (‘a’ – ‘a’ = 0, ‘b’ –
     * ‘a’ = 1 y así sucesivamente). En una línea aparecerán las letras del
     * abecedario y en la siguiente el número de veces que aparece cada letra.
     * Nota: Haremos el ejercicio de forma que no distinga letras minúsculas de
     * mayúsculas (no case sensitive).
     */
    public static void main(String[] args) {

        int arrayCont[];
        int tamAbc = 'z' - 'a' + 1; //ascii 122 - 97
        //System.out.println(tamAbc);
        arrayCont = new int[tamAbc];

        //inicializarArray(arrayCont);
        contadorLetras(arrayCont);
    }

    public static void inicializarArray(int arrayCont[]) {
        /* no hace falta inicializar el contador a 0 porque al crear el array
        inicializa todas las posiciones  a 0, pero se haria: */

        int i;
        for (i = 0; i < arrayCont.length; i++) {
            arrayCont[i] = 0;
        }
    }

    public static void contadorLetras(int arrayCont[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cadena:");
        String cad = sc.nextLine(); //leemos la cadena a analizar
        //int numVocales = 0;

        char car;

        for (int i = 0; i < cad.length(); i++) //Recorremos los caracteres de la cadena
        {
            car = cad.charAt(i);
            car = Character.toLowerCase(car); //Uniformizamos ya que el enunciado nos dice que no debe ser case sensitive
            if (car >= 'a' && car <= 'z') {
                //arrayCont[car - 'a']++; //es lo mismo
                //arrayCont[car - 'a'] += 1;
                arrayCont[car - 'a'] = arrayCont[car - 'a'] + 1; //guarda la posición y suma uno

                //System.out.print(arrayCont['z' - 'a']);
                //System.out.print("\n");
            }
        }
        //imprime el abcdario
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.print(letra + " ");
        }

        System.out.println("\n");

        //imprime el número de veces.
        for (int i = 0; i < arrayCont.length; i++) {
            System.out.print(arrayCont[i] + " ");
        }
    }

}
