package Tema06.Ejercicios;

/**
 *
 * @author Anuska
 */
public class _16MatrizTraspTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        _16MatrizTrasp m = new _16MatrizTrasp(3, 4);
        m.cargar();
        System.out.println(m);
        System.out.println("La suma es " + m.suma());
        System.out.println("El máximo es " + m.maximo());
        System.out.println("El mínimo es " + m.minimo());
        System.out.println("El promedio es " + m.promedio());
        System.out.println("Matriz transpuesta\n" + m.transpuesta());

    }

}
