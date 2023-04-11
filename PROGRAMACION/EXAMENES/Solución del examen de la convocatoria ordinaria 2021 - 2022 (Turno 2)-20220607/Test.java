/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donmarciano;

import java.util.Scanner;

/**
 *
 * @author anusk
 */
public class Test extends Prueba{
    
    private PreguntaTest[] preguntas;
    
    public Test(String fecha, int nPreguntas)
    {
        super(fecha); 
        preguntas = new PreguntaTest[nPreguntas];
        for (int i = 0; i < preguntas.length; i++)
        {
            System.out.println("PREGUNTA "+(i+1));
            preguntas[i] = rellenarPregunta();
        }
            
    }
    
    private PreguntaTest rellenarPregunta()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pregunta: ");
        String p = sc.nextLine();
        PreguntaTest pt = new PreguntaTest(p);
        pt.anadirRespuestas();
        return pt;
    }
    
    @Override
    public String toString()
    {
        String texto = "Fecha: "+fecha+"\n";
        for (int i = 0; i < preguntas.length; i++)
            texto += "PREGUNTA "+(i+1)+"\n"+preguntas[i]+"\n";
        return texto;
    }
    
}
