package Tema03;

public class Cuenta {

    // Atributos
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    // Constructores
    public Cuenta() {
    }

    public Cuenta(String n, String num, double t, double s) {
        this.nombre = n;
        numeroCuenta = num;
        tipoInteres = t;
        saldo = s;
    }

    public Cuenta(Cuenta c) {
        this.nombre = c.nombre;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numero) {
        this.numeroCuenta = numero;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double cantidad) {

        if (cantidad >= 0) {
            saldo += cantidad;
            return true;
        } else {
            return false;
        }

    }

    public boolean reintegro(double cantidad) {
        if (cantidad >= 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferencia(Cuenta c, double cantidad) {

        if (reintegro(cantidad)) {
            c.ingreso(cantidad);
            return true;
        } else {
            return false;
        }

        /*
        * Es lo mismo que poner return reintegro(cantidad) && c.ingreso(cantidad);
        */
    }

}
