//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-pseint/
Funcion verifica_si_es_primo <- es_primo(n)	
	Si n<=1 Entonces
		verifica_si_es_primo <- Falso
	SiNo		
		encontro_divisores <- Falso
		i <- 2
		Mientras i<=rc(n) y no encontro_divisores Hacer
			Si n mod i=0 Entonces
				encontro_divisores <- Verdadero
			FinSi
			i <- i+1
		FinMientras		
		verifica_si_es_primo <- no encontro_divisores		
	FinSi
Fin Funcion

Funcion n <- siguiente_primo(n)
	Repetir
		n <- n+1
	Mientras Que no es_primo(n) 
Fin Funcion

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
			factor_primo <- siguiente_primo(factor_primo)
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