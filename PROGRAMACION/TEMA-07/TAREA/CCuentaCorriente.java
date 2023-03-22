/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author diego
 */
public class CCuentaCorriente extends CCuenta {

    // Atributo
    protected int transacciones;
    protected double importePorTrans;
    protected int transExentas;

    //Métodos
    public CCuentaCorriente() {
    }

    public CCuentaCorriente(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, int transacciones, double importePorTrans, int transExentas) {
        super(nombreTitular, numCuenta, saldo, tipoDeInteres);
        transacciones = 0;
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }

    public void decrementarTransacciones() {
        transacciones -= 1;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }

    public double getImportePorTrans() {
        return importePorTrans;
    }

    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }

    public int getTransExentas() {
        return transExentas;
    }

    public void ingreso(double cantidad) {
        super.ingreso(cantidad);
        transacciones += 1;
    }

    public void reintegro(double cantidad) {
        super.reintegro(cantidad);
        transacciones += 1;
    }

    @Override
    public void comisiones() {
        GregorianCalendar calendario = new GregorianCalendar();
        int diaDelMes = calendario.get(Calendar.DAY_OF_MONTH);
        if (diaDelMes == 1) {
            double comisiones = (transacciones - getTransExentas()) * getImportePorTrans();
            if (comisiones > 0) {
                reintegro(getSaldo() - comisiones);
                System.out.println("Se han cobrado " + comisiones + " euros en comisiones.");
            }
            transacciones = 0;
        }
    }

    @Override
    public double intereses() {
        Calendar fecha = Calendar.getInstance();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        if (dia != 1) {
            return 0.0;
        }
        double intereses = 0.0;
        double saldoActual = getSaldo();
        if (saldoActual > 0.0) {
            if (saldoActual <= 3000.0) {
                intereses = saldoActual * 0.005;
            } else {
                intereses = (3000.0 * 0.005) + ((saldoActual - 3000.0) * getTipoInteres() / 100);
            }
            ingreso(intereses);
        }
        return intereses;
    }

}
