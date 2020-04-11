#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-python/
import math
i=0
mayor_magnitud = -math.inf
menor_magnitud = math.inf
while True:
    n=int(input("Ingrese número {:d}: ".format(i+1)))
    if n < 0:
        break
    i+=1
    if n > mayor_magnitud:
        mayor_magnitud = n
    if n < menor_magnitud:
         menor_magnitud = n
if i == 0:
    print("No se ha ingresado ningún número");
else:
    print("El número con mayor magnitud es: {:d}".format(mayor_magnitud))
    print("El número con menor magnitud es: {:d}".format(menor_magnitud))