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

Funcion producto<-MCD(a,b) 
	factor<-2
	producto<-1
	Mientras factor<=a y factor<=b Hacer
		Si a mod factor=0 o b mod factor=0 Entonces
			Si a mod factor=0 y b mod factor=0 Entonces
				producto<-producto*factor
			FinSi
			Si a mod factor=0 Entonces
				a <- trunc(a/factor)
			FinSi
			Si b mod factor=0 Entonces
				b <- trunc(b/factor)
			FinSi
		SiNo
			factor <- siguiente_primo(factor)
		FinSi		
	FinMientras
FinFuncion

Algoritmo Maximo_Comun_Divisor
	Escribir "Ingrese dos números: "
	Leer a, b
	Si a>0 y b>0 Entonces
		Escribir "MCD(", a, ",",b,")=", MCD(a,b)
	SiNo
		Escribir "Números inválidos"
	FinSi
FinAlgoritmo
