package Tema08;

public class _02CalculadoraV2 {

    public static void main(String[] args) throws ErrorNumeroArgumentos {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        try {
            if (args.length != 3) {
                throw new ErrorNumeroArgumentos("Número de parametros del main incorrecto. Deben ser 3 parámetros");
            } else {
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
                        if (args[1].compareTo(args[2]) == 0) {
                            throw new ErrorNumeradorDenominadorIguales("El resultado de dividir es la unidad");
                        } else {
                            System.out.println("Dividir " + args[1] + " y " + args[2]);
                            System.out.println("Resultado: " + (Integer.parseInt(args[1]) / Integer.parseInt(args[2])));
                        }
                        break;
                }
            }
        } catch (ErrorNumeroArgumentos error) {
            System.out.println(error);
        } catch (ErrorNumeradorDenominadorIguales error) {
            System.out.println(error);
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir por 0");
        } catch (NumberFormatException error) {
            System.out.println("Los operandos deben ser enteros");
        } finally {
            System.out.println("Hasta la próxima");
        }

    }

}

class ErrorNumeroArgumentos extends Exception {

    public ErrorNumeroArgumentos(String mensaje) {
        super(mensaje);
    }
}

class ErrorNumeradorDenominadorIguales extends Exception {

    public ErrorNumeradorDenominadorIguales(String mensaje) {
        super(mensaje);
    }
}
