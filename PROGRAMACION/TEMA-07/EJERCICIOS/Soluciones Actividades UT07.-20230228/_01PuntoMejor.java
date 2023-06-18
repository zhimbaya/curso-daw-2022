package Tema07.Ejercicios;

public class _01PuntoMejor extends _01Punto {

    //Constructores
    public _01PuntoMejor(double x, double y) {
        super(x, y);
    }

    public static double distanciaPuntos(_01Punto p1, _01Punto p2) {
        double distancia;
        distancia = Math.sqrt(((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())) 
                + ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY())));
        return distancia;
    }

    public double distanciaPuntos(_01Punto p) {
        double distancia;
        distancia = Math.sqrt(((p.getX() - this.getX()) * (p.getX() - this.getX())) 
                + ((p.getY() - this.getY()) * (p.getY() - this.getY())));
        return distancia;
    }
}
