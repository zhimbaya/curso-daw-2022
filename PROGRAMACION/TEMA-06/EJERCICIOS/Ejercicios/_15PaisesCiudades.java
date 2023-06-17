package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Crea un programa que pida por pantalla cuatro países y a continuación tres
 * ciudades de cada uno de estos países. Los nombres de ciudades deben
 * almacenarse en un array multidimensional cuyo primer índice sea el número
 * asignado a cada país y el segundo índice el número asignado a cada ciudad.
 *
 * Ejemplo de resultados que debe mostrar el programa:
 *
 * País: Argentina Ciudades: Buenos Aires Cordoba La Plata
 *
 * País: España Ciudades: Madrid Lugo Sevilla
 *
 * País: Francia Ciudades: Paris Niza Lyon
 *
 * País: Italia Ciudades: Roma Napoles Sicilia
 *
 * @author Anuska
 */
public class _15PaisesCiudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NPAISES = 4;
        final int NCIUDADES = 3;

        String[] paises = new String[NPAISES];
        String[][] ciudades = new String[NPAISES][NCIUDADES];

        for (int i = 0; i < paises.length; i++) {
            System.out.println("Escribe el país: " + (i + 1));
            paises[i] = sc.nextLine();
        }

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.println("Escribe la ciudad " + (j + 1) + " de " + paises[i]);
                ciudades[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < paises.length; i++) {
            System.out.print("Pais: " + paises[i] + "\tCiudades:");
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print("\t" + ciudades[i][j]);
            }
            System.out.println();
        }

    }

}
