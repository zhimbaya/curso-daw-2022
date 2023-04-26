package Tema10;

/*3)Repite el ejercicio anterior procesando la informaci�n l�nea a l�nea.
 El fuente se puede llamar CrearFicheroTextoLineas.*/
import java.io.*;
import java.lang.*;

public class CrearFicheroTextoLinea {

    public static void main(String args[]) throws IOException {
        try {
            if (args.length != 1) {
                throw new ArgumentosIncorrectos();
            } else {
                crearFichero(args[0]);
            }
        } ////////////////////////////////////////////////////////////////////////
        catch (ArgumentosIncorrectos error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
            System.out.println("Sintaxis: java CrearFicheroTexto nomFichero");
        }
    }

    ////////////////////////////////////////////////////////////////////////////
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

    ////////////////////////////////////////////////////////////////////////////
    public static void crearFichero(String nomFichero) throws IOException {
        File fichero = new File(nomFichero);
        FileWriter flujoSalida = null;
        char respuesta = 's';

        try {
            if (fichero.exists()) {
                System.out.print("El Fichero Ya Existe �Desea Sobreescribirlo? (S/N): ");
                respuesta = getRespuesta();
            }//Fin Si

            if (respuesta == 's') {
                //Creamos el Flujo de Salida
                BufferedReader flujoLector = new BufferedReader(new InputStreamReader(System.in));
                flujoSalida = new FileWriter(fichero);
                String linea = null;
                String eof = null;
                System.out.println("Escribe un Texto. Pulsa Control + Z para Finalizar");
                while ((linea = flujoLector.readLine()) != eof) {
                    flujoSalida.write(linea + "\n");
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
}

////////////////////////////////////////////////////////////////////////////////
class ArgumentosIncorrectos extends Exception {

    public ArgumentosIncorrectos() {
        super();
    }
}
