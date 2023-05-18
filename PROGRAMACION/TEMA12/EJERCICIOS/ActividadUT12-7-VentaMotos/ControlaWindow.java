import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ControlaWindow implements ActionListener{/*clase escuchadora de nuestra vista*/
    VentanaPrincipal ventana;/*declaramos un objeto del tipo window*/
    int precioCajon=82,precioInmovilizador=73,precioMoto2,precioMoto1,total=0;/*declaramos e instanciamos nuestras variables*/
    //Variables que usaremos para crear un objeto Compra para poder hacer la consulta
    String modelo="";
	double precioSinExtras=0;
	boolean extraCajon=false;
	boolean extraInmovilizador=false;
	
    public ControlaWindow(VentanaPrincipal objeto){
        ventana = objeto;
    }
    public void actionPerformed(ActionEvent evento) 
    {
    	
        if (evento.getSource()== ventana.jchkCajon){/*escuchamos el evento en cajon*/
            if (ventana.jchkCajon.isSelected()){/*nos aseguramos q esta chekeado*/            
                total=total+precioCajon;
                ventana.jtfTotal.setText(Integer.toString(total));}    
            else {/*si no esta chekeado*/
                    total=total-precioCajon;
                    ventana.jtfTotal.setText(Integer.toString(total));}    }
        else {
	        if (evento.getSource()== ventana.jchkInmovilizador){/*escuchamos el evento en inmovilizador*/
	            if (ventana.jchkInmovilizador.isSelected()){/*nos aseguramos q esta chekeado*/            
	                total=total+precioInmovilizador;
	                ventana.jtfTotal.setText(Integer.toString(total));}    
	            else {/*si no esta chekeado*/
	                    total=total-precioInmovilizador;
	                    ventana.jtfTotal.setText(Integer.toString(total));}    
            }    
	        else {
		        if (evento.getSource()== ventana.jrbMoto1){/*escuchamos el evento en comp. escritorio*/
		        	modelo="Super Dink 125i";
		        	precioSinExtras=3350.00;
	        		total=total-precioMoto2; //Por si previamente estuviera marcada la otra
	                precioMoto1=3350;
	                total=total+precioMoto1;            
	                ventana.jtfTotal.setText(Integer.toString(total));}        
		        else {
		        	if (evento.getSource()== ventana.jrbMoto2){/*escuchamos el evento en comp. portatil*/    
		        		modelo="Agility City 125";
	        			precioSinExtras=2199.00;
		        		total=total-precioMoto1; //Por si previamente estuviera marcada la otra
		                precioMoto2=2199;                
		                total=total+precioMoto2;            
		                ventana.jtfTotal.setText(Integer.toString(total));}       
		        	else if(evento.getSource()==ventana.jbGuardar){
		        		
		        		if(ventana.jchkCajon.isSelected())
		        			extraCajon=true;
		        		if(ventana.jchkInmovilizador.isSelected())
		        			extraInmovilizador=true;
		        		
		        		System.out.println(modelo + "****"+precioSinExtras);
		        		
		        		insertarBBDD(new Compra(modelo, extraCajon, extraInmovilizador, precioSinExtras));
		        	}
		        }
	        }    
        }
    }
    
    public void insertarBBDD(Compra miCompra){
    	System.out.println(miCompra.toString()); //Para comprobar
    	Connection conexion;
		Statement sentenciaSQL;
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/motos", "root", "");
			sentenciaSQL = conexion.createStatement();
			
			sentenciaSQL.execute("INSERT INTO ventas VALUES(NULL, '" + miCompra.getModeloMoto() + "', " + miCompra.getPrecioCompraSinExtras() + ", " + miCompra.getExtraCajon() + ", " + miCompra.getExtraInmovilizador()  + ");");
			
			sentenciaSQL.close();
			conexion.close();
			
			JOptionPane.showMessageDialog(new JFrame(), "Compra registrada.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}


