
import java.io.*;
import java.util.*;

public class CCuentaCorriente extends CCuenta {
    //Miembro Dato

    private int transacciones;
    private double importePorTrans;
    private int transExentas;

    //Constructores
    public CCuentaCorriente(String nombreTitular, String numCuenta, double saldo, double tipoInteres, int transacciones, double importePorTrans, int transExentas) {
        super(nombreTitular, numCuenta, saldo, tipoInteres);
        transacciones = 0;
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }

    public CCuentaCorriente() {
    }

    ////////////////////////////////////////////////////////////////////////////
    public void decrementarTransacciones() {
        transacciones--;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getTransacciones() {
        return transacciones;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }

    public double getImportePorTrans() {
        return importePorTrans;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void setTransExentas(double TransExentas) {
        this.transExentas = transExentas;
    }

    public double getTransExentas() {
        return transExentas;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void ingreso(double cantidad) {
        super.ingreso(cantidad);
        transacciones++;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void reintegro(double cantidad) {
        super.reintegro(cantidad);
        transacciones++;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void comisiones() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        double comision;

        if (dia == 1) {
            comision = (getTransacciones() - getTransExentas()) * getImportePorTrans();
            reintegro(comision);
            transacciones = 0;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public double intereses() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        double interes = 0.0;

        if (dia == 1) {
            if (getSaldo() <= 3000) {
                interes = (getSaldo() * 0.005) / 12;
            } else {
                interes = (((getSaldo() - 3000) * getTipoInteres()) + (3000 * 0.005)) / 12;
            }

            ingreso(interes);
        }
        decrementarTransacciones();
        return interes;
    }

}
