package Tema06.Ejercicios;

/**
 *
 * @author Anuska
 */
public class _05VecIntTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        _05VecInt v = new _05VecInt(10);
        v.cargar(1, 4);
        System.out.println(v);
        System.out.println("SUMA = " + v.suma());
        System.out.println("PROMEDIO = " + v.promedio());
        System.out.println("MODA = " + v.moda());

    }

}
