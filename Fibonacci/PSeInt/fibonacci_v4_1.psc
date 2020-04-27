//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-pseint/
Algoritmo Sucesion_de_Fibonacci
	Escribir "Ingrese número de términos: "
	Leer n
	
	Si n<=0 Entonces
		Escribir "Debe ingresar un número mayor que cero"
	SiNo		
		Escribir 0	
		Si n>=2 Entonces
			anterior <- 0
			actual <- 1	
			i<-2
			Repetir				
				copia_actual<-actual
				actual<-actual+anterior
				anterior<-copia_actual
				Escribir actual
				i<-i+1
			Hasta Que i>n
		FinSi
	FinSi
FinAlgoritmo
