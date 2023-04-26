package Tema10;

import java.io.*;
import java.lang.*;

public class LeerFicheroTextoLinea {

    public static void main(String args[]) throws IOException {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos();
            } else {
                File fichero = new File(args[0]);

                if (fichero.exists()) {
                    mostrarFichero(fichero);
                } else {
                    throw new FicheroInexistente();
                }
            }
        } ////////////////////////////////////////////////////////////////////////
        catch (ArgumentosIncorrectos error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java CrearFicheroTexto nomFichero");
        } catch (FicheroInexistente error) {
            System.out.println("El Fichero No Existe");
        }

    }

    ////////////////////////////////////////////////////////////////////////////
    public static void mostrarFichero(File fichero) {
        BufferedReader flujoEntrada = null;

        try {
            flujoEntrada = new BufferedReader(new FileReader(fichero));
            String linea;
            String eof = null;
            while ((linea = flujoEntrada.readLine()) != eof) {
                System.out.print(linea + "\n");
            }
        } catch (FileNotFoundException error) {
            System.out.println("");
        } catch (IOException error) {
            System.out.println("Error al Crear el Flujo o al Leer");
        } finally {
            try {
                flujoEntrada.close();
            } catch (IOException error) {
                System.out.println("Error al Cerrar el Flujo de Entrada");
            }
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
