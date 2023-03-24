/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa1006;

import java.util.Random;

public class Producto {
    
    private String nombre;
    private int cantidad;
    private double precio;
    
   private static int num=1;
   
   private String generarNombre()
   {
       return "Producto"+num++;
   }
   
   private int generarCantidad()
   {
       return (int)(Math.random()*10+1);
   }
   
   private double generarPrecio()
   {

       return (double)((int)(Math.random()*10000+1))/100;       
   }
   
   public Producto()
   {
       nombre = generarNombre();
       cantidad = generarCantidad();
       precio = generarPrecio();
   }
   
   public double precioTotal()
   {
       return cantidad * precio;
   }
   
    @Override
   public String toString()
   {
       return nombre+"\t"+cantidad+"\t"+precio+"\t"+precioTotal();
   }
    
}
