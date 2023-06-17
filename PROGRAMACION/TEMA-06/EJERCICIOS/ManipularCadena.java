package Tema06;

import java.io.*;

public class ManipularCadena {
    //Miembros dato

    private int tamMax;
    private char cadena[];

    //Constructores
    public ManipularCadena(int tamMax) {
        this.tamMax = tamMax;
        cadena = new char[tamMax + 1];
    }

    //Constructor copia
    public ManipularCadena(ManipularCadena copia) {
        tamMax = copia.tamMax;
        cadena = new char[tamMax + 1];
        int i;

        for (i = 0; copia.cadena[i] != '\0'; i++) {
            cadena[i] = copia.cadena[i];
        }

        cadena[i] = '\0';
    }

    public void leerCadena() throws IOException {
        char caracter;
        int i = 0;

        System.getProperty("line.separator").charAt(0);
        System.out.println("Introduce una Cadena y Pulse Intro Para Terminar");

        while (((caracter = (char) System.in.read()) != System.getProperty("line.separator").charAt(0)) && i < cadena.length) {
            //Se supone que para los linux System.getProperty("line.separator") devuelve la cadena "\n" y para los Windows la cadena "\r\n", y que luego pasamos a caracter. Tb podemos comparar
            //directa/ con los caracteres: (char)System.in.read()) != '\n' para los linux y (char)System.in.read()) != '\r' para los Windows
            cadena[i] = caracter;
            i++;
        }

        cadena[i] = '\0';
    }

    public void escribirCadena() {
        int i = 0;

        while (cadena[i] != '\0') {
            System.out.print(cadena[i]);
            i++;
        }
    }

    public int longitud() {
        int i = 0;

        while (cadena[i] != '\0') {
            i++;
        }

        return i;
    }

    public void copiar(ManipularCadena cadena2) {
        cadena = new char[tamMax + 1];
        int i;

        for (i = 0; cadena2.cadena[i] != '\0'; i++) {
            cadena[i] = cadena2.cadena[i];
        }

        cadena2.cadena[i] = '\0';
    }

    public boolean esVocal(char car) {
        car = Character.toLowerCase(car);
        return (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'
                || car == '�' || car == '�' || car == '�' || car == '�' || car == '�');
    }

    public void eliminarVocales() {
        int i = 0;
        int ultimoCar = longitud() - 1;

        while (i < longitud()) {
            if (esVocal(cadena[i])) {
                for (int j = i; j < longitud(); j++) {
                    cadena[j] = cadena[j + 1];
                }

                ultimoCar--;
            } else {
                i++;
            }
        }
    }

    public boolean contieneCadena(ManipularCadena cadena2) {
        eliminarEspacios();
        for (int i = 0; i < longitud() - cadena2.longitud(); i++) {
            if (cadena[i] == cadena2.cadena[0]) {
                int j = 0;
                boolean salir = false;

                while (j < cadena2.longitud() && !salir) {
                    if (cadena[i + j] == cadena2.cadena[j]) {
                        j++;
                    } else {
                        salir = true;
                    }
                }

                if (j == cadena2.longitud()) {
                    return true;
                }
            }
        }

        return false;

    }

    public boolean contieneCadena2(ManipularCadena cadena4) {
        int i = 0;
        int j = 0;
        boolean salir = false;
        while (i < longitud() && j < cadena4.longitud() || !salir) {
            if (cadena[i] == cadena4.cadena[j]) {
                i++;
                j++;
            } else {
                salir = true;
            }
        }

        if (j == cadena4.longitud()) {
            return true;
        } else {
            return false;
        }
    }

    public void convertirAmayusculas() {
        int salto = 'A' - 'a';

        for (int i = 0; cadena[i] != '\0'; i++) {
            if (cadena[i] >= 'a' && cadena[i] <= 'z') {
                cadena[i] = (char) (cadena[i] + salto);
            }
            //Por otro lado consideraremos tb las acentuadas:
            if (cadena[i] == '�') {
                cadena[i] = '�';
            }
            if (cadena[i] == '�') {
                cadena[i] = '�';
            }
            if (cadena[i] == '�') {
                cadena[i] = '�';
            }
            if (cadena[i] == '�') {
                cadena[i] = '�';
            }
            if (cadena[i] == '�') {
                cadena[i] = '�';
            }
        }
    }

    public void eliminarEspacios() {
        int i = 0;
        int ultimoCar = longitud() - 1;

        while (i < longitud()) {
            if (cadena[i] == ' ') {
                for (int j = i; j < longitud(); j++) {
                    cadena[j] = cadena[j + 1];
                }

                ultimoCar--;
            } else {
                i++;
            }
        }
    }

    public boolean esPalindromo() {
        eliminarEspacios();

        int ultimoCar = longitud() - 1;
        int i = 0;

        for (i = 0; cadena[i] != '\0'; i++) {
            if (cadena[i] != cadena[ultimoCar]) {
                return false;
            }

            ultimoCar--;
        }

        return true;
    }

}
