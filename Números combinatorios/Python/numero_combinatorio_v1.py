def factorial(n):
    productoria = 1
    for i in range(2, n+1):
        productoria *= i
    return productoria

def combinatorio(n, k):
    return factorial(n)//(factorial(n-k)*factorial(k))

n=int(input("Ingrese n: "))
k=int(input("Ingrese k: "))

if n <= 0 or k <= 0:
    print("n y k deben ser mayores que cero")
elif k > n:
    print("n debe ser mayor o igual que k")
else:
    print("El combinatorio de n en k es {:d}".format(combinatorio(n, k)))