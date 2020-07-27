#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/numero-combinatorio-en-python/
def combinatorio(n, k):
    if n >= 0 and k == 0:
        return 1
    if n == 0 and k > 0:
        return 0
    return combinatorio(n - 1, k - 1) + combinatorio(n - 1, k)

n=int(input("Ingrese n: "))
k=int(input("Ingrese k: "))

if n < 0 or k < 0:
    print("n y k deben ser mayores o iguales que cero")
elif k > n:
    print("n debe ser mayor o igual que k")
else:
    print("El combinatorio de n en k es {:d}".format(combinatorio(n, k)))