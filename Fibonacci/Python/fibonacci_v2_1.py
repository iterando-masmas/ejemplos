#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-python/
n=int(input("Ingrese número de términos: "))
if n<=0:
    print("Debe ingresar un número mayor que cero")
else:
    if n>=1:
        print("{:d} ".format(0) , end="")
    if n>=2:
        print("{:d} ".format(1) , end="")
    anterior=0
    actual=1
    for i in range(3, n+1):
        copia_actual=actual
        actual=actual+anterior
        anterior=copia_actual
        print("{:d} ".format(actual) , end="")