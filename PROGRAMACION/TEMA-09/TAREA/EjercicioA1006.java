/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa1006;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anuska
 */
public class EjercicioA1006 {

    
    
    public static ArrayList<Producto> generarLista()
    {
        int n = (int)(Math.random()*8+1);
        ArrayList<Producto> c = new ArrayList<Producto>();
        for (int i = 0; i < n; i++)
        {
            c.add(new Producto());
        }
        return c;
    }
    
    public static void mostrarTicket(ArrayList<Producto> c)
    {
        System.out.println("***********Cantidad****Precio*****Total");
        Iterator<Producto> it = c.iterator();
        double total = 0;
        while(it.hasNext())
        {
            Producto p = it.next();
            System.out.println(p);
            total += p.precioTotal();
        }
        
        System.out.println("Precio final\t\t\t"+total);
    }
    
    public static void main(String[] args) {
        ArrayList<Producto> compra = generarLista();
        mostrarTicket(compra);
        
    }
    
}
