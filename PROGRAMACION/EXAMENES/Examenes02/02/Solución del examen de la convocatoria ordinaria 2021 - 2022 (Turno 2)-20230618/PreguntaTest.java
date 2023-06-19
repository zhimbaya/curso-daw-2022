/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donmarciano;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class PreguntaTest implements Serializable{
    private String pregunta;
    private ArrayList<Respuesta> respuestas;
    
    public PreguntaTest(String pregunta)
    {
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<Respuesta>();
    }
    
    public void anadirRespuestas()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Indica todas las posibles respuestas y si son correctas o no. Termina con la respuesta \"fin\"\n");
        System.out.print("Respuesta: ");
        String r = sc.nextLine();
        while (!r.equalsIgnoreCase("fin"))
        {
            
            System.out.println("¿Es una respuesta correcta? ");
            int c = Util.leerSiNo();
            boolean correcta = ((c==1)?true:false);
            respuestas.add(new Respuesta(r,correcta));
            System.out.print("Respuesta: ");
            r = sc.nextLine();
        }
    }
    
    @Override
    public String toString()
    {
        String t = pregunta;
        Iterator<Respuesta> it = respuestas.iterator();
        while (it.hasNext())
            t += "\n\t- "+it.next();
        return t;
    }
    
}
