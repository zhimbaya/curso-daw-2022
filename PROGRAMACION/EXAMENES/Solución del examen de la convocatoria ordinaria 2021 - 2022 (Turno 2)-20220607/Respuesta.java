
package donmarciano;

import java.io.Serializable;


public class Respuesta implements Serializable{
    
    private String texto;
    private boolean correcta;
    
    public Respuesta (String texto, boolean correcta)
    {
        this.texto = texto;
        this.correcta = correcta;
    }
    
    @Override
    public String toString()
    {
        return texto+"\t"+((correcta)?"Correcta":"Incorrecta");
    }
    
}
