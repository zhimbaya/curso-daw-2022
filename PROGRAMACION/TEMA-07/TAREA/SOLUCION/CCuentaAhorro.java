package Tema07.SOLUCION;

import java.io.*;
import java.util.*;

public class CCuentaAhorro extends CCuenta {
    //Miembros dato

    private double cuotaMantenimiento;

    //Constructores
    public CCuentaAhorro(String nombreTitular, String numCuenta, double saldo, double tipoInteres, double cuotaMantenimiento) {
        super(nombreTitular, numCuenta, saldo, tipoInteres);
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public CCuentaAhorro() {
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    @Override
    public void comisiones() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        if (dia == 1) {
            reintegro(cuotaMantenimiento);
        }
    }

    @Override
    public double intereses() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        double intereses = 0.0;

        if (dia == 1) {
            intereses = (getSaldo() * getTipoInteres()) / 12;
            ingreso(intereses);
        }

        return intereses;
    }

}
