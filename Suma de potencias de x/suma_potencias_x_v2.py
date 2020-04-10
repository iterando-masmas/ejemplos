#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/suma-de-potencias-de-x-en-python/
x=float(input("Ingrese el valor de x(|x|<1): "))
n=int(input("Ingrese la cantidad de términos: "))

if abs(x) >= 1:
    print("Valor de x incorrecto")
else:
    suma=0
    for i in range(n):
        suma += x**i
    print("El valor de 1/(1-x) es: {:.3f}".format(suma))

