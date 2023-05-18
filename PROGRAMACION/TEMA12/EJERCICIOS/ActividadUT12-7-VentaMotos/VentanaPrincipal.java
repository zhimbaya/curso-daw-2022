import java.awt.Color;

import javax.swing.*;
public class VentanaPrincipal extends JFrame {
	// declaramos  las variables de los componentes
    public ButtonGroup grupoDeBotonesRadio;
    public JLabel jLabel2;
    public JLabel jLabel3;
    public JPanel jPanel1;
    public JPanel jPanel2;
    public JPanel jPanel4;
    public JCheckBox jchkCajon;
    public JCheckBox jchkInmovilizador;
    public JRadioButton jrbMoto1;
    public JRadioButton jrbMoto2;
    public JTextField jtfTotal;    
    public JButton jbGuardar;
    
    public VentanaPrincipal() {
    	crearComponentes();
        colocarComponentes();
        registrarEventos();
    }
    public void crearComponentes() {

        grupoDeBotonesRadio = new ButtonGroup();
        jPanel1 = new JPanel();
        jrbMoto1 = new JRadioButton();
        jrbMoto2 = new JRadioButton();
        jPanel2 = new JPanel();
        jchkCajon = new JCheckBox();
        jchkInmovilizador = new JCheckBox();
        jPanel4 = new JPanel();
        jLabel2 = new JLabel();
        jtfTotal = new JTextField();
        jLabel3 = new JLabel();
        jbGuardar=new JButton("Comprar");
    }
    public void colocarComponentes(){
    
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MOTOS KYMCO - AUSMOTOR");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(BorderFactory.createTitledBorder("Seleccione Motocicleta"));
        jPanel1.setLayout(null);

        jrbMoto1.setText("Super Dink 125i ( 3350€ )");
        jPanel1.add(jrbMoto1);
        jrbMoto1.setBounds(10, 23, 200, 30);

        jrbMoto2.setText("Agility City 125 ( 2199� )");
        jPanel1.add(jrbMoto2);
        jrbMoto2.setBounds(210, 23, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(35, 40, 440, 70);

        jPanel2.setBorder(BorderFactory.createTitledBorder("Extras Opcionales"));
        jPanel2.setLayout(null);

        jchkCajon.setText("Cajón transportín ( 82€ )");
        jPanel2.add(jchkCajon);
        jchkCajon.setBounds(10, 20, 170, 23);

        jchkInmovilizador.setText("Inmovilizador ( 73€ )");
        jPanel2.add(jchkInmovilizador);
        jchkInmovilizador.setBounds(10, 50, 170, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 120, 200, 90);

        jPanel4.setBorder(BorderFactory.createTitledBorder("Precio Total"));
        jPanel4.setLayout(null);

        
        jPanel4.add(jtfTotal);
        jtfTotal.setBounds(30, 20, 100, 20);
        jLabel2.setText("€");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(130, 20, 20, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(250, 130, 190, 60);

        jLabel3.setText("KYMCO Scooters");
        //jLabel3.setBackground(Color.black);
        jLabel3.setForeground(Color.red);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 10, 150, 30);

        /*agregamos los JRadioButton al ButtonGroup*/
        grupoDeBotonesRadio.add(jrbMoto1);
        grupoDeBotonesRadio.add(jrbMoto2);
        
        
        getContentPane().add(jbGuardar);
        jbGuardar.setBounds(300, 200, 100, 30);
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-501)/2, (screenSize.height-300)/2, 501, 300);
    }
    public void registrarEventos(){
        /*Creamos un objeto controlador de esta clase*/
        ControlaWindow controlaWindow = new ControlaWindow(this);
        /* y luego los agregamos al objeto creado*/
        jchkCajon.addActionListener(controlaWindow);
        jchkInmovilizador.addActionListener(controlaWindow);
        jrbMoto1.addActionListener(controlaWindow);
        jrbMoto2.addActionListener(controlaWindow);
        jbGuardar.addActionListener(controlaWindow);
    }
    public static void main(String args[]) {
                new VentanaPrincipal().setVisible(true);}

    
}