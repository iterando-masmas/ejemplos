import math

def es_primo(n):
    if n <= 1:
        return False
    encontro_divisores = False    
    i = 2
    while i <= math.sqrt(n) and not encontro_divisores:
        if n % i == 0:
            encontro_divisores = True
        i+=1    
    return not encontro_divisores
        
def siguiente_primo(n):
    while True:
        n+=1
        if es_primo(n):
            return n
        
def MCD(a,b):
    factor=2
    producto=1
    while factor<=a and factor<=b:
        if a%factor==0 or b%factor==0:
            if a%factor==0 and b%factor==0:
                producto *= factor
            if a%factor==0:
                a /= factor
            if b%factor==0:
                b /= factor
        else:
            factor=siguiente_primo(factor)
    return producto
        
a=int(input("Ingrese número a: "))
b=int(input("Ingrese número b: "))
if a>0 and b>0:
    print("El MCD({:d},{:d})={:d}".format(a,b,MCD(a,b)))
else:
    print("Números inválidos")