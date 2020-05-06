//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/numero-palindromo-en-pseint/
Funcion numero_invertido <- invierte_numero(n)
	numero_invertido <- 0
	Mientras n>0 Hacer
		digito <- n mod 10
	 numero_invertido <- numero_invertido*10
	 numero_invertido <- numero_invertido+digito
	 n <- trunc(n/10)
	FinMientras
Fin Funcion

Funcion verifica_palindromo <- es_palindromo (n)
	numero_invertido <- invierte_numero(n)
	verifica_palindromo <- n = numero_invertido
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
