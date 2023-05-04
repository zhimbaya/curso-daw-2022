package Tema11;

import java.awt.event.*;

class CerrarVentana extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
