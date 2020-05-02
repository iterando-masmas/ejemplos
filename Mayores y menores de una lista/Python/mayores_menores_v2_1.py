#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-python/
i=0 
while True:
    n=int(input("Ingrese número {:d}: ".format(i+1)))
    if n < 0:
        break
    i+=1
    if i == 1:
        mayor_magnitud1 = menor_magnitud1 = n
    else:
        if i == 2 or n > mayor_magnitud1 or n > mayor_magnitud2:
            if n > mayor_magnitud1:
                mayor_magnitud2 = mayor_magnitud1
                mayor_magnitud1 = n
            else:
                mayor_magnitud2 = n
        if i == 2 or n < menor_magnitud1 or n < menor_magnitud2:
            if n < menor_magnitud1:
                menor_magnitud2 = menor_magnitud1
                menor_magnitud1 = n
            else:
                 menor_magnitud2 = n
if i == 0:
    print("No se ha ingresado ningún número");
else:
    print("El 1er número con mayor magnitud es: {:d}".format(mayor_magnitud1))
    if i >1:
        print("El 2do número con mayor magnitud es: {:d}".format(mayor_magnitud2))    
    print("El 1er número con menor magnitud es: {:d}".format(menor_magnitud1))
    if i >1:
        print("El 2do número con menor magnitud es: {:d}".format(menor_magnitud2))