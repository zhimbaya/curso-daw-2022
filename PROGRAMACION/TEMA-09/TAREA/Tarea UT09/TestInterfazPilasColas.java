/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema09;

/**
 *
 * @author diego
 */
public class TestInterfazPilasColas {

    public static void main(String args[]) {

        ColaDinamica cola = new ColaDinamica();
        Character caracter;

        for (char car = 'a'; car <= 'z'; car++) //Rellenamos con todo el abecedario
        {
            caracter = new Character(car);
            cola.insertar(caracter);
        }

        while (!cola.vacia()) //Ahora los vamos sacando para mostrarlos (saldrán en el mismo orden que entraron por ser una cola)
        {
            caracter = (Character) cola.eliminar();
            char car = caracter.charValue();
            System.out.print("" + car);
        }

        System.out.println("\n");

        PilaDinamica pila = new PilaDinamica();
        Character caracter1;

        for (char car = 'a'; car <= 'z'; car++) {
            caracter1 = new Character(car);
            pila.insertar(caracter1);
        }

        while (!pila.vacia()) //se mostrarán en orden inverso a como entraron, es decir, ultimo en entra, primero en salir (Pila)
        {
            caracter1 = (Character) pila.eliminar();
            char car = caracter1.charValue();
            System.out.print("" + car);
        }

        System.out.println("\n");
    }

}
