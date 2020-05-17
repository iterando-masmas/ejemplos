#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/numero-armstrong-en-python/
import math

def cuenta_digitos(numero):
    if numero == 0:
        return 1
    return int(math.log10(numero) + 1)

def es_Armstrong(numero):
    total_digitos = cuenta_digitos(numero)
    copia_numero = numero
    suma_de_potencias = 0
    for i in range(0, total_digitos):
        digito = copia_numero % 10
        copia_numero //= 10
        suma_de_potencias += digito**total_digitos
    return numero == suma_de_potencias

limite = 2**31-1
for i in range(1, limite+1):
    if es_Armstrong(i):
        print(i)