/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinario2021;

/**
 *
 * @author Profesor
 */
public class Paciente {

    private String nombre;
    private String telefono;
    private String pDosis;
    private Vacuna vacuna;

    public Paciente(String n, String t, String pDosis, Vacuna v)
    {
        nombre = n;
        telefono = t;
        this.pDosis = pDosis;
        vacuna = v;
    }

    public boolean dosisCompleta()
    {
        if (vacuna instanceof VMultidosis)
            return Fecha.fechaAlcanzada(Fecha.sumaSemanas(pDosis, ((VMultidosis)vacuna).getSemanas()));
        else
            return true;
    }

    public String toString()
    {
        String texto = nombre+"\t"+telefono+"\t"+vacuna.getNombre()+"\t(1) "+
                        pDosis;
        if (vacuna instanceof VMultidosis)
            texto+="\t (2) " + Fecha.sumaSemanas(pDosis, ((VMultidosis)vacuna).getSemanas());
        return texto;
    }   

}
