/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carniceriamanolo;

import java.io.Serializable;

/**
 *
 * @author anusk
 */
public class Producto implements Serializable{
    
    private int codigo;
    private String desc;
    private int stock;
    private double precio;

    public Producto(int c, String d, int s, double p)
    {
        codigo = c;
        desc = d;
        stock = s;
        precio = p;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString()
    {
        return codigo+"\t"+desc+"\t"+stock+" unidades\t"+precio+" €/u";
    }
    
}
