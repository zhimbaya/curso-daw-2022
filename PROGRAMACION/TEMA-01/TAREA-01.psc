Algoritmo Calculadora
	// 'Crea a través de la aplicación PSeInt una calculadora de '
	//'números a la cual se pasen como parámetros 2 operandos, '
	//'y como operador, un símbolo correspondiente a 
	//'la suma, resta, multiplicación o división.'
	
	Definir operacion como entero
	Definir operando1, operando2, resultado como REAL
	Escribir 'Seleccionar la operación a realizar:'
	Escribir '1 - suma'
	Escribir '2 - resta'
	Escribir '3 - multiplicación'
	Escribir '4 - divisón'
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
				Escribir 'La multiplicación es: ' , resultado
			SiNo
				Si operacion=4 Entonces
					Escribir 'Introducir primer operando'
					Leer operando1
					Escribir 'Introducir segundo operando'
					Leer operando2
					resultado<-operando1 / operando2
					Escribir 'La división es: ' , resultado	
				SiNo
					Escribir 'No has seleccionado ninguna operación'
				Fin Si
			FinSi
		FinSi
	FinSi
FinAlgoritmo
