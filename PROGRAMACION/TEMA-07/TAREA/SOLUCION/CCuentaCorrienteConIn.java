
import java.io.*;
import java.util.*;

public class CCuentaCorrienteConIn extends CCuentaCorriente {

    public CCuentaCorrienteConIn(String nombreTitular, String numCuenta, double saldo, double tipoInteres, int transacciones, double importePorTrans, int transExentas) {
        super(nombreTitular, numCuenta, saldo, tipoInteres, transacciones, importePorTrans, transExentas);
    }

    public CCuentaCorrienteConIn() {
    }

    public double intereses() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        double interes = 0;

        if (dia == 1) {
            if (getSaldo() >= 3000) {
                interes = (getSaldo() * getTipoInteres()) / 12;
            }

            ingreso(interes);
        }
        decrementarTransacciones();
        return interes;
    }
}
