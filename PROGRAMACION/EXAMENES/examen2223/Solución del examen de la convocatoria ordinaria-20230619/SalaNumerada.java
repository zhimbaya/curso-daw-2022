
package cine;


public class SalaNumerada extends Sala{
    
    private boolean[][] butacas;
    
    public SalaNumerada(String t,int f, int c)
    {
        super(t);
        butacas = new boolean[f][c];
    }
    
    @Override
    public int numDisponibles()
    {
        int n = 0;
        for (int i = 0; i < butacas.length; i++)
            for (int j = 0; j < butacas[i].length; j++)
                if (!butacas[i][j])
                    n++;
        return n;
    }
    
    public void mostrarButacas()
    {
        System.out.println("Butacas: _ (libre) x (ocupada)");
               
        for (int i = 0; i < butacas.length; i++)
        {
            System.out.print("Fila "+(i+1)+": ");
            for (int j = 0; j < butacas[i].length; j++)
            {
                System.out.print(((butacas[i][j])?"x":"_")+" ");
            }
            System.out.println();
        }
    }
    
    public int numDisponibles(int f,int c)
    {
        int n = 0;
        for (int i = f; i < butacas.length; i++)
        {
            for (int j = c; j < butacas[i].length; j++)
            {
                if (!butacas[i][j])
                    n++;
               
            }
            c = 0;
        }
        return n;
    }
    
    public String  reservar(int n,int f, int c)
    {
        String e= "";
        int cont = 1;
        for (int i = f; i < butacas.length && cont<=n; i++)
        {
            for (int j = c; j < butacas[i].length && cont<=n; j++)
            {
                if (!butacas[i][j])
                {                    
                    butacas[i][j] = true;
                    e+="\nEntrada "+cont+": Fila "+(i+1)+" Butaca "+(j+1);
                    cont++;
                }
               
            }
            c = 0;
        }
        return e;
    };
    
    @Override
    public void venderEntradas()
    {
        mostrarButacas();
        int nentradas = Util.leerInt("Número de entradas: ");
        int fila = Util.leerInt("Indica a partir de qué fila (1-"+butacas.length+"): ",1,butacas.length);
        int col = Util.leerInt("Indica a partir de qué butaca de la fila "+fila
                + "(1-"+butacas[0].length+"): ",1,butacas[0].length);
        int disp = numDisponibles(fila-1, col-1);
        if (disp>=nentradas)
        {
            String entradas = reservar(nentradas,fila-1, col-1);
            System.out.println("Entradas reservadas: \n"+entradas);
            Util.guardarFicheroTexto("Sala: "+numSala+
                                 "\nTítulo: "+titulo+
                                 "\nNº Entradas: "+nentradas+
                                 "\nEntradas asignadas:\n"+entradas);
        }
        else
            System.out.println("No hay entradas disponibles a partir de la fila "+fila+
                    " y la butaca "+col);
        
        
        
    }
    
    @Override
    public void vaciarSala()
    {
        for (int i = 0; i < butacas.length; i++)
            for (int j = 0; j < butacas[i].length; j++)
                butacas[i][j] = false;
    }
    
}
