#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-python/
def fibonacci(n):
    if n<=2:
        return n-1    
    return fibonacci(n-1)+fibonacci(n-2)
    
n=int(input("Ingrese número de términos: "))
if n<=0:
    print("Debe ingresar un número mayor que cero")
else:
     for i in range(1, n+1):
        print("{:d} ".format(fibonacci(i)) , end="")