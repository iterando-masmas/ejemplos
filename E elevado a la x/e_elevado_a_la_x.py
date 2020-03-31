x=float(input("Ingrese el valor de x: "))
n=int(input("Ingrese la cantidad de términos: "))

if n >= 24:
    print("La cantidad de términos debe ser menor a 24")
else:
    i=0
    sumatoria = 0
    factorial = 1
    while i < n:
        if i != 0:
            factorial *= i
        sumatoria += (x**i) / factorial
        i+=1
    print("e^x = {:.3f}".format(sumatoria))