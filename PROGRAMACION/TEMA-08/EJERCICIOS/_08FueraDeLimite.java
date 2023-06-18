package Tema08;

/**
 *
 * @author diego
 */
public class _08FueraDeLimite {

    public static void main(String[] args) {
        String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};
        boolean fueradelimite = true;
        int i;
        int conteo = 0;
        while (fueradelimite) {
            try {
                i = (int) Math.round(Math.random() * 9);
                System.out.println("Array: " + texto[i]);
                fueradelimite = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fallo en el índice");
            } finally {
                conteo++;
            }
        }
        System.out.println("Nº de veces: " + conteo);
    }
}
