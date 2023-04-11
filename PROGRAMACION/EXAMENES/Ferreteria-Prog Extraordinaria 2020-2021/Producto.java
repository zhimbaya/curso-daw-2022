/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra21;

import java.io.Serializable;

/**
 *
 * @author Profesor
 */
public abstract class  Producto implements Serializable{

    protected int codigo;
    protected String desc;
    protected double precio;
    
    public Producto(int c, String d, double p)
    {
        codigo = c;
        desc = d;
        precio = p;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDesc() {
        return desc;
    }


}
