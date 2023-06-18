package Tema08;

public class _03CalculadoraV3 {

    public static void main(String[] args) throws ErrorNumeroArgumentos2 {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        try {
            if (args.length != 3) {
                throw new ErrorNumeroArgumentos2("n de parametros del main incorrecto. Deben ser 3 parámetros");
            } else {
                switch (args[0].charAt(0)) {
                    case '+':
                        System.out.println("Sumar " + args[1] + " y " + args[2]);
                        System.out.println("Resultado: " + (Integer.parseInt(args[1]) + Integer.parseInt(args[2])));
                        break;
                    case '-':
                        if (args[1].compareTo(args[2]) == 0) {
                            throw new ErrorOperandosIguales2("El resultado de restar numeros iguales siempre es cero");
                        } else {
                            System.out.println("Restar " + args[1] + " y " + args[2]);
                            System.out.println("Resultado: " + (Integer.parseInt(args[1]) - Integer.parseInt(args[2])));
                        }
                        break;
                    case '*':
                        System.out.println("Multiplicar " + args[1] + " y " + args[2]);
                        System.out.println("Resultado: " + (Integer.parseInt(args[1]) * Integer.parseInt(args[2])));
                        break;
                    case '/':
                        if (args[1].compareTo(args[2]) == 0) {
                            throw new ErrorOperandosIguales2("El resultado de dividir es la unidad");
                        } else {
                            System.out.println("Dividir " + args[1] + " y " + args[2]);
                            System.out.println("Resultado: " + (Integer.parseInt(args[1]) / Integer.parseInt(args[2])));
                        }
                        break;
                }
            }
        } catch (ErrorNumeroArgumentos2 error) {
            System.out.println(error);
        } catch (ErrorOperandosIguales2 error) {
            System.out.println(error);
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir por 0");
        } /*catch(NumberFormatException error) {
			System.out.println("Los operandos deben ser enteros");
		}
         */ catch (Exception error) {
            System.out.println("Manejador de excepcion por defecto");
            //System.out.println("Ha ocurrido excepcion:"+error.getMessage());
            System.out.println("Ha ocurrido excepcion: " + error.toString());
            //error.printStackTrace();
        } finally {
            System.out.println("Hasta la próxima");
        }

    }

}

class ErrorNumeroArgumentos2 extends Exception {

    public ErrorNumeroArgumentos2(String mensaje) {
        super(mensaje);
    }
}

class ErrorNumeradorDenominadorIguales2 extends Exception {

    public ErrorNumeradorDenominadorIguales2(String mensaje) {
        super(mensaje);
    }
}

class ErrorOperandosIguales2 extends Exception {

    public ErrorOperandosIguales2(String mensaje) {
        super(mensaje);
    }
}
