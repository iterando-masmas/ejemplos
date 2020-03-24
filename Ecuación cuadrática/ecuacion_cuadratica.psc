//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
Algoritmo EcuacionCuadratica
	Escribir 'Ingrese los coeficientes de a, b, c: '
	Leer a,b,c
	discriminante <- b^2-4*a*c
	Si discriminante>=0 Entonces
		Si discriminante=0 Entonces
			x <- -b/2*a
			Escribir 'La raíz única es: ',x
		SiNo
			x1 <- (-b+rc(discriminante))/(2*a)
			x2 <- (-b-rc(discriminante))/(2*a)
			Escribir 'La raíz x1 es: ',x1
			Escribir 'La raíz x2 es: ',x2
		FinSi
	SiNo
		discriminante <- abs(discriminante)
		parteReal <- -b/(2*a)
		parteImaginaria <- rc(discriminante)/(2*a)
		Escribir 'La raíz compleja x1 es: ',parteReal,' + ',parteImaginaria,'i'
		Escribir 'La raíz compleja x2 es: ',parteReal,' - ',parteImaginaria,'i'
	FinSi
FinAlgoritmo
