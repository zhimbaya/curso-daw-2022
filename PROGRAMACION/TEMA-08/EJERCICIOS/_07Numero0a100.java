package Tema08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author diego
 */
public class _07Numero0a100 {

    public static void main(String[] args) {

        int numero = -1;
        String linea;
        int intentos = 0;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                System.out.println("Introducir un número de 0 al 100");
                linea = teclado.readLine();
                numero = Integer.parseInt(linea);
            } catch (IOException e) {
                System.out.println("Error al leer por el teclado.");
            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un número.");
            } finally {
                intentos++;
            }

        } while (numero < 0 || numero > 100);

        System.out.println("El número introducido es: " + numero);
        System.out.println("Número de intentos: " + intentos);
    }

}
