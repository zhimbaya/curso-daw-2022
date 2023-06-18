package Tema08;

//Maneja una excepci�n definida por el usuario
import java.io.*;

public class _05Notasv3 {

    public static void main(String args[]) throws IOException {
        double media = 0, total = 0, notanum = 0;
        int contador = 0;
        String notatext = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while (!notatext.equals("Z")) {
            try {
                System.out.print("Teclee una calificación (1-10),Z para terminar:");

                notatext = entrada.readLine().toUpperCase();
                notanum = Double.valueOf(notatext).doubleValue();
                if (notanum < 0 || notanum > 10) {
                    throw new NotaMal();
                }
                total += notanum;
                contador++;
            } catch (NotaMal objeto) {
                System.out.println("\nNota debe estar entre 0 y 10");
            } catch (NumberFormatException objeto) {
                if (!notatext.equals("Z")) {
                    System.out.println("\nError de formato númerico: " + objeto.toString());
                }
            }
        }

        if (contador != 0) {
            media = (double) total / contador;
            System.out.println("\n Nota Media = " + media);
        } else {
            System.out.println("\n No se introdujeron calificaciones");
        }

        //char c = (char) System.in.read();
    }
}

//clase derivada de exception
class NotaMal extends Exception {

    public NotaMal() { //esta excepcion no existe en Java. La ha creado el programador.
        super();
    }
}
