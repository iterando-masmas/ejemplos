Algoritmo Suma_potencias_x
	Escribir "Ingrese el valor de x(|x|<1): "
	Leer x
	Escribir "Ingrese la cantidad de términos: "
	Leer n
	
	Si abs(x)>=1 Entonces
		Escribir "Valor de x incorrecto"
	SiNo		
		i <-0
		suma <- 0
		Mientras i<n Hacer
			suma <- suma + x^i
			i <- i+1
		FinMientras
		Escribir "El valor de 1/(1-x) es: ", suma
	FinSi
FinAlgoritmo
