Algoritmo Verificacion_Numero_Primo
 Escribir "Ingrese un número natural (>0): "
 Leer n
	
 Si n<=0 Entonces
  Escribir "El número debe ser mayor que cero"
 SiNo
  cant_divisores<-0
  mitad<-trunc(n/2) 
  i<-2
  Mientras i<=mitad Hacer
   Si n mod i=0 Entonces
    cant_divisores <- cant_divisores+1
   FinSi
   i<-i+1
  FinMientras
  Si cant_divisores=0 Entonces
   Escribir "El número es primo"
  SiNo
   Escribir "El número no es primo"
  FinSi
 FinSi
FinAlgoritmo
