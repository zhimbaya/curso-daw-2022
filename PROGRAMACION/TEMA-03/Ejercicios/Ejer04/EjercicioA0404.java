/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa0404;

public class EjercicioA0404 {

    public static void main(String[] args) {

        NIF nif = new NIF();
        nif.leer();
        System.out.println(nif);
        
        NIF nif2 = new NIF(123456);
        System.out.println(nif2);
    }
    
}
