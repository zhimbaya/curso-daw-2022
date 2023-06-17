package Tema06.Ejercicios;

/**
 * Implementa una clase llamada Email con las siguientes características:
 *
 * email de tipo String
 *
 * Constructor sin parámetros
 *
 * Constructor con un parámetro de tipo String que será el email
 *
 * Métodos:
 *
 * Get y Set
 *
 * boolean esCorrecto() comprueba que el email tenga el formato correcto. El
 * formato es correcto si incluye una @ y, después de la @, contiene al menos un
 * punto. No puede terminar con un punto.
 *
 * String toString() devuelve un String que será el atributo email
 *
 * @author Anuska
 */
public class _21Email {

    private String email;

    public _21Email() {

    }

    public _21Email(String e) {
        this.email = e;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean esCorrecto() {
        int arroba = email.indexOf('@');
        if (arroba == -1) {
            return false;
        }
        int punto = email.indexOf('.', arroba);
        if (punto == -1) {
            return false;
        }
        if (email.charAt(email.length() - 1) == '.') {
            return false;
        }
        return true;
    }

    public String toString() {
        return email;
    }

}
