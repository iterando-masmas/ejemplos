Funcion n<-MCD(a,b) 
	Si a>=b Entonces
		m=a
		n=b
	SiNo
		m=b
		n=a
	FinSi
	Repetir
		resto <- m mod n
		Si resto<>0 Entonces
			m <- n
			n <- resto
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
