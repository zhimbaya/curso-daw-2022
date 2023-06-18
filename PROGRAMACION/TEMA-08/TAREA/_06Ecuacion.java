package Tema08;

/**
 * Este es el autor. Ecuación de segundo grado con excepciones.
 *
 * @author diego

 Definir la clase _06Ecuacion que se corresponde con una ecuación de segundo
 grado con coeficientes a, b y c (debe obedecer a la presentación
 ax^2+bx+c=0).

 La clase _06Ecuacion tendrá al menos un constructor con los tres parámetros (a,
 b y c) y un método resolver que mostrará por pantalla la solución o
 soluciones de la ecuación.

 El método solución lanzará una excepción llamada _06EcuacionException definida
 por el alumno y que irá en un archivo independiente al de la clase _06Ecuacion y
 que será lanzada cuando se produzcan las siguientes situaciones:

 a) Si a y b son iguales a 0 lanzará una excepción _06EcuacionException y
 mostrará un mensaje indicando que la ecuación es degenerada.

 b) Si el discriminante es menor que 0 lanzará una excepción _06EcuacionException
 y mostrará un mensaje indicando que las raíces son complejas.

 Recuerda que el discriminante es b al cuadrado menos 4*a*c. Si a == 0 y b!= 0
 la ecuación tiene una única raíz igual a – c/b y si el discriminante es 0, la
 raíz también es única.

 Si es necesario puedes utilizar los métodos de la clase Math.

 Se deberá entregar dos ficheros _06EcuacionException.java y _06Ecuacion.java sin
 comprimir.
 */
public class _06Ecuacion {

    private double a, b, c;

    /**
     * Constructor vacio
     */
    public _06Ecuacion() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param a parámetro a
     * @param b parámetro b
     * @param c parámetro c
     */
    public _06Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Método resolver que llama a la clase _06EcuacionException.
     *
     * @throws _06EcuacionException , se llama a la excepción.
     */
    public void resolver() throws _06EcuacionException {
        if (a == 0 && b == 0) {
            throw new _06EcuacionException("La ecuación es degenerada.");
        } else {
            double discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                throw new _06EcuacionException("Las raíces son complejas.");
            } else if (discriminante == 0) {
                double solucion = -b / (2 * a);
                System.out.println("La ecuación tiene una solución: " + solucion);
            } else if (a == 0 && b != 0) {
                double solucion = -c / b;
                System.out.println("La ecuación tiene una única raíz: " + solucion);
            } else {
                double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones: " + solucion1 + " y " + solucion2);
            }
        }
    }

    /**
     * Método principal del proyecto.
     *
     * @param args , paso de parámetros al método main.
     */
    public static void main(String[] args) {
        _06Ecuacion ecuacion = new _06Ecuacion(0, 0, 5);
        try {
            ecuacion.resolver();
        } catch (_06EcuacionException e) {
            System.out.println("La excepción es:" + e.getMessage());
        }
    }

}
