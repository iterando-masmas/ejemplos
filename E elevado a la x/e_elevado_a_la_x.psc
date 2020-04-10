//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/e-elevado-a-la-x-en-pseint/
Algoritmo e_elevado_a_la_x
	Escribir "Ingrese el valor de x: "
	Leer x
	Escribir "Ingrese la cantidad de términos: "
	Leer n
	
	Si n>=24 Entonces
		Escribir "La cantidad de términos debe ser menor a 24"
	Sino
		i<-0
		sumatoria <- 0
		factorial<-1
		Repetir
			Si i<>0 Entonces
				factorial <- factorial*i
			FinSi		
			sumatoria <- sumatoria + x^i/factorial				
			i<-i+1
		Mientras Que i<n
		Escribir "e^x = ", sumatoria
	FinSi
FinAlgoritmo
