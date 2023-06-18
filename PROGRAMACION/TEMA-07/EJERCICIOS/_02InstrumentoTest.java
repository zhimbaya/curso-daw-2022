package Tema07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author diego
 */
public class _02InstrumentoTest {

    public static void main(String[] args) {

        String tipo = null;
        String nota = null;

        _02Instrumento instrumento1 = null;
        // Elección
        do {
            System.out.println("Elija un instrumento: flauta(F) o piano(P) o (X) para salir: ");
            
            try {
                tipo = lecturaTeclado();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
            if (tipo.equals("P") || tipo.equals("p")) {
                tipo = "piano";
            } else if (tipo.equals("F") || tipo.equals("f")) {
                tipo = "flauta";
            } else {
                tipo = "X";
            }
                    
        } while (tipo.equals("X"));

        // Nota musical
        System.out.println("Escriba nota musical: ");
        try {
            nota = lecturaTeclado();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // Creación del objeto instrumento1 (desconocido en tiempo de compilación)
        // Sabemos que será subclase de _02Instrumento, pero no sabemos si será _02Flauta o _02Piano 
        // (dependerá de la ejecución)
        if (tipo.equals("piano")) {
            instrumento1 = new _02Piano(); // Ejemplo de objeto polimórfico (puede ser _02Piano o _02Flauta) 
        } else if (tipo.equals("flauta")) {
            instrumento1 = new _02Flauta(); // Ejemplo de objeto polimórfico (puede ser _02Piano o _02Flauta)
        } else {
        }
        // Interpretamos una nota con el objeto instrumento1
        // No sabemos si se ejecutará el método tocarNota de _02Piano o de Faluta
        // (dependerá de la ejecución)
        instrumento1.tocarNota(nota); // Ejemplo de ligadura dinámica (tiempo de ejecución)
    }

    private static String lecturaTeclado() throws Exception {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            throw e;
        }
    }
}
