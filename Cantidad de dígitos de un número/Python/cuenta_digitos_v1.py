def cuenta_digitos(numero):
    total_digitos = 0
    while numero>0:
        total_digitos+=1
        numero//=10
    if total_digitos==0:
        total_digitos+=1
    return total_digitos

numero=int(input("Ingrese un número: "))
numero=abs(numero)
print("El número tiene {:d} dígito(s)".format(cuenta_digitos(numero)))