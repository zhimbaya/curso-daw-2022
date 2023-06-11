package Tema10;

/**
 * Escribe un programa denominado CrearFicheroTexto que se ejecute de la
 * siguiente forma: C:/> java CrearFicheroTexto texto.txt El programa deberá
 * controlar que el número de parámetros pasados a main es correcto y manejará
 * excepciones de tipo IOException. Si el número de argumentos es correcto,
 * invocará a un método denominado crearFichero(), donde se llevará a cabo la
 * creación del fichero de texto. En caso de que ya exista, le preguntaremos si
 * desea sobrescribirlo, validando la respuesta (s/n). Si el número de
 * parámetros no es correcto, lanzará una excepción propia indicando que los
 * parámetros son incorrectos y la sintaxis correcta para ejecutar el programa.
 * La información se procesará carácter a carácter, leyendo con método
 * System.in.read(), y casteando su salida con (char). Utilizar como flujo de
 * salida un FileWriter.
 */
import java.io.*;

public class CrearFicheroTexto {

    public static void main(String args[]) throws IOException {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos2();
            } else {

                crearFichero(args[0]);

            }
        } catch (ArgumentosIncorrectos2 error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java CrearFicheroTexto nomFichero");
        }
    }

    public static void crearFichero(String nomFichero) throws IOException {
        File fichero = null;
        FileWriter flujoSalida = null;
        char respuesta = 's';
        try {
            fichero = new File(nomFichero);

            if (fichero.exists()) {
                System.out.println("El Fichero Ya Existe ¿Desea Sobreescribirlo? (S/N): ");
                respuesta = getRespuesta();
            }

            if (respuesta == 's') {
                //Creamos el Flujo de Salida
                flujoSalida = new FileWriter(fichero);
                char caracter;
                char eof = (char) -1;
                System.out.println(eof);
                System.out.println("Escribe un Texto. Pulsa Control + Z para Finalizar");
                while ((caracter = (char) System.in.read()) != 'f') {
                    flujoSalida.write(caracter);
                }
            }//Fin Si

        }//Fin Try
        catch (IOException error) {
            System.out.println("Error de Entrada y Salida");
        } finally {
            if (flujoSalida != null) {
                flujoSalida.close();
            }
        }
    }

    public static char getRespuesta() {
        char respuesta = 's';
        boolean respuestaValida;

        try {
            do {
                respuesta = (char) System.in.read();
                respuesta = Character.toLowerCase(respuesta);
                respuestaValida = (respuesta == 's' || respuesta == 'n');
                if (!respuestaValida) {
                    System.out.println("La Respuesta No es Valida");
                }
            } while (!respuestaValida);
        } catch (IOException error) {
            System.out.println("Error de Entrada/Salida");
        }

        return respuesta;
    }
}

class ArgumentosIncorrectos2 extends Exception {

    public ArgumentosIncorrectos2() {
        super();
    }
}

