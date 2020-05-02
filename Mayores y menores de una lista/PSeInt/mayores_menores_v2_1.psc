//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-pseint/
Algoritmo Mayores_y_menores
	i<-0
	Repetir
		Escribir "Ingrese número ", i+1, ": "
		Leer n
		Si n>=0 Entonces					
			i<-i+1
			Si i=1 Entonces
				mayor_magnitud1 <- n
				menor_magnitud1 <- n						
			SiNo
				Si i=2 Entonces
					Si n>mayor_magnitud1 Entonces
						mayor_magnitud2<- mayor_magnitud1
						mayor_magnitud1<- n
					SiNo
						mayor_magnitud2<- n
					FinSi
					Si n<menor_magnitud1 Entonces
						menor_magnitud2<- menor_magnitud1
						menor_magnitud1<- n
					SiNo
						menor_magnitud2<- n
					FinSi
				SiNo	
					Si n>mayor_magnitud1 o n>mayor_magnitud2 Entonces
						Si n>mayor_magnitud1 Entonces
							mayor_magnitud2<- mayor_magnitud1
							mayor_magnitud1 <- n
						SiNo
							mayor_magnitud2 <- n
						FinSi
					FinSi
					Si n<menor_magnitud1 o n<menor_magnitud2 Entonces
						Si n<menor_magnitud1 Entonces
							menor_magnitud2<- menor_magnitud1
							menor_magnitud1 <- n
						SiNo
							menor_magnitud2 <- n
						FinSi
					FinSi
				FinSi
			FinSi			
		FinSi
	Mientras Que n>=0 
	Si i=0 Entonces
		Escribir "No se ha ingresado ningún número"
	SiNo
		Escribir "El 1er número con mayor magnitud es: ", mayor_magnitud1
		Si i>=2 Entonces
			Escribir "El 2do número con mayor magnitud es: ", mayor_magnitud2
		FinSi
		Escribir "El 1er con menor magnitud es: ", menor_magnitud1
		Si i>=2 Entonces
			Escribir "El 2do con menor magnitud es: ", menor_magnitud2
		FinSi
	FinSi
FinAlgoritmo