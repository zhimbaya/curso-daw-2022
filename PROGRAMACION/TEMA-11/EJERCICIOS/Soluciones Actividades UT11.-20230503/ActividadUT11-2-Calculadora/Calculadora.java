import java.awt.*;
import java.awt.event.*;

public class Calculadora
{
	//Miembros Dato
	private Frame ventana;
	private Button bSumar,bRestar,bMultiplicar,bDividir,bBorrar;
   	private TextField cTOperador1,cTOperador2,cTResultado;
   	private Label etiqueta1,etiqueta2,etiqueta3,etiqueta4;
   	private Panel panelSuperior,panelInferior;
   	
	public Calculadora()
	{
		crearComponentes();
		colocarComponentes();
		registrarEventos();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void crearComponentes()
	{
		ventana = new Frame();
		
		ventana.setTitle( "Calculadora" );
    	ventana.setSize( 300,250 );
    	ventana.setResizable(false);
    	
    	bSumar = new Button("+");
    	bRestar = new Button("-");
    	bMultiplicar = new Button("*");
    	bDividir = new Button("/");
    	bBorrar = new Button("Borrar");
    	
    	etiqueta1 = new Label("Op.Calculadora:");
    	etiqueta2 = new Label("Operando 1:");
    	etiqueta3 = new Label("Operando 2:");
    	etiqueta4 = new Label("Resultado:");
    	
    	cTOperador1 = new TextField(20);
    	cTOperador2 = new TextField(20);
    	cTResultado = new TextField(20);
    	
    	panelSuperior = new Panel();
    	panelInferior = new Panel();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void colocarComponentes()
	{
		//Establecemos el Gestor, Colocamos los Objetos en el Panel Superior
		panelSuperior.add(etiqueta1);
		panelSuperior.add(bSumar);
		panelSuperior.add(bRestar);
		panelSuperior.add(bMultiplicar);
		panelSuperior.add(bDividir);
		panelSuperior.add(bBorrar);
		
		//Establecemos el Gestor, Colocamos los Objetos en el Panel Inferior
		panelInferior.setLayout(new GridLayout(3,2));
		panelInferior.add(etiqueta2);
		panelInferior.add(cTOperador1);
		panelInferior.add(etiqueta3);
		panelInferior.add(cTOperador2);
		panelInferior.add(etiqueta4);
		panelInferior.add(cTResultado);
		
		//Colocamos los Paneles en la Ventana
		ventana.add("North",panelSuperior);
		ventana.add("South",panelInferior);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void registrarEventos()
	{
		bSumar.addActionListener(new ManejadorBotones());
		bRestar.addActionListener(new ManejadorBotones());
		bMultiplicar.addActionListener(new ManejadorBotones());
		bDividir.addActionListener(new ManejadorBotones());
		bBorrar.addActionListener(new ManejadorBotones());
		
		ventana.setVisible(true);
		
		ventana.addWindowListener(new CerrarVentana());
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	class ManejadorBotones implements ActionListener 
    {
    	public void actionPerformed(ActionEvent e)
    	{
			//getSource devuelve la referencia del objeto fuente que ha detectado el evento
			Object fuente = e.getSource();
			
			try
			{
				//Capturamos los Operandos de los Campos de Texto
				double operando1 = Double.parseDouble(cTOperador1.getText());
				double operando2 = Double.parseDouble(cTOperador2.getText());
				
				if(fuente == bSumar)
				{
	        		cTResultado.setText(Double.toString(operando1 + operando2));
	        	}
	         	else
	           	if(fuente == bRestar)
	           	{
	            	cTResultado.setText(Double.toString(operando1 - operando2));
	           	}
	           	else
	           	if(fuente == bMultiplicar)
	           	{
	            	cTResultado.setText(Double.toString(operando1 * operando2));
	           	}
	           	else
	           	if(fuente == bDividir)
	           	{
	            	cTResultado.setText(Double.toString(operando1 / operando2));
	           	}
			}
	        
	        catch(NumberFormatException error)
	        {
	        	if(cTOperador1.getText().equals("") || cTOperador2.getText().equals(""))
	        		cTResultado.setText("Faltan Datos");
	        	else
	        		cTResultado.setText("Datos Incorrectos");
	        }
	        
	        if(fuente == bBorrar)
	        {
	           	cTOperador1.setText("");
	           	cTOperador2.setText("");
	           	cTResultado.setText("");
	        }
    	}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void main(String args[])
	{
		Calculadora calculadora = new Calculadora();
	}
}