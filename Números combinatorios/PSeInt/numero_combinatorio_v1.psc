// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/numero-combinatorio-en-pseint/
Funcion productoria <- factorial (n)
	productoria <- 1	
	Para i<-2 Hasta n Con Paso 1 Hacer
		productoria <- productoria*i
	Fin Para
Fin Funcion

Funcion operacion <- combinatorio (n,k)
	operacion <- factorial(n)/(factorial(k)*factorial(n-k))
Fin Funcion

Algoritmo Numeros_Combinatorios
	Escribir "Ingrese n: "
	Leer n
	Escribir "Ingrese k: "
	Leer k
	
	Si n<0 o k<0 Entonces
		Escribir "n y k deben ser mayores o iguales que cero"		
	SiNo
		Si k>n Entonces
			Escribir "n debe ser mayor o igual que k"	
		SiNo
			Escribir "El combinatorio de n en k es ", combinatorio(n,k)
		FinSi		
	FinSi
FinAlgoritmo
