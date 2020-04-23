Funcion termino_serie<-fibonacci (n)
	Si n=1 Entonces
		termino_serie <- 0		
	SiNo
		Si n=2 Entonces
			termino_serie <- 1			
		SiNo
			termino_serie <- fibonacci(n-1)+fibonacci(n-2)			
		FinSi
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
