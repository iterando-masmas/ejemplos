import numpy

def inicializar_arreglo(fibonacci, n):
    fibonacci[1] = 0;
    fibonacci[2] = 1;
    for i in range(3, n+1):
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    
MAX_TERMINOS=100
n=int(input("Ingrese número de términos (1<=n<=100): "))
if n<=0:
    print("Debe ingresar un número en el rango [0..100]")
else:
    fibonacci=numpy.arange(MAX_TERMINOS+1)
    inicializar_arreglo(fibonacci, MAX_TERMINOS)
    for i in range(1, n+1):
        print("{:d} ".format(fibonacci[i]) , end="")