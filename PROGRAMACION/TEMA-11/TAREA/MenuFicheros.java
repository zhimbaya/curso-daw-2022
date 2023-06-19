import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MenuFicheros {
	
	//Miembros dato
	private JFrame ventana;
	private JMenuBar barraMenu;
	private JMenu menuArchivo;
	private JMenuItem itemMenuCrear;
	private JMenuItem itemMenuAbrir;
	private JMenuItem itemMenuGuardar;
	private JMenuItem itemMenuSalir;
	private JTextArea areaTexto;
	private JButton bGrabar;
	private JPanel panelSuperior,panelInferior;
	private JOptionPane mensajeError;
	private JFileChooser cuadroDialogoFicheros;
	
	private String ruta;
	private FileWriter flujoSalida; //Para escribir en fichero
	private BufferedReader flujoBr; //Para leer de fichero
	private File fichero;
	boolean pulsadoBotonCrear = false;
	boolean pulsadoBotonCargar = false;


	
	
	public MenuFicheros() {
		super();
		// TODO Auto-generated constructor stub
		crearComponentes();
		colocarComponentes();
		registrarEventos();
	}

	public void crearComponentes()
	{
		ventana = new JFrame();
		
		ventana.setTitle( "Leer/guardar fichero" );
    	ventana.setSize( 400,400 );
    	ventana.setResizable(true);
    	
    	barraMenu=new JMenuBar();
    	menuArchivo=new JMenu("Archivo");
    	itemMenuCrear=new JMenuItem("Crear archivo");
    	itemMenuAbrir=new JMenuItem("Abrir archivo");
    	itemMenuGuardar=new JMenuItem("Guardar archivo");
    	itemMenuSalir=new JMenuItem("Salir");

    	
    	areaTexto = new JTextArea(10,30);
    	areaTexto.setEnabled(false);
    	bGrabar = new JButton("Grabar");

    	
    	panelSuperior = new JPanel();
    	panelInferior = new JPanel();
	}
	
	public void colocarComponentes()
	{
		ventana.setJMenuBar(barraMenu);
		barraMenu.add(menuArchivo);
		menuArchivo.add(itemMenuCrear);
		menuArchivo.add(itemMenuAbrir);
		menuArchivo.add(itemMenuGuardar);
		menuArchivo.add(itemMenuSalir);
		
		//Establecemos el Gestor, Colocamos los Objetos en el Panel Superior
		panelSuperior.add(areaTexto);
		panelInferior.add(bGrabar);
		bGrabar.setVisible(false);
				
		//Colocamos los Paneles en la Ventana
		ventana.add("North",panelSuperior);
		ventana.add("South",panelInferior);
		
		ventana.setVisible(true);
	}
	
	public void registrarEventos()
	{
		itemMenuCrear.addActionListener(new ManejadorItemsMenu());
		itemMenuAbrir.addActionListener(new ManejadorItemsMenu());
		itemMenuGuardar.addActionListener(new ManejadorItemsMenu());
		itemMenuSalir.addActionListener(new ManejadorItemsMenu());
			
	}
	
	
	class ManejadorItemsMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			//getSource devuelve la referencia del objeto fuente que ha detectado el evento
			Object fuente = e.getSource();
			
			if(fuente == itemMenuCrear){
				cuadroDialogoFicheros = new JFileChooser();
	        	cuadroDialogoFicheros.setDialogTitle("Creando un nuevo fichero...");
	        	cuadroDialogoFicheros.setFileSelectionMode(JFileChooser.FILES_ONLY); //Para que solo se puedan elegir ficheros
	        	FileNameExtensionFilter filtroFicherosTxt = new FileNameExtensionFilter("*.txt", "txt"); //Creamos un filtro para que solo puedan seleccionarse ficheros .txt
	        	cuadroDialogoFicheros.setFileFilter(filtroFicherosTxt); //Aplicamos el filtro al cuadro de dialogo
	        	if(cuadroDialogoFicheros.showOpenDialog(ventana)==cuadroDialogoFicheros.APPROVE_OPTION){
	        		ruta=cuadroDialogoFicheros.getSelectedFile().getAbsolutePath()+".txt"; //Debemos añadir la extensión ya que no la incorpora a pesar de aparecer el filtro en el cuadro de diálogo
	        		
	        		bGrabar.setVisible(true);
	        		areaTexto.setText(""); //Al crear el fichero nuevo, el area de texto debe estar vacía
	        		areaTexto.setEnabled(true);
	        		bGrabar.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							try
				        	{
				        		flujoSalida = new FileWriter(ruta);
					        	flujoSalida.write(areaTexto.getText());
					        	flujoSalida.close();
				        	}
				        	catch(IOException error)
				        	{
				        		System.out.println(error.getMessage());
				        	}
							areaTexto.setText("");
							areaTexto.setEnabled(false);
							bGrabar.setVisible(false);
				        	JOptionPane.showMessageDialog(ventana, "El fichero ha sido creado");
				
						}
					});
	        		
	        	}
			}
			
			if(fuente == itemMenuAbrir){
				cuadroDialogoFicheros = new JFileChooser();
	        	cuadroDialogoFicheros.setDialogTitle("Seleccione un fichero..."); //Título del cuadro de diálogo
	        	cuadroDialogoFicheros.setFileSelectionMode(JFileChooser.FILES_ONLY); //Para que solo se puedan elegir ficheros
	        	FileNameExtensionFilter filtroFicherosTxt = new FileNameExtensionFilter("*.txt", "txt"); //Creamos un filtro para que solo puedan seleccionarse ficheros .txt
	        	cuadroDialogoFicheros.setFileFilter(filtroFicherosTxt); //Aplicamos el filtro al cuadro de dialogo
	        	
	        	
	        	int seleccion = cuadroDialogoFicheros.showOpenDialog(ventana);
	        	if(seleccion==JFileChooser.APPROVE_OPTION){
	                ruta=cuadroDialogoFicheros.getSelectedFile().getPath();
	                
	                areaTexto.setText(""); //Por si abro uno teniendo uno abierto previamente. Así evitaré que se añada detrás
	        		areaTexto.setEnabled(true); //Por si una vez abierto, queremos modificar su contenido
	                
	                String linea;
					String eof = null;
					try
		        	{
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
	        	
	        	
			}
			
			if(fuente == itemMenuGuardar){
				try
	        	{
	        		flujoSalida = new FileWriter(ruta);
		        	flujoSalida.write(areaTexto.getText());
		        	flujoSalida.close();
		        	areaTexto.setText("");
		        	areaTexto.setEnabled(false);
		        	JOptionPane.showMessageDialog(ventana, "El fichero ha sido actualizado");

		        	
	        	}
	        	catch(IOException error)
	        	{
	        		System.out.println(error.getMessage());
	        	}
			}
			
			if(fuente == itemMenuSalir){
				ventana.dispose();
			}
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFicheros ficheros=new MenuFicheros();
		
	}

}
