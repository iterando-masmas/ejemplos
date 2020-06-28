Funcion operacion <- combinatorio (n,k)
	Si n>=0 y k=0 Entonces
		operacion<-1
	SiNo
		Si n=0 y k>0 Entonces
			operacion<-0
		SiNo
			operacion<-combinatorio(n-1,k-1)+combinatorio(n-1,k)
		FinSi
	FinSi
Fin Funcion

Algoritmo Numeros_Combinatorios
	Escribir "Ingrese n: "
	Leer n
	Escribir "Ingrese k: "
	Leer k
	
	Si n<=0 o k<=0 Entonces
		Escribir "n y k deben ser mayores que cero"		
	SiNo
		Si k>n Entonces
			Escribir "n debe ser mayor o igual que k"	
		SiNo
			Escribir "El combinatorio de n en k es ", combinatorio(n,k)
		FinSi		
	FinSi
	
FinAlgoritmo
