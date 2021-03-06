#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-python/
n=int(input("Ingrese un número natural (>0): "))

if n <= 0:
    print("El número debe ser mayor que cero")
else:
    encontro_divisores = False    
    i = 2
    while (i <= n//2 and not encontro_divisores):
        if n % i == 0:
            encontro_divisores = True
        i+=1
    if not encontro_divisores and n>1:
        print("El número es primo")
    else:
        print("El número no es primo")