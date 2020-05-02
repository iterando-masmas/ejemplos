// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/factorial-en-pseint/
Funcion productoria <- factorial (n)
	productoria <- 1	
	Para i<-2 Hasta n Con Paso 1 Hacer
		productoria <- productoria*i
	Fin Para
Fin Funcion

Algoritmo Calculo_de_Factorial
	Escribir "Ingrese número n (0<=n<=20): "
	Leer n
	
	Si n<0 o n>20 Entonces
		Escribir "Debe ingresar un número en el rango [0..20]"
	SiNo
		Escribir n, "! = ", factorial(n)
	FinSi
FinAlgoritmo