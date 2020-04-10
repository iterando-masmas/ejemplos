#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-python/
n=int(input("Ingrese un número natural (>0): "))

if n <= 0 or n>20:
    print("El número debe estar entre [1..20]")
else:
    factorial = 1
    i = 2
    while (i < n):
        factorial *= i;
        i+=1
    if (factorial + 1) % n == 0 and n > 1:
        print("El número es primo")
    else:
        print("El número no es primo")

