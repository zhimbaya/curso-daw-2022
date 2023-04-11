/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barluis;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Reserva implements Serializable{
    protected int id;
    protected String cliente;
    
    public Reserva (int anio, int sem, String c)
    {
        id = generarId(anio,sem);
        cliente = c;
    }
    
    public static int generarId(int a,int s)
    {
        return a*100 + s;
    }
    
    public static boolean esSemanaValida(int s)
    {
        return s>=1 && s<=53;
    }
    
    public int getId()
    {
        return id;
    }
    
    @Override
    public String toString()
    {
        return id+"\t"+cliente;
    }
    
    public abstract double calcularPrecio();
            
    
}
