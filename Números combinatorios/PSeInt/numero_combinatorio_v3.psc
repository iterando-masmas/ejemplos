// Creado por Andrés Melgar
// para iterando++ http://iterando.online
// entrada: http://iterando.online/ejercicios-resueltos/numero-combinatorio-en-pseint/
Funcion operacion <- combinatorio (n,k)
	n_menos_k<-n-k
	Si k>n_menos_k Entonces
		numero_mayor<-k
		numero_menor<-n_menos_k
	SiNo
		numero_mayor<-n_menos_k
		numero_menor<-k
	FinSi
	numerador<-1
	Para i<-numero_mayor+1 Hasta n Con Paso 1 Hacer
		numerador<-numerador*i
	Fin Para
	denominador<-1
	Para i<-1 Hasta numero_menor Con Paso 1 Hacer
		denominador<-denominador*i
	Fin Para
	operacion<-numerador/denominador
Fin Funcion

Algoritmo Numeros_Combinatorios
	Escribir "Ingrese n: "
	Leer n
	Escribir "Ingrese k: "
	Leer k
	
	Si n<0 o k<0 Entonces
		Escribir "n y k deben ser mayores o iguales que cero"		
	SiNo
		Si k>n Entonces
			Escribir "n debe ser mayor o igual que k"	
		SiNo
			Escribir "El combinatorio de n en k es ", combinatorio(n,k)
		FinSi		
	FinSi
	
FinAlgoritmo
