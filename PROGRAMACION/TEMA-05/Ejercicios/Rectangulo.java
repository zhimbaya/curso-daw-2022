package EjerciciosT5;

class Rectangulo { // Sin modificador "public" para que sólo sea accesible desde el paquete
	/*
	 * Imagina que quieres escribir una clase que represente un rectángullo en el
	 * plano. Para ello has pensado en los siguientes atributos: • Atributos x1, y1,
	 * que representan la coordenadas del vértice inferior izquierdo del rectángulo.
	 * Ambos de tipo double (números reales). • Atributos x2, y2, que representan
	 * las coordenadas del vértice superior derecho del rectángulo. También de tipo
	 * double (números reales). Con estos dos puntos (x1, y1) y (x2, y2) se puede
	 * de!nir perfectamente la ubicación de un rectángulo en el plano. Escribe una
	 * clase que contenga todos esos atributos teniendo en cuenta que queremos que
	 * sea una clase visible desde cualquier parte del programa y que sus atributos
	 * sean también accesibles desde cualquier parte del código.
	 * 
	 * Ampliar el ejercicio anterior del rectángulo incluyendo los siguientes
	 * atributos: • Atributo numRectangullos, que almacena el número de objetos de
	 * tipo rectángulo creados hasta el momento. • Atributo nombre, que almacena el
	 * nombre que se le quiera dar a cada rectángulo. • Atributo nombreFiigura, que
	 * almacena el nombre de la clase, es decir, "Rectángulo". • Atributo PI, que
	 * contiene el nombre de la constante PI con una precisión de cuatro cifras
	 * decimales. No se desea que los atributos nombre y numRectangullos puedan ser
	 * visibles desde fuera de la clase. Y además se desea que la clase sea
	 * accesible solamente desde su propio paquete.
	 */

	// Atributos de clase
	private static int numRectangulos; // Número total de rectángulos creados
	public static final String nombreFigura = "Rectángulo"; // Nombre de la clase
	public static final double PI = 3.1416; // Constante PI

	// Atributos de objeto
	private String nombre; // Nombre del rectángulo
	public double x1, y1; // Vértice inferior izquierdo
	public double x2, y2; // Vértice superior derecho

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
