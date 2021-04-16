Funcion n<-MCD(a,b) 
	Si a>=b Entonces
		divisor<-b
	SiNo
		divisor<-a
	FinSi
	encontro_MCD <- Falso
	Mientras divisor>=1 y no encontro_MCD Hacer
		Si a mod divisor=0 y b mod divisor=0 Entonces
			n<-divisor
			encontro_MCD <- Verdadero
		FinSi
		divisor <- divisor-1
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
