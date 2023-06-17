package Tema06.Ejercicios;

/**
 *
 * @author Anuska
 */
public class _18MatrizTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        _18Matriz m = new _18Matriz(3, 3);
        m.cargar();
        System.out.println(m);
        System.out.println("La fila con mayor suma es la " + m.maxFila());
        System.out.println("La fila con menor suma  es la " + m.minFila());
        System.out.println("La columna con mayor suma es la " + m.maxCol());
        System.out.println("La columna con menor suma es la " + m.minCol());

    }

}
