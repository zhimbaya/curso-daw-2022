package Tema07.Ejercicios;

public class _04TestFigura {

    public static void main(String args[]) {
        _04Triangulo t1 = new _04Triangulo(2, 4);
        _04Rectangulo r1 = new _04Rectangulo(4, 2);

        System.out.println("El Area del Triangulo es: " + t1.area());
        System.out.println("El Area del Rectangulo es: " + r1.area());
    }
}
