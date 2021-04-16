#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-python/
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
    
def descomponer_factores(n): 
    print(n," = ", end="")    
    factor_primo = 2
    primer_factor = True
    while n>1:
        if n % factor_primo == 0:
            if primer_factor:
                primer_factor = False
            else:
                print("x", end="")
            print(factor_primo, end="")
            n //= factor_primo            
        else:  
            factor_primo = siguiente_primo(factor_primo)        
    
n=int(input("Ingrese un número (>1): "))
if n <= 1:
    print("Debe ingresar un número mayor que uno")
else:
    descomponer_factores(n)