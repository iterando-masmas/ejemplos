#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-python/
def fibonacci(n):
    if n<=2:
        return n-1
    anterior=0
    actual=1
    for i in range(3, n+1):
        copia_actual=actual
        actual=actual+anterior
        anterior=copia_actual
    return actual
    
n=int(input("Ingrese número de términos: "))
if n<=0:
    print("Debe ingresar un número mayor que cero")
else:
     for i in range(1, n+1):
        print("{:d} ".format(fibonacci(i)) , end="")