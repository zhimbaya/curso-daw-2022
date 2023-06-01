package Tema10;

/**
 * Escribe un programa denominado LeerFiicheroTexto que se ejecute de la
 * siguiente forma: C>jjavaLeerFiicheroTexto texto.txt El programa deberá
 * controlar que el número de parámetros pasados a main es correcto, manejará
 * excepciones de tipo IOExceptiion, si el número de argumentos es correcto,
 * invocará a un método denominado mostrarFichero, donde se llevará a cabo la
 * visualización del fichero de texto. Si el número de parámetros no es correcto
 * lanzará una excepción propia indicando que los parámetros son incorrectos y
 * la sintaxis correcta para ejecutar el programa. La información se procesará
 * carácter a carácter. Utilizar como flujo de entrada un FileReader, invocando a
 * su método read(), y casteando su salida con (char).
 */
import java.io.*;
import java.lang.*;

public class LeerFicheroTexto {

    public static void main(String args[]) throws IOException {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos4();
            } else {
                mostrarFichero(args[0]);
            }
        } catch (ArgumentosIncorrectos4 error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java LeerFicheroTexto nomFichero");
        }

    }

    public static void mostrarFichero(String nomFichero) throws IOException {
        File fichero;
        FileReader flujoEntrada = null;

        try {
            fichero = new File(nomFichero);
            if (fichero.exists()) {
                flujoEntrada = new FileReader(fichero);
                char caracter;
                char eof = (char) -1;
                while ((caracter = (char) flujoEntrada.read()) != eof) {
                    System.out.print(caracter);
                }
            } else {
                throw new FicheroInexistente4();
            }
        } catch (FicheroInexistente4 error) {
            System.out.println("El Fichero No Existe");
        }
    }
}

class ArgumentosIncorrectos4 extends IOException {

    public ArgumentosIncorrectos4() {
        super();
    }
}

class FicheroInexistente4 extends FileNotFoundException {

    public FicheroInexistente4() {
        super();
    }
}
