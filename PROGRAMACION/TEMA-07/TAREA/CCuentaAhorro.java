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
public class CCuentaAhorro extends CCuenta {

    // Atributos
    protected double cuotaMantenimiento;

    // Métodos
    public CCuentaAhorro() {
    }

    public CCuentaAhorro(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
        super(nombreTitular, numCuenta, saldo, tipoDeInteres);
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public void setCuotaManten(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public double getCuotaMante() {
        return cuotaMantenimiento;
    }

    @Override
    public void comisiones() {
        GregorianCalendar calendario = new GregorianCalendar();
        int diaDelMes = calendario.get(Calendar.DAY_OF_MONTH);
        if (diaDelMes == 1) {
            double cuota = getCuotaMante();
            ingreso(cuota);
        }
    }

    @Override
    public double intereses() {
        Calendar fecha = Calendar.getInstance();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        if (dia != 1) {
            return 0.0;
        }
        double intereses = getSaldo() * getTipoInteres() / 12.0;
        ingreso(intereses);
        return intereses;
    }

}
