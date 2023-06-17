package Tema06;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

class TareaArrayDoubleTest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Para usar como separador de parte enteray decimal un "." en lugar de una ","

        System.out.println("---INTRODUCCION DE DATOS---");
        ArrayDouble array = new ArrayDouble();
        array.leerArray();

        System.out.println("\n---MOSTRAR ARRAYS---");
        System.out.println("Los Elementos del Array son:");
        array.escribirArray();

        ArrayDouble copia = new ArrayDouble(array);
        System.out.println("\nLos Elementos del Array Copia son:");
        copia.escribirArray();

        System.out.println("\n---INSERTAR Y MOSTRAR ARRAY---");
        array.insertar();
        System.out.println("\nLos Elementos del Array Actualizados son:");
        array.escribirArray();

        System.out.println("\n---ELIMINAR Y MOSTRAR ARRAY---");
        array.eliminar();
        System.out.println("\nLos Elementos del Array Actualizados son:");
        array.escribirArray();

        System.out.println("\n---BUSQUEDA DE ELEMENTOS---");

        double buscado;
        System.out.print("Introduce el Numero a Buscar (Busqueda Secuencial V1): ");
        buscado = sc.nextDouble();

        int posBuscado = array.busquedaSecuencial(buscado);
        boolean encontrado = (posBuscado != -1);
        if (encontrado) {
            System.out.println("El Numero " + buscado + " esta en la posicion: Array[" + posBuscado + "]");
        } else {
            System.out.println("El Numero " + buscado + " no esta en el Array");
        }

        double buscado2;
        System.out.print("\nIntroduce el Numero a Buscar (Busqueda Secuencial V2): ");
        buscado2 = sc.nextDouble();

        int posBuscado2 = array.busquedaSecuencial2(buscado2);
        boolean encontrado2 = (posBuscado2 != -1);
        if (encontrado2) {
            System.out.println("El Numero " + buscado2 + " esta en la posicion: Array[" + posBuscado2 + "]");
        } else {
            System.out.println("El Numero" + buscado2 + " no esta en el Array");
        }

        double buscado3;
        System.out.print("\nIntroduce el Numero a Buscar (Busqueda Secuencial V3): ");
        buscado3 = sc.nextDouble();

        int posBuscado3 = array.busquedaSecuencial3(buscado3);
        boolean encontrado3 = (posBuscado3 != -1);
        if (encontrado3) {
            System.out.println("El Numero " + buscado3 + " esta en la posicion: Array[" + posBuscado3 + "]");
        } else {
            System.out.println("El Numero" + buscado3 + " no esta en el Array");
        }

        System.out.println("\n---MOSTRAR ELEMENTOS MAXIMO Y MINIMO---");

        array.maximo();
        array.minimo();

        System.out.println("\n---ORDENAR ARRAY---");

        array.ordenaBurbuja();
        System.out.print("\nLos Elementos del Array Ordenados son:");
        array.escribirArray();

        System.out.println("\n---BUSQUEDA DE ELEMENTOS (BINARIA)---");

        array.busquedaBinaria();

        array.mediaAritmetica();
    }
}
