n=int(input("Ingrese un número natural (>0): "))

if n <= 0:
    print("El número debe ser mayor que cero")
else:
    cant_divisores = 0
    encontro_divisores = False
    mitad=n/2
    i = 2
    while (i <= mitad and not encontro_divisores):
        if n % i == 0:
            cant_divisores+=1
            encontro_divisores = True
        i+=1
    if cant_divisores==0 and n>1:
        print("El número es primo")
    else:
        print("El número no es primo")