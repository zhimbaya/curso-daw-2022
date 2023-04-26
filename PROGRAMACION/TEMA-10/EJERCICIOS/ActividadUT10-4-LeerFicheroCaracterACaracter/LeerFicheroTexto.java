package Tema10;

/*4)Escribe un programa denominado LeerFicheroTexto  que se ejecute de la siguiente forma: 
 C> java LeerFicheroTexto  texto.txt.
El  programa deber� controlar que el n�mero de par�metros pasados a main es correcto, 
manejar� excepciones de tipo IOException, 
si el n�mero de argumentos es correcto, 
	invocar� a un m�todo denominado mostrarFichero, 
	donde se llevar� a cabo la visualizaci�n del fichero de texto. 
Si el n�mero de par�metros no es correcto 
	lanzar� una excepci�n propia indicando que los par�metros son incorrectos 
	y la sintaxis correcta para ejecutar el programa. 
La informaci�n se procesar� car�cter a car�cter.*/

import java.io.*;
import java.lang.*;

public class LeerFicheroTexto {

    public static void main(String args[]) throws IOException {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos();
            } else {
                mostrarFichero(args[0]);
            }
        } ////////////////////////////////////////////////////////////////////////
        catch (ArgumentosIncorrectos error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java CrearFicheroTexto nomFichero");
        }

    }

    ////////////////////////////////////////////////////////////////////////////
    public static void mostrarFichero(String nomFichero) throws IOException {
        File fichero = new File(nomFichero);
        FileReader flujoEntrada = null;

        try {
            if (fichero.exists()) {
                flujoEntrada = new FileReader(fichero);
                char caracter;
                char eof = (char) -1;
                while ((caracter = (char) flujoEntrada.read()) != eof) {
                    System.out.print(caracter);
                }
            } else {
                throw new FicheroInexistente();
            }
        } catch (FicheroInexistente error) {
            System.out.println("El Fichero No Existe");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
class ArgumentosIncorrectos extends Exception {

    public ArgumentosIncorrectos() {
        super();
    }
}

class FicheroInexistente extends Exception {

    public FicheroInexistente() {
        super();
    }
}
