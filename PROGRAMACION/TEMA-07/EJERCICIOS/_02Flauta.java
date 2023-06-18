package Tema07;

/**
 *
 * @author diego
 */
public class _02Flauta extends _02Instrumento {

    @Override
    public void tocarNota(String nota) {
        System.out.printf("Flauta: tocar nota %s.\n", nota);
    }
}
