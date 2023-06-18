package Tema08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author anusk
 */
public class _04ErrorAritmtic {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double n1, n2;

        try {
            System.out.println("Introduce el primer número");
            n1 = Double.parseDouble(entrada.readLine());
            System.out.println("Introduce el segundo número");
            n2 = Double.parseDouble(entrada.readLine());
            
            if (n2 == 0) {
                throw new ArithmeticException();
            }
            System.out.println(n1 + "/" + n2 + " = " + n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede realiar una división por 0");
        } catch (Exception e) {
            System.out.println("Error leyendo los datos" + e);
        }
    }
}
