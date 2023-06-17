import java.io.*;
import java.util.Scanner;

public class Prueba
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
	  
	
      Circulo unCirculo = new Circulo();
      System.out.println(unCirculo.toString());
      System.out.println("Area del circulo = " + unCirculo.calcularArea());
      System.out.println("Longitud de la circunferencia = " + unCirculo.calcularPerimetro());
      System.out.println("Introduzca el nombre: ");
      String cadena = sc.nextLine();
      System.out.println("Introduzca el radio: ");
      String numero = sc.nextLine();
      Double d = new Double(numero);
      double real = d.doubleValue();
      Circulo otroCirculo = new Circulo(real, cadena);
      System.out.println(otroCirculo.toString());
      System.out.println("Area del circulo = " + otroCirculo.calcularArea());
      System.out.println("Longitud de la circunferencia = " + otroCirculo.calcularPerimetro());
    
  }
}
