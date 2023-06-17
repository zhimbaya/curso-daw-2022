package Tema06;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class TareaArrayDouble {

    Scanner sc = new Scanner(System.in);

    //Miembros Datos
    private double array[];
    private int tamMax;
    private int numElem;
    private PrintStream pantalla = System.out;

    //Constructor por Defecto
    public TareaArrayDouble() {
        pantalla.print("Introduce el Tamano Maximo del Array: ");
        tamMax = sc.nextInt();
        numElem = 0;

        //Instanciar o Crear el Array
        array = new double[tamMax];
    }

    public TareaArrayDouble(int tamMax) {
        this.tamMax = tamMax;
        numElem = 0;
        array = new double[tamMax];
    }

    //Constructor Cop�a
    public TareaArrayDouble(TareaArrayDouble copia) {
        numElem = copia.numElem;
        tamMax = copia.tamMax;
        array = new double[tamMax];

        for (int c = 0; c < numElem; c++) {
            array[c] = copia.array[c];
        }
    }

    public void leerArray() {
        boolean finalizar;
        double numero;
        numElem = 0;

        pantalla.println("Introduce los Elementos del Array. Para Finalizar escribe 999");

        do {
            sc.useLocale(Locale.US); //Para usar como separador de parte enteray decimal un "." en lugar de una ","
            numero = sc.nextDouble();

            finalizar = (numero == 999 || numElem == tamMax);
            if (!finalizar) {
                array[numElem] = numero;
                numElem++;
            }
        } while (!finalizar);
    }

    public void escribirArray() {
        for (int i = 0; i < numElem; i++) {
            pantalla.println("Array[" + i + "] = " + array[i]);
        }
    }

    public boolean arrayLleno() {
        return (numElem == tamMax);
    }

    public void insertar() {
        int posicion;
        double numero;
        boolean posicionValida;

        if (arrayLleno()) {
            pantalla.println("\nEl Array Esta LLeno");
        } else {
            System.out.print("Introduce la Posicion donde Introducir el Elemento: ");

            do {
                posicion = sc.nextInt();
                posicionValida = (posicion >= 0 && posicion < numElem);
                if (!posicionValida) {
                    pantalla.println("Posicion No Valida. Introduce de Nuevo");
                }
            } while (!posicionValida);

            pantalla.print("Introduce un Numero: ");
            numero = sc.nextDouble();

            for (int contador = numElem; contador > posicion; contador--) {
                array[contador] = array[contador - 1];
            }

            array[posicion] = numero;

            numElem++;
        }
    }

    public boolean arrayVacio() {
        return (numElem == 0);
    }

    public void eliminar() {
        int posicion;
        boolean posicionValida;

        if (arrayVacio()) {
            pantalla.println("\nEl Array Esta Vacio");
        } else {
            System.out.println("Introduce la Posicion a Eliminar: ");

            do {
                posicion = sc.nextInt();
                posicionValida = (posicion >= 0 && posicion < numElem);
                if (!posicionValida) {
                    pantalla.println("Posicion No Valida. Introduce de Nuevo");
                }
            } while (!posicionValida);

            for (int contador = posicion; contador < numElem - 1; contador++) {
                array[contador] = array[contador + 1];
            }
            numElem--;
        }
    }

    public int busquedaSecuencial(double buscado) {
        for (int contador = 0; contador < numElem; contador++) {
            if (array[contador] == buscado) {
                return contador;
            }
        }
        return -1;
    }

    public int busquedaSecuencial2(double buscado2) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < numElem) {
            if (buscado2 == array[i]) {
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado) {
            return i;
        } else {
            return -1;
        }
    }

    public int busquedaSecuencial3(double buscado3) {
        int i = 0;
        while (i < numElem && buscado3 != array[i]) {
            i++;
        }
        if (i == numElem) {
            return -1;
        } else {
            return i;
        }
    }

    public void busquedaBinaria() {
        double numero;
        int posicion = 0;

        int bajo = 0;
        int medio = 0;
        int alto = numElem;

        pantalla.print("\nIntroduce el Numero a Buscar (Busqueda Binaria): ");
        numero = sc.nextDouble();

        while (bajo <= alto) {
            medio = (bajo + alto) / 2;

            if (numero > array[medio]) {
                bajo = medio + 1;
            } else if (numero < array[medio]) {
                alto = medio - 1;
            } else {
                break;
            }
        }

        if (bajo > alto) {
            System.out.print(numero + " No Encontrado");
        } else {
            System.out.print("Array[" + medio + "] = " + numero + "\n");
        }
    }

    public void maximo() {
        double maximo = array[0];
        int posicion = numElem;

        for (int contador = 0; contador < numElem; contador++) {
            if (array[contador] < maximo) {
                maximo = array[contador];
                posicion--;
            }
        }

        pantalla.print("\nLa Posicion y El Numero Maximo es: Array[" + posicion + "] = " + maximo);
    }

    public void minimo() {
        double minimo = array[0];
        int posicion = 0;

        for (int contador = 0; contador < numElem; contador++) {
            if (array[contador] > minimo) {
                minimo = array[contador];
                posicion++;
            }
        }

        pantalla.print("\nLa Posicion y El Numero Minimo es: Array[" + posicion + "] = " + minimo);
    }

    public void ordenaBurbuja() {
        double aux;
        boolean intercambio;

        do {
            intercambio = false;

            for (int contador = 0; contador < numElem - 1; contador++) {
                if (array[contador] > array[contador + 1]) {
                    aux = array[contador];
                    array[contador] = array[contador + 1];
                    array[contador + 1] = aux;

                    intercambio = true;
                }
            }
        } while (intercambio);
    }

    public void mediaAritmetica() {
        double acum = 0;

        for (int contador = 0; contador < numElem; contador++) {
            acum = acum + array[contador];
        }

        pantalla.println("La Media es Igual a: " + (acum / numElem));
    }
}
