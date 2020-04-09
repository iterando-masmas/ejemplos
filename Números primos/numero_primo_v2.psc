Algoritmo Teorema_de_Wilson
 Escribir "Ingrese un número natural (>0): "
 Leer n
	
 Si n<=0 o n>20 Entonces
  Escribir "El número debe estar entre [1..20]"
 SiNo
  factorial<-1  
  i<-2
  Mientras i<n Hacer
   factorial<-factorial*i
   i<-i+1
  FinMientras
  Si (factorial+1) mod n=0 y n>1 Entonces
   Escribir "El número es primo"
  SiNo
   Escribir "El número no es primo"
  FinSi
 FinSi
FinAlgoritmo
