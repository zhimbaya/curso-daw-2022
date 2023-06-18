
package ecompleto1;


public abstract class Producto {
    
    protected int ref;
    protected String desc;
    protected double precio;
    private static int cont = 1;
    
    public Producto(String d, double p)
    {
        ref = cont++;
        desc = d;
        precio = p;
    }

    public int getRef() {
        return ref;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString()
    {
        return ref+"\t"+desc+"\t"+precio+"€/";
    }
    
    
}
