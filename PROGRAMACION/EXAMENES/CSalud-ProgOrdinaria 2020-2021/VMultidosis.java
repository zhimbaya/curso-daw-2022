/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinario2021;

/**
 *
 * @author Profesor
 */
public class VMultidosis extends Vacuna{

    private int semanas;

    public VMultidosis(String n, int s)
    {
        super(n);
        semanas = s;
    }
    public int getSemanas()
    {
        return semanas;
    }
    
}
