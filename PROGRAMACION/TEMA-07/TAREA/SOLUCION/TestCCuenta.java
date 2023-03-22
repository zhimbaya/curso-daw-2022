
import java.io.*;
import java.util.*;

public class TestCCuenta {

    public static void main(String[] args) throws IOException {
        CCuentaAhorro cliente01 = new CCuentaAhorro("Angel Lillo", "111/6666", 10000, 3.5, 30);

        System.out.println(cliente01.getNombreTitular());
        System.out.println(cliente01.getNumCuenta());
        System.out.println(cliente01.getSaldo());
        System.out.println(cliente01.getTipoInteres());
        System.out.println(cliente01.intereses());

        CCuentaCorrienteConIn cliente02 = new CCuentaCorrienteConIn();

        cliente02.setNombreTitular("Ainhoa");
        cliente02.setNumCuenta("1234567890");
        cliente02.setTipoInteres(3.0);
        cliente02.setTransExentas(0);
        cliente02.setImportePorTrans(1.0);

        cliente02.ingreso(20000);
        cliente02.reintegro(10000);
        cliente02.intereses();
        cliente02.comisiones();

        System.out.println();
        System.out.println(cliente02.getNombreTitular());
        System.out.println(cliente02.getNumCuenta());
        System.out.println(cliente02.getSaldo());
    }
}
