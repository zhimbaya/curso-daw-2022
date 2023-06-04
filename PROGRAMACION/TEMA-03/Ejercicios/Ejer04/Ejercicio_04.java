package Tema03;

public class Ejercicio_04 {

    public static void main(String[] args) {

        NIF nif = new NIF();
        nif.leer();
        System.out.println(nif.toString());
        
        NIF nif2 = new NIF(123456);
        System.out.println(nif2);
    }

}
