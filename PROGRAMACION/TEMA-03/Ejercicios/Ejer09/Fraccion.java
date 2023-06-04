package Tema03;

public class Fraccion {

    // Atributos
    private int num = 0;
    private int den = 1;

    // Constructores
    public Fraccion() {
    }

    public Fraccion(int n) {
        num = n;
    }

    public Fraccion(int n, int d) {
        num = n;
        den = d;
    }

    public Fraccion sumar(Fraccion f) {
        Fraccion suma = new Fraccion(num * f.den + den * f.num, den * f.den);
        return suma;
    }

    public Fraccion restar(Fraccion f) {
        return new Fraccion(num * f.den - den * f.num, den * f.den);
    }

    public Fraccion multiplicar(Fraccion f) {
        return new Fraccion(num * f.num, den * f.den);
    }

    public Fraccion dividir(Fraccion f) {
        return new Fraccion(num * f.den, den * f.num);
    }

    public String toString() {
        simplificar();
        return num + "/" + den;
    }

    private void simplificar() {
        int m_c_d = mcd();
        num = num / mcd();
        den = den / m_c_d;
    }

    private int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

}
