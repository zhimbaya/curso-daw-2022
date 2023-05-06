import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PaletaColores extends JFrame implements FocusListener{

	private JPanel contentPane;
	private JTextField tFRojo;
	private JTextField tFVerde;
	private JTextField tFAzul;
	private Canvas canvas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PaletaColores frame = new PaletaColores();
		frame.setVisible(true);


	}

	/**
	 * Create the frame.
	 */
	public PaletaColores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRojo = new JLabel("ROJO:");
		lblRojo.setBounds(17, 53, 46, 14);
		contentPane.add(lblRojo);
		
		JLabel lblVerde = new JLabel("VERDE:");
		lblVerde.setBounds(17, 109, 46, 14);
		contentPane.add(lblVerde);
		
		JLabel lblAzul = new JLabel("AZUL:");
		lblAzul.setBounds(17, 164, 46, 14);
		contentPane.add(lblAzul);
		
		tFRojo = new JTextField();
		tFRojo.addFocusListener(this);
		tFRojo.setHorizontalAlignment(SwingConstants.RIGHT);
		tFRojo.setText("0");
		tFRojo.setBounds(64, 50, 86, 20);
		contentPane.add(tFRojo);
		tFRojo.setColumns(10);
		
		tFVerde = new JTextField();
		tFVerde.addFocusListener(this);
		tFVerde.setHorizontalAlignment(SwingConstants.RIGHT);
		tFVerde.setText("0");
		tFVerde.setBounds(64, 106, 86, 20);
		contentPane.add(tFVerde);
		tFVerde.setColumns(10);
		
		tFAzul = new JTextField();
		tFAzul.addFocusListener(this);
		tFAzul.setHorizontalAlignment(SwingConstants.RIGHT);
		tFAzul.setText("0");
		tFAzul.setBounds(64, 161, 86, 20);
		contentPane.add(tFAzul);
		tFAzul.setColumns(10);
		
		JLabel lblRangoR = new JLabel("(0-255)");
		lblRangoR.setBounds(160, 53, 46, 14);
		contentPane.add(lblRangoR);
		
		JLabel lblRangoV = new JLabel("(0-255)");
		lblRangoV.setBounds(160, 109, 46, 14);
		contentPane.add(lblRangoV);
		
		JLabel lblRangoA = new JLabel("(0-255)");
		lblRangoA.setBounds(160, 164, 46, 14);
		contentPane.add(lblRangoA);
		
		canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(243, 65, 100, 100);
		contentPane.add(canvas);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		//NO hacemos nada
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		//Al perder el foco, actualizamos el color de fondo del canvas
		try {
			canvas.setBackground(new Color(Integer.parseInt(tFRojo.getText()), Integer.parseInt(tFVerde.getText()), Integer.parseInt(tFAzul.getText())));
		}catch (Exception e){
			e.printStackTrace();
        	JOptionPane.showMessageDialog(contentPane, "Debes escribir un número entero en el rango 0-255");

		}
	}
}
