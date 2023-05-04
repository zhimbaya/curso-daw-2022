package Tema11;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public final class GrabarFichero {

    //Miembros Dato
    private Frame ventana;
    private Button bCrear, bGrabar;
    private TextArea areaTexto;
    private FileDialog cuadroDialogo;
    private Panel panelSuperior, panelInferior;
    private Dialog mensajeError;

    private String ruta;
    private FileWriter flujoSalida;

    boolean pulsadoBotonCrear = false;

    public GrabarFichero() {
        crearComponentes();
        colocarComponentes();
        registrarEventos();
    }

    public void crearComponentes() {
        ventana = new Frame();

        ventana.setTitle("Creacion/Grabacion de Fichero");
        ventana.setSize(400, 400);
        ventana.setResizable(false);

        mensajeError = new Dialog(ventana, "Mensaje de Error", false);

        bCrear = new Button("Abrir Cuadro de Dialogo");
        bGrabar = new Button("Grabar");

        areaTexto = new TextArea(10, 30);

        panelSuperior = new Panel();
        panelInferior = new Panel();
    }

    public void colocarComponentes() {
        //Establecemos el Gestor, Colocamos los Objetos en el Panel Superior
        panelSuperior.add(areaTexto);

        //Establecemos el Gestor, Colocamos los Objetos en el Panel Inferior
        panelInferior.add(bCrear);
        panelInferior.add(bGrabar);

        //Colocamos los Paneles en la Ventana
        ventana.add("North", panelSuperior);
        ventana.add("South", panelInferior);

        ventana.setVisible(true);
    }

    public void registrarEventos() {
        bCrear.addActionListener(new ManejadorBotones());
        bGrabar.addActionListener(new ManejadorBotones());

        mensajeError.addWindowListener(new CerrarVentana());
        ventana.addWindowListener(new CerrarVentana());
    }

    class ManejadorBotones implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //getSource devuelve la referencia del objeto fuente que ha detectado el evento
            Object fuente = e.getSource();

            if (fuente == bCrear) {
                cuadroDialogo = new FileDialog(ventana, "Guardar", FileDialog.SAVE);
                cuadroDialogo.setVisible(true);
                ruta = cuadroDialogo.getDirectory() + cuadroDialogo.getFile();
                pulsadoBotonCrear = true;
            } else if (fuente == bGrabar) {
                if (pulsadoBotonCrear) {
                    try {
                        flujoSalida = new FileWriter(ruta);
                        flujoSalida.write(areaTexto.getText());
                        flujoSalida.close();
                    } catch (IOException error) {
                        System.out.println(error.getMessage());
                    }
                } else {

                    mensajeError.setTitle("No Ha Pulsado el Boton de Cuadro de Dialogo");
                    mensajeError.setSize(100, 100);
                    mensajeError.setResizable(false);
                    mensajeError.setVisible(true);

                }

            }
        }
    }

    public static void main(String args[]) {
        GrabarFichero fichero = new GrabarFichero();
    }
}
