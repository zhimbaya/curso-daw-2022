import java.io.*;

class TestColaDinamica
{
	public static void main(String args[])
	{
		ColaDinamica cola = new ColaDinamica();
		Character caracter;
		
		for(char car = 'a'; car <= 'z'; car++) //Rellenamos con todo el abecedario
		{
			caracter = new Character(car);
			cola.insertar(caracter);
		}
		
		while(!cola.vacia()) //Ahora los vamos sacando para mostrarlos (saldrán en el mismo orden que entraron por ser una cola)
		{
			caracter = (Character)cola.eliminar();
			char car = caracter.charValue();
			System.out.print("" + car);
		}
		
		System.out.println("\n");
	}
}