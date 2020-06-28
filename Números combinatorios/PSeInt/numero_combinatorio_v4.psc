Funcion inicializa_arreglo(combinatorio Por Referencia)
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		combinatorio[0,i]<-0
		combinatorio[i,0]<-1
	Fin Para
	Para n<-1 Hasta 19 Con Paso 1 Hacer
		Para k<-1 Hasta n Con Paso 1 Hacer
			combinatorio[n,k]<-combinatorio[n-1,k-1]+combinatorio[n-1,k]
		FinPara
	FinPara
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
			Dimension combinatorio[20,20]
			inicializa_arreglo(combinatorio)
			Escribir "El combinatorio de n en k es ", combinatorio[n,k]
		FinSi		
	FinSi
	
FinAlgoritmo
