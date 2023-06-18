package Tema08;

public class _01Calculadora {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        try {
            switch (args[0].charAt(0)) {
                case '+':
                    System.out.println("Sumar " + args[1] + " y " + args[2]);
                    System.out.println("Resultado: " + (Integer.parseInt(args[1]) + Integer.parseInt(args[2])));
                    break;
                case '-':
                    System.out.println("Restar " + args[1] + " y " + args[2]);
                    System.out.println("Resultado: " + (Integer.parseInt(args[1]) - Integer.parseInt(args[2])));
                    break;
                case '*':
                    System.out.println("Multiplicar " + args[1] + " y " + args[2]);
                    System.out.println("Resultado: " + (Integer.parseInt(args[1]) * Integer.parseInt(args[2])));
                    break;
                case '/':
                    System.out.println("Dividir " + args[1] + " y " + args[2]);
                    System.out.println("Resultado: " + (Integer.parseInt(args[1]) / Integer.parseInt(args[2])));
                    break;
            }

        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Numero de parametros incorrecto");
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir por 0");
        } catch (NumberFormatException error) {
            System.out.println("Los operandos deben ser enteros");
        } finally {
            System.out.println("Hasta la próxima");
        }

    }

}
