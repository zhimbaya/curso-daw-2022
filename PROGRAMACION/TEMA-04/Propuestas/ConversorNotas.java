package Tema04;

import java.io.*;

public class ConversorNotas {

    public static void main(String args[]) throws IOException {
        //Declaracion Variables
        char calificacion;
        int nota;
        boolean notaValida;

        System.out.println("Introduce la calificacion");
        calificacion = (char) System.in.read();

        notaValida = true;
        nota = 0;

        switch (calificacion) {
            case 'I':
                nota = 4;
                break;
            case 'F':
                nota = 5;
                break;
            case 'B':
                nota = 6;
                break;
            case 'N':
                nota = 7;
                break;
            case 'S':
                nota = 9;
                break;
            default:
                notaValida = false;
        }//fin segun sea

        if (notaValida) {
            System.out.println("La nota es: " + nota);
        } else {
            System.out.println("La nota introducida no es valida");
        }

    }//fin main
}//fin class
