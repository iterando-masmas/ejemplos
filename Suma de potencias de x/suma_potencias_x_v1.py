x=float(input("Ingrese el valor de x(|x|<1): "))
n=int(input("Ingrese la cantidad de términos: "))

if abs(x) >= 1:
    print("Valor de x incorrecto")
else:
    i=0
    suma=0
    while i<n:
        suma += x**i
        i+=1
    print("El valor de 1/(1-x) es: {:.3f}".format(suma))