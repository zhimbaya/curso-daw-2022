/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5;

/**
 *
 * @author diego
 */
public class DniCalcular {

    public static void main(String[] args) throws Exception {
        DNI dniDiego = new DNI();
        
        //int dniNumero = 2562559;
        String dniLetra = "2562559Z";
        
        //dniDiego.establecer(dniNumero);
        dniDiego.establecer(dniLetra);
        
        System.out.println("El nº de DNI es: "+dniDiego.obtenerDNI());
        System.out.println("Mi NIF es: "+dniDiego.obtenerNIF());
        
    }

}
