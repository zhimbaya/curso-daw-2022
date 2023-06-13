package Tema04;

import java.util.Scanner;

public class NIF2 {

    private int dni;
    private char letra;

    public NIF2() {
        letra = calcularLetra();
    }

    public NIF2(int dni) {
        this.dni = dni;
        letra = calcularLetra();
    }

    private char calcularLetra() {
        int resto = dni % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(resto);
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número del dni sin letra");
        int dni = sc.nextInt();
        this.dni = dni;
        letra = calcularLetra();
    }

    @Override
    public String toString() {
        String nif = dni + "-" + Character.toUpperCase(letra);
        while (nif.length() < 10) {
            nif = "0" + nif;
        }
        return nif;
    }

}
