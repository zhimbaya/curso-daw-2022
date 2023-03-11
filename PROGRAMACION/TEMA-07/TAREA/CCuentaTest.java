/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema07;

import java.io.IOException;

/**
 *
 * @author diego
 */
public class CCuentaTest {

    public static void main(String[] args) throws IOException {
        
        // Cliente 1

        CCuentaAhorro cliente01 = new CCuentaAhorro("Angel Lillo", "111/6666", 10000, 3.5, 30);

        System.out.println("Nombre: " + cliente01.getNombre());

        System.out.println("Cuenta: " + cliente01.getCuenta());

        System.out.println("Saldo: " + cliente01.getSaldo());

        System.out.println("Tipo de Interes: " + cliente01.getTipoInteres());

        System.out.println("Intereses: " + cliente01.intereses());
        
        // Cliente 2

        CCuentaCorrienteConIn cliente02 = new CCuentaCorrienteConIn();

        cliente02.setNombre("Ainhoa");

        cliente02.setCuenta("1234567890");

        cliente02.setTipoInteres(3.0);

        cliente02.setTransExentas(0);

        cliente02.setImportePorTrans(1.0);

        cliente02.ingreso(20000);

        cliente02.reintegro(10000);

        cliente02.intereses();

        cliente02.comisiones();

        System.out.println(cliente02.getNombre());

        System.out.println(cliente02.getCuenta());

        System.out.println(cliente02.getSaldo());

    }

}
