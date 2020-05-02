Funcion cantidad_de_digitos <- cuenta_digitos(n)
	Si n=0 Entonces
		cantidad_de_digitos <- 0
	SiNo
		cantidad_de_digitos <- trunc(ln(n)/ln(10)) + 1
	FinSi
Fin Funcion

Funcion verifica_palindromo <- es_palindromo (n)
	total_digitos <- cuenta_digitos(n)
 mitad <- trunc(total_digitos/2)
 factor <- trunc(10^(total_digitos - 1))
 i <- 1
 termino <- Falso
 verifica_palindromo <- Verdadero
 Mientras i<= mitad y no termino Hacer 
  digito_derecha <- n mod 10
		digito_izquierda <- trunc(n/factor)
		Si digito_derecha <> digito_izquierda Entonces
			verifica_palindromo <- Falso
			termino <- Verdadero
		FinSi
		n <- n mod factor       
	 n <- trunc(n/10)        
	 factor <- trunc(factor/100)        
	 i <- i+1
	FinMientras
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
