/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema09;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Suma {

    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<Integer>();
        String str;
        do {
            str = JOptionPane.showInputDialog("Introduce un número " + (conjunto.size() + 1) + ":");
            try {
                Integer n = Integer.parseInt(str);
                if (!conjunto.add(n)) {
                    JOptionPane.showMessageDialog(null, "Número ya en la lista. Debes introducir otro.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Número erróneo.");
            }

        } while (conjunto.size() < 5);

        // Calcular la suma
        //Integer suma = new Integer(0);
        Integer suma = 0;
        for (Integer i : conjunto) {
            suma = suma + i;
        }
        JOptionPane.showMessageDialog(null, "La suma es:" + suma);

    }

}
