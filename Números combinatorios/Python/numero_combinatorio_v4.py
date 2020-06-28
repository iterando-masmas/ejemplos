import numpy
    
def inicializa_arreglo(combinatorio):
    for i in range(0, DIMENSION):
        combinatorio[0][i] = 0
        combinatorio[i][0] = 1
    for n in range(1, DIMENSION):
        for k in range(1, n+1):
            combinatorio[n][k] = combinatorio[n - 1][k - 1] + combinatorio[n - 1][k]
    
DIMENSION=20    
n=int(input("Ingrese n: "))
k=int(input("Ingrese k: "))

if n <= 0 or k <= 0:
    print("n y k deben ser mayores que cero")
elif k > n:
    print("n debe ser mayor o igual que k")
else:
    combinatorio=numpy.zeros((DIMENSION, DIMENSION), dtype=int)
    inicializa_arreglo(combinatorio)
    print("El combinatorio de n en k es {:d}".format(combinatorio[n, k]))