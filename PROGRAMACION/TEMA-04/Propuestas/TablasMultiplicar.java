package Tema04;

import java.io.*;

public class TablasMultiplicar {

    public static void main(String args[]) throws IOException {
        //Declarar Variables
        int num1;
        int num2;

        for (num1 = 1; num1 <= 10; num1++) {
            System.out.println("Tabla del " + num1);
            for (num2 = 1; num2 <= 10; num2++) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }//fin para
        }//fin para
    }//fin main
}//fin class
