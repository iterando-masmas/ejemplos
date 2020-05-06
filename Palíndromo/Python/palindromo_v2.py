#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/numero-palindromo-en-python/
import math

def cuenta_digitos(numero):
    if numero == 0:
        return 1
    return int(math.log10(numero) + 1)
    
def es_palindromo(numero):
    total_digitos = cuenta_digitos(numero)
    mitad = total_digitos // 2
    factor = 10 ** (total_digitos - 1)
    for i in range(1, mitad+1):
        digito_derecha = numero % 10
        digito_izquierda = numero // factor        
        if digito_derecha != digito_izquierda:
            return False
        numero %= factor       
        numero //= 10        
        factor //= 100
    return True

numero=int(input("Ingrese un número: "))
numero = abs(numero)
if es_palindromo(numero):
    print("El número es palíndromo")
else:
    print("El número no es palíndromo")