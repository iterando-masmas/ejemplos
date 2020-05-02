#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-python/
import math

def cuenta_digitos(numero):
    if numero == 0:
        return 1
    return int(math.log10(numero) + 1)

numero=int(input("Ingrese un número: "))
numero=abs(numero)
print("El número tiene {:d} dígito(s)".format(cuenta_digitos(numero)))