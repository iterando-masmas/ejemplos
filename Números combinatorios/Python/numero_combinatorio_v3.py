#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/numero-combinatorio-en-python/
def combinatorio(n, k):
    n_menos_k = n - k
    if k > n_menos_k:
        numero_mayor = k
        numero_menor = n_menos_k
    else:
        numero_mayor = n_menos_k
        numero_menor = k
    numerador = 1
    for i in range(numero_mayor + 1, n+1):
        numerador *= i
    denominador = 1
    for i in range(1, numero_menor+1):
        denominador *= i
    return numerador // denominador

n=int(input("Ingrese n: "))
k=int(input("Ingrese k: "))

if n < 0 or k < 0:
    print("n y k deben ser mayores o iguales que cero")
elif k > n:
    print("n debe ser mayor o igual que k")
else:
    print("El combinatorio de n en k es {:d}".format(combinatorio(n, k)))