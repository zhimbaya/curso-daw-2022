package Tema10;


import java.io.*;

public class MostrarListaTfnos {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos();
            } else {
                File fichero = new File(args[0]);

                if (fichero.exists()) {
                    mostrarFichero(fichero);
                } else {
                    throw new FileNotFoundException();
                }
            }
        } catch (ArgumentosIncorrectos error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java MostrarListaTfnos nomFichero");
        } catch (FileNotFoundException error) {
            System.out.println("El Fichero " + args[0] + " No Existe");
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void mostrarFichero(File fichero) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));

            do {
                System.out.println("Nombre: " + dis.readUTF());
                System.out.println("Direccion: " + dis.readUTF());
                System.out.println("Telefono: " + dis.readLong());
            } while (true);
        } catch (EOFException error) {
            System.out.println("Hemos LLegado al Fin del Fichero");
        } catch (IOException error) {
            System.out.println("Error de Entrada/Salida");
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException error) {
                System.out.println("Error al Cerrar el Flujo de Lectura");
            }
        }
    }
}

class ArgumentosIncorrectos extends Exception {

    public ArgumentosIncorrectos() {
        super();
    }
}
