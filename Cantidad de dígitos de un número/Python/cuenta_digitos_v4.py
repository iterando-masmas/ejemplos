#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-python/
import math

def cuenta_digitos(numero, base):
    if numero == 0:
        return 1
    return int(math.log(numero)+math.log(base)) + 1

numero=int(input("Ingrese un número: "))
base=int(input("Ingrese una base: "))
numero=abs(numero)
if base>1:
    print("El número tiene {:d} dígito(s) en la base {:d}".format(cuenta_digitos(numero, base), base))
else:
    print("La base debe ser mayor que 1")