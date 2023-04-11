/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluditos;

/**
 *
 * @author anusk
 */
public class Gato extends Animal{
    public Gato(String n, int e)
    {
        super(n,e);
    }
    
    @Override
    public String toString()
    {
        return "Gato: "+super.toString();
    }
    
}
