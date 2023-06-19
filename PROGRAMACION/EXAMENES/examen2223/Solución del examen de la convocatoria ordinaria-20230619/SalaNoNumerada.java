
package cine;


public class SalaNoNumerada extends Sala{
    
    private int numButacas;
    private int disponibles;
    
    public SalaNoNumerada(String t,int n)
    {
        super(t);
        numButacas = n;
        disponibles = n;
    }
    
    @Override
    public void venderEntradas()
    {
        int entradas = Util.leerInt("Número de entradas: ");
        if (entradas>disponibles)
            System.out.println("No hay entradas suficientes");
        else
        {
            disponibles-=entradas;
            Util.guardarFicheroTexto("Sala: "+numSala+
                                 "\nTítulo: "+titulo+
                                 "\nNº Entradas: "+entradas);
        }
        
        
        
    }
    
    @Override
    public int numDisponibles()
    {
        return disponibles;
    }
    
    @Override
    public void vaciarSala()
    {
        disponibles = numButacas;
    }
    
}
