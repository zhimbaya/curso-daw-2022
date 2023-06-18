package Tema07.Ejercicios;

public class _04Rectangulo extends _04Figura {

    public _04Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return super.getBase() * getAltura();
    }
}
