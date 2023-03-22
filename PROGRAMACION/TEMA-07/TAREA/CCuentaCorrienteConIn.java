/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

/**
 *
 * @author diego
 */
public class CCuentaCorrienteConIn extends CCuentaCorriente {
    private static final double INTERES_BAJO = 0.5; // Interés para saldos menores a 3000 euros
    private static final double INTERES_ALTO = 1.0; // Interés para saldos iguales o mayores a 3000 euros
    

    public CCuentaCorrienteConIn() {
    }

    public CCuentaCorrienteConIn(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, int transacciones, double importePorTrans, int transExentas) {
        super(nombreTitular, numCuenta, saldo, tipoDeInteres,transacciones, importePorTrans, transExentas);
    }

    @Override
    public double intereses() {
        double interesMensual = 0.0;
        double saldo = this.getSaldo();

        if (saldo >= 3000) {
            interesMensual = (saldo * INTERES_ALTO) / 1200;
        } else {
            interesMensual = (saldo * INTERES_BAJO) / 1200;
        }

        ingreso(saldo + interesMensual);
        return interesMensual;
    }
}
