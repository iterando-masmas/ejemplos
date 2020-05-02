Funcion cantidad_de_digitos <- cuenta_digitos(n)
	Si n=0 Entonces
		cantidad_de_digitos <- 0
	SiNo
		cantidad_de_digitos <- trunc(ln(n)/ln(10)) + 1
	FinSi
Fin Funcion

Funcion verifica_Armstrong <- es_Armstrong(n)
	total_digitos <- cuenta_digitos(n);
	copia_numero <- n
	suma_de_potencias <- 0
	Para i<-1 Hasta total_digitos Con Paso 1 Hacer
		digito <- copia_numero mod 10
		copia_numero <- trunc(copia_numero/10)
		suma_de_potencias <- suma_de_potencias+digito^total_digitos
	Fin Para
	verifica_Armstrong <- n=suma_de_potencias
Fin Funcion

Algoritmo lista_de_Armstrong
	limite <- 2^31-1
	Para i<-1 Hasta limite Con Paso 1 Hacer
		Si es_Armstrong(i) Entonces
			Escribir i
		FinSi
	Fin Para
FinAlgoritmo
