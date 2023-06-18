package Tema07.Ejercicios;

import java.io.*;

public class _01TestPunto {

    public static void main(String[] args) {
        _01Punto p1 = new _01Punto(2, 4);
        _01Punto p2 = new _01Punto(7, 10);

        System.out.println("La Distancia entre los puntos p1 y p2 es: " + _01PuntoMejor.distanciaPuntos(p1, p2));

        _01PuntoMejor p3 = new _01PuntoMejor(1, 1);
        System.out.println("La Distancia entre los puntos p1 y p3 es: " + p3.distanciaPuntos(p1));

    }
}
