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
				mayor_magnitud <- n			
				menor_magnitud <- n
			SiNo
				Si n>mayor_magnitud Entonces
					mayor_magnitud <- n
				FinSi
				Si n<menor_magnitud Entonces
					menor_magnitud <- n
				FinSi
			FinSi			
		FinSi
	Hasta Que n<0 
	Si i=0 Entonces
		Escribir "No se ha ingresado ningún número"
	SiNo
		Escribir "El número con mayor magnitud es: ", mayor_magnitud
		Escribir "El número con menor magnitud es: ", menor_magnitud
	FinSi
FinAlgoritmo

