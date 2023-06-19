/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra21;

/**
 *
 * @author Profesor
 */
public class PPeso extends Producto implements AlPeso{

    public PPeso(int c, String d, double p)
    {
        super(c,d,p);
    }
    
    @Override
    public double calcularPrecio(int g)
    {
        return g*precio/1000;
    }

    @Override
    public String toString()
    {
        return codigo+"\t"+desc+"\t"+precio+"€/kilo";
    }
    
}
