package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * El ejercicio consiste en resolver el reto del siguiente enlace
 *
 * Una vez resuelto aceptado por el corrector, entregaremos nuestro nombre de
 * usuario y subiremos a esta página el fichero .java con la solución.
 * https://aceptaelreto.com/problem/statement.php?id=101
 *
 * @author diego
 */
public class _17AceptaReto101 {

    public static int cm(int[][] m) {
        int cm = 0;
        for (int j = 0; j < m[0].length; j++) {
            cm += m[0][j];
        }
        return cm;
    }

    public static boolean diabolico(int[][] m) {
        // Si es diabólico me devuelva la constante mágica CM
        // Si no es diabolico me devuelve -1

        // 1. Sumo la primera fila y me da la CM
        // 2. Sumo el resto de las filas una a una y compruebo que suman CM
        //    si alguna suma un valor distinto no es diabolico y devuelvo -1
        // 3. Sumo las columnas una a una y compruebo que suman CM
        //    si alguna suma un valor distinto no es diabolico y devuelvo -1
        // 4. Sumo las dos diagonales una a una y compruebo que suman CM
        //    si alguna suma un valor distinto no es diabolico y devuelvo -1
        // 5. Si todas las sumas dan el mismo valor devuelvo dicho valor que es CM
        int cm = cm(m);

        // Suma por filas
        for (int i = 1; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            if (suma != cm) {
                return false;
            }
        }
        // Suma por columnas
        for (int j = 0; j < m[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            if (suma != cm) {
                return false;
            }
        }
        /*
        int suma = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (i==j)
                    suma+=m[i][j];
            }
        }
         */
        // Diagonal Principal
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }

        if (suma != cm) {
            return false;
        }

        // Otra diagonal
        suma = 0;
        for (int i = m.length - 1, j = 0; i >= 0; i--, j++) {
            suma += m[i][j];
        }
        if (suma != cm) {
            return false;
        }

        return true;
    }

    public static boolean esta(int[][] m, int n) {
        // Me dice si el número n está o no en la matriz m

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (n == m[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean todosNumeros(int[][] m) {
        // Buscar que todos los números entre 1 y nºfilas al cuadrado están
        // en la matriz. Si están, devuelve true, si no devuelve false

        for (int x = 1; x <= (m.length * m.length); x++) {
            if (!esta(m, x)) {
                return false;
            }
        }
        return true;
    }

    public static int cm2(int[][] m) {
        return 4 * cm(m) / m.length;
    }

    public static boolean comprobarEsquinas(int[][] m) {
        int suma = m[0][0] + m[0][m.length - 1] + m[m.length - 1][0] + m[m.length - 1][m.length - 1];
        return suma == cm2(m);
    }

    public static boolean comprobarCentros(int[][] m) {
        if (m.length % 2 != 0) {
            int pc = m.length / 2;
            int suma = m[0][pc] + m[pc][0] + m[pc][m.length - 1] + m[m.length - 1][pc];
            return ((suma == cm2(m)) && (4 * m[pc][pc] == cm2(m)));
        } else {
            int pc1 = (m.length / 2 - 1);
            int pc2 = (m.length / 2);

            int suma = m[0][pc1] + m[0][pc2]
                    + m[pc1][0] + m[pc2][0] + m[pc1][m.length - 1] + m[pc2][m.length - 1]
                    + m[m.length - 1][pc1] + m[m.length - 1][pc2];
            int sumaCentral = m[pc1][pc1] + m[pc1][pc2] + m[pc2][pc1] + m[pc2][pc2];
            return suma == 2 * cm2(m) && sumaCentral == cm2(m);

        }
    }

    public static boolean esoterico(int[][] m) {
        return diabolico(m) && todosNumeros(m)
                && comprobarEsquinas(m) && comprobarCentros(m);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[][] m = new int[n][n];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = sc.nextInt();
                }
            }
            if (esoterico(m)) {
                System.out.println("ESOTERICO");
            } else if (diabolico(m)) {
                System.out.println("DIABOLICO");
            } else {
                System.out.println("NO");
            }
            n = sc.nextInt();

        }
    }

}
