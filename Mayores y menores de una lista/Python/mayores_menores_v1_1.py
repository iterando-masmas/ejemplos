#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-python/
i=0
n=0
while n >= 0:
    n=int(input("Ingrese número {:d}: ".format(i+1)))
    if n >= 0:
        i+=1
        if i == 1:
            mayor_magnitud = menor_magnitud = n
        else:
            if n > mayor_magnitud:
                mayor_magnitud = n
            if n < menor_magnitud:
                menor_magnitud = n
if i == 0:
    print("No se ha ingresado ningún número");
else:
    print("El número con mayor magnitud es: {:d}".format(mayor_magnitud))
    print("El número con menor magnitud es: {:d}".format(menor_magnitud))