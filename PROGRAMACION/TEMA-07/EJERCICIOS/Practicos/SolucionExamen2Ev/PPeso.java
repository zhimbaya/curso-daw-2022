/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecompleto1;

/**
 *
 * @author anusk
 */
public class PPeso extends Producto implements AlPeso{
    
    public PPeso(String d, double p)
    {
        super(d,p);
    }
    
    public String mostrar(int gr)
    {
        return ref+"\t"+desc+"\t"+gr+"gr\t"+calcularPrecio(gr)+"€";
    }
    
    @Override
    public double calcularPrecio(int peso)
    {
        return peso*precio/1000;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"Kg";
    }
    
}
