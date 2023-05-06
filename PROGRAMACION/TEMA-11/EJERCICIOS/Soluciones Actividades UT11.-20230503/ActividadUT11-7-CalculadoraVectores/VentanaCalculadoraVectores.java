import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculadoraVectores extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldV10;
	private JTextField textFieldV11;
	private JTextField textFieldV12;
	private JTextField textFieldV20;
	private JTextField textFieldV21;
	private JTextField textFieldV22;
	private JTextField textFieldVR0;
	private JTextField textFieldVR1;
	private JTextField textFieldVR2;
	private JLabel labelEscalar;
	private JTextField textFieldEscalar;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnProductoEscalar1;
	private JButton btnProductoEscalar2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadoraVectores frame = new VentanaCalculadoraVectores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculadoraVectores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVector1 = new JLabel("Vector 1:");
		lblVector1.setBounds(50, 42, 57, 14);
		contentPane.add(lblVector1);
		
		JLabel lblVector2 = new JLabel("Vector 2:");
		lblVector2.setBounds(50, 92, 57, 14);
		contentPane.add(lblVector2);
		
		JLabel lblVectorResultado = new JLabel("Vector Resultado:");
		lblVectorResultado.setBounds(10, 215, 108, 14);
		contentPane.add(lblVectorResultado);
		
		textFieldV10 = new JTextField();
		textFieldV10.setBounds(121, 39, 32, 20);
		contentPane.add(textFieldV10);
		textFieldV10.setColumns(10);
		
		textFieldV11 = new JTextField();
		textFieldV11.setColumns(10);
		textFieldV11.setBounds(163, 39, 32, 20);
		contentPane.add(textFieldV11);
		
		textFieldV12 = new JTextField();
		textFieldV12.setColumns(10);
		textFieldV12.setBounds(205, 39, 32, 20);
		contentPane.add(textFieldV12);
		
		textFieldV20 = new JTextField();
		textFieldV20.setColumns(10);
		textFieldV20.setBounds(121, 89, 32, 20);
		contentPane.add(textFieldV20);
		
		textFieldV21 = new JTextField();
		textFieldV21.setColumns(10);
		textFieldV21.setBounds(163, 89, 32, 20);
		contentPane.add(textFieldV21);
		
		textFieldV22 = new JTextField();
		textFieldV22.setColumns(10);
		textFieldV22.setBounds(205, 89, 32, 20);
		contentPane.add(textFieldV22);
		
		textFieldVR0 = new JTextField();
		textFieldVR0.setColumns(10);
		textFieldVR0.setBounds(121, 212, 32, 20);
		contentPane.add(textFieldVR0);
		
		textFieldVR1 = new JTextField();
		textFieldVR1.setColumns(10);
		textFieldVR1.setBounds(163, 212, 32, 20);
		contentPane.add(textFieldVR1);
		
		textFieldVR2 = new JTextField();
		textFieldVR2.setColumns(10);
		textFieldVR2.setBounds(205, 212, 32, 20);
		contentPane.add(textFieldVR2);
		
		labelEscalar = new JLabel("Escalar:");
		labelEscalar.setBounds(50, 138, 46, 14);
		contentPane.add(labelEscalar);
		
		textFieldEscalar = new JTextField();
		textFieldEscalar.setColumns(10);
		textFieldEscalar.setBounds(121, 135, 32, 20);
		contentPane.add(textFieldEscalar);
		
		btnSuma = new JButton("Suma Vectores");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					int v10=Integer.parseInt(textFieldV10.getText());
					int v11=Integer.parseInt(textFieldV11.getText());
					int v12=Integer.parseInt(textFieldV12.getText());
					int v20=Integer.parseInt(textFieldV20.getText());
					int v21=Integer.parseInt(textFieldV21.getText());
					int v22=Integer.parseInt(textFieldV22.getText());
					int v1[]={v10, v11, v12};
					int v2[]={v20, v21, v22};
					//Comprobamos los valores cargados
					for(int i=0; i<v1.length; i++)
						System.out.println(v1[i]);
					System.out.println("-----------------");
					for(int i=0; i<v1.length; i++)
						System.out.println(v2[i]);
					//Realizamos la suma y la cargamos sobre un nuevo array
					int vSuma[]=new int[3];
					CalculadoraVectores miCalculadoraVectores=new CalculadoraVectores(v1, v2);
					vSuma=miCalculadoraVectores.sumaVectores();
					textFieldVR0.setText(Integer.toString(vSuma[0]));
					textFieldVR1.setText(Integer.toString(vSuma[1]));
					textFieldVR2.setText(Integer.toString(vSuma[2]));
				}
				catch(NumberFormatException e){
		        	JOptionPane.showMessageDialog(contentPane, "Revise el contenido de los vectores");

				}
				
				
			}
		});
		btnSuma.setBounds(325, 38, 149, 23);
		contentPane.add(btnSuma);
		
		btnResta = new JButton("Resta Vectores");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					int v10=Integer.parseInt(textFieldV10.getText());
					int v11=Integer.parseInt(textFieldV11.getText());
					int v12=Integer.parseInt(textFieldV12.getText());
					int v20=Integer.parseInt(textFieldV20.getText());
					int v21=Integer.parseInt(textFieldV21.getText());
					int v22=Integer.parseInt(textFieldV22.getText());
					int v1[]={v10, v11, v12};
					int v2[]={v20, v21, v22};
					
					int vResta[]=new int[3];
					CalculadoraVectores miCalculadoraVectores=new CalculadoraVectores(v1, v2);
					vResta=miCalculadoraVectores.restaVectores();
					textFieldVR0.setText(Integer.toString(vResta[0]));
					textFieldVR1.setText(Integer.toString(vResta[1]));
					textFieldVR2.setText(Integer.toString(vResta[2]));
				}
				catch(NumberFormatException e){
		        	JOptionPane.showMessageDialog(contentPane, "Revise el contenido de los vectores");
	
				}
				

				
			}
		});
		btnResta.setBounds(325, 88, 149, 23);
		contentPane.add(btnResta);
		
		btnProductoEscalar1 = new JButton("Producto de escalar por vector 1\u00BA");
		btnProductoEscalar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					int v10=Integer.parseInt(textFieldV10.getText());
					int v11=Integer.parseInt(textFieldV11.getText());
					int v12=Integer.parseInt(textFieldV12.getText());
					int esca=Integer.parseInt(textFieldEscalar.getText());
					int v1[]={v10, v11, v12};
					int v2[]={0, 0, 0}; //Este no le vamos a usar
					int vProd[]=new int[3];
					
					CalculadoraVectores miCalculadoraVectores=new CalculadoraVectores(v1, v2, esca);
					vProd=miCalculadoraVectores.productoEscalarVectores(1); //Multiplicamos por el primer vector
					textFieldVR0.setText(Integer.toString(vProd[0]));
					textFieldVR1.setText(Integer.toString(vProd[1]));
					textFieldVR2.setText(Integer.toString(vProd[2]));
				}
				catch(NumberFormatException e){
		        	JOptionPane.showMessageDialog(contentPane, "Revise el vector y el escalar");
				}
				
			}
		});
		btnProductoEscalar1.setBounds(325, 142, 240, 23);
		contentPane.add(btnProductoEscalar1);
		
		btnProductoEscalar2 = new JButton("Producto de escalar por vector 2\u00BA");
		btnProductoEscalar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					int v20=Integer.parseInt(textFieldV20.getText());
					int v21=Integer.parseInt(textFieldV21.getText());
					int v22=Integer.parseInt(textFieldV22.getText());
					int esca=Integer.parseInt(textFieldEscalar.getText());
					
					int v1[]={0, 0, 0}; //Este no le vamos a usar
					int v2[]={v20, v21, v22};
					int vProd[]=new int[3];
					
					CalculadoraVectores miCalculadoraVectores=new CalculadoraVectores(v1, v2, esca);
					vProd=miCalculadoraVectores.productoEscalarVectores(2); //Multiplicamos por el segundo vector
					textFieldVR0.setText(Integer.toString(vProd[0]));
					textFieldVR1.setText(Integer.toString(vProd[1]));
					textFieldVR2.setText(Integer.toString(vProd[2]));
				}
				catch(NumberFormatException e){
		        	JOptionPane.showMessageDialog(contentPane, "Revise el vector y el escalar");
				}
				
			}
		});
		btnProductoEscalar2.setBounds(325, 196, 240, 23);
		contentPane.add(btnProductoEscalar2);
	}
}
