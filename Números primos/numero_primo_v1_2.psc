Algoritmo Verificacion_Numero_Primo
 Escribir "Ingrese un número natural (>0): "
 Leer n
	
 Si n<=0 Entonces
  Escribir "El número debe ser mayor que cero"
 SiNo
	 cant_divisores<-0
	 encontro_divisores<-Falso
  i<-2
  Mientras i<n y no encontro_divisores Hacer
   Si n mod i=0 Entonces
	   cant_divisores <- cant_divisores+1
	   encontro_divisores<-Verdadero
   FinSi
   i<-i+1
  FinMientras
  Si cant_divisores=0 y n>1 Entonces
   Escribir "El número es primo"
  SiNo
   Escribir "El número no es primo"
  FinSi
 FinSi
FinAlgoritmo
