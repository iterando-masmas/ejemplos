//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-pseint/
Algoritmo Verificacion_Numero_Primo
  Escribir "Ingrese un número natural (>0): "
  Leer n
  
  Si n<=0 Entonces
    Escribir "El número debe ser mayor que cero"
  SiNo
    encontro_divisores<-Falso
    i<-2
    Mientras i<n y no encontro_divisores Hacer
      Si n mod i=0 Entonces
        encontro_divisores<-Verdadero
      FinSi
      i<-i+1
    FinMientras
    Si no encontro_divisores y n>1 Entonces
      Escribir "El número es primo"
    SiNo
      Escribir "El número no es primo"
    FinSi
  FinSi
FinAlgoritmo