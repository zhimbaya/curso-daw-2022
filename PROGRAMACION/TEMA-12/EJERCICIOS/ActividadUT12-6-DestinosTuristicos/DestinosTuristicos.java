package Tema12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DestinosTuristicos extends JFrame {

    //Ventana
    //private JFrame frame;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu mnPaises, mnDestinos;
    private JLabel lblPrecio;

    private ArrayList<JMenuItem> paises;
    private ArrayList<JMenuItem> destinos;
    private String aux;

    //Conexión bbdd
    private Connection conexion;
    private Statement sentenciaSQL;

    /**
     * Create the frame.
     */
    public DestinosTuristicos() {
        paises = new ArrayList<JMenuItem>();
        destinos = new ArrayList<JMenuItem>();

        crearVentana();
        registrarEventos();
    }

    private void crearVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 150);
        setResizable(false);

        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnPaises = new JMenu("Paises");
        cargarPaises();
        menuBar.add(mnPaises);

        mnDestinos = new JMenu("Destinos");
        mnDestinos.setVisible(false);
        menuBar.add(mnDestinos);

        lblPrecio = new JLabel("");
        lblPrecio.setBounds(10, 11, 274, 68);
        panel.add(lblPrecio);

        setVisible(true);
    }

    private void registrarEventos() {
        for (int i = 0; i < paises.size(); i++) {
            int x = i;
            paises.get(i).addActionListener(e -> cargarDestinos(paises.get(x).getText()));
        }
    }

    private void cargarPaises() {
        try {
            int contador = 0;
            aux = null;

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet registros = this.sentenciaSQL.executeQuery("SELECT distinct(pais) FROM destinoturistico;");

           // destinos.clear();
            //destinos = new ArrayList<JMenuItem>();
            //ni esto se entiende
            //mnDestinos = new JMenu();

            while (registros.next()) {
                aux = registros.getString(1);
                System.out.println(aux); //Para comprobar que encuentra todos los paises
                paises.add(new JMenuItem(aux));
                mnPaises.add(paises.get(contador));
                //podría agrear aquí el addActionListener
                contador++;
            }
            //esto no se entiende
            //menuBar.add(mnDestinos);
            //nDestinos.setVisible(true);
            //
            registros.close();
            sentenciaSQL.close();
            conexion.close();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(new JFrame(), "Error al realizar la consulta.");
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }

    private void cargarDestinos(String pais) {
        try {
            int contador = 0;
            aux = null;

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet registros = this.sentenciaSQL.executeQuery("SELECT destino FROM destinoturistico WHERE pais like '" + pais + "';");

            while (registros.next()) {
                aux = registros.getString(1);
                System.out.println(aux); //Para comprobar que encuentra todos los destinos de un país
                destinos.add(new JMenuItem(aux));
                mnDestinos.add(destinos.get(contador));
                destinos.get(contador).addActionListener(e -> mostrarPrecio(aux));
                contador++;
            }

            mnDestinos.setVisible(true);

            registros.close();
            sentenciaSQL.close();
            conexion.close();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(new JFrame(), "Error al realizar la consulta.");
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }

    private void mostrarPrecio(String dest) {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/bd1", "root", "root");
            sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet registros = this.sentenciaSQL.executeQuery("SELECT precio FROM destinoturistico WHERE destino like '" + dest + "';");
            registros.next();
            System.out.println(registros.getString(1) + "€"); //Para comprobar que encuentra el precio del destino buscado
            lblPrecio.setText(registros.getString(1) + "€");

            registros.close();
            sentenciaSQL.close();
            conexion.close();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(new JFrame(), "Error al realizar la consulta.");
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }

    /**
     * Main.
     */
    public static void main(String[] args) {
        DestinosTuristicos test = new DestinosTuristicos();
    }
}
