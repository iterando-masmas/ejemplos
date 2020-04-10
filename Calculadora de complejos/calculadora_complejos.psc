// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/calculadora-de-numeros-complejos-en-pseint/
Algoritmo Calculadora_complejos
	Escribir 'Ingrese operación (+,-,*,/): '
	Leer operacion
	Escribir 'Ingrese parte real del número 1: '
	Leer par_real1
	Escribir 'Ingrese parte imaginaria del número 1: '
	Leer par_imag1
	Escribir 'Ingrese parte real del número 2: '
	Leer par_real2
	Escribir 'Ingrese parte imaginaria del número 2: '
	Leer par_imag2
	division_por_cero <- Falso
	operacion_valida <- verdadero
	Segun operacion  Hacer
		'+':
			par_real <- par_real1+par_real2
			par_imag <- par_imag1+par_imag2
		'-':
			par_real <- par_real1-par_real2
			par_imag <- par_imag1-par_imag2
		'*':
			par_real <- par_real1*par_real2-par_imag1*par_imag2
			par_imag <- par_real1*par_imag2+par_imag1*par_real2
		'/':
			denominador <- par_real2^2+par_imag2^2
			Si denominador=0 Entonces
				division_por_cero <- verdadero
			SiNo				
				par_real <- par_real1*par_real2+par_imag1*par_imag2
				par_real <- par_real/denominador
				par_imag <- par_imag1*par_real2-par_real1*par_imag2
				par_imag <- par_imag/denominador
			FinSi
		De Otro Modo:
			operacion_valida <- Falso
			Escribir 'La operación no es válida'
	FinSegun
	Si operacion_valida Entonces
		Si division_por_cero Entonces
			Escribir 'No se puede dividir entre cero'
		SiNo
			Escribir 'El resultado es: ',par_real,' + ',par_imag,'i'
		FinSi
	FinSi
FinAlgoritmo
