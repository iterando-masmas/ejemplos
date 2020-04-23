Funcion actual <- fibonacci (n)
	Si n<=2 Entonces
		actual <- n-1
	SiNo
		anterior <- 0
		actual <- 1	
		i<-2
		Repetir				
			copia_actual<-actual
			actual<-actual+anterior
			anterior<-copia_actual		
			i<-i+1
		Hasta Que i=n
	FinSi
Fin Funcion

Algoritmo Sucesion_de_Fibonacci
	Escribir "Ingrese número de términos: "
	Leer n
	
	Si n<=0 Entonces
		Escribir "Debe ingresar un número mayor que cero"
	SiNo		
		Para i<-1 Hasta n Con Paso 1 Hacer
			Escribir fibonacci(i)
		Fin Para
	FinSi
FinAlgoritmo
