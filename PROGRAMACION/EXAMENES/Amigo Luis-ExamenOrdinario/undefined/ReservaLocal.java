/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barluis;

/**
 *
 * @author anusk
 */
public class ReservaLocal extends Reserva{
    
    private static final double PRECIO = 250;
    
    public ReservaLocal(int anio, int sem, String c)
    {
        super(anio,sem,c);
    }    
    
    @Override
    public double calcularPrecio()
    {
        return PRECIO;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\t"+calcularPrecio()+" €";
    }
}
