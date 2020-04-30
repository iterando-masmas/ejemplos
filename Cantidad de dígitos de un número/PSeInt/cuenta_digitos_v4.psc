Funcion total_digitos <- cuenta_digitos(n)
	Si n=0 Entonces
		total_digitos <- 0	
	SiNo
		total_digitos <- 1 + cuenta_digitos(n-1)
	FinSi
	
Fin Funcion

Algoritmo Cuenta_digitos_de_un_numero
	Escribir "Ingrese un número: "
	Leer n
	
	n<-abs(n)
	total_digitos <- cuenta_digitos(n)
	Si total_digitos = 0 Entonces
		total_digitos <- 1
	FinSi
	Escribir "El número tiene ", total_digitos, " dígito(s)"
FinAlgoritmo
