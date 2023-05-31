/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author diego
 */
public class _02StreamTokenizer {

    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Main().contarPalabrasyNumeros("/Users/diego/Documents/text.txt");
        contarPalabrasyNumeros("/Users/diego/Documents/text.txt");
    }

    //public void contarPalabrasyNumeros(String nombre_fichero) {
    public static void contarPalabrasyNumeros(String nombre_fichero) {
        StreamTokenizer sTokenizer = null;
        int contapal = 0, numNumeros = 0;
        try {
            sTokenizer = new StreamTokenizer(new FileReader(nombre_fichero));
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (sTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    contapal++;
                } else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    numNumeros++;
                }
            }
            System.out.println("Número de palabras en el fichero: " + contapal);
            System.out.println("Número de números en el fichero: " + numNumeros);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
