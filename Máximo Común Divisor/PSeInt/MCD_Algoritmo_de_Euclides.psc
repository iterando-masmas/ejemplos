Funcion b<-MCD(a,b) 
	Si b>a Entonces
		aux <- a
		a<-b
		b<-aux
	FinSi
	Repetir
		resto <- a mod b
		Si resto<>0 Entonces
			a <- b
			b <- resto
		FinSi
	Mientras Que resto<>0 
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
