import java.io.*;

public class TestMatriz
{
	public static void main(String [] args)
	{
		Matriz matriz = new Matriz();
		
		matriz.leerMatriz();
		matriz.escribirMatriz();
		
		Matriz copia = new Matriz(matriz);
		copia.escribirMatriz();
		
		System.out.println("La Suma de la Diagonal Principal de la Matriz es: " + matriz.sumaDiagonal());
		System.out.println("La Suma Superior a la Diagonal es: " + matriz.sumaEncimaDiagonal());
		System.out.println("La Suma Inferior a la Diagonal es: " + matriz.sumaDebajoDiagonal());
		System.out.println("El Maximo de la Matriz es: " + matriz.maximo());
		
		Matriz traspuesta = matriz.traspuesta();
		System.out.println("La Matriz Traspuesta es: ");
		traspuesta.escribirMatriz();
		
		matriz.totales();
	}
}