package Tema04;

import java.io.IOException;

public class Triangulo {

    public static void main(String[] args) throws IOException {
        char caracter;
        int altura;
        
        System.out.println("Indique la altura: ");
        altura = Leer.datoInt();
        System.out.println("Escriba caracter de relleno: ");
        caracter = (char) System.in.read();

        dibujar(caracter, altura);
    }

    public static void dibujar(char car, int alt) {
        for (int i = alt; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < alt - i + 1; j++) {
                System.out.print(car + " ");
            }
            System.out.println("");
        }
    }

}
