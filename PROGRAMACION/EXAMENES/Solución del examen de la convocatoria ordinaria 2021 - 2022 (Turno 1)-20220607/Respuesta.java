
package centropsicologia;

import java.io.Serializable;


public class Respuesta implements Serializable{
    
    private String texto;
    private int puntuacion;
    
    public Respuesta (String texto, int puntuacion)
    {
        this.texto = texto;
        this.puntuacion = puntuacion;
    }
    
    @Override
    public String toString()
    {
        return texto+"\t"+puntuacion;
    }
    
}
