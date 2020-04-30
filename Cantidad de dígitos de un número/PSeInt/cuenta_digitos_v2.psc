Funcion total_digitos <- cuenta_digitos(n)
	total_digitos <- 0	
	Repetir
		total_digitos <- total_digitos + 1
		n <- trunc(n/10)
	Mientras Que n>0
Fin Funcion

Algoritmo Cuenta_digitos_de_un_numero
	Escribir "Ingrese un número: "
	Leer n
	
	n<-abs(n)
	Escribir "El número tiene ", cuenta_digitos(n), " dígito(s)"
FinAlgoritmo
