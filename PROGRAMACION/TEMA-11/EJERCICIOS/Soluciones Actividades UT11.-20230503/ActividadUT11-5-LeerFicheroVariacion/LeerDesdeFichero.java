import java.io.*;

import javax.annotation.processing.ProcessingEnvironment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;

public class LeerDesdeFichero
{
	//Miembros Dato
	private JFrame ventana;
	private JButton bCargar,bLeer;
	private JTextArea areaTexto;
	private JPanel panelSuperior,panelInferior;
	private JOptionPane mensajeError;
	private JFileChooser cuadroDialogoFicheros;
	
	private String ruta;
	private BufferedReader flujoBr;
	File fichero;
	
	boolean pulsadoBotonCargar = false;
	
	public LeerDesdeFichero()
	{
		crearComponentes();
		colocarComponentes();
		registrarEventos();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void crearComponentes()
	{
		ventana = new JFrame();
		
		ventana.setTitle( "Creacion/Grabacion de Fichero" );
    	ventana.setSize( 400,400 );
    	ventana.setResizable(true);
    	
    	
    	bCargar = new JButton("Cargar Fichero");
    	bLeer = new JButton("Leer Fichero");
    	
    	areaTexto = new JTextArea(10,30);
    	areaTexto.setEnabled(false);
    	
    	panelSuperior = new JPanel();
    	panelInferior = new JPanel();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void colocarComponentes()
	{
		//Establecemos el Gestor, Colocamos los Objetos en el Panel Superior
		panelSuperior.add(areaTexto);
		
		//Establecemos el Gestor, Colocamos los Objetos en el Panel Inferior
		panelInferior.add(bCargar);
		panelInferior.add(bLeer);
		
		//Colocamos los Paneles en la Ventana
		ventana.add("North",panelSuperior);
		ventana.add("South",panelInferior);
		
		ventana.setVisible(true);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void registrarEventos()
	{
		bCargar.addActionListener(new ManejadorBotones());
		bLeer.addActionListener(new ManejadorBotones());
		
			
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	class ManejadorBotones implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//getSource devuelve la referencia del objeto fuente que ha detectado el evento
			Object fuente = e.getSource();
			
			if(fuente == bCargar)
			{
	        	
				/* VARIANTE USANDO JFileChooser de swing */
	        	cuadroDialogoFicheros = new JFileChooser();
	        	cuadroDialogoFicheros.setDialogTitle("Seleccione un fichero..."); //Título del cuadro de diálogo
	        	cuadroDialogoFicheros.setFileSelectionMode(JFileChooser.FILES_ONLY); //Para que solo se puedan elegir ficheros
	        	FileNameExtensionFilter filtroFicherosTxt = new FileNameExtensionFilter("*.txt", "txt"); //Creamos un filtro para que solo puedan seleccionarse ficheros .txt
	        	cuadroDialogoFicheros.setFileFilter(filtroFicherosTxt); //Aplicamos el filtro al cuadro de dialogo
	        	
	        	int seleccion = cuadroDialogoFicheros.showSaveDialog(ventana);
	        	if(seleccion==JFileChooser.APPROVE_OPTION){
	                ruta=cuadroDialogoFicheros.getSelectedFile().getPath();
	            }
	        	pulsadoBotonCargar = true;

	        	
	        }
	        else
	        if(fuente == bLeer)
	        {
	        	if(pulsadoBotonCargar)
	        	{
	        		String linea;
  					String eof = null;
  						
		        	try
		        	{
		        		areaTexto.setEnabled(true);
		        		fichero = new File(ruta);
			        	flujoBr = new BufferedReader(new FileReader(ruta));
						
  						while ((linea = flujoBr.readLine()) != eof)
        					areaTexto.append(linea + "\n");
			        	
			        	flujoBr.close();
		        	}
		        	catch(IOException error)
		        	{
		        		System.out.println(error.getMessage());
		        	}
		        }
		      	else
		        {
		        	//mensajerError
		        	JOptionPane.showMessageDialog(ventana, "No Ha Pulsado el Boton de Carga de fichero");
		      		
		        }
		        
	        }
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void main(String args[])
	{
		LeerDesdeFichero fichero = new LeerDesdeFichero();
	}
}