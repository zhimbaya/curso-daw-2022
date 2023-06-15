package Tema05;

/**
 *
 * @author diego
 */
/**
 * ----------------------------------------------------------------

 Clase Dni

 ----------------------------------------------------------------
 */
public class Dni {

    // Atributos estáticos
    // Cadena con las letras posibles del Dni ordenados para el cálculo de Dni
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    // Atributos de objeto
    private int numDNI;

    // Métodos
    public String obtenerNIF() {
        // Variables locales
        String cadenaNIF;   // NIF con letra para devolver
        char letraNIF;      // Letra del número de NIF calculado
        // Cálculo de la letra del NIF       
        letraNIF = Dni.calcularLetraNIF(numDNI);
        // Construcción de la cadena del Dni: número + letra
        cadenaNIF = Integer.toString(numDNI) + String.valueOf(letraNIF);
        // Devolución del resultado
        return cadenaNIF;
    }

    public int obtenerDNI() {
        return numDNI;
    }

    public void establecer(String nif) throws Exception {

        if (Dni.validarNIF(nif)) { // Valor válido: lo almacenamos
            this.numDNI = Dni.extraerNumeroNIF(nif);
        } else { // Valor inválido: lanzamos una excepción
            throw new Exception("NIF inválido: " + nif);
        }
    }

    public void establecer(int dni) throws Exception {

        // Comprobación de rangos
        if (dni > 999999 && dni < 99999999) {
            this.numDNI = dni; // Valor válido: lo almacenamos
        } else { // Valor inválido: lanzamos una excepción
            throw new Exception("DNI inválido: " + String.valueOf(dni));
        }
    }

    private static char calcularLetraNIF(int dni) {
        char letra;
        // Cálculo de la letra NIF
        letra = LETRAS_DNI.charAt(dni % 23);
        // Devolución de la letra NIF
        return letra;
    }

    private static char extraerLetraNIF(String nif) {
        char letra = nif.charAt(nif.length() - 1);
        return letra;
    }

    private static int extraerNumeroNIF(String nif) {
        int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
        return numero;
    }

    private static boolean validarNIF(String nif) {

        boolean valido = true;   // Suponemos el NIF válido mientras no se encuentre algún fallo
        char letra_calculada;
        char letra_leida;
        int dni_leido;
        if (nif == null) {  // El parámetro debe ser un objeto no vacío
            valido = false;
        } else if (nif.length() < 8 || nif.length() > 9) {    // La cadena debe estar entre 8(7+1) y 9(8+1) caracteres
            valido = false;
        } else {

            letra_leida = Dni.extraerLetraNIF(nif);    // Extraemos la letra de NIF (letra)
            dni_leido = Dni.extraerNumeroNIF(nif);  // Extraemos el número de Dni (int)
            letra_calculada = Dni.calcularLetraNIF(dni_leido);  // Calculamos la letra de NIF a partir del número extraído
            if (letra_leida == letra_calculada) {   // Comparamos la letra extraída con la calculada

                // Todas las comprobaciones han resultado válidas. El NIF es válido.
                valido = true;
            } else {
                valido = false;
            }
        }
        return valido;
    }
}
