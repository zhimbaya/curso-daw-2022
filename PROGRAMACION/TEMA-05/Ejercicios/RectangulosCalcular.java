package Tema05;

/**
 * Ejemplo de uso de la clase Rectangulo
 *
 *
 * Programa Principal (clase principal)
 */
public class RectangulosCalcular {

    public static void main(String[] args) {
        Rectangulo r1, r2;
        r1 = new Rectangulo();
        r2 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 10;
        r1.y2 = 10;
        r1.establecerNombre("rectangulo1");

        System.out.printf("PRUEBA DE USO DE LA CLASE RECTÁNGULO\n");
        System.out.printf("------------------------------------\n\n");
        System.out.printf("r1.x1: %4.2f\nr1.y1: %4.2f\n", r1.x1, r1.y1);
        System.out.printf("r1.x2: %4.2f\nr1.y2: %4.2f\n", r1.x2, r1.y2);
        System.out.printf("Perimetro: %4.2f\nSuperficie: %4.2f\n", r1.CalcularPerimetro(), r1.CalcularSuperficie());
        System.out.printf("DESPLAZAMOS X=3, Y=3\n");
        System.out.println("Nº de triangulos: "+Rectangulo.obtenerNumRectangulos());
        System.out.printf("r1.x1: %4.2f\nr1.y1: %4.2f\n", r1.x1, r1.y1);
        System.out.printf("r1.x2: %4.2f\nr1.y2: %4.2f\n", r1.x2, r1.y2);
    }
}
