Funcion total_digitos <- cuenta_digitos(n)
	total_digitos <- 0
	Mientras n > 0 Hacer
		total_digitos <- total_digitos + 1
		n <- trunc(n/10)
	FinMientras
	Si total_digitos=0 Entonces
		total_digitos <- 1
	FinSi
Fin Funcion

Algoritmo Cuenta_digitos_de_un_numero
	Escribir "Ingrese un número: "
	Leer n
	
	n<-abs(n)
	Escribir "El número tiene ", cuenta_digitos(n), " dígito(s)"
FinAlgoritmo
