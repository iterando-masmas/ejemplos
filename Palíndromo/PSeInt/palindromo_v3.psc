//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/numero-palindromo-en-pseint/
Funcion cantidad_de_digitos <- cuenta_digitos(n)
	Si n=0 Entonces
		cantidad_de_digitos <- 0
	SiNo
		cantidad_de_digitos <- trunc(ln(n)/ln(10)) + 1
	FinSi
Fin Funcion

Funcion verifica_palindromo <-  es_palindromo_recursivo(n,factor)
	Si n>=0 y n<= 9 Entonces
		verifica_palindromo <- Verdadero
	SiNo
		digito_derecha <- n mod 10
		digito_izquierda <- trunc(n/factor)
		Si digito_derecha <> digito_izquierda Entonces
			verifica_palindromo <- False
		SiNo		
			n <- n mod factor
			n <- trunc(n/10)
			factor <- (factor/100)
			verifica_palindromo <- es_palindromo_recursivo(n, factor)
		FinSi	
	FinSi
Fin Funcion

Funcion verifica_palindromo <- es_palindromo (n)
	total_digitos <- cuenta_digitos(n)
 factor <- trunc(10^(total_digitos-1))
 verifica_palindromo <- es_palindromo_recursivo(n, factor)
Fin Funcion

Algoritmo Palindromo
	Escribir "Ingrese un número: "
	Leer n
	
	n <- abs(n)
	Si es_palindromo(n) Entonces
		Escribir "El número es palíndromo"
	SiNo
		Escribir "El número no es palíndromo"
	FinSi
FinAlgoritmo
