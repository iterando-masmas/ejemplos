// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/factorial-en-pseint/
Funcion inicializar_arreglo (factorial Por Referencia)
	factorial[0] <- 1
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		factorial[i] <- i*factorial[i-1]
	Fin Para
Fin Funcion

Algoritmo Calculo_de_Factorial
	Escribir "Ingrese número n (0<=n<=20): "
	Leer n
	
	Si n<0 o n>20 Entonces
		Escribir "Debe ingresar un número en el rango [0..20]"
	SiNo		
		Dimension factorial[21]
		inicializar_arreglo(factorial)
		Escribir n, "! = ", factorial[n]
	FinSi
FinAlgoritmo