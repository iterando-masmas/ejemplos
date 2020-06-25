// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/factorial-en-pseint/
Funcion productoria <- factorial (n)
	productoria <- 1
	i <- 1
	Repetir  
		productoria <- productoria*i
		i <- i+1
	Hasta Que i>n
Fin Funcion

Algoritmo Calculo_de_Factorial
	Escribir "Ingrese número n (0<=n<=22): "
	Leer n
	
	Si n<0 o n>22 Entonces
		Escribir "Debe ingresar un número en el rango [0..22]"
	SiNo
		Escribir n, "! = ", factorial(n)
	FinSi
FinAlgoritmo