package Tema07;

/**
 *
 * @author diego
 */
public class _02Piano extends _02Instrumento {

    @Override
    public void tocarNota(String nota) {
        System.out.printf("Piano: tocar nota %s.\n", nota);
    }
}
