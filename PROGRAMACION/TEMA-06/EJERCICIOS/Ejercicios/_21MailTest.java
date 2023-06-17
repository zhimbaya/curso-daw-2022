package Tema06.Ejercicios;

import java.util.Scanner;

public class _21MailTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu email");
        String email = sc.nextLine();

        _21Email e = new _21Email(email);

        System.out.println(e);

        if (e.esCorrecto()) {
            System.out.println("El email es válido");
        } else {
            System.out.println("El email no es válido");
        }
    }

}
