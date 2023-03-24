import java.io.*;

class TestPilaDinamica
{
	public static void main(String args[])
	{
		PilaDinamica pila = new PilaDinamica();
		Character caracter;
		
		for(char car = 'a'; car <= 'z'; car++)
		{
			caracter = new Character(car);
			pila.insertar(caracter);
		}
		
		while(!pila.vacia()) //se mostrarán en orden inverso a como entraron, es decir, ultimo en entra, primero en salir (Pila)
		{
			caracter = (Character)pila.eliminar();
			char car = caracter.charValue();
			System.out.print("" + car);
		}
		
		System.out.println("\n");
	}
}