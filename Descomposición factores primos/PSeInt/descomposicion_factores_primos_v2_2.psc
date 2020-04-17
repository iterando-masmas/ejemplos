//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-pseint/
Funcion verifica_si_es_primo <- es_primo(n)
	verifica_si_es_primo <- Verdadero
	Si n<=0 Entonces
		verifica_si_es_primo <- False
	SiNo
		cant_divisores<-0
		encontro_divisores<-Falso
		limite<-trunc(rc(n)) 
		i<-2
		Mientras i<=limite y no encontro_divisores Hacer
			Si n mod i=0 Entonces
				cant_divisores <- cant_divisores+1
			FinSi
			i<-i+1
		FinMientras
		Si cant_divisores>0  o n=1 Entonces
			verifica_si_es_primo <- False
		FinSi
	FinSi
Fin Funcion

Funcion n <- siguiente_primo(n)
	Repetir
		n <- n+1
	Mientras Que no es_primo(n) 
Fin Funcion

Funcion escribe_factor(hay_factores Por Referencia, factor_primo, cant_factores Por Referencia)
	Si hay_factores Entonces  
		Escribir "x" 
	SiNo
		hay_factores <- Verdadero
	FinSi
	Si cant_factores=1 Entonces
		Escribir factor_primo
	SiNo
		Escribir factor_primo, "^", cant_factores
	FinSi
	cant_factores <- 0
FinFuncion

Funcion descomponer_factores(n)
	productoria <- 1
	copia_n <- n
	factor_primo <- 2
	cant_factores <- 0
	hay_factores<-Falso
	Repetir
		resto <- copia_n mod factor_primo
		Si resto=0 Entonces			
			copia_n <- trunc(copia_n/factor_primo)
			productoria<-productoria*factor_primo
			cant_factores <- cant_factores+1
		SiNo
			Si cant_factores > 0 Entonces
				escribe_factor(hay_factores, factor_primo, cant_factores)			 
			FinSi			
			factor_primo <- siguiente_primo(factor_primo)
		FinSi
	Mientras Que productoria<>n	
	escribe_factor(hay_factores, factor_primo, cant_factores)			 
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
