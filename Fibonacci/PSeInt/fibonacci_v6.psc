//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-pseint/
Funcion inicializar_arreglo(fibonacci)
	fibonacci[1]<-0
	fibonacci[2]<-1
	Para i<-3 Hasta 79 Con Paso 1 Hacer
		fibonacci[i]<-fibonacci[i-1]+fibonacci[i-2]
	Fin Para			
Fin Funcion

Algoritmo Sucesion_de_Fibonacci
	Escribir "Ingrese número de términos: "
	Leer n
	
	Si n<=0 o n>79 Entonces
		Escribir "Debe ingresar un número en el rango [0..79]"
	SiNo		
		Dimension fibonacci[80]
		inicializar_arreglo(fibonacci)
		Para i<-1 Hasta n Con Paso 1 Hacer
			Escribir fibonacci[i]
		Fin Para			
	FinSi	
	Escribir z
FinAlgoritmo
