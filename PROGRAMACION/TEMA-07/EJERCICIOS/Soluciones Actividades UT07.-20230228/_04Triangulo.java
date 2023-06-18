package Tema07.Ejercicios;

public class _04Triangulo extends _04Figura {

    public _04Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return getBase() * getAltura() / 2;
    }
}
