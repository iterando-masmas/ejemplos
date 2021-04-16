Funcion n<-MCD(a,b) 
	m <- a
	n <- b
	fin_iteracion <- Falso
	Mientras no fin_iteracion Hacer
		Si n<m Entonces //n siempre tiene el valor mayor
			auxiliar <- m
			m <- n
			n <- auxiliar
		FinSi
		Si m=0 Entonces
			fin_iteracion <- Verdadero
		SiNo
			n <- n-m
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
