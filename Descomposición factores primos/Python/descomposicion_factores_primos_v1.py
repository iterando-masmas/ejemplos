#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-python/
import math

def es_primo(n):
    if n <= 0:
        return False
    cant_divisores = 0
    encontro_divisores = False
    limite=math.sqrt(n)
    i = 2
    while i <= limite and not encontro_divisores:
        if n % i == 0:
            cant_divisores+=1
            encontro_divisores = True
        i+=1
    if cant_divisores==0 and n>1:
        return True
    return False
        
def siguiente_primo(n):
    while True:
        n+=1
        if es_primo(n):
            return n
    
def descomponer_factores(n):
    productoria = 1
    copia_n = n
    factor_primo = 2
    while True:
        resto = copia_n % factor_primo
        if resto == 0:
            if productoria > 1:
                print("x", end="")
            print(factor_primo, end="")
            copia_n //= factor_primo
            productoria *= factor_primo
        else:  
            factor_primo = siguiente_primo(factor_primo)
        
        if productoria == n:
            break;
    
n=int(input("Ingrese un número (>1): "))
if n <= 1:
    print("Debe ingresar un número mayor que uno")
else:
    descomponer_factores(n)