//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-pseint/
Algoritmo Verificacion_Numero_Primo
 Escribir "Ingrese un número natural (>0): "
 Leer n
	
 Si n<=0 Entonces
  Escribir "El número debe ser mayor que cero"
 SiNo
	 cant_divisores<-0
	 encontro_divisores<-Falso
  limite<-trunc(rc(n)) 
  i<-2
  Mientras i<=limite y no encontro_divisores Hacer
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
