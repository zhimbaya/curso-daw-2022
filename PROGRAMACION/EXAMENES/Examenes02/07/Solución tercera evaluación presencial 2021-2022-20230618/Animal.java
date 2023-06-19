/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluditos;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public abstract class Animal implements Serializable{
    
    protected int id;
    protected String nombre;
    protected int edad;
    protected boolean reservado;
    
    protected static int contador = 1;
    
    public Animal(String n, int e)
    {
        id = contador++;
        nombre = n;
        edad = e;
        reservado = false;
    }

    public int getId() {
        return id;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    public void reservar() {
        this.reservado = true;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animal.contador = contador;
    }
    
    public void cancelarReserva() {
        this.reservado = false;
    }
    
    @Override
    public String toString()
    {
        return id+"\t"+nombre+"\t"+edad+" meses\t"+((reservado)?"Reservado":"No reservado");
    }
    
}
