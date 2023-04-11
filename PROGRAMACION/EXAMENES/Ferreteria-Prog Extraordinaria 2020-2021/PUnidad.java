/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra21;

/**
 *
 * @author Profesor
 */
public class PUnidad extends Producto{

    public PUnidad(int c, String d, double p)
    {
        super(c,d,p);
    }
    

    @Override
    public String toString()
    {
        return codigo+"\t"+desc+"\t"+precio+"€/unidad";
    }
    
}
