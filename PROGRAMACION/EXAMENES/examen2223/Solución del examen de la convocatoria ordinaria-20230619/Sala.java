
package cine;

import java.io.Serializable;


public abstract class Sala implements Serializable{
    
    protected int numSala;
    protected String titulo;
    
    private static int contador = 1;
    
    public Sala(String t)
    {
        numSala = contador++;
        titulo = t;
    }
   
    public int getNumSala()
    {
        return numSala;
    }
    
    public void setTitulo(String t)
    {
        titulo = t;
    }
    
    public static void setContador(int c)
    {
        contador = c;
    }
    
    public static int getContador()
    {
        return contador;
    }
    
    public abstract void venderEntradas();
    public abstract int numDisponibles();
    public abstract void vaciarSala();
    
    @Override
    public String toString()
    {
        return numSala+"\t"+titulo+"\t"+numDisponibles();
    }
    
}
