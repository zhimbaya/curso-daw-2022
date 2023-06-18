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
public class PUnidad extends Producto{
    
    public PUnidad(String d, double p)
    {
        super(d,p);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"u";
    }
    
}
