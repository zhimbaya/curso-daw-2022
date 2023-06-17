package Tema06.Ejercicios;

import java.util.Scanner;

/**
 * Completar la clase Matriz del ejercicio A5.15 añadiendo los siguientes
 * métodos:
 *
 * sumaFila(int i) devuelve la suma de los elementos de la fila cuyo índice
 * pasamos como parámetro sumaCol(int i) devuelve la suma de los elementos de la
 * columna cuyo índice pasamos como parámetro maxFila() me devuelve el índice de
 * la fila cuya suma de elementos es mayor minFila() me devuelve el índice de la
 * fila cuya suma de elementos es menor maxCol() me devuelve el índice de la
 * columna cuya suma de elementos es mayor minCol() me devuelve el índice de la
 * columna cuya suma de elementos es menor
 *
 * modificar el método toString() para que queden bien alineadas a la derecha
 * las columnas de números
 *
 * Ej: 4 125 45 3 23 3 12 789 1 34 1 3
 *
 * @author Anuska
 */
public class _18Matriz {

    private int[][] m;

    public _18Matriz(int f, int c) {
        m = new int[f][c];
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + i + "," + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
        }
        return suma;
    }

    public int maximo() {
        int maximo = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maximo < m[i][j]) {
                    maximo = m[i][j];
                }
            }
        }
        return maximo;
    }

    public int minimo() {
        int minimo = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (minimo > m[i][j]) {
                    minimo = m[i][j];
                }
            }
        }
        return minimo;
    }

    public int promedio() {
        return suma() / (m.length * m[0].length);
    }

    public _18Matriz transpuesta() {
        _18Matriz t = new _18Matriz(m[0].length, m.length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                t.m[j][i] = this.m[i][j];
            }
        }
        return t;
    }

    public int sumaFila(int i) {
        if (i < 0 || i >= m.length) {
            System.out.println("La fila " + i + " no es válida");
            return 0;
        }
        int suma = 0;
        for (int j = 0; j < m[i].length; j++) {
            suma += m[i][j];
        }
        return suma;
    }

    public int sumaCol(int j) {
        if (j < 0 || j >= m[0].length) {
            System.out.println("La columna " + j + " no es válida");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][j];
        }
        return suma;
    }

    public int maxFila() {
        int indice = 0;
        int mayor = sumaFila(0);
        for (int i = 1; i < m.length; i++) {
            if (sumaFila(i) > mayor) {
                mayor = sumaFila(i);
                indice = i + 1;
            }
        }
        return indice;
    }

    public int minFila() {
        int indice = 0;
        int menor = sumaFila(0);
        for (int i = 1; i < m.length; i++) {
            if (sumaFila(i) < menor) {
                menor = sumaFila(i);
                indice = i;
            }
        }
        return indice + 1;
    }

    public int maxCol() {
        int indice = 0;
        int mayor = sumaCol(0);
        for (int j = 1; j < m[0].length; j++) {
            if (sumaCol(j) > mayor) {
                mayor = sumaCol(j);
                indice = j + 1;
            }
        }
        return indice;
    }

    public int minCol() {
        int indice = 0;
        int menor = sumaCol(0);
        for (int j = 1; j < m[0].length; j++) {
            if (sumaCol(j) < menor) {
                menor = sumaCol(j);
                indice = j;
            }
        }
        return indice + 1;
    }

    private int digitos(int n) {
        return String.valueOf(n).length();
    }

    private int long_maxima() {
        int dig = digitos(m[0][0]);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (digitos(m[i][j]) > dig) {
                    dig = digitos(m[i][j]);
                }
            }
        }
        return dig;
    }

    public String toString() {
        String texto = "";
        int sep = long_maxima() + 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                String valor = m[i][j] + "";
                while (valor.length() < sep) {
                    valor = " " + valor;
                }
                texto += valor;
            }
            texto += "\n";
        }
        return texto;
    }

}
