#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-python/
def cuenta_digitos(numero):
    if numero == 0:
        return 0
    return 1 + cuenta_digitos(numero // 10)

numero=int(input("Ingrese un número: "))
numero=abs(numero)
print("El número tiene {:d} dígito(s)".format(1 if numero==0 else cuenta_digitos(numero)))