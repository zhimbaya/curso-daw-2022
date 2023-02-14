import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Matriz
{
	//Miembros dato
	private double matriz[][];
	private int tamMaxFila;
	private int tamMaxColum;
	
	//Constructor Por Defecto
	public Matriz()
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce el Tamaño Maximo de las Filas");
		tamMaxFila = sc.nextInt();
		System.out.println("Introduce el Tamaño Maximo de las Columnas");
		tamMaxColum = sc.nextInt();
		matriz = new double[tamMaxFila][tamMaxColum];
	}
	
	//Constructor
	public Matriz(int tamMaxFila,int tamMaxColum)
	{
		this.tamMaxFila = tamMaxFila;
		this.tamMaxColum = tamMaxColum;
		matriz = new double[tamMaxFila][tamMaxColum];
	}
	
	//Constructor copia
	public Matriz(Matriz copia)
	{
		tamMaxFila = copia.tamMaxFila;
		tamMaxColum = copia.tamMaxColum;
		matriz = new double[tamMaxFila][tamMaxColum];
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila; f++)
		{
			for(c = 0; c < tamMaxColum; c++)
				matriz[f][c] = copia.matriz[f][c];
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void leerMatriz()
	{
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //Para delimitar parte entera de decimal con "." en lugar de con ","
		System.out.println("Introduce los Elementos de la Matriz");
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila; f++)
		{
			for(c = 0; c < tamMaxColum; c++)
			{
				matriz[f][c] = sc.nextDouble();
			}
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void escribirMatriz()
	{
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila; f++)
		{
			for(c = 0; c < tamMaxColum; c++)
			{
				System.out.print(matriz[f][c] + "\t");
			}	
			System.out.println("");
		}
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double sumaDiagonal()
	{
		double sumaDiag = 0;
		int i;
		
		for(i = 0; i < tamMaxFila; i++)
			sumaDiag = matriz[i][i] + sumaDiag;
		
		return sumaDiag;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double sumaEncimaDiagonal()
	{
		double sumaEnc = 0;
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila - 1; f++)
		{
			for(c = f + 1; c < tamMaxColum; c++)
				sumaEnc = matriz[f][c] + sumaEnc;
		}
		
		return sumaEnc;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double sumaDebajoDiagonal()
	{
		double sumaDeb = 0;
		int f;
		int c;
		
		for(c = 0; c < tamMaxColum - 1; c++)
		{
			for(f = c + 1; f < tamMaxFila; f++)
				sumaDeb = matriz[f][c] + sumaDeb;
		}
		
		return sumaDeb;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public Matriz traspuesta()
	{
		Matriz traspuesta = new Matriz(tamMaxFila,tamMaxColum);
		
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila; f++)
		{
			for(c = 0; c < tamMaxColum; c++)
				traspuesta.matriz[c][f] = matriz[f][c];
		}
		
		return traspuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double maximo()
	{
		double maximo = 0;
		int f;
		int c;
		
		for(f = 0; f < tamMaxFila; f++)
		{
			for(c = 0; c < tamMaxColum; c++)
			{
				if(matriz[f][c] > maximo)
					maximo = matriz[f][c];
			}
				
		}
		
		return maximo;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void totales()
	{
		double sumaFilas[] = new double[tamMaxFila];
		double sumaColum[] = new double[tamMaxColum];
		
		for(int f = 0; f < tamMaxFila; f++)
		{
			for(int c = 0; c < tamMaxColum; c++)
			{
				sumaFilas[f] = matriz[f][c] + sumaFilas[f];
				sumaColum[c] = matriz[f][c] + sumaColum[c];
			}
		}
		
		for(int f = 0; f < tamMaxFila; f++)
			System.out.println("Fila[" + f + "] = " + sumaFilas[f]);
			
		for(int c = 0; c < tamMaxColum; c++)
			System.out.println("Columna[" + c + "] = " + sumaColum[c]);
	}
}