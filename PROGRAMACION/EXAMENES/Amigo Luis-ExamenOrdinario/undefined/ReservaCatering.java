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
public class ReservaCatering extends Reserva{
    
    private int nPersonas;
    private int horas;
    private static final double PRECIO_PERSONA = 25;
    private static final int HORAS_MIN = 2;
    private static final double HORA_ADC = 5;
    private static final double PERSONAS_MIN = 15;
    private static final double PERSONAS_MAX = 30;
    
    public ReservaCatering(int anio, int sem, String c,int nPersonas, int horas)
    {
        super(anio,sem,c);
        this.nPersonas = nPersonas;
        if (horas < 2)
            this.horas = 2;
        else
            this.horas = horas;
    }
    
    public static boolean esPersonasValido(int p)
    {
        return p>=PERSONAS_MIN && p<=PERSONAS_MAX;
    }
    
    @Override
    public double calcularPrecio()
    {
        return nPersonas*PRECIO_PERSONA + (horas-HORAS_MIN)*HORA_ADC*nPersonas;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\t"+nPersonas+" personas\t"+horas+" horas\t"+calcularPrecio()+" €";
                
    }
    
}
