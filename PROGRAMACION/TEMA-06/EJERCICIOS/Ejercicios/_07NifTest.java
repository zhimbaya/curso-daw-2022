/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.Ejercicios;

/**
 *
 * @author diego
 */
public class _07NifTest {
    public static void main(String[] args) {
        
        _07Nif dni1 = new _07Nif(999999999);
        System.out.println(dni1);
        
        _07Nif dni2 = new _07Nif();
        dni2.leer();
        System.out.println(dni2);
        
    }
    
}
