#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/factorial-en-python/
def factorial(n):
    productoria = 1
    for i in range(2, n+1):
        productoria *= i
    return productoria

n=int(input("Ingrese número n (n>=0): "))
if n < 0 :
    print("Debe ingresar un número mayor o igual a cero")
else:
    print("{:d}!={:d}".format(n, factorial(n)))