Funcion descomponer_factores(n)
	Escribir n, " = " Sin Saltar
	factor_primo <- 2	
	primer_factor <- Verdadero
	Repetir
		Si n mod factor_primo = 0 Entonces
			Si primer_factor Entonces
				Escribir factor_primo Sin Saltar
				primer_factor <- Falso
			SiNo
				Escribir "x", factor_primo Sin Saltar
			FinSi			
			n <- trunc(n/factor_primo)			
		SiNo
			factor_primo <- factor_primo+1
		FinSi
	Mientras Que n>1
FinFuncion

Algoritmo Descomposicion_factores_primos
	Escribir "Ingrese un número (>1): "
	Leer n
	Si n<=1 Entonces
		Escribir "Debe ingresar un número mayor que uno"
	SiNo
		descomponer_factores(n)
	FinSi		
FinAlgoritmo
