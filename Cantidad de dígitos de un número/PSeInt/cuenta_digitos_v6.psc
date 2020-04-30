Funcion total_digitos <- cuenta_digitos(n, base)
	Si n=0 Entonces
		total_digitos <- 1	
	SiNo
		total_digitos <- trunc(ln(n)/ln(base))+1
	FinSi
	
Fin Funcion

Algoritmo Cuenta_digitos_de_un_numero
	Escribir "Ingrese un número: "
	Leer n
	Escribir "Ingrese una base: "
	Leer base
	
	n<-abs(n)	
	Si base >1 Entonces
		Escribir "El número tiene ", cuenta_digitos(n, base), " dígito(s) en la base ", base
	SiNo
		Escribir "La base debe ser mayor que 1"
	FinSi
	
FinAlgoritmo
