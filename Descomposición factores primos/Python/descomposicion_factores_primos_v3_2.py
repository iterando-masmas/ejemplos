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
    cant_factores = 0
    while n>1:
        if n % factor_primo == 0:
            cant_factores += 1
            n //= factor_primo            
        else:  
            primer_factor, cant_factores = escribe_factor(primer_factor, factor_primo, cant_factores)
            factor_primo = siguiente_primo(factor_primo)  
    primer_factor, cant_factores = escribe_factor(primer_factor, factor_primo, cant_factores)
    
def escribe_factor(primer_factor, factor_primo, cant_factores):
    if cant_factores > 0:
        if primer_factor:
            primer_factor = False
        else:
             print("x", end="")
        if cant_factores==1:
            print(factor_primo, end="")
        else:
            print("{:d}^{:d}".format(factor_primo, cant_factores), end="")      
        cant_factores = 0        
    return primer_factor, cant_factores 

n=int(input("Ingrese un número (>1): "))
if n <= 1:
    print("Debe ingresar un número mayor que uno")
else:
    descomponer_factores(n)
