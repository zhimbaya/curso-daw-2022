package Tema02;

import java.util.Scanner;

/**
 * Realizar un programa que lea una variable entera mes y compruebe si el valor
 * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
 * 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor
 * introducido esté comprendido entre 1 y 12.
 *
 * @author Anuska
 */
public class Ejercicio_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número correspondiente al mes");
        int mes = sc.nextInt();
        String nombre = "";
        int dias = 0;
        switch (mes) {
            case 1:
                nombre = "Enero";
                dias = 31;
                break;
            case 2:
                nombre = "Febrero";
                dias = 28;
                break;
            case 3:
                nombre = "Marzo";
                dias = 31;
                break;
            case 4:
                nombre = "Abril";
                dias = 30;
                break;
            case 5:
                nombre = "Mayo";
                dias = 31;
                break;
            case 6:
                nombre = "Junio";
                dias = 30;
                break;
            case 7:
                nombre = "Julio";
                dias = 31;
                break;
            case 8:
                nombre = "Agosto";
                dias = 31;
                break;
            case 9:
                nombre = "Septiembre";
                dias = 30;
                break;

            case 10:
                nombre = "Octubre";
                dias = 31;
                break;

            case 11:
                nombre = "Noviembre";
                dias = 30;
                break;

            case 12:
                nombre = "Diciembre";
                dias = 31;
                break;

        }
        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes es " + nombre + " y tiene " + dias + " días");
        } else {
            System.out.println("Mes no válido");
        }
    }

}
