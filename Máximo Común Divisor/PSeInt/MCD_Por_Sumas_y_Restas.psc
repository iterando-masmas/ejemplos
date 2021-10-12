Funcion b<-MCD(a,b) 
	fin_iteracion <- Falso
	Mientras no fin_iteracion Hacer
		Si b<a Entonces 
			auxiliar <- a
			a <- b
			b <- auxiliar
		FinSi
		Si a=0 Entonces
			fin_iteracion <- Verdadero
		SiNo
			b <- b-a
		FinSi
	FinMientras 
FinFuncion

Algoritmo Maximo_Comun_Divisor
	Escribir "Ingrese dos números: "
	Leer a, b
	Si a>0 y b>0 Entonces
		Escribir "MCD(", a, ",",b,")=", MCD(a,b)
	SiNo
		Escribir "Números inválidos"
	FinSi
FinAlgoritmo
