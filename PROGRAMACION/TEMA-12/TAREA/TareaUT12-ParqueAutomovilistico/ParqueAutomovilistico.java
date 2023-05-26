import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ParqueAutomovilistico extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblOperacion, lblMatricula, lblNombrePropietario, lblNumBastidor ,lblImpuestoCirculacion, lblImpuestoCirculacionPagado;
	private JComboBox<String> comboBoxOperaciones;
	private JComboBox<String> comboBoxImpuestoCircPagado;
	private JTextField txtImpuestoCirculacion, txtNumeroBastidor, txtNombrePropietario, txtMatricula;
	private JButton btnAceptar, btnSalir, btnLimpiar;
	private JTextPane textPane;
	private JMenuBar menuBar;
	private JMenu mnOperaciones;
	private JMenuItem mntmBuscar, mntmInsertar;
	
	private int aux = 0;
	
	private ArrayList<Coche> coches;
	private JMenuItem mntmCalcularTotalImpuesto;
	private JLabel lblTotalRecaudado;
	private JLabel lblTotal;
	
	

	/**
	 * MAIN
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParqueAutomovilistico frame = new ParqueAutomovilistico();
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
	public ParqueAutomovilistico() {
		coches = new ArrayList<Coche>();
		crearVentana();
		registrarEventos();
	}
	
	public void crearVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		setTitle("Parque Automovilístico Alcalá de Henares");
		setResizable(false);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		mntmInsertar = new JMenuItem("Nuevo vehiculo");
		mnOperaciones.add(mntmInsertar);
		
		mntmBuscar = new JMenuItem("Buscar");
		mnOperaciones.add(mntmBuscar);
		
		mntmCalcularTotalImpuesto = new JMenuItem("Calcular computo recaudado");
		mnOperaciones.add(mntmCalcularTotalImpuesto);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 14, 174, 14);
		lblMatricula.setVisible(false);
		contentPane.add(lblMatricula);
		
		lblNombrePropietario = new JLabel("Nombre propietario");
		lblNombrePropietario.setBounds(10, 39, 174, 14);
		lblNombrePropietario.setVisible(false);
		contentPane.add(lblNombrePropietario);
		
		lblNumBastidor = new JLabel("Numero bastidor");
		lblNumBastidor.setBounds(10, 64, 174, 14);
		lblNumBastidor.setVisible(false);
		contentPane.add(lblNumBastidor);
		
		lblImpuestoCirculacion = new JLabel("ImpuestoCirculacion");
		lblImpuestoCirculacion.setBounds(10, 89, 174, 14);
		lblImpuestoCirculacion.setVisible(false);
		contentPane.add(lblImpuestoCirculacion);
		
		lblImpuestoCirculacionPagado = new JLabel("Impuesto circulacion pagado");
		lblImpuestoCirculacionPagado.setBounds(10, 113, 174, 14);
		lblImpuestoCirculacionPagado.setVisible(false);
		contentPane.add(lblImpuestoCirculacionPagado);
		
		comboBoxImpuestoCircPagado = new JComboBox<String>();
		comboBoxImpuestoCircPagado.setBounds(194, 110, 95, 20);
		comboBoxImpuestoCircPagado.addItem("Pagado");
		comboBoxImpuestoCircPagado.addItem("No pagado");
		comboBoxImpuestoCircPagado.setVisible(false);
		contentPane.add(comboBoxImpuestoCircPagado);
		
		txtImpuestoCirculacion = new JTextField();
		txtImpuestoCirculacion.setBounds(194, 85, 150, 20);
		txtImpuestoCirculacion.setVisible(false);
		contentPane.add(txtImpuestoCirculacion);
		txtImpuestoCirculacion.setColumns(10);
		
		txtNumeroBastidor = new JTextField();
		txtNumeroBastidor.setBounds(194, 61, 150, 20);
		txtNumeroBastidor.setVisible(false);
		contentPane.add(txtNumeroBastidor);
		txtNumeroBastidor.setColumns(10);
		
		txtNombrePropietario = new JTextField();
		txtNombrePropietario.setBounds(194, 36, 150, 20);
		txtNombrePropietario.setVisible(false);
		contentPane.add(txtNombrePropietario);
		txtNombrePropietario.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(194, 11, 150, 20);
		txtMatricula.setVisible(false);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setBounds(10, 89, 344, 113);
		textPane.setVisible(false);
		textPane.setEditable(false);
		contentPane.add(textPane);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 216, 89, 23);
		btnAceptar.setVisible(false);
		contentPane.add(btnAceptar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(265, 216, 89, 23);
		contentPane.add(btnSalir);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(137, 216, 89, 23);
		btnLimpiar.setVisible(false);
		contentPane.add(btnLimpiar);
		
		lblTotalRecaudado = new JLabel("Total recaudado");
		lblTotalRecaudado.setBounds(10, 138, 174, 14);
		lblTotalRecaudado.setVisible(false);
		contentPane.add(lblTotalRecaudado);
		
		lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setBounds(194, 141, 150, 14);
		lblTotal.setVisible(false);
		contentPane.add(lblTotal);
		
		
	}
	
	private void registrarEventos() {
		mntmInsertar.addActionListener(e -> cambiarOperacion(1));
		mntmBuscar.addActionListener(e -> cambiarOperacion(2));
		mntmCalcularTotalImpuesto.addActionListener(e -> cambiarOperacion(3));
		
		btnAceptar.addActionListener(e -> aceptarOperacion(aux));
		btnLimpiar.addActionListener(e -> limpiarCampos());
		btnSalir.addActionListener(e -> System.exit(0));
	}
	
	private void cambiarOperacion(int operacion) {
		lblMatricula.setVisible(false);
		lblNombrePropietario.setVisible(false);
		lblNumBastidor.setVisible(false);
		lblImpuestoCirculacion.setVisible(false);
		lblImpuestoCirculacionPagado.setVisible(false);
		comboBoxImpuestoCircPagado.setVisible(false);
		txtImpuestoCirculacion.setVisible(false);
		txtNumeroBastidor.setVisible(false);
		txtNombrePropietario.setVisible(false);
		txtMatricula.setVisible(false);
		btnAceptar.setVisible(false);
		btnLimpiar.setVisible(false);
		textPane.setVisible(false);
		lblTotalRecaudado.setVisible(false);
		lblTotal.setVisible(false);
		limpiarCampos();
		
		if (operacion == 1) {
			lblMatricula.setVisible(true);
			lblNombrePropietario.setVisible(true);
			lblNumBastidor.setVisible(true);
			lblImpuestoCirculacion.setVisible(true);
			lblImpuestoCirculacionPagado.setVisible(true);
			comboBoxImpuestoCircPagado.setVisible(true);
			txtImpuestoCirculacion.setVisible(true);
			txtNumeroBastidor.setVisible(true);
			txtNombrePropietario.setVisible(true);
			txtMatricula.setVisible(true);
			btnAceptar.setVisible(true);
			btnLimpiar.setVisible(true);
			aux = 1;
			
		} else if (operacion == 2) {
			lblMatricula.setVisible(true);
			txtMatricula.setVisible(true);
			btnAceptar.setVisible(true);
			btnLimpiar.setVisible(true);
			textPane.setText(null);
			textPane.setVisible(true);
			aux = 2;
		} else if (operacion == 3) {
			lblTotalRecaudado.setVisible(true);
			calcularTotal();
			lblTotal.setVisible(true);
		}
	}
	
	private void calcularTotal() {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parqueautomovilistico", "root", "");
			Statement sentenciaSQL = conexion.createStatement();
			
			ResultSet total = sentenciaSQL.executeQuery("SELECT sum(impuesto_circulacion) FROM datos_vehiculo;");
			
			lblTotal.setText(null);
			
			while (total.next()) {
				lblTotal.setText(total.getDouble(1) + "€");
			}
			
			total.close();
			sentenciaSQL.close();
			conexion.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void limpiarCampos() {
		txtMatricula.setText(null);
		txtImpuestoCirculacion.setText(null);
		txtNumeroBastidor.setText(null);
		txtNombrePropietario.setText(null);
		textPane.setText(null);
	}

	private void aceptarOperacion(int operacion) {
		if (operacion == 1) {
			if (comboBoxImpuestoCircPagado.getSelectedItem().equals("Pagado")) {
				coches.add(new Coche(txtMatricula.getText(), txtNombrePropietario.getText(), txtNumeroBastidor.getText(), Double.parseDouble(txtImpuestoCirculacion.getText()), true));
			} else {
				coches.add(new Coche(txtMatricula.getText(), txtNombrePropietario.getText(), txtNumeroBastidor.getText(), Double.parseDouble(txtImpuestoCirculacion.getText()), false));
			}
			insertarVehiculo(coches.get(coches.size() - 1));
			
		} else {
			buscarVehiculo(txtMatricula.getText());
		}
	}
	
	private void insertarVehiculo(Coche coche) {
		
		Connection conexion;
		Statement sentenciaSQL;
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/parqueautomovilistico", "root", "");
			sentenciaSQL = conexion.createStatement();
			
			sentenciaSQL.execute("INSERT INTO datos_vehiculo VALUES('" + coche.getMatricula() + "', '" + coche.getNombrePropietario() + "', '" + coche.getNumBastidor() + "', " + coche.getImpuestoCirculacion() + ", " + coche.getImpuestoCirculacionPagado() + ");");
			
			sentenciaSQL.close();
			conexion.close();
			
			JOptionPane.showMessageDialog(new JFrame(), "Vehículo insertado.");
			limpiarCampos();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void buscarVehiculo(String matricula) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parqueautomovilistico", "root", "");
			Statement sentenciaSQL = conexion.createStatement();
			
			ResultSet vehiculo = sentenciaSQL.executeQuery("SELECT * FROM datos_vehiculo WHERE matricula like '" + matricula + "';");
			
			textPane.setText(" ");
			
			while (vehiculo.next()) {
				textPane.setText("Matricula: " + vehiculo.getString(1));
				textPane.setText(textPane.getText() + "\nPropietario: " + vehiculo.getString(2));
				textPane.setText(textPane.getText() + "\nBastidor: " + vehiculo.getString(3));
				textPane.setText(textPane.getText() + "\nImpuesto circulacion: " + vehiculo.getDouble(4));
				textPane.setText(textPane.getText() + "\nImpuesto circulacion pagado: " + vehiculo.getBoolean(5));
			}
			
			if (textPane.getText().equals(" ")) {
				JOptionPane.showMessageDialog(new JFrame(), "Vehículo no encontrado.");
			}
			
			
			vehiculo.close();
			sentenciaSQL.close();
			conexion.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
