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
    i=3
    while i<=n:
        copia_actual=actual
        actual=actual+anterior
        anterior=copia_actual
        print("{:d} ".format(actual) , end="")
        i+=1