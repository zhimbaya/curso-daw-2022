
import java.io.*;
import java.util.*;

public abstract class CCuenta {
    //Miembros dato

    private String nombreTitular;
    private String numCuenta;
    private double saldo;
    private double tipoInteres;

    //Constructores
    public CCuenta(String nombreTitular, String numCuenta, double saldo, double tipoInteres) {
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
        ingreso(saldo);
        this.tipoInteres = tipoInteres;
    }

    public CCuenta() {
    }

    //Metodos set
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    //Metodos get
    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    ////////////////////////////////////////////////////////////////////////////
    public abstract void comisiones();

    ////////////////////////////////////////////////////////////////////////////
    public void ingreso(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La Cantidad a Ingresar debe ser > 0");
        } else {
            saldo = saldo + cantidad;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public void reintegro(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("El Saldo que hay en su Cuenta no es suficiente");
        } else {
            saldo = saldo - cantidad;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public abstract double intereses();

}
