Algoritmo Calculadora
	// 'Crea a trav�s de la aplicaci�n PSeInt una calculadora de '
	//'n�meros a la cual se pasen como par�metros 2 operandos, '
	//'y como operador, un s�mbolo correspondiente a 
	//'la suma, resta, multiplicaci�n o divisi�n.'
	
	Definir operacion como entero
	Definir operando1, operando2, resultado como REAL
	Escribir 'Seleccionar la operaci�n a realizar:'
	Escribir '1 - suma'
	Escribir '2 - resta'
	Escribir '3 - multiplicaci�n'
	Escribir '4 - divis�n'
	Leer operacion
	Si operacion=1 Entonces
		Escribir 'Introducir primer operando'
		Leer operando1
		Escribir 'Introducir segundo operando'
		Leer operando2
		resultado<-operando1 + operando2
		Escribir 'La suma es: ' , resultado
	Sino
		Si operacion=2 Entonces
		Escribir 'Introducir primer operando'
		Leer operando1
		Escribir 'Introducir segundo operando'
		Leer operando2
		resultado<-operando1 - operando2
		Escribir 'La resta es: ' , resultado
		SiNo
			si operacion=3 Entonces
				Escribir 'Introducir primer operando'
				Leer operando1
				Escribir 'Introducir segundo operando'
				Leer operando2
				resultado<-operando1 * operando2
				Escribir 'La multiplicaci�n es: ' , resultado
			SiNo
				Si operacion=4 Entonces
					Escribir 'Introducir primer operando'
					Leer operando1
					Escribir 'Introducir segundo operando'
					Leer operando2
					resultado<-operando1 / operando2
					Escribir 'La divisi�n es: ' , resultado	
				SiNo
					Escribir 'No has seleccionado ninguna operaci�n'
				Fin Si
			FinSi
		FinSi
	FinSi
FinAlgoritmo
