// Creado por Andr�s Melgar
// para iterando++ http://iterando.online
Algoritmo Calculadora_complejos
	Escribir 'Ingrese operaci�n (+,-,*): '
	Leer operacion
	Escribir 'Ingrese parte real del n�mero 1: '
	Leer par_real1
	Escribir 'Ingrese parte imaginaria del n�mero 1: '
	Leer par_imag1
	Escribir 'Ingrese parte real del n�mero 2: '
	Leer par_real2
	Escribir 'Ingrese parte imaginaria del n�mero 2: '
	Leer par_imag2	
	operacion_valida <- verdadero
	Si operacion='+' Entonces
			par_real <- par_real1+par_real2
			par_imag <- par_imag1+par_imag2
	SiNo
		Si operacion='-' Entonces
			par_real <- par_real1-par_real2
			par_imag <- par_imag1-par_imag2
		SiNo
			Si operacion='*' Entonces
				par_real <- par_real1*par_real2-par_imag1*par_imag2
				par_imag <- par_real1*par_imag2+par_imag1*par_real2
			SiNo
				operacion_valida <- Falso
				Escribir 'La operaci�n no es v�lida'
			FinSi
		FinSi
	FinSi
	Si operacion_valida Entonces
			Escribir 'El resultado es: ',par_real,' + ',par_imag,'i'		
	FinSi
FinAlgoritmo
