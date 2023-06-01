package Tema10;

/**
 * Escribe un fuente denominado PropiedadesFiichero que se ejecute de la
 * siguiente forma: java PropiedadesFichero nomFich1 nomFich2.... (es decir, que
 * maneje parámetros del main). Crea una Exceptiion propia si el número de
 * argumentos no es correcto (será incorrecto cuando no pasemos ningún
 * parámetro, es decir, 0 !cheros, y será correcto, cuando pasemos uno o más).
 * En caso de que el !chero exista, invoca a un método denominado propiiedades()
 * que haga lo siguiente (esto lo hará para cada uno de los !cheros pasados como
 * parámetros): Si el !chero es ordinario, lo indica y muestra en pantalla:
 * nombre, .camino absoluto, camino relativo, si se puede leer y si se puede
 * modi!car; si no, si es un directorio muestra la lista del los !cheros que
 * están en ese path.
 */
import java.io.*;
import java.lang.*;

public class PropiedadesFicheros {

    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                throw new ArgumentosIncorrectos();
            } else {
                for (int i = 0; i < args.length; i++) {
                    File fichero = new File(args[i]);
                    if (!fichero.exists()) {
                        throw new FicheroInexistente();
                    } else {
                        nomFichero(fichero);
                    }
                }
            }
        } catch (ArgumentosIncorrectos error) {
            System.out.println("El Numero de Argumentos es Incorrecto");
        } catch (FicheroInexistente error) {
            System.out.println("El Fichero no Existe");
        }
    }

    public static void nomFichero(File nomFichero) {

        if (nomFichero.isFile()) {
            System.out.println("El Nombre del Fichero es: " + nomFichero.getName());
            System.out.println("La Ruta Absoluta del Fichero es: " + nomFichero.getAbsolutePath());
            System.out.println("La Ruta Relativa del Fichero es: " + nomFichero.getPath());

            if (nomFichero.canRead()) {
                System.out.println("El Fichero se Puede Leer");
            } else {
                System.out.println("El Fichero No se Puede Leer");
            }

            if (nomFichero.canWrite()) {
                System.out.println("El Fichero se Puede Escribir");
            } else {
                System.out.println("El Fichero No se Puede Escribir");
            }
        } else {
            if (nomFichero.isDirectory()) {
                String nomFicheros[] = nomFichero.list();
                for (int i = 0; i < nomFicheros.length; i++) {
                    System.out.println(nomFicheros[i]);
                }
            }
        }
    }
}

class ArgumentosIncorrectos extends IOException {

    public ArgumentosIncorrectos() {
        super();
    }
}

class FicheroInexistente extends FileNotFoundException {

    public FicheroInexistente() {
        super();
    }
}
